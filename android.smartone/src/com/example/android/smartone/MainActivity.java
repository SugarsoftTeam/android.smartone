package com.example.android.smartone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ViewFlipper;

import com.example.android.smartone.titleActivity;
import com.example.android.smartone.all.diet_photo;
import com.example.android.smartone.all.entrance_list;
import com.example.android.smartone.all.festival_album_list;
import com.example.android.smartone.all.freeboard_list;
import com.example.android.smartone.all.leaving_list;
import com.example.android.smartone.all.news_list;
import com.example.android.smartone.ban.attendance_book_list;
import com.example.android.smartone.ban.class_album_list;
import com.example.android.smartone.ban.class_story_list;
import com.example.android.smartone.ban.entry_ing_list;
import com.example.android.smartone.ban.homereport_list;
import com.example.android.smartone.ban.medicine_list;
import com.example.android.smartone.ban.notify_homemake_view;
import com.example.android.smartone.customer.deposit_list;
import com.example.android.smartone.customer.gulumma_mantoman_list;
import com.example.android.smartone.customer.gulumma_noti_list;
import com.example.android.smartone.customer.happycall_write;
import com.example.android.smartone.customer.subject_list;
import com.example.android.smartone.each.mantoman_list;
import com.example.android.smartone.each.receiveMsg_list;
import com.example.android.smartone.inc.Footer;
import com.example.android.smartone.info.freetalk_list;
import com.example.android.smartone.job.job_man_list;
import com.example.android.smartone.job.recruit_man_list;
import com.example.android.smartone.notice.noti_list;
import com.example.android.smartone.notice.offer_list;

public class MainActivity extends Activity {
	
	private ViewFlipper m_viewFlipper;
	private int m_nPreTouchPosX = 0;
	Footer footer;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        // notice ?????????占쏙옙???- ???????????占�?占쏙옙????占쏙옙???癒쇽옙? ??
        //startActivity(new Intent(this, noticeActivity.class)); 
        
        // �����蹂댁�二쇨린
        
        requestWindowFeature(Window.FEATURE_NO_TITLE);
     	startActivity(new Intent(this, titleActivity.class));
     	
        // 占�占쏙옙??????? 癒쇽옙? 蹂댐옙?二쇨린
		//Intent intenttitle = new Intent( MainActivity.this, loginActivity.class );
		//startActivity(intenttitle);
		
        //requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_main);
        //getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.header);
        
        Log.d("moms", "?占쎄린??占�?");
        
        footer = (Footer) findViewById(R.id.layoutFooter);
        footer.setActivity(this);
    		    
        
        m_viewFlipper = (ViewFlipper)findViewById(R.id.viewFlipper);
        m_viewFlipper.setOnTouchListener(MyTouchListener);	    
	           
        ImageButton btnMsg = (ImageButton)findViewById(R.id.BtnMsg);
        btnMsg.setOnClickListener( new View.OnClickListener() {
			public void onClick(View v) {
				//setContentView(R.layout.activity_sub);
				Intent intentsub = new Intent( MainActivity.this, receiveMsg_list.class );
				startActivity(intentsub);
			}
		}); 

        //1�� ��� 
        ImageButton btnMantoman = (ImageButton)findViewById(R.id.BtnMantoman);
        btnMantoman.setOnClickListener( new View.OnClickListener() {
			public void onClick(View v) {
				Intent intentsub = new Intent( MainActivity.this, mantoman_list.class );
				startActivity(intentsub);
			}
		}); 
        
        //��� ��┝��
        
        ImageButton btnNotify = (ImageButton)findViewById(R.id.BtnNotify);
        
        btnNotify.setOnClickListener( new  View.OnClickListener() {
			public void onClick(View v) {
				Intent intentsub = new Intent( MainActivity.this, notify_homemake_view.class );
				startActivity(intentsub);
			}
		}); 
        
        
        //異�껐愿�━
        ImageButton btnAttendance = (ImageButton)findViewById(R.id.BtnAttendance);
        btnAttendance.setOnClickListener( new View.OnClickListener() {
			public void onClick(View v) {
				Intent intentsub = new Intent( MainActivity.this, attendance_book_list.class );
				startActivity(intentsub);
			}
		}); 
        
