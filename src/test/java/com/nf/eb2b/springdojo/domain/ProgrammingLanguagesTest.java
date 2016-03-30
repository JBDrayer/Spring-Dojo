package com.nf.eb2b.springdojo.domain;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

@RunWith(MockitoJUnitRunner.class)
public class ProgrammingLanguagesTest {
	@Mock private ProgrammingLanguage languageOne;
	@Mock private ProgrammingLanguage languageTwo;
	@Mock private ProgrammingLanguage languageThree;
	private StringBuilder content = new StringBuilder();
	private List<ProgrammingLanguage> languagesList;
	private ProgrammingLanguages languages;
	private String languageName = RandomStringUtils.randomAlphabetic(10);

	@Before
	public void configureProgrammingLanguages() {
		languagesList = Arrays.asList(languageOne, languageTwo, languageThree);
		languages = new ProgrammingLanguages(languagesList);
	}

	@Before
	public void configureLanguage() {
		addRandomStringToContent();
	}

	public void addRandomStringToContent() {
		doAnswer(new Answer<Void>() {
			public Void answer(InvocationOnMock invocation) {
				content.append(languageName);
				return null;
			}
		}).when(languageOne).addLanguageToContent(content);
		
		doAnswer(new Answer<Void>() {
			public Void answer(InvocationOnMock invocation) {
				content.append(languageName);
				return null;
			}
		}).when(languageTwo).addLanguageToContent(content);
		
		doAnswer(new Answer<Void>() {
			public Void answer(InvocationOnMock invocation) {
				content.append(languageName);
				return null;
			}
		}).when(languageThree).addLanguageToContent(content);
	}

	@Test
	public void addsProgrammingLanguagesToContent() {
		languages.addLanguagesToContent(content);

		verify(languageOne).addLanguageToContent(content);
		verify(languageTwo).addLanguageToContent(content);
	}

	@Test
	public void addsformattedLanguagesToContent() throws Exception {
		String expected = "I know how to write " + languageName + ", " + languageName + " and " + languageName + " code. ";

		languages.addLanguagesToContent(content);

		assertEquals(expected, content.toString());
	}
}
