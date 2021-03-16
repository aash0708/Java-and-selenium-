package com.java.day1;

public class Datavariableconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str = "capgemini"; 
     String array = str.toString();
     char[] c = str.toCharArray();
     for (int i = 0; i < c.length; i++) {
    	 for(int j=i+1; j<c.length; j++) {
    		 if(c[i]==c[j]) {
        		 System.out.println(c[i]);
        	 } 
    	 }
    	
		    
		       
	}
	}

}
