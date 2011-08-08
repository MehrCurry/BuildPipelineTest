package de.gzockoll.test.buildpipeline;

import static org.junit.Assert.*;

import org.junit.Test;

public class WebIntegrationTest extends SeleniumTestCase {
	
	@Test
	public void testServlet() throws Exception {
		selenium.open("/BuildPipelineTest/hello");
		selenium.waitForPageToLoad("5000");
		assertTrue(selenium.isTextPresent("Hello Servlet"));
	}	
	
	@Test
	public void testWicket() throws Exception {
		selenium.open("/BuildPipelineTest/wicket");
		selenium.waitForPageToLoad("5000");
		assertTrue(selenium.isTextPresent("Wicket Page"));
		assertTrue(selenium.isTextPresent("Hurz"));
	}	

}