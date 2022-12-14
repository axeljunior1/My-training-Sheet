package com.trainingsheet.My.training.Sheet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@SpringBootApplication
public class MyTrainingSheetApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyTrainingSheetApplication.class, args);
	}




}
