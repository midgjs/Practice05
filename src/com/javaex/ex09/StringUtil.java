package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] str){
    	
    	
    	String[] strArray = new String[3];
    	String herosum = str[0];
        for(int i=1; i<strArray.length; i++) {
        	herosum = herosum + str[i];
        }
        return herosum;
    }

}
