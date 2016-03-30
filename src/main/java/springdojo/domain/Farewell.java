package springdojo.domain;

public class Farewell {

	private String farewell;

	public Farewell(String farewell) {
		this.farewell = farewell;
	}

	public void addFarewellToContent(StringBuilder content) {
		content.append(farewell);
	}

}
