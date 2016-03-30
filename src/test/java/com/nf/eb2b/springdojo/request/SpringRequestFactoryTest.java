package com.nf.eb2b.springdojo.request;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nf.eb2b.springdojo.request.SpringRequest;
import com.nf.eb2b.springdojo.request.SpringRequestFactory;

public class SpringRequestFactoryTest {

	@Test
	public void createsRequestFromSpringContext() {
		SpringRequestFactory factory = new SpringRequestFactory();
		
		SpringRequest results = factory.newRequest();
		
		assertNotNull(results);
	}

}
