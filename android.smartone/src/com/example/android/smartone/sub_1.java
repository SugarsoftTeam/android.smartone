package com.example.android.smartone;


import com.example.android.smartone.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class sub_1 extends Activity {
	


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // ����� ������ ���� ����
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.sub_1);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.header);        
        
     
        

    }
	
	
}
