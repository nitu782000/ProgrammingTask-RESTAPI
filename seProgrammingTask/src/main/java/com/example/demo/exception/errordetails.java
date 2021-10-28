/*
 The UK DRI Care Research and Technology Centre Programming Task
 
 Customizing Error Response Structure
 
 Error details
 
 Developed by: Neeta Patel
 Date: 28/10/2021
 */


package com.example.demo.exception;

import java.util.Date;

public class errordetails {
	
	 private Date timestamp;
	    private String message;
	    private String details;

	    public errordetails(Date timestamp, String message, String details) {
	         super();
	         this.timestamp = timestamp;
	         this.message = message;
	         this.details = details;
	    }

	    public Date getTimestamp() {
	         return timestamp;
	    }

	    public String getMessage() {
	         return message;
	    }

	    public String getDetails() {
	         return details;
	    }

}
