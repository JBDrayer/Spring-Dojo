package springdojo.domain;

import java.util.List;

public class ProgrammingLanguages {

	private List<ProgrammingLanguage> languages;

	public ProgrammingLanguages(List<ProgrammingLanguage> languages) {
		this.languages = languages;
	}

	public void addLanguagesToContent(StringBuilder content) {
		content.append("I know how to write ");
		for (ProgrammingLanguage language : languages) {
			if (languages.indexOf(language) != languages.size() - 1) {
				language.addLanguageToContent(content);
				if (languages.indexOf(language) != languages.size() - 2) {
					content.append(", ");
				}
			} else {
				content.append(" and ");
				language.addLanguageToContent(content);
				content.append(" code. ");
			}
		}
	}

}
