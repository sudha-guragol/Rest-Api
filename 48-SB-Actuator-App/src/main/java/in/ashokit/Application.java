package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}


/*
Run the application with url 
http://localhost:7090/actuator/shutdown (in postman with post request)

Run in browser
http://localhost:7090/actuator

*/