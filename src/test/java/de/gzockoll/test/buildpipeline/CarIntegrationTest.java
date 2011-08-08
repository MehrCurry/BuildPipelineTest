package de.gzockoll.test.buildpipeline;

import org.junit.Test;


public class CarIntegrationTest extends SeleniumTestCase {
	
	// @Test
	public void testAddCar() throws Exception {
		selenium.open("/BuildPipelineTest/hello/");
		selenium.waitForPageToLoad("5000");
		assertTrue(selenium.isTextPresent("Hello Servlet"));
	}	
}