        //媛���듭�臾�        
        ImageButton btnHomereport = (ImageButton)findViewById(R.id.BtnHomereport);
        btnHomereport.setOnClickListener( new View.OnClickListener() {
			public void onClick(View v) {
				Intent intentsub = new Intent( MainActivity.this, homereport_list.class );
				startActivity(intentsub);
			}
		}); 
        
        
        ImageButton btnEntry = (ImageButton)findViewById(R.id.BtnEntry);
        btnEntry.setOnClickListener( new View.OnClickListener() {
			public void onClick(View v) {
				Intent intentsub = new Intent( MainActivity.this, entry_ing_list.class );
				startActivity(intentsub);
			}
		}); 

              
        
        ImageButton btnMedicine = (ImageButton)findViewById(R.id.BtnMedicine);
        btnMedicine.setOnClickListener( new View.OnClickListener() {
			public void onClick(View v) {
				Intent intentsub = new Intent( MainActivity.this, medicine_list.class );
				startActivity(intentsub);
			}
		}); 

        //�곕━ 諛��⑤� 
        ImageButton btnClassAlbum = (ImageButton)findViewById(R.id.BtnClassAlbum);
        btnClassAlbum.setOnClickListener( new View.OnClickListener() {
			public void onClick(View v) {
				Intent intentsub = new Intent( MainActivity.this, class_album_list.class );
				startActivity(intentsub);
			}
		}); 

        
        //�곕━ 諛��댁�湲�        
        
        ImageButton btnClassStory = (ImageButton)findViewById(R.id.BtnClassStory);
        btnClassStory.setOnClickListener( new View.OnClickListener() {
			public void onClick(View v) {
				Intent intentsub = new Intent( MainActivity.this, class_story_list.class );
				startActivity(intentsub);
			}
		}); 
        
        
        ImageButton btnDiet = (ImageButton)findViewById(R.id.BtnDiet);
        btnDiet.setOnClickListener( new View.OnClickListener(){
			public void onClick(View v) {
				Intent intentsub = new Intent( MainActivity.this, diet_photo.class );
				startActivity(intentsub);
			}
		}); 

        //
        
        ImageButton btnFestivalAlbum = (ImageButton)findViewById(R.id.BtnFestivalAlbum);
        btnFestivalAlbum.setOnClickListener( new View.OnClickListener(){
        	public void onClick(View v) {
				Intent intentsub = new Intent( MainActivity.this, festival_album_list.class );
				startActivity(intentsub);
			}
		}); 

        //
        
        ImageButton btnEntrance = (ImageButton)findViewById(R.id.BtnEntrance);
        btnEntrance.setOnClickListener( new View.OnClickListener() {
			public void onClick(View v) {
				Intent intentsub = new Intent( MainActivity.this, entrance_list.class );
				startActivity(intentsub);
			}
		}); 
        
		//
		ImageButton btnNews = (ImageButton)findViewById(R.id.BtnNews);
		btnNews.setOnClickListener( new View.OnClickListener() {
			public void onClick(View v) {
				Intent intentsub = new Intent( MainActivity.this, news_list.class );
				startActivity(intentsub);
			}
		}); 
		
		//
		ImageButton btnFreeboard = (ImageButton)findViewById(R.id.BtnFreeboard);
		btnFreeboard.setOnClickListener( new View.OnClickListener() {
			public void onClick(View v) {
				Intent intentsub = new Intent( MainActivity.this, freeboard_list.class );
				startActivity(intentsub);
			}
		});  
				
		//
		ImageButton btnLeaving = (ImageButton)findViewById(R.id.BtnLeaving);
		btnLeaving.setOnClickListener( new View.OnClickListener() {
			public void onClick(View v) {
				Intent intentsub = new Intent( MainActivity.this, leaving_list.class );
				startActivity(intentsub);
			}
		});  
		
		//
		ImageButton btnNoti = (ImageButton)findViewById(R.id.BtnNoti);
		btnNoti.setOnClickListener( new View.OnClickListener() {
			public void onClick(View v) {
				Intent intentsub = new Intent( MainActivity.this, noti_list.class );
				startActivity(intentsub);
			}
		});  
		
		//
		ImageButton btnOffer = (ImageButton)findViewById(R.id.BtnOffer);
		btnOffer.setOnClickListener( new View.OnClickListener() {
			public void onClick(View v) {
				Intent intentsub = new Intent( MainActivity.this, offer_list.class );
				startActivity(intentsub);
			}
		}); 
		
