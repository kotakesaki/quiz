package com.design_shinbi.quiz.test;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.design_shinbi.quiz.Question;

class QuizTest {

	@Test
	void test() {
		String line = "麦わら海賊団の船長は？,ルフィー,ゾロ,ナミ,ウソップ";

		Question question = new Question();
		question.readLine(line);
		question.display();
	}

	@Test
	void testResource() throws IOException {
		List<Question> questions = Question.getQuestions();
		for (Question question : questions) {
			question.display();
		}
	}

}
