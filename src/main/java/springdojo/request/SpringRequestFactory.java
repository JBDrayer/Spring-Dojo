package springdojo.request;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRequestFactory {

	public SpringRequest newRequest() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Brad.xml");
		SpringRequest request = context.getBean("request", SpringRequest.class);
		context.close();
		return request;
		
	}

}
