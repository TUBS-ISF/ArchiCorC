package de.tu_bs.ccc.contracting.core.features;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.tu_bs.ccc.contracting.Verification.Ports;
import de.tu_bs.ccc.contracting.core.mapping.ProjectMapping;

public class DeletePortFeature extends DefaultDeleteFeature {

	public DeletePortFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void delete(IDeleteContext context) {
		PictogramElement pes = context.getPictogramElement();
		Object object = getBusinessObjectForPictogramElement(pes);
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		IWorkbenchWindow window = PlatformUI.getWorkbench()
	            .getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window.getActivePage();

		IEditorPart activeEditor = activePage.getActiveEditor();
		MessageBox dialog2 = new MessageBox(shell, SWT.ICON_QUESTION | SWT.OK | SWT.CANCEL);
		if (activeEditor != null) {
		   IEditorInput input = activeEditor.getEditorInput();

		   IProject project = input.getAdapter(IProject.class);
		   if (project == null) {
		      IResource resource = input.getAdapter(IResource.class);
		      if (resource != null) {
		         project = resource.getProject();
		      }
		   }
		   if(ProjectMapping.getMapPro().get(project).getMappingEntry(((Ports) object).getModule()).size() > 0)
		 {

			
			dialog2.setText("Component already used");
			dialog2.setMessage("This component already has instances, do you really want to change it?");
			if(((Ports) object).getModule().getModule()!=null) {
				dialog2.setText("Component is an Instance");
				dialog2.setMessage("This component is an instance, you shouldn't delete Ports as it this could cause synch problems?");			
			}}

			// open dialog and await user selection
			
			int returnCode = dialog2.open();
			if (returnCode == SWT.CANCEL) {
				return;
			}
		}
		super.delete(context);
	}

}
