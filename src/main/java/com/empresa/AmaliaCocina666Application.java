package com.empresa;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class AmaliaCocina666Application {
//public class AmaliaCocina666Application implements CommandLineRunner{
	
	
	/*@Autowired
	private BCryptPasswordEncoder passEncoder;*/

	public static void main(String[] args) {
		SpringApplication.run(AmaliaCocina666Application.class, args);
	}
	
	//@Override
	/*public void run(String... args) throws Exception {
		String pass1="user";
	String pass2="admin";
		
		System.out.println(passEncoder.encode(pass1));
		System.out.println(passEncoder.encode(pass2));
		
	}*/

}
