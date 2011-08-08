package de.gzockoll.test.buildpipeline;



public class CarIntegrationTest extends SeleniumTestCase {
	
	public void testAddCar() throws Exception {
		selenium.open("/BuildPipelineTest/hello");
		selenium.waitForPageToLoad("5000");
		assertTrue(selenium.isTextPresent("Hello Servlet"));
	}	
}