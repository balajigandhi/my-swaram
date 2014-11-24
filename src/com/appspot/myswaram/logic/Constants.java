package com.appspot.myswaram.logic;

import java.util.HashMap;
import java.util.Map;

public class Constants {

	public static final Map<String, Integer> AAROHANAM = new HashMap<>();
	
	public static final int BLANKNOTE = 9999;
	
	static {
		AAROHANAM.put("S",  0);
		AAROHANAM.put("R",  1);
		AAROHANAM.put("G",  2);
		AAROHANAM.put("M",  3);
		AAROHANAM.put("P",  4);
		AAROHANAM.put("D",  5);
		AAROHANAM.put("N",  6);
		AAROHANAM.put("SA", 7);
	}
	
	public static final String HOMEPAGE = "<!DOCTYPE html>" +
            "<html>" +
            "<body>" +
            "" +
            "<form action='/my_swaram' method='POST'>" +
            "Pattern:" +
            "<br><br>" +
            "<input type='text' name='pattern' value='S,R,G,M,P,D,N,Sa'>" +
            "<br><br>" +
            "<input type='submit'>" +
            "</form>" +
            "" +
            "</body>" +
            "</html>";
	
	public static final String RESULT = "<!DOCTYPE html>" +
            "<html>" +
            "<body>" +
            "" +
            "<table border='0' cellspacing='10' style='width:640;height:480;'>" +
            "%table_data%" +
            "</table>" +
            "" +
            "</body>" +
            "</html>";

}