		//
		ImageButton btnRecruit = (ImageButton)findViewById(R.id.BtnRecruit);
		btnRecruit.setOnClickListener( new View.OnClickListener() {
			public void onClick(View v) {
				Intent intentsub = new Intent( MainActivity.this, recruit_man_list.class );
				startActivity(intentsub);
			}
		}); 
		//
		ImageButton btnJob = (ImageButton)findViewById(R.id.BtnJob);
		btnJob.setOnClickListener( new View.OnClickListener() {
			public void onClick(View v) {
				Intent intentsub = new Intent( MainActivity.this, job_man_list.class );
				startActivity(intentsub);
			}
		}); 
		
		//
		ImageButton btnGulumma = (ImageButton)findViewById(R.id.BtnGulumma);
		btnGulumma.setOnClickListener( new View.OnClickListener() {
			public void onClick(View v) {
				Intent intentsub = new Intent( MainActivity.this, gulumma_noti_list.class );
				startActivity(intentsub);
			}
		}); 
		
		//
		ImageButton btnGulummaMantoman = (ImageButton)findViewById(R.id.BtnGulummaMantoman);
		btnGulummaMantoman.setOnClickListener( new View.OnClickListener() {
			public void onClick(View v) {
				Intent intentsub = new Intent( MainActivity.this, gulumma_mantoman_list.class );
				startActivity(intentsub);
			}
		}); 
		
		//
		ImageButton btnSubject = (ImageButton)findViewById(R.id.BtnSubject);
		btnSubject.setOnClickListener( new View.OnClickListener() {
			public void onClick(View v) {
				Intent intentsub = new Intent( MainActivity.this, subject_list.class );
				startActivity(intentsub);
			}
		}); 
		
		//
		ImageButton btnDeposit = (ImageButton)findViewById(R.id.BtnDeposit);
		btnDeposit.setOnClickListener( new View.OnClickListener() {
			public void onClick(View v) {
				Intent intentsub = new Intent( MainActivity.this, deposit_list.class );
				startActivity(intentsub);
			}
		}); 
		
		//
		ImageButton btnHappycall = (ImageButton)findViewById(R.id.BtnHappycall);
		btnHappycall.setOnClickListener( new View.OnClickListener() {
			public void onClick(View v) {
				Intent intentsub = new Intent( MainActivity.this, happycall_write.class );
				startActivity(intentsub);
			}
		}); 
		
		//
		ImageButton btnFreetalk = (ImageButton)findViewById(R.id.BtnFreetalk);
		btnFreetalk.setOnClickListener( new View.OnClickListener() {
			public void onClick(View v) {
				Intent intentsub = new Intent( MainActivity.this, freetalk_list.class );
				startActivity(intentsub);
			}
		}); 
        
        
        
    }
    
    // 
    public boolean onCreateOptionsMenu(Menu menu) {
    	getMenuInflater().inflate(R.menu.option, menu);
    	return true;
    }
    
    // 
    public boolean onOptionsItemSelected(MenuItem item) {
    	
    	switch(item.getItemId()) {
    	case R.id.settings:
    		return true;
    	case R.id.logout:
    		return true;
    	case R.id.exit:
    		finish();
    		return true;
    	}    	
		return true;
	}

    private void MoveNextView()
    {
    	Log.d("moms","?占쏙옙? ?占쏙옙?");
    	m_viewFlipper.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.apear_from_right));
    	m_viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.disappear_to_left));
    	m_viewFlipper.showNext();
    }
     
    private void MovewPreviousView()
    {
    	Log.d("moms","?占쏙옙? ?占쏙옙?");
    	m_viewFlipper.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.apear_from_left));
    	m_viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.disappear_to_right));
    	m_viewFlipper.showPrevious();
    }

    View.OnTouchListener MyTouchListener = new View.OnTouchListener()
    {
	    public boolean onTouch(View v, MotionEvent event)
	    {
	    	int s = (int)event.getX();
	    	Log.d("moms", s+"");
	    	
		    if (event.getAction() == MotionEvent.ACTION_DOWN)
		    {
		    	m_nPreTouchPosX = (int)event.getX();
		    }
	     
		    if (event.getAction() == MotionEvent.ACTION_UP)
		    {
		    	int nTouchPosX = (int)event.getX();
		     
			    if (nTouchPosX < m_nPreTouchPosX)
			    {
			    MoveNextView();
			    }
			    else if (nTouchPosX > m_nPreTouchPosX)
			    {
			    MovewPreviousView();
			    }
		     
			    m_nPreTouchPosX = nTouchPosX;
		    }
		    return true;
	    }
    };    
    
}
