package vn.com.vti.springexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.vti.springexam.form.PublisherForm;

@Controller
@RequestMapping("/pubIn")
public class PublisherInsertController {

	@ModelAttribute
	public PublisherForm createForm() {
		return new PublisherForm();
	}
	
	@RequestMapping("/input")
	public String input(PublisherForm publisherForm) {
		return "publisher/publisherInsertInput";
	}
	
	@RequestMapping("/confirm")
	public String confirm(PublisherForm publisherForm, Model model) {
		return "publisher/publisherInsertConfirm";
	}
}
