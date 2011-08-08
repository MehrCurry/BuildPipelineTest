package de.gzockoll.test.buildpipeline.ui;

import java.util.Date;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class HelloWorld extends WebPage {
	public HelloWorld() {
		add(new Label("message","Hurz" + new Date()));
	}
}
