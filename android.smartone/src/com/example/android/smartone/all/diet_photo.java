package com.example.android.smartone.all;

import com.example.android.smartone.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.RelativeLayout.*;

public class diet_photo extends Activity implements OnClickListener  {
    private Context context;
    private Activity mantoman;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        
        
        RelativeLayout relativeLayout = new RelativeLayout(this);
        Button button_view = new Button(this);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
        	button_view.setText(bundle.getString("NAME") + "sdf" + bundle.getString("TIME") +"--------" + bundle.getString("DESC")
                    + " --- Go Back ");
        } else {
        	button_view.setText("Go Back");
        }
        context = this;
        
        button_view.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //startActivity(new Intent(context, mantoman.class));
                //mantoman.finish();
                finish();
                
            }
        });
        
        relativeLayout.addView(button_view);
        LayoutParams params = new LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.FILL_PARENT);
        
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(relativeLayout, params);
        
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.sub_header);
        TextView tvText = (TextView)findViewById(R.id.sub_header_text);
        tvText.setText(R.string.diet_photo_header_text);
        
        
    }

	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
 
}
