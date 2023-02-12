package com.zohocrm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.dto.Email;
import com.zohocrm.util.EmailService;

@Controller
public class EmailController {
	@Autowired
	private EmailService emailservice;
	
	@PostMapping("/sendEmail")
	public String getEmailId(@RequestParam("email") String email,Model model) {
		model.addAttribute("email", email);
		return "compose_email";
	}
	@PostMapping("/triggerEmail")
	public String triggerEmail(Email email,Model model) {
		emailservice.sendMail(email.getEmail(), email.getSubject(), email.getContent());
		model.addAttribute("msg", "email sent");
		return "compose_email";
	}

}
