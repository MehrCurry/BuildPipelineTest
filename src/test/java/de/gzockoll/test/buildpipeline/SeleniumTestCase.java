package de.gzockoll.test.buildpipeline;

import junit.framework.TestCase;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public abstract class SeleniumTestCase extends TestCase {
	 
	private static final int SELENIUM_PORT = 4444;
	protected Selenium selenium;
 
	@Override
	protected void setUp() throws Exception {
		super.setUp();
        selenium = new DefaultSelenium(
        		"localhost", 
        		SELENIUM_PORT, 
        		"*firefox", 
        		"http://localhost:8080");
        selenium.start();
	}
 
    @Override
    protected void tearDown() throws Exception {
    	selenium.stop();
    	super.tearDown();
    }
}