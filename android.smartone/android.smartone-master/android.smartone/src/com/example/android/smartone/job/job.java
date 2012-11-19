package com.example.android.smartone.job;

import java.util.ArrayList;

import com.example.android.smartone.R;
import com.example.android.smartone.R.id;
import com.example.android.smartone.R.layout;
import com.example.android.smartone.inc.Footer;
import com.example.android.smartone.inc.ItemBO;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class job extends Activity implements OnClickListener {
 
    private ListView listview;
    private ArrayList mListItem;
    Footer footer;
 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.list);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.header);
        
        listview = (ListView) findViewById(R.id.list_view);
        mListItem = ItemBO.getItems();
        listview.setAdapter(new ListAdapter(job.this, R.id.list_view,
                mListItem));
        
        footer = (Footer) findViewById(R.id.layoutFooter);
        footer.setActivity(this);
        
    }
 
    public void onClick(View v) {
    }
 
    // ***ListAdapter***
    private class ListAdapter extends ArrayAdapter { //--CloneChangeRequired
        private ArrayList mList; //--CloneChangeRequired
        private Context mContext;
 
        public ListAdapter(Context context, int textViewResourceId,
                ArrayList list) { //--CloneChangeRequired
            super(context, textViewResourceId, list);
            this.mList = list;
            this.mContext = context;
        }
 
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = convertView;
            try {
                if (view == null) {
                    LayoutInflater vi = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    view = vi.inflate(R.layout.list_item, null); //--CloneChangeRequired(list_item)
                }
                final ItemBO listItem = (ItemBO) mList.get(position); //--CloneChangeRequired
                if (listItem != null) {
                    // setting list_item views
                    ((TextView) view.findViewById(R.id.tv_name))
                            .setText(listItem.getName());
                    ((TextView) view.findViewById(R.id.tv_description))
                    .setText(listItem.getDescription());
                    ((TextView) view.findViewById(R.id.tv_time))
                    .setText(listItem.getTime());
                    
                    view.setOnClickListener(new OnClickListener() {
                        public void onClick(View arg0) { //--clickOnListItem
                            Intent myIntent = new Intent(job.this,
                            		job_view.class);
                            myIntent.putExtra("NAME", listItem.getName());
                            myIntent.putExtra("DESC", listItem.getDescription());
                            myIntent.putExtra("TIME", listItem.getTime());
                            startActivity(myIntent);
                            //finish();
                        }
                    });
                }
            } catch (Exception e) {
                Log.i(job.ListAdapter.class.toString(), e.getMessage());
            }
            return view;
        }
    }
}
