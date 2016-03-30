package springdojo.domain;

public class Name {

	private String name;

	public Name(String name) {
		this.name = name;
	}

	public void addNameToContent(StringBuilder content) {
		content.append("My name is " + name +"! ");
	}

}
