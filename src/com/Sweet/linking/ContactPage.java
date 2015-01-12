package com.Sweet.linking;

import android.widget.LinearLayout;

public class ContactPage {
	LinearLayout contact;
	
	public ContactPage(final MainActivity main){
		contact = (LinearLayout) main.getLayoutInflater().inflate(R.layout.contact_layout, null);
		//do something here
		
	}
	LinearLayout getLayout(){
		return  contact;
	}
	

}
