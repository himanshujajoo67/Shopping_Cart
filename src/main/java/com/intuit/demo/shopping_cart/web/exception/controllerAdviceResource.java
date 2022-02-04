package com.intuit.demo.shopping_cart.web.exception;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import net.minidev.json.JSONObject;

@ControllerAdvice
public class controllerAdviceResource {
	  private static final String ERROR_EVENT_IO_MESSAGE = "The CLIENT_RETRIEVE_RESPONSE could not reach the client's application due to a connection timeout. Client should retry and if problem persists contact support.";	
	  private static final String ERROR_EVENT_MESSAGE = "Unable to process the Retrieval Request due to: ";  
	  private static final String INTERNAL_SERVER_ERROR = "Internal Server Error";
	  
	  @ExceptionHandler({IllegalStateException.class, JpaSystemException.class})
	  public ResponseEntity<String> handleException(Exception ex, HttpServletRequest request) {
	    //if(request.getMethod().equalsIgnoreCase("post")) {
	      Timestamp errorTimestamp = Timestamp.valueOf(LocalDateTime.now());
	      
	      JSONObject item = new JSONObject();
	      item.put("message", ex.getMessage());
	      item.put("error", INTERNAL_SERVER_ERROR);
	      item.put("time", errorTimestamp);
	      return new ResponseEntity<>(item.toString(), HttpStatus.BAD_REQUEST);	  
	  }
	  
	  
	  @ExceptionHandler(IllegalArgumentException.class)
	  public ResponseEntity<String> badRequestException(Exception ex, HttpServletRequest request) {
	    //if(request.getMethod().equalsIgnoreCase("post")) {
	      Timestamp errorTimestamp = Timestamp.valueOf(LocalDateTime.now());
	      
	      JSONObject item = new JSONObject();
	      item.put("message", ex.getMessage());
	      item.put("error", INTERNAL_SERVER_ERROR);
	      item.put("time", errorTimestamp);
	      return new ResponseEntity<>(item.toString(), HttpStatus.BAD_REQUEST);	  
	  }
	    
}

