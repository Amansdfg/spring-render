package kz.kalabay.Deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeployApplication.class, args);
	}
}
@RestController
class DemoController{
	@GetMapping("/hello")
	public String hello(){
		return "Hello World";
	}
}