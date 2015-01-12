package com.Sweet.linking;

import android.widget.LinearLayout;

public class SettingPage {
	LinearLayout setting;
	
	public SettingPage(final MainActivity main){
		setting = (LinearLayout) main.getLayoutInflater().inflate(R.layout.setting_layout, null);
		
	}
	LinearLayout getLayout(){
		return setting;
	}
}
