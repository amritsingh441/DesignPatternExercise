package com.learn.e04.pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerInstanceSingelton {
	
	 private static Logger instance;
	    
	    private LoggerInstanceSingelton(){}
	    
	    public static synchronized Logger getInstance(){
	        if(instance == null){
	            instance = LoggerFactory.getLogger(LoggerInstanceSingelton.class);
	        }
	        return instance;
	    }
	    
	    public static void main(String[] args) {
	    	Logger log1 = LoggerInstanceSingelton.getInstance();
	    	Logger log2 = LoggerInstanceSingelton.getInstance();
	    	if(log1 == log2) {
	    		System.out.println("same logger object");
	    	}else {
	    		System.out.println("different logger object");
	    	}
	    	
		}

}
