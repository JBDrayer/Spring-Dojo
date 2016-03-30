package com.nf.eb2b.springdojo;

import com.nf.eb2b.springdojo.request.SpringRequest;
import com.nf.eb2b.springdojo.request.SpringRequestFactory;

public class SpringDojo {

	private StringBuilder content;

	public SpringDojo(StringBuilder content) {
		this.content = content;
	}

	public void introduceYourself() {
		SpringRequest request = new SpringRequestFactory().newRequest();
		request.introduceYourself(content);
	}
}
