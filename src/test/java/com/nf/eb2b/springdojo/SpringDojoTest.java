package com.nf.eb2b.springdojo;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

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

	@Test
	public void loadsRequestFromRequestFactory() {
		SpringDojo dojo = new SpringDojo();
		
		dojo.introduceYourself();
		
		verify(requestFactory).newRequest();
	}
}
