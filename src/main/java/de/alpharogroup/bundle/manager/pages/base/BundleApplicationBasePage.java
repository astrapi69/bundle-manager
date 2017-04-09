package de.alpharogroup.bundle.manager.pages.base;

import org.apache.log4j.Logger;
import org.apache.wicket.Component;
import org.apache.wicket.markup.html.panel.EmptyPanel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import de.alpharogroup.bundle.manager.pages.area.publicly.PubliclyBasePage;

public abstract class BundleApplicationBasePage<T> extends ApplicationBasePage<T> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The logger constant. */
	protected static final Logger LOG = Logger.getLogger(PubliclyBasePage.class.getName());

	/**
	 * Default constructor that instantiates a new
	 * {@link BundleApplicationBasePage}.
	 */
	public BundleApplicationBasePage() {
		this(new PageParameters());
	}

	/**
	 * Instantiates a new {@link BundleApplicationBasePage} with the given
	 * model.
	 *
	 * @param model
	 *            the model
	 */
	public BundleApplicationBasePage(final IModel<T> model) {
		super(model);
	}

	/**
	 * Instantiates a new {@link BundleApplicationBasePage} with the given
	 * {@link PageParameters} object.
	 *
	 * @param parameters
	 *            the {@link PageParameters} object
	 */
	public BundleApplicationBasePage(final PageParameters parameters) {
		super(parameters);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void onInitialize() {
		super.onInitialize();
		add(newNavbarPanel(NAVBAR_PANEL_ID, getModel()));
		add(feedback = newFeedbackPanel(FEEDBACK_PANEL_ID, getModel()));
		add(newContainerPanel(CONTAINER_PANEL_ID, getModel()));
		add(newFooterPanel(FOOTER_PANEL_ID, getModel()));
	}

	/**
	 * Factory method for creating a new {@link Component} for the navigation
	 * menu. This method is invoked in the constructor from the derived classes
	 * and have to be overridden so users can provide their own version of a new
	 * {@link Component} for the navigation menu.
	 *
	 * @param id
	 *            the id
	 * @param model
	 *            the model
	 * @return the new {@link Component} for the navigation menu.
	 */
	protected Component newNavbarPanel(final String id, final IModel<T> model) {
		return new EmptyPanel(id);
	}

}
