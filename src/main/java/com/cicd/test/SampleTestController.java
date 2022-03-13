package com.cicd.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleTestController {

	@GetMapping(path = "/v1/salutation/{name}")
	public String getTestData(@PathVariable(name = "name", required = true) String name) {
		return "Congratulation you have deployed your first build into eks !" + name;

	}

}
