package com.Sweet.linking;

import android.widget.LinearLayout;

public class MessagePage {
	LinearLayout message;
	
	public MessagePage(final MainActivity main){
		message = (LinearLayout) main.getLayoutInflater().inflate(R.layout.message_layout, null);
		
	}
	LinearLayout getLayout(){
		return message;
	}

}
