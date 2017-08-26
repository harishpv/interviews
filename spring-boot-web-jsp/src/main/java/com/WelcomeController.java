package com;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.db.entities.Country;
import com.db.repo.CountryRepo;

@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";
	
	@Autowired
	CountryRepo repo;

	@RequestMapping("/")
	public String welcome(@RequestParam(value = "cc") String cc, Map<String, String> model) {
		model.put("message", repo.findOne(cc).getCities().get(0).getName());
		return "welcome";
	}

}