package de.tu_bs.ccc.contracting.edl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.tu_bs.ccc.contracting.edl.events.Model;

public class EdlPersistenceManager {
	public static final String FILE_EXTENSION = "events";

	public static Collection<EObject> getEdlModels(IProject p) {
		final List<IFile> files = getEdlModelFiles(p);
		final List<EObject> modelList = new ArrayList<EObject>();
		final ResourceSet rSet = new ResourceSetImpl();
		for (final IFile file : files) {
			final EObject model = getEdlModelFromFile(file, rSet);
			if (model != null) {
				modelList.add(model);
			}
		}
		return modelList;
	}

	public static List<IFile> getEdlModelFiles(IContainer folder) {
		final List<IFile> ret = new ArrayList<IFile>();
		try {
			final IResource[] members = folder.members();
			for (final IResource resource : members) {
				if (resource instanceof IContainer) {
					ret.addAll(getEdlModelFiles((IContainer) resource));
				} else if (resource instanceof IFile) {
					final IFile file = (IFile) resource;
					if (file.getName().endsWith(FILE_EXTENSION)) {
						ret.add(file);
					}
				}
			}
		} catch (final CoreException e) {
			e.printStackTrace();
		}
		return ret;
	}

	public static EObject getEdlModelFromFile(IFile file, ResourceSet resourceSet) {
		// Get the URI of the model file.
		final URI resourceURI = getFileURI(file, resourceSet);
		// Demand load the resource for this file.
		Resource resource;
		try {
			resource = resourceSet.getResource(resourceURI, true);
			if (resource != null) {
				// does resource contain a diagram as root object?
				final EObject root = resource.getContents().get(0);
				if (root instanceof Model) {
					return root;
				}
			}
		} catch (final WrappedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static URI normalizeURI(URI path) {
		if (path.isFile()) {
			return URI.createURI(path.toString().replaceAll("\\\\", "/"));
		}
		return path;
	}

	private static URI getFileURI(IFile file, ResourceSet resourceSet) {
		final String pathName = file.getFullPath().toString();
		URI resourceURI = URI.createFileURI(pathName);
		resourceURI = resourceSet.getURIConverter().normalize(resourceURI);
		return resourceURI;
	}
}
