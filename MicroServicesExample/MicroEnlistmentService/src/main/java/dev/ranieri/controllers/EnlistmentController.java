package dev.ranieri.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import dev.ranieri.entities.Associate;
import dev.ranieri.services.EnlistService;

@Component
@Controller
public class EnlistmentController {

	@Autowired
	EnlistService es;
	
	@RequestMapping(value = "/enroll/{email}", method = RequestMethod.POST)
	@ResponseBody
	public Associate enrollAssociate(@RequestBody Associate associate, @PathVariable String email) {
		System.out.println(email);
		return es.enlistAssociate(associate, email);
	}
}
