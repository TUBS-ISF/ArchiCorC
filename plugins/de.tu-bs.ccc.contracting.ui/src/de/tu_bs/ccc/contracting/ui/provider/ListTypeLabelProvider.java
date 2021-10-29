package de.tu_bs.ccc.contracting.ui.provider;

import java.net.URL;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import de.tu_bs.ccc.contracting.edl.events.EventType;
import de.tu_bs.ccc.contracting.idl.cidl.Interface;
import de.tu_bs.ccc.contracting.ui.ImageProvider;

public class ListTypeLabelProvider extends LabelProvider {

	private Image resize(Image image, int width, int height) {
		Image scaled = new Image(Display.getDefault(), width, height);
		GC gc = new GC(scaled);
		gc.setAntialias(SWT.ON);
		gc.setInterpolation(SWT.HIGH);
		gc.drawImage(image, 0, 0, image.getBounds().width, image.getBounds().height, 0, 0, width, height);
		gc.dispose();
		image.dispose();
		return scaled;
	}

	@Override
	public Image getImage(Object element) {
		Bundle bundle = FrameworkUtil.getBundle(this.getClass());

		String img = element instanceof Interface ? ImageProvider.IMG_ICON_SERVICE_INTERFACE
				: (element instanceof EventType ? ImageProvider.IMG_ICON_EVENT : ImageProvider.IMG_ICON_JAVA_TYPE);

		URL url = FileLocator.find(bundle, new Path(img), null);

		return resize(ImageDescriptor.createFromURL(url).createImage(), 16, 16);
	}

	@Override
	public String getText(Object element) {
		if (element instanceof Interface) {
			Interface i = (Interface) element;
			return "[:Service] " + i.getName()
					+ ((i.getVersion() != null)
							? " (version: " + i.getVersion().getMajor() + "." + i.getVersion().getMinor() + ")"
							: "");
		} else if (element instanceof EventType) {
			EventType e = (EventType) element;

			return "[:Event] " + e.getName() + " ("
					+ e.getEvents().stream().map(elem -> elem.getElement()).collect(Collectors.joining(", ")) + ")";
		} else {
			return "[:Type] " + (String) element;
		}
	}
}