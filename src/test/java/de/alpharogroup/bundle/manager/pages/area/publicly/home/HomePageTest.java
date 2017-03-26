package de.alpharogroup.bundle.manager.pages.area.publicly.home;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;

import de.alpharogroup.bundle.manager.application.WicketApplication;

public class HomePageTest
{
	private WicketTester tester;

	@Before
	public void setUp()
	{
		tester = new WicketTester(new WicketApplication());
	}

	@Test
	public void homepageRendersSuccessfully()
	{
		//start and render the test page
		tester.startPage(HomePage.class);

		//assert rendered page class
		tester.assertRenderedPage(HomePage.class);
	}

}
