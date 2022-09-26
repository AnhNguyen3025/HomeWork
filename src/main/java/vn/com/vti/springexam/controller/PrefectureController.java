package vn.com.vti.springexam.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.vti.springexam.form.PrefectureForm;

@Controller
@RequestMapping("/prefectureCon")
public class PrefectureController {
	@ModelAttribute
	public PrefectureForm createForm() {
		return new PrefectureForm();
	}

	@RequestMapping("/input")
	public String input2(PrefectureForm prefectureForm) {
		return "prefecture/prefectureInsertInput";
	}

	@RequestMapping("/confirm")
	public String confirm(@Valid PrefectureForm prefectureForm, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return input2(prefectureForm);
		}
		return "prefecture/prefectureInsertConfirm";
	}
}