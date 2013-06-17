package com.siemens.e.innodayapp;

import java.nio.charset.Charset;
import java.util.LinkedList;

public class Utility {

	// looks for \0 (termination symbol) in the provided byte array
	public static String[] extractStringFromByteArray(byte[] byteArray, int index){
		
		Charset charset = Charset.forName("US-ASCII");
		int i, j;
		LinkedList<String> strings = new LinkedList<String>();
		i = 0;
		for(j = 0; j < byteArray.length  && byteArray[j] != 0;){
			
			for (; byteArray[i] != 0; i++) { }
			strings.add(new String(byteArray, j, i - j, charset));	
			
			j = ++i;
		}
	
		String[] retStrings = strings.toArray(new String[strings.size()]);
		return retStrings;
		
	}
	
}
