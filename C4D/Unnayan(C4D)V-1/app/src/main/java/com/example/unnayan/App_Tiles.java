package com.example.unnayan;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
import java.util.*;

public class App_Tiles extends Activity {
	
	MediaPlayer entrymusic;
	ArrayList<Integer> selectedtile = new ArrayList<Integer>();
    ArrayList<Integer> tile = new ArrayList<Integer>();
	 int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0,count10=0,count11=0,count12=0,count13=0,count14=0,count15=0,count16=0,count17=0,count18=0,count19=0,count20=0;
	 int count21=0,count22=0,count23=0,count24=0,count25=0,count26=0;	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_tiles);

		Intent in = getIntent();
		@SuppressWarnings("unchecked")
		final ArrayList<String> firstpage_entry =(ArrayList<String>) in.getSerializableExtra("entry1");
       
        
        final ImageButton tile1 = (ImageButton) findViewById(R.id.tile1);
        final ImageButton tile2 = (ImageButton) findViewById(R.id.tile2);
        final ImageButton tile3 = (ImageButton) findViewById(R.id.tile3);
        final ImageButton tile4 = (ImageButton) findViewById(R.id.tile4);
        final ImageButton tile5 = (ImageButton) findViewById(R.id.tile5);
        final ImageButton tile6 = (ImageButton) findViewById(R.id.tile6);
        final ImageButton tile7 = (ImageButton) findViewById(R.id.tile7);
        final ImageButton tile8 = (ImageButton) findViewById(R.id.tile8);
        final ImageButton tile9 = (ImageButton) findViewById(R.id.tile9);
        final ImageButton tile10 = (ImageButton) findViewById(R.id.tile10);
        final ImageButton tile11 = (ImageButton) findViewById(R.id.tile11);
        final ImageButton tile12 = (ImageButton) findViewById(R.id.tile12);
        final ImageButton tile13 = (ImageButton) findViewById(R.id.tile13);
        final ImageButton tile14 = (ImageButton) findViewById(R.id.tile14);
        final ImageButton tile15 = (ImageButton) findViewById(R.id.tile15);
        final ImageButton tile16 = (ImageButton) findViewById(R.id.tile16);
        final ImageButton tile17 = (ImageButton) findViewById(R.id.tile17);
        final ImageButton tile18 = (ImageButton) findViewById(R.id.tile18);
        final ImageButton tile19 = (ImageButton) findViewById(R.id.tile19);
        final ImageButton tile20 = (ImageButton) findViewById(R.id.tile20);
        final ImageButton tile21 = (ImageButton) findViewById(R.id.tile21);
        final ImageButton tile22 = (ImageButton) findViewById(R.id.tile22);
        final ImageButton tile23 = (ImageButton) findViewById(R.id.tile23);
        final ImageButton tile24 = (ImageButton) findViewById(R.id.tile24);
        final ImageButton tile25 = (ImageButton) findViewById(R.id.tile25);
        final ImageButton tile26 = (ImageButton) findViewById(R.id.tile26);
        final Button rank = (Button) findViewById(R.id.takeinterviewbutton);

        
        tile1.setOnClickListener(
     		   new Button.OnClickListener()
     		   {
     			   public void onClick(View v)
     			   {
     				   if(count1==0)
     				   {
     					  selectedtile.add(1);
     					  count1++;
     				   }
                        tile.add(1);
     				    Intent i = new Intent(App_Tiles.this, drawPicture.class);
	    				i.putExtra("key10", tile);
	    				startActivity(i);
                       triggerEntry();
     				   tile1.setBackgroundColor(Color.WHITE);
     				   tile1.getBackground().setAlpha(100);
                       tile.remove(0);
     			   }
     		   }
     		 );
        
        tile2.setOnClickListener(
      		   new Button.OnClickListener()
      		   {
      			   public void onClick(View v)
      			   {
      				    if(count2==0)
      				    {
      				    	selectedtile.add(2);
      				    	count2++;
      				    }

					   tile.add(2);
					   Intent i = new Intent(App_Tiles.this, drawPicture.class);
					   i.putExtra("key10", tile);
					   startActivity(i);
					   triggerEntry();
					   tile2.setBackgroundColor(Color.WHITE);
					   tile2.getBackground().setAlpha(100);
					   tile.remove(0);
      			   }
      		   }
      		 );
        
        tile3.setOnClickListener(
      		   new Button.OnClickListener()
      		   {
      			   public void onClick(View v)
      			   {
      				 if(count3==0)
   				     {
   				    	selectedtile.add(3);
   				    	count3++;
   				     }

					   tile.add(3);
					   Intent i = new Intent(App_Tiles.this, drawPicture.class);
					   i.putExtra("key10", tile);
					   startActivity(i);
					   triggerEntry();
					   tile3.setBackgroundColor(Color.WHITE);
					   tile3.getBackground().setAlpha(100);
					   tile.remove(0);
      			   }
      		   }
      		 );
        
        tile4.setOnClickListener(
      		   new Button.OnClickListener()
      		   {
      			   public void onClick(View v)
      			   {
      				 if(count4==0)
   				     {
   				    	selectedtile.add(4);
   				    	count4++;
   				     }

					   tile.add(4);
					   Intent i = new Intent(App_Tiles.this, drawPicture.class);
					   i.putExtra("key10", tile);
					   startActivity(i);
					   triggerEntry();
					   tile4.setBackgroundColor(Color.WHITE);
					   tile4.getBackground().setAlpha(100);
					   tile.remove(0);
      			   }
      		   }
      		 );
        
        tile5.setOnClickListener(
      		   new Button.OnClickListener()
      		   {
      			   public void onClick(View v)
      			   {
      				   if(count5==0)
      				   {
      					   selectedtile.add(5);
      					   count5++;
      				   }
					   tile.add(5);
					   Intent i = new Intent(App_Tiles.this, drawPicture.class);
					   i.putExtra("key10", tile);
					   startActivity(i);
					   triggerEntry();
					   tile5.setBackgroundColor(Color.WHITE);
					   tile5.getBackground().setAlpha(100);
					   tile.remove(0);
      			   }
      		   }
      		 );
        
        tile6.setOnClickListener(
      		   new Button.OnClickListener()
      		   {
      			   public void onClick(View v)
      			   {
      				 if(count6==0)
    				   {
    					   selectedtile.add(6);
    					   count6++;
    				   }
					   tile.add(6);
					   Intent i = new Intent(App_Tiles.this, drawPicture.class);
					   i.putExtra("key10", tile);
					   startActivity(i);
					   triggerEntry();
					   tile6.setBackgroundColor(Color.WHITE);
					   tile6.getBackground().setAlpha(100);
					   tile.remove(0);
      			   }
      		   }
      		 );
        
        tile7.setOnClickListener(
      		   new Button.OnClickListener()
      		   {
      			   public void onClick(View v)
      			   {
      				 if(count7==0)
    				   {
    					   selectedtile.add(7);
    					   count7++;
    				   }
					   tile.add(7);
					   Intent i = new Intent(App_Tiles.this, drawPicture.class);
					   i.putExtra("key10", tile);
					   startActivity(i);
					   triggerEntry();
					   tile7.setBackgroundColor(Color.WHITE);
					   tile7.getBackground().setAlpha(100);
					   tile.remove(0);
      			   }
      		   }
      		 );
        
        tile8.setOnClickListener(
      		   new Button.OnClickListener()
      		   {
      			   public void onClick(View v)
      			   {
      				 if(count8==0)
    				   {
    					   selectedtile.add(8);
    					   count8++;
    				   }

					   tile.add(8);
					   Intent i = new Intent(App_Tiles.this, drawPicture.class);
					   i.putExtra("key10", tile);
					   startActivity(i);
					   triggerEntry();
					   tile8.setBackgroundColor(Color.WHITE);
					   tile8.getBackground().setAlpha(100);
					   tile.remove(0);
      			   }
      		   }
      		 );
        
        tile9.setOnClickListener(
      		   new Button.OnClickListener()
      		   {
      			   public void onClick(View v)
      			   {
      				 if(count9==0)
    				   {
    					   selectedtile.add(9);
    					   count9++;
    				   }
					   tile.add(9);
					   Intent i = new Intent(App_Tiles.this, drawPicture.class);
					   i.putExtra("key10", tile);
					   startActivity(i);
					   triggerEntry();
					   tile9.setBackgroundColor(Color.WHITE);
					   tile9.getBackground().setAlpha(100);
					   tile.remove(0);
      			   }
      		   }
      		 );
        
        tile10.setOnClickListener(
       		   new Button.OnClickListener()
       		   {
       			   public void onClick(View v)
       			   {
       				 if(count10==0)
     				   {
     					   selectedtile.add(10);
     					   count10++;
     				   }
					   tile.add(10);
					   Intent i = new Intent(App_Tiles.this, drawPicture.class);
					   i.putExtra("key10", tile);
					   startActivity(i);
					   triggerEntry();
					   tile10.setBackgroundColor(Color.WHITE);
					   tile10.getBackground().setAlpha(100);
					   tile.remove(0);
       			   }
       		   }
       		 );
        
         tile11.setOnClickListener(
      		   new Button.OnClickListener()
      		   {
      			   public void onClick(View v)
      			   {
      				 if(count11==0)
    				   {
    					   selectedtile.add(11);
    					   count11++;
    				   }
					   tile.add(11);
					   Intent i = new Intent(App_Tiles.this, drawPicture.class);
					   i.putExtra("key10", tile);
					   startActivity(i);
					   triggerEntry();
					   tile11.setBackgroundColor(Color.WHITE);
					   tile11.getBackground().setAlpha(100);
					   tile.remove(0);
      			   }
      		   }
      		 );
        
       tile12.setOnClickListener(
      		   new Button.OnClickListener()
      		   {
      			   public void onClick(View v)
      			   {
      				 if(count12==0)
    				   {
    					   selectedtile.add(12);
    					   count12++;
    				   }

					   tile.add(12);
					   Intent i = new Intent(App_Tiles.this, drawPicture.class);
					   i.putExtra("key10", tile);
					   startActivity(i);
					   triggerEntry();
					   tile12.setBackgroundColor(Color.WHITE);
					   tile12.getBackground().setAlpha(100);
					   tile.remove(0);
      			   }
      		   }
      		 );
        
        tile13.setOnClickListener(
      		   new Button.OnClickListener()
      		   {
      			   public void onClick(View v)
      			   {
      				 if(count13==0)
    				   {
    					   selectedtile.add(13);
    					   count13++;
    				   }
					   tile.add(13);
					   Intent i = new Intent(App_Tiles.this, drawPicture.class);
					   i.putExtra("key10", tile);
					   startActivity(i);
					   triggerEntry();
					   tile13.setBackgroundColor(Color.WHITE);
					   tile13.getBackground().setAlpha(100);
					   tile.remove(0);
      			   }
      		   }
      		 );    
        tile14.setOnClickListener(
       		   new Button.OnClickListener()
       		   {
       			   public void onClick(View v)
       			   {
       				if(count14==0)
   				   {
   					   selectedtile.add(14);
   					   count14++;
   				   }
					   tile.add(14);
					   Intent i = new Intent(App_Tiles.this, drawPicture.class);
					   i.putExtra("key10", tile);
					   startActivity(i);
					   triggerEntry();
					   tile14.setBackgroundColor(Color.WHITE);
					   tile14.getBackground().setAlpha(100);
					   tile.remove(0);
       			   }
       		   }
       		 );    
        tile15.setOnClickListener(
       		   new Button.OnClickListener()
       		   {
       			   public void onClick(View v)
       			   {
       				if(count15==0)
   				   {
   					   selectedtile.add(15);
   					   count15++;
   				   }
					   tile.add(15);
					   Intent i = new Intent(App_Tiles.this, drawPicture.class);
					   i.putExtra("key10", tile);
					   startActivity(i);
					   triggerEntry();
					   tile15.setBackgroundColor(Color.WHITE);
					   tile15.getBackground().setAlpha(100);
					   tile.remove(0);
       			   }
       		   }
       		 );    
        tile16.setOnClickListener(
       		   new Button.OnClickListener()
       		   {
       			   public void onClick(View v)
       			   {
       				if(count16==0)
   				   {
   					   selectedtile.add(16);
   					   count16++;
   				   }
					   tile.add(16);
					   Intent i = new Intent(App_Tiles.this, drawPicture.class);
					   i.putExtra("key10", tile);
					   startActivity(i);
					   triggerEntry();
					   tile16.setBackgroundColor(Color.WHITE);
					   tile16.getBackground().setAlpha(100);
					   tile.remove(0);
       			   }
       		   }
       		 );    
        tile17.setOnClickListener(
       		   new Button.OnClickListener()
       		   {
       			   public void onClick(View v)
       			   {
       				if(count17==0)
   				   {
   					   selectedtile.add(17);
   					   count17++;
   				   }
					   tile.add(17);
					   Intent i = new Intent(App_Tiles.this, drawPicture.class);
					   i.putExtra("key10", tile);
					   startActivity(i);
					   triggerEntry();
					   tile17.setBackgroundColor(Color.WHITE);
					   tile17.getBackground().setAlpha(100);
					   tile.remove(0);
       			   }
       		   }
       		 );    
        tile18.setOnClickListener(
       		   new Button.OnClickListener()
       		   {
       			   public void onClick(View v)
       			   {
       				if(count18==0)
   				   {
   					   selectedtile.add(18);
   					   count18++;
   				   }
					   tile.add(18);
					   Intent i = new Intent(App_Tiles.this, drawPicture.class);
					   i.putExtra("key10", tile);
					   startActivity(i);
					   triggerEntry();
					   tile18.setBackgroundColor(Color.WHITE);
					   tile18.getBackground().setAlpha(100);
					   tile.remove(0);
       			   }
       		   }
       		 );    
        tile19.setOnClickListener(
       		   new Button.OnClickListener()
       		   {
       			   public void onClick(View v)
       			   {
       				if(count19==0)
   				   {
   					   selectedtile.add(19);
   					   count19++;
   				   }
					   tile.add(19);
					   Intent i = new Intent(App_Tiles.this, drawPicture.class);
					   i.putExtra("key10", tile);
					   startActivity(i);
					   triggerEntry();
					   tile19.setBackgroundColor(Color.WHITE);
					   tile19.getBackground().setAlpha(100);
					   tile.remove(0);
       			   }
       		   }
       		 );    
        tile20.setOnClickListener(
       		   new Button.OnClickListener()
       		   {
       			   public void onClick(View v)
       			   {
       				if(count20==0)
   				   {
   					   selectedtile.add(20);
   					   count20++;
   				   }
					   tile.add(20);
					   Intent i = new Intent(App_Tiles.this, drawPicture.class);
					   i.putExtra("key10", tile);
					   startActivity(i);
					   triggerEntry();
					   tile20.setBackgroundColor(Color.WHITE);
					   tile20.getBackground().setAlpha(100);
					   tile.remove(0);
       			   }
       		   }
       		 ); 
        
        tile21.setOnClickListener(
        		   new Button.OnClickListener()
        		   {
        			   public void onClick(View v)
        			   {
        				if(count21==0)
    				   {
    					   selectedtile.add(21);
    					   count21++;
    				   }
						   tile.add(21);
						   Intent i = new Intent(App_Tiles.this, drawPicture.class);
						   i.putExtra("key10", tile);
						   startActivity(i);
						   triggerEntry();
						   tile21.setBackgroundColor(Color.WHITE);
						   tile21.getBackground().setAlpha(100);
						   tile.remove(0);
        			   }
        		   }
        		 ); 
        
        tile22.setOnClickListener(
     		   new Button.OnClickListener()
     		   {
     			   public void onClick(View v)
     			   {
     				if(count22==0)
 				   {
 					   selectedtile.add(22);
 					   count22++;
 				   }
					   tile.add(22);
					   Intent i = new Intent(App_Tiles.this, drawPicture.class);
					   i.putExtra("key10", tile);
					   startActivity(i);
					   triggerEntry();
					   tile22.setBackgroundColor(Color.WHITE);
					   tile22.getBackground().setAlpha(100);
					   tile.remove(0);
     			   }
     		   }
     		 ); 
        
        tile23.setOnClickListener(
     		   new Button.OnClickListener()
     		   {
     			   public void onClick(View v)
     			   {
     				if(count23==0)
 				   {
 					   selectedtile.add(23);
 					   count23++;
 				   }
					   tile.add(23);
					   Intent i = new Intent(App_Tiles.this, drawPicture.class);
					   i.putExtra("key10", tile);
					   startActivity(i);
					   triggerEntry();
					   tile23.setBackgroundColor(Color.WHITE);
					   tile23.getBackground().setAlpha(100);
					   tile.remove(0);
     			   }
     		   }
     		 ); 
        
        tile24.setOnClickListener(
     		   new Button.OnClickListener()
     		   {
     			   public void onClick(View v)
     			   {
     				if(count24==0)
 				   {
 					   selectedtile.add(24);
 					   count24++;
 				   }
					   tile.add(1);
					   Intent i = new Intent(App_Tiles.this, drawPicture.class);
					   i.putExtra("key10", tile);
					   startActivity(i);
					   triggerEntry();
					   tile24.setBackgroundColor(Color.WHITE);
					   tile24.getBackground().setAlpha(100);
					   tile.remove(0);
     			   }
     		   }
     		 );
        
        tile25.setOnClickListener(
      		   new Button.OnClickListener()
      		   {
      			   public void onClick(View v)
      			   {
      				if(count25==0)
  				   {
  					   selectedtile.add(25);
  					   count25++;
  				   }
					   tile.add(25);
					   Intent i = new Intent(App_Tiles.this, drawPicture.class);
					   i.putExtra("key10", tile);
					   startActivity(i);
					   triggerEntry();
					   tile25.setBackgroundColor(Color.WHITE);
					   tile25.getBackground().setAlpha(100);
					   tile.remove(0);
      			   }
      		   }
      		 );
        
        tile26.setOnClickListener(
      		   new Button.OnClickListener()
      		   {
      			   public void onClick(View v)
      			   {
      				if(count26==0)
  				   {
  					   selectedtile.add(26);
  					   count26++;
  				   }
					   tile.add(26);
					   Intent i = new Intent(App_Tiles.this, drawPicture.class);
					   i.putExtra("key10", tile);
					   startActivity(i);
					   triggerEntry();
					   tile26.setBackgroundColor(Color.WHITE);
					   tile26.getBackground().setAlpha(100);
					   tile.remove(0);
      			   }
      		   }
      		 );
        
        
        rank.setOnClickListener(
        		new Button.OnClickListener()
        		{
        			public void onClick(View v)
        			{
        				if(selectedtile.size()>0)
        				{
        					Intent i = new Intent(App_Tiles.this,Input.class);
            				i.putExtra("key", selectedtile);
							i.putExtra("entry1",firstpage_entry);
            				startActivity(i);
        				}
        				
        			}
        		});
}
    private void triggerEntry()
	 {
		 entrymusic = MediaPlayer.create(App_Tiles.this, R.raw.enter);
		 entrymusic.start();
	 }
     

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
	
}