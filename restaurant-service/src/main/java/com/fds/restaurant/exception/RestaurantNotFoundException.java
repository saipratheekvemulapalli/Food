package com.fds.restaurant.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RestaurantNotFoundException extends RuntimeException{
	
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public RestaurantNotFoundException() {
			super();
			// TODO Auto-generated constructor stub
		}

		public RestaurantNotFoundException(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}

		
	    
	}