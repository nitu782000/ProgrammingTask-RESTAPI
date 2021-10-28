/*
 The UK DRI Care Research and Technology Centre Programming Task
 
 Resource not found Exception
 
 Developed by: Neeta Patel
 Date: 28/10/2021
 */

package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class resourceNotFoundException extends Exception{
	
	private static final long serialVersionUID = 1L;

	 public resourceNotFoundException(String message){
	        super(message);
	    }
  

}
