package com.example.android.smartone.inc;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.os.Build;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import android.widget.TextView;

public class ItemBO {
    private String name;
    private String description;
    private String time;
    private String read;
    
    
    public String getRead() {
		return read;
	}
	public void setRead(String read) {
		this.read = read;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public String getName() { return name;  }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    // / --------------------

    
    public static ArrayList getItems() {
    	
        
        String ver =Build.VERSION.RELEASE.toString(); 
        ver = ver.substring(0, ver.indexOf(".",2));
        Log.d("moms",ver);
        
        if(Float.parseFloat(ver) >= 2.3) {
        	StrictMode.ThreadPolicy policy=new StrictMode.ThreadPolicy.Builder().permitAll().build();
        	StrictMode.setThreadPolicy(policy);
        }

        Handler handler = new Handler();
        TextView textview;
        String display = "";
        ItemBO item;
        ArrayList list = new ArrayList();
        
        InputStream is = null;
        
        String result = "";
        //the year data to send, warunek rok większy od 1980
        ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
        nameValuePairs.add(new BasicNameValuePair("code_id","1"));
        //nameValuePairs.add(new BasicNameValuePair("no", question));
    	
    	//http post
        
        try{

        	    HttpClient httpclient = new DefaultHttpClient();
                HttpPost httppost = new HttpPost("http://www.gulumma.net/member/member/ajaxproc/");
                httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
                HttpResponse response = httpclient.execute(httppost);
                HttpEntity entity = response.getEntity();
                is = entity.getContent();


        }catch(Exception e){
                Log.e("moms", "Error : "+e.toString());
        }

        //convert response to string
        try{
                BufferedReader reader = new BufferedReader(new InputStreamReader(is,"UTF-8"),8);
                StringBuilder sb = new StringBuilder();
                String line = null;
                while ((line = reader.readLine()) != null) {
                        sb.append(line + "\n");
                }
                is.close();
                result=sb.toString();

        }catch(Exception e){
                Log.e("log_tag", "Error converting result "+e.toString());
        }
        
        try{

            JSONArray jArray = new JSONArray(result);

            for(int i=0;i<jArray.length();i++){
                  JSONObject json_data = jArray.getJSONObject(i);
                  item = new ItemBO();
                    
                  item.setTime(json_data.getString("TIME"));
                  item.setName(json_data.getString("NAME"));
                  item.setDescription(json_data.getString("DESC"));
                  
                  list.add(item);


            }


    }catch(JSONException e){
            Log.e("log_tag", "Error parsing data "+e.toString());
    }
 	    
    
        //Log.d("moms", jsonarray.getJSONObject(i).getString("NAME").toString() );
   	 
	  return list;
    }
}
