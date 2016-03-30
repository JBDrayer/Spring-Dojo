package com.nf.eb2b.springdojo;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.nf.eb2b.springdojo.request.SpringRequest;
import com.nf.eb2b.springdojo.request.SpringRequestFactory;

@RunWith(PowerMockRunner.class)
@PrepareForTest(SpringDojo.class)
public class SpringDojoTest {

	@Before
	public void configureSpringRequestFactory() throws Exception{
		PowerMockito.whenNew(SpringRequestFactory.class)
			.withNoArguments()
			.thenReturn(requestFactory);
	}
	
	@Mock private SpringRequestFactory requestFactory;
	@Mock private SpringRequest request;
	private SpringDojo dojo;
	private StringBuilder content;

	@Before
	public void configureDojo(){
		dojo = new SpringDojo(content);
	}
	
	@Before
	public void configureRequest(){
		when(requestFactory.newRequest()).thenReturn(request);
	}
	@Test
	public void loadsRequestFromRequestFactory() {
		dojo.introduceYourself();
		
		verify(requestFactory).newRequest();
	}
	
	@Test
	public void requestTellsUsAboutTheDeveloper() throws Exception {
		dojo.introduceYourself();
		
		verify(request).introduceYourself(content);
	}
}
