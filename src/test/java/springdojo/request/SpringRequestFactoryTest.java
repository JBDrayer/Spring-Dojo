package springdojo.request;

import static org.junit.Assert.*;

import org.junit.Test;

import springdojo.request.SpringRequest;
import springdojo.request.SpringRequestFactory;

public class SpringRequestFactoryTest {

	@Test
	public void createsRequestFromSpringContext() {
		SpringRequestFactory factory = new SpringRequestFactory();
		
		SpringRequest results = factory.newRequest();
		
		assertNotNull(results);
	}

}
