package com.example.android.smartone;


import com.example.android.smartone.loginActivity;
import com.example.android.smartone.noticeActivity;
import com.example.android.smartone.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class loginActivity extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // 스플래쉬로 타이틀을 잠깐 보여줌
        //startActivity(new Intent(this, titleActivity.class));
        
        // 헤더에 보여줄 내용 정의
        //requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_login);
        //getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.header); 
        Button login_button_1 = (Button)findViewById(R.id.login_button1);
        login_button_1.setOnClickListener(mLoginListener);
        
    }
	
    private OnClickListener mLoginListener = new OnClickListener() {
    	public void onClick(View v) {
            Intent myIntent, intentsub;
            switch (v.getId()) {
            case R.id.login_button1:
                startActivity(new Intent(loginActivity.this, noticeActivity.class));
                finish();
            	break;
            }
    	}
    };
}
