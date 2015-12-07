package com.example.unnayan;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.*;
import android.media.MediaRecorder;
import java.io.*;
import java.util.*;

public class drawPicture extends Activity{
    private MediaRecorder myRecorder;
    private MediaPlayer myPlayer;
    private String outputFile = null;
    private ImageButton record ;
    int v=0;
    static int c=0;


    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	   
	        Intent in = getIntent();
	        @SuppressWarnings("unchecked")
			final ArrayList<Integer> photo =(ArrayList<Integer>) in.getSerializableExtra("key10");	  
	        
	        final RelativeLayout newLayout = new RelativeLayout(this);

            newLayout.setBackgroundResource(R.drawable.back);

	        TextView head = new TextView(this);
	        
	        ImageView image = new ImageView(this);

             RelativeLayout.LayoutParams imagelay = new RelativeLayout.LayoutParams(600,600);
             imagelay.setMargins(0, 120, 0, 0);
             imagelay.addRule(RelativeLayout.CENTER_HORIZONTAL);
	        
	        RelativeLayout.LayoutParams txt = new RelativeLayout.LayoutParams(
	        		RelativeLayout.LayoutParams.WRAP_CONTENT,
	        		RelativeLayout.LayoutParams.WRAP_CONTENT
	        		); 
	        
	        txt.addRule(RelativeLayout.CENTER_HORIZONTAL);
	        txt.setMargins(0, 30, 0, 0);
            image.setLayoutParams(imagelay);
	        head.setLayoutParams(txt);
	        newLayout.addView(head);
	        setContentView(newLayout);

            record = new ImageButton(this);
            RelativeLayout.LayoutParams recordbutton = new RelativeLayout.LayoutParams(90,90);
            recordbutton.addRule(RelativeLayout.CENTER_HORIZONTAL);
            recordbutton.setMargins(0, 750, 0, 0);
            record.setBackgroundResource(R.drawable.reco);
            record.setLayoutParams(recordbutton);
            newLayout.addView(record);
            setContentView(newLayout);

            record.setOnClickListener(
                    new ImageButton.OnClickListener() {
                        public void onClick(View view) {
                            if (v%2 == 0)
                            {
                                outputFile = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Unnayan/unnayanRecordings"+ c +".3gpp";
                                myRecorder = new MediaRecorder();
                                myRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
                                myRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
                                myRecorder.setAudioEncoder(MediaRecorder.OutputFormat.AMR_NB);
                                myRecorder.setOutputFile(outputFile);
                                System.out.println(c);
                                // start timer
                                start(view);
                                Toast.makeText(getApplicationContext(), "Recoring started!!!", Toast.LENGTH_SHORT).show();
                                c++;
                                record.setBackgroundResource(R.drawable.stop);
                                setContentView(newLayout);
                                v++;
                            }
                            else
                            {
                                stop(view);
                                Toast.makeText(getApplicationContext(), "Recording stopped", Toast.LENGTH_SHORT).show();
                                record.setBackgroundResource(R.drawable.reco);
                                setContentView(newLayout);
                                v++;
                            }

                        }
                    }
            );

	        if(photo.size()>0)
            {
                switch(photo.get(0))
                {
                    case 1: image.setImageResource(R.drawable.cash);
                            newLayout.addView(image);
                            head.setText("Cash");
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            head.setTextSize(70);
                            setContentView(newLayout);
                        break;
                    case 2: image.setImageResource(R.drawable.home);
                            head.setText("Home");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);
                        break;
                    case 3: image.setImageResource(R.drawable.irrigation);
                            head.setText("Irrigation");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);
                        break;
                    case 4: image.setImageResource(R.drawable.police);
                            head.setText("Police");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);
                        break;
                    case 5: image.setImageResource(R.drawable.school);
                            head.setText("School");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);
                        break;
                    case 6: image.setImageResource(R.drawable.logos);
                            head.setText("Forrest");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);

                        break;
                    case 7: image.setImageResource(R.drawable.road_01);
                            head.setText("Road");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);
                        break;
                    case 8: image.setImageResource(R.drawable.toilet);
                            head.setText("Toilet");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);
                        break;
                    case 9: image.setImageResource(R.drawable.electricity);
                            head.setText("Electricity");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);
                        break;
                    case 10:image.setImageResource(R.drawable.factory);
                            head.setText("Factory");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);
                        break;
                    case 11:image.setImageResource(R.drawable.handi);
                            head.setText("Handicraft");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);
                        break;
                    case 12:image.setImageResource(R.drawable.health);
                            head.setText("Health");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);
                        break;
                    case 13:image.setImageResource(R.drawable.unemploy);
                            head.setText("Unemployment");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);
                        break;
                    case 14:image.setImageResource(R.drawable.fish);
                            head.setText("Cash");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);
                        break;
                    case 15:image.setImageResource(R.drawable.stamp);
                            head.setText("Stamp");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);
                        break;
                    case 16:image.setImageResource(R.drawable.water_tap);
                            head.setText("Water");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);
                        break;
                    case 17:image.setImageResource(R.drawable.elephent);
                            head.setText("Elephant");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);
                        break;
                    case 18:image.setImageResource(R.drawable.cow);
                            head.setText("Cow");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);
                        break;
                    case 19:image.setImageResource(R.drawable.dryland);
                            head.setText("Dry Land");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);
                        break;
                    case 20:image.setImageResource(R.drawable.agriculture);
                            head.setText("Agriculture");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);
                        break;
                    case 21:image.setImageResource(R.drawable.food);
                            head.setText("Food");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);
                        break;
                    case 22:image.setImageResource(R.drawable.pollution);
                            head.setText("Pollution");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);
                        break;
                    case 23:image.setImageResource(R.drawable.childhunger);
                            head.setText("Child Hunger");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);
                        break;
                    case 24:image.setImageResource(R.drawable.cigar);
                            head.setText("Addiction");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);
                        break;
                    case 25:image.setImageResource(R.drawable.lake);
                            head.setText("Lake");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);
                        break;
                    case 26:image.setImageResource(R.drawable.corruption);
                            head.setText("Corruption");
                            newLayout.addView(image);
                            head.setTextSize(70);
                            head.setTextColor(Color.argb(255, 00, 255, 166));
                            setContentView(newLayout);
                        break;

                }
            }
	 }
    public void start(View v)
    {
        try
        {
            myRecorder.prepare();
            myRecorder.start();
        }
        catch (IllegalStateException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
    public void stop(View v)
    {
        try
        {
            myRecorder.stop();
            myRecorder.release();
            myRecorder  = null;
        }
        catch (IllegalStateException e)
        {
            e.printStackTrace();
        }
        catch (RuntimeException e)
        {
            e.printStackTrace();
        }

    }

}
