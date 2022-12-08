package com.trainingsheet.My.training.Sheet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyTrainingSheetApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyTrainingSheetApplication.class, args);
	}

	@RequestMapping("/")
	String getAll(){
		return "Hello Word";
	}

	@RequestMapping("/id")
	String getById( String id){
		id = "5" ;
		return  "Your Id is: "+ id ;
	}

}
