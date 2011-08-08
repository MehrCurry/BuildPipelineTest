package de.gzockoll.test.buildpipeline;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public abstract class SeleniumTestCase {
	 
	private static final int SELENIUM_PORT = 4444;
	protected static Selenium selenium;
 
	@BeforeClass
	public static void setUp() throws Exception {
        selenium = new DefaultSelenium(
        		"localhost", 
        		SELENIUM_PORT, 
        		"*firefox", 
        		"http://localhost:8080");
        selenium.start();
	}
 
    @AfterClass
    public static void tearDown() throws Exception {
    	selenium.stop();
    }
}