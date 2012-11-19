package com.example.android.smartone.customer;

import com.example.android.smartone.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class happycall_write extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.header);
        //서브해더 삽입
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.sub_header);
        
        TextView tvText = (TextView)findViewById(R.id.sub_header_text);
        tvText.setText("해피콜 신청");
    }
 
}
