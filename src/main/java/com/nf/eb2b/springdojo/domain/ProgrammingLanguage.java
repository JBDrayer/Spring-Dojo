package com.nf.eb2b.springdojo.domain;

public class ProgrammingLanguage {

	private String language;

	public ProgrammingLanguage(String language) {
		this.language = language;
	}

	public void addLanguageToContent(StringBuilder content) {
		content.append(language);
	}
}
