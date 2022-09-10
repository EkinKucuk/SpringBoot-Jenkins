package com.pipelineproject.controller;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class DemoController {

	@GetMapping("/get")
	public ResponseEntity<String> getRequest() {

		return new ResponseEntity<String>("Get Request works", HttpStatus.OK);

	}

	@PostMapping("/post")
	public ResponseEntity<?> doSomeCalc(HashMap<String, Double> values) {
		if (values != null) {
			if (values.get("first") == null || values.get("second") == null) {
				return new ResponseEntity<String>("Parameters should be named as first and second",
						HttpStatus.BAD_REQUEST);
			} else {
				if (!Double.isNaN((double) values.get("first")) && !Double.isNaN((double) values.get("second"))) {
					double result = (double) values.get("first") + (double) values.get("second");

					return new ResponseEntity<String>("The result of adding is : " + result, HttpStatus.OK);
				} else {

					return new ResponseEntity<String>("Please enter numberic values for argument first and second",
							HttpStatus.BAD_REQUEST);
				}
			}

		}

		return new ResponseEntity<String>("Missing Request Body", HttpStatus.BAD_REQUEST);

	}

}
