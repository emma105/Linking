package com.Sweet.linking;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
	
	LinearLayout content = null;
	Button dial_btn = null;
	Button contact_btn = null;
	Button message_btn = null;
	Button setting_btn = null;
	
	ContactPage contactPage = null;
	DialPage dialPage = null;
	MessagePage messagePage = null;
	SettingPage settingPage = null;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById();
        content = (LinearLayout) findViewById(R.id.content);
        contactPage = new ContactPage(MainActivity.this);
        content.addView(contactPage.getLayout());
        
        addEvents();
        
    }
   
    


    private void addEvents() {
		// TODO Auto-generated method stub
    	View.OnClickListener menuListener = new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				content.removeAllViews();
				if (v.getId() == dial_btn.getId()){
					
					if (dialPage == null){
						dialPage = new DialPage(MainActivity.this);
					}
					content.addView(dialPage.getLayout());
				}else if (v.getId() == contact_btn.getId()){
					if (contactPage == null){
						contactPage = new ContactPage(MainActivity.this);
					}
					content.addView(contactPage.getLayout());
				}else if (v.getId() == message_btn.getId()){
					if (messagePage == null){
						messagePage = new MessagePage(MainActivity.this);
					}
					content.addView(messagePage.getLayout());
				}else if (v.getId() == setting_btn.getId()){
					if (settingPage == null){
						settingPage = new SettingPage(MainActivity.this);
					}
					content.addView(settingPage.getLayout());
				}
				
			}
		};
		dial_btn.setOnClickListener(menuListener);
		contact_btn.setOnClickListener(menuListener);
		message_btn.setOnClickListener(menuListener);
		setting_btn.setOnClickListener(menuListener);
    	
		
	}




	private void findViewById() {
		// TODO Auto-generated method stub
		dial_btn = (Button) findViewById(R.id.dial_btn);
		contact_btn  = (Button) findViewById(R.id.contact_btn);
		message_btn = (Button) findViewById(R.id.message_btn);
		setting_btn = (Button) findViewById(R.id.setting_btn);
	}



	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
