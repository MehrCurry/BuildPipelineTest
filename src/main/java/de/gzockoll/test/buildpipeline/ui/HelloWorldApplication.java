package de.gzockoll.test.buildpipeline.ui;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class HelloWorldApplication extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		return HelloWorld.class;
	}

}
