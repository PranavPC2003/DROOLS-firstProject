package com.drools.DemoApp.controller;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.drools.DemoApp.model.Question;

@RestController
public class QuestionController {
	@Autowired
	private KieSession session;

	@PostMapping("/question")
	public Question orderNow(@RequestBody Question question) {
		session.insert(question);
		session.fireAllRules();
		return question;
	}

}