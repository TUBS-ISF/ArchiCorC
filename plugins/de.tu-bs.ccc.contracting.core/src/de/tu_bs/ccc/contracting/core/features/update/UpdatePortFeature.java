package de.tu_bs.ccc.contracting.core.features.update;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

import de.tu_bs.ccc.contracting.Verification.PortType;
import de.tu_bs.ccc.contracting.Verification.Ports;

public class UpdatePortFeature extends AbstractUpdateFeature {

	public UpdatePortFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canUpdate(IUpdateContext context) {
		Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		return (bo instanceof Ports);
	}

	@Override
	public IReason updateNeeded(IUpdateContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		Ports port = (Ports) getBusinessObjectForPictogramElement(pictogramElement);
		if (pictogramElement instanceof ContainerShape) {

			ContainerShape cs = (ContainerShape) pictogramElement;
			Shape name = cs.getChildren().get(0);
			Shape type = cs.getChildren().get(1);
			Text nameText = (Text) name.getGraphicsAlgorithm();
			Text typeText = (Text) type.getGraphicsAlgorithm();
			String suffix = "";
			if (port.getType().getValue() == PortType.SERVICE_VALUE) {
				suffix += " : " + port.getService();
			} else if (port.getType().getValue() == PortType.EVENT_VALUE) {
				suffix += " : " + port.getEvent();
			}
			boolean triggerupdate = false;
			
			String subtext;
			if (port.getType().getValue() == PortType.SERVICE_VALUE) 
				subtext = port.getType().toString();
			else if (port.getType().getValue() == PortType.EVENT_VALUE) 
				subtext = port.getType().toString();
			else
				subtext = port.getService();
			
			if (nameText.getValue().equals(port.getName() + suffix) && typeText.getValue().equals(subtext)) {
				triggerupdate = true;
			}
			if (!triggerupdate) {
				updatePictogramElement(pictogramElement);
				return Reason.createTrueReason("Name is out of date");
			}

		}
		return Reason.createFalseReason();
	}

	@Override
	public boolean update(IUpdateContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		Ports port = (Ports) getBusinessObjectForPictogramElement(pictogramElement);
		
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pictogramElement;
			if (port.isIsDerived()) {
				IColorConstant E_CLASS_FORE = new ColorConstant(198, 123, 0);

				IColorConstant E_CLASS_BACK = new ColorConstant(255, 240, 160);

				pictogramElement.getGraphicsAlgorithm().setForeground(manageColor(E_CLASS_FORE));
				pictogramElement.getGraphicsAlgorithm().setBackground(manageColor(E_CLASS_BACK));
			}
			Shape name = cs.getChildren().get(0);
			Shape type = cs.getChildren().get(1);
			Text nameText = (Text) name.getGraphicsAlgorithm();
			String suffix = "";
			if (port.getType().getValue() == PortType.SERVICE_VALUE) {
				suffix += " : " + port.getService();
			} else if (port.getType().getValue() == PortType.EVENT_VALUE) {
				suffix += " : " + port.getEvent();
			}
			
			nameText.setValue(port.getName() + suffix);
			Text typeText = (Text) type.getGraphicsAlgorithm();
			if (port.getType().getValue() == PortType.SERVICE_VALUE) 
				typeText.setValue(port.getType().toString());
			else if (port.getType().getValue() == PortType.EVENT_VALUE) 
				typeText.setValue(port.getType().toString());
			else
				typeText.setValue(port.getService());
			
			typeText.setWidth(cs.getGraphicsAlgorithm().getWidth());
			nameText.setWidth(cs.getGraphicsAlgorithm().getWidth());

			return true;
		}
		return false;
	}
}
