package pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Sample01Application {
	@GetMapping("/")
	public String hello(){
		return "hello world!!! 01";
	}

	public static void main(String[] args) {
		SpringApplication.run(Sample01Application.class, args);
	}

}
