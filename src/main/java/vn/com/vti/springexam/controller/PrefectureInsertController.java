package vn.com.vti.springexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.vti.springexam.form.PrefectureForm2;

@Controller
@RequestMapping("/prefectureInsert")
public class PrefectureInsertController {
	
	@ModelAttribute
	public  PrefectureForm2 createForm() {
		return new PrefectureForm2();
	}
	
	@RequestMapping("/input")
	public String input(PrefectureForm2 prefectureForm) {
		return "prefecture/prefectureInsertInput";
	}
	@RequestMapping("/confirm")
	public String confirm(PrefectureForm2 prefectureForm, Model model) {
		return "prefecture/prefectureInsertConfirm";
	}
}
