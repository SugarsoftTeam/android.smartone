package com.example.android.smartone;


import com.example.android.smartone.loginActivity;
import com.example.android.smartone.titleActivity;
import com.example.android.smartone.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class titleActivity extends Activity {

	Handler mHandler;
	
	int splashSceneNumber;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
    	splashSceneNumber = 0;
    	
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_title);

        mHandler = new Handler() {
        	public void handleMessage(Message msg) {
        		startActivity(new Intent(titleActivity.this, loginActivity.class));
        		finish();
        	}
        };            

        mHandler.sendEmptyMessageDelayed(0, 2000);
        

        

    }
	
	
}
