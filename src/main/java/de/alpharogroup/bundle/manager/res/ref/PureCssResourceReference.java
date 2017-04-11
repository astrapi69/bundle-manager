package de.alpharogroup.bundle.manager.res.ref;

import org.apache.wicket.request.resource.CssResourceReference;

/**
 * The class {@link PureCssResourceReference} holds the resource reference of the pure css file.
 */
public class PureCssResourceReference  extends CssResourceReference {

	/** The serialVersionUID. */
	private static final long serialVersionUID = 1L;

	public static final PureCssResourceReference INSTANCE = new PureCssResourceReference();

	/**
	 * Instantiates a new {@link TooltipsterResourceReference}.
	 */
	private PureCssResourceReference()
	{
		super(PureCssResourceReference.class, "pure-min.css");
	}

	/**
	 * Gets the singleton instance of the {@link PureCssResourceReference}.
	 *
	 * @return the pure css resource reference
	 */
	public static final PureCssResourceReference get() {
		return INSTANCE;
	}
}
