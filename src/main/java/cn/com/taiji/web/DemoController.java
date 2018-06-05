package cn.com.taiji.web;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DemoController {
	@GetMapping("login")
	public String firstPage() {
//		System.out.println(name);
		return "login";
	}
		
	@GetMapping("/")
	public String index(Model model) {
		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
			    .getAuthentication()
			    .getPrincipal();
		
		String username = userDetails.getUsername();
		System.out.println(username);
		model.addAttribute("username",username);
		return "index";
	}
}
