package springdojo;

import springdojo.request.SpringRequest;
import springdojo.request.SpringRequestFactory;

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
