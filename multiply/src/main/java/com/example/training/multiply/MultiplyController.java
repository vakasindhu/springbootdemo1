package com.example.training.multiply;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplyController {
	@RequestMapping(path = "/multiply", method=RequestMethod.POST)
	public ResponseEntity<Multiply> processAddition(@RequestBody Multiply requestJSON) {
		//Building Response JSON
		Multiply responseJSON = new Multiply();
		responseJSON.setA(requestJSON.getA());
		responseJSON.setB(requestJSON.getB());
		responseJSON.process(); //Update the result
		
		//Returning Response JSON + HTTP Status code 200 i.e. OK
		ResponseEntity response = new ResponseEntity(responseJSON, HttpStatus.OK);
		return response;
	}

}
