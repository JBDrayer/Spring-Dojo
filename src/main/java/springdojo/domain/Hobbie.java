package springdojo.domain;

public class Hobbie {

	private String hobbie;

	public Hobbie(String hobbie) {
		this.hobbie = hobbie;
	}

	public void addHobbieToContent(StringBuilder content) {
		content.append(hobbie);
	}

}
