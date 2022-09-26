package vn.com.vti.springexam.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class FortuneController {
	
	@RequestMapping(value="/fortune",produces="text/html; charset= utf-8")
	@ResponseBody
	public String fortune() {
		Random random = new Random();
		int num = random.nextInt(3);
		String numStr ="";
		if (num ==0) {
			numStr = "Lucky";
		}
		if (num ==1) {
			numStr = "Normal";
		}if (num ==2) {
			numStr = "Bad";
		}
		String result = "";
		result+= "<html>";
		result+= "<head><meta charset =\"UTF-8\"></head>";
		result+= "<body>";
		result+= "<p>";
		result+= "現在:"+numStr;
		result+= "</p>";
		result+= "</body>";
		result+= "</html>";
		return result;
	 }
}


