package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyProjectApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "<ul>\n" +
				"  <li><a href='doctor/1'>First doctor</a></li>\n" +
				"  <li><a href='doctor/10'>Tenth doctor</a></li>\n" +
				"  <li><a href='doctor/12'>Twelth doctor</a></li>\n" +
				"  <li><a href='doctor/13'>Thirteenth doctor</a></li>\n" +
				"</ul>";
	}

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String doctor1() {
		return "First doctor: <a href='https://en.wikipedia.org/wiki/William_Hartnell'>William Hartnell</a>";
	}

	@RequestMapping("/doctor/10")
	@ResponseBody
	public String doctor10() {
		return "Tenth doctor: <a href='https://en.wikipedia.org/wiki/David_Tennant'>David Tennant</a>";
	}

	@RequestMapping("/doctor/12")
	@ResponseBody
	public String doctor12() {
		return "Twelth doctor: <a href='https://en.wikipedia.org/wiki/Peter_Capaldi'>Peter Capaldi</a>";
	}

	@RequestMapping("/doctor/13")
	@ResponseBody
	public String doctor13() {
		return "Thirteenth doctor: <a href='https://en.wikipedia.org/wiki/Jodie_Whittaker'>Jodie Whittaker</a>";
	}


}
