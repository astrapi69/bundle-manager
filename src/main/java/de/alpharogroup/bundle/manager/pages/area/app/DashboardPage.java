package de.alpharogroup.bundle.manager.pages.area.app;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.panel.EmptyPanel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.wicketstuff.annotation.mount.MountPath;

import de.alpharogroup.bundle.manager.pages.base.BundleApplicationBasePage;


@MountPath("bundle/manager/dashboard")
public class DashboardPage extends BundleApplicationBasePage<DashboardBean>
{

	private static final long serialVersionUID = 1L;

	public DashboardPage(final PageParameters parameters)
	{
		super(parameters);
	}

	@Override
	public Component newContainerPanel(final String id, final IModel<DashboardBean> model)
	{
		return new EmptyPanel(id);
	}

}
