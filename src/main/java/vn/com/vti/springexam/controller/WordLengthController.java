package vn.com.vti.springexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/wordlength")
public class WordLengthController {
	@RequestMapping("/input")
	public String input() {
		return "wordlength/wordLengthInput";
	}
	
	@RequestMapping("/result")
	public String result(@RequestParam String str, Model model) {
		
		int result = str.length();
		model.addAttribute("result",result);
		
		return "wordlength/wordLengthResult";
		
	}
}
