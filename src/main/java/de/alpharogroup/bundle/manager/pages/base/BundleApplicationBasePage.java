package de.alpharogroup.bundle.manager.pages.base;

import org.apache.log4j.Logger;
import org.apache.wicket.model.IModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import de.alpharogroup.bundle.manager.pages.area.publicly.PubliclyBasePage;

public abstract class BundleApplicationBasePage<T> extends ApplicationBasePage<T>
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The logger constant. */
	protected static final Logger LOG = Logger.getLogger(PubliclyBasePage.class.getName());

	/**
	 * Default constructor that instantiates a new {@link BundleApplicationBasePage}.
	 */
	public BundleApplicationBasePage()
	{
		this(new PageParameters());
	}

	/**
	 * Instantiates a new {@link BundleApplicationBasePage} with the given model.
	 *
	 * @param model the model
	 */
	public BundleApplicationBasePage(final IModel<T> model)
	{
		super(model);
	}

	/**
	 * Instantiates a new {@link BundleApplicationBasePage} with the given {@link PageParameters} object.
	 *
	 * @param parameters
	 *            the {@link PageParameters} object
	 */
	public BundleApplicationBasePage(final PageParameters parameters)
	{
		super(parameters);
	}

}
