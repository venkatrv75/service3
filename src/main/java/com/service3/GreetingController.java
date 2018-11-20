package com.service3;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.net.InetAddress;
import java.net.UnknownHostException;


@Controller
public class GreetingController {
private static final String welcomemsg = "Hello %s!";
    @GetMapping("/greet/user")
    @ResponseBody
    public Greet greetUser(@RequestParam(name="name", required=false, defaultValue="Ramana") String name) {
		String ip ="NA";
		try {
			ip = InetAddress.getLocalHost().getHostAddress().toString();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Greet(String.format("Container: " + ip + " - " + welcomemsg, name));
    	
    }
}