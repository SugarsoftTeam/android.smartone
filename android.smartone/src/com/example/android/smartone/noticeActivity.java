package com.example.android.smartone;


import com.example.android.smartone.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class noticeActivity extends Activity {
	
	Button closebtn, notopenbtn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        // 헤더에 보여줄 내용 정의
        //requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_notice);
        //getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.header);  
        
        closebtn = (Button) findViewById(R.id.notice_close_btn);
        notopenbtn = (Button) findViewById(R.id.notice_notopen_btn);
        
        closebtn.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
        
        notopenbtn.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				System.out.println("오늘 한번만 보여지게 처리해야함");
			}
		});
        
    }
	
	
}
