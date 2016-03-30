package springdojo.domain;

import java.util.List;

public class Hobbies {

	private List<Hobbie> hobbies;

	public Hobbies(List<Hobbie> hobbies) {
		this.hobbies = hobbies;
	}

	public void addHobbiesToContent(StringBuilder content) {
		content.append("My hobbies include ");
		for (Hobbie hobbie : hobbies) {
			if (hobbies.size() == 1) {
				hobbie.addHobbieToContent(content);
				content.append(". ");
			} else if ((hobbies.indexOf(hobbie) != hobbies.size() - 1)) {
				hobbie.addHobbieToContent(content);
				if ((hobbies.indexOf(hobbie) != hobbies.size() - 2)) {
					content.append(", ");
				}
			}else {
				content.append(" and ");
				hobbie.addHobbieToContent(content);
				content.append(". ");
			}
		}
	}
}
