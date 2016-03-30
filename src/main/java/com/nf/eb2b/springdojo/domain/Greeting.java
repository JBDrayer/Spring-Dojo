package com.nf.eb2b.springdojo.domain;

public class Greeting {

	private String greeting;

	public Greeting(String greeting) {
		this.greeting = greeting;
	}

	public void addGreetingToContent(StringBuilder content) {
		content.append(greeting +". ");
	}

}
