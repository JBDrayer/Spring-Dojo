package springdojo.domain;

import static org.junit.Assert.*;

import org.junit.Test;

import springdojo.domain.ProgrammingLanguage;

public class ProgrammingLanguageTest {

	private StringBuilder content = new StringBuilder();
	private String language = "language";
	private ProgrammingLanguage programmingLanguage = new ProgrammingLanguage(language);

	@Test
	public void addsProgrammingLanguageToContent() {
		programmingLanguage.addLanguageToContent(content);
		
		assertEquals(language, content.toString());
	}
}
