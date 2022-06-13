package org.hdcd.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {

	@GetMapping("/")
	public String home(Locale locale, Model model) {
		log.info("Welcome home! The Client locale is" + locale + ".");
		
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 (E)a h시 m분 s초");
		String formattedNow = now.format(formatter);
		
		model.addAttribute("serverTime", formattedNow);
		
		return "home";
	}
}
