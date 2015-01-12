package com.Sweet.linking;

import android.widget.LinearLayout;

public class DialPage {
	LinearLayout dial = null;
	
	public DialPage(final MainActivity main){
		dial = (LinearLayout) main.getLayoutInflater().inflate(R.layout.dial_layout, null);
		//do something...
		
		
	}
	LinearLayout getLayout(){
		return dial;
	}

}
