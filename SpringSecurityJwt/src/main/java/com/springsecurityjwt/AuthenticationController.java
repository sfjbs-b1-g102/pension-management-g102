package com.springsecurityjwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AuthenticationController {
@GetMapping("/")
String getPublicMessage() {
	return "Hello everyone";
}
@GetMapping("/users")
String getUserMessage() {
	return "Hi User,You are now logged in......";
}
}
