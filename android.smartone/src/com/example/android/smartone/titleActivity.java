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
	
	// 처음화면 0
	int splashSceneNumber;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
    	splashSceneNumber = 0;
    	
        super.onCreate(savedInstanceState);
        
        // 헤더에 보여줄 내용 정의
        //requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_title);
        //getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.header);  
        
        // 핸들러 선언으로 딜레이 메시지를 받음
        mHandler = new Handler() {
        	public void handleMessage(Message msg) {
        		// 일정 시간뒤 타이틀 종료
        		startActivity(new Intent(titleActivity.this, loginActivity.class));
        		finish();
        		}
        };            
       
        // 핸들러에게 일정 시간 뒤에 전달하는 녀석 (앞의 0 의미 모르겠음)
        mHandler.sendEmptyMessageDelayed(0, 3000);
        

        

    }
	
	
}
