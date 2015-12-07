package com.example.unnayan;

import android.R.color;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.*;

import android.view.View;
import android.widget.*;
import android.widget.ImageView.ScaleType;
import android.graphics.*;

public class SelectedTile extends Activity 
{
	
	
	int count21=0,count22=0,count23=0,count24,count25=0,count26=0;
	int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0,count10=0,count11=0,count12=0,count13=0,count14=0,count15=0,count16=0,count17=0,count18=0,count19=0,count20=0;
	 ArrayList<Integer> selected = new ArrayList<Integer>();
 	int counter=0;
    int w;
		
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

              
        Intent in = getIntent();
        @SuppressWarnings("unchecked")
		final ArrayList<Integer> elements =(ArrayList<Integer>) in.getSerializableExtra("key1");
        final ArrayList<String> firstpage_entry =(ArrayList<String>) in.getSerializableExtra("entry1");
        final ArrayList<String> secondpage_entry =(ArrayList<String>) in.getSerializableExtra("entry2");

        int length = elements.size();
  
        int i,x=40,start=40,y=20,extra=110;
        
        final RelativeLayout newLayout = new RelativeLayout(this);

     //   newLayout.setBackgroundColor(Color.rgb(00,00, 00));
        newLayout.setBackgroundResource(R.drawable.back);
        
        RelativeLayout.LayoutParams ntxt = new RelativeLayout.LayoutParams(385,100);
        
        ImageButton next = new ImageButton(this);
       // next.setText("Next");
        next.setBackgroundResource(R.drawable.next);
      //  next.setTextSize(30);
       // next.setBackgroundColor(Color.rgb(00, 00, 00));
//        next.setAlpha(50);
        next.setId(1001);
        ntxt.setMargins(100, 750, 0, 0);
        next.setLayoutParams(ntxt);
        newLayout.addView(next);
        setContentView(newLayout);
        
        final ImageButton move = (ImageButton) findViewById(1001);
        
        move.setOnClickListener(
   		   new ImageButton.OnClickListener()
   		   {
   			   public void onClick(View v)
   			   {
   				   if(selected.size()==3)
   				   {
	   					Intent i = new Intent(SelectedTile.this,finalthree.class);
	    				i.putExtra("key", selected);
                        i.putExtra("entry1",firstpage_entry);
                        i.putExtra("entry2",secondpage_entry);
	    				startActivity(i);
   				   }
   	
   				}
   		   });
        
        
        for(i=0;i<length;i++)
        {
        	ImageButton imagetile = new ImageButton(this);
        	TextView detail = new TextView(this);
            detail.setTextSize(20);
        	newLayout.addView(imagetile);
        	newLayout.addView(detail);
        	RelativeLayout.LayoutParams btn = new RelativeLayout.LayoutParams(85,85);
        	 if(x<500)
        	 {
        		 btn.setMargins(x,y,0,0);
        		 x=x+extra;
        	 }
        	 else
        	 {
        		 x=start;
        		 y=y+extra;
        		 btn.setMargins(x,y,0,0);
        		 x=x+extra;
        	 }      	 
        	 imagetile.setLayoutParams(btn);
        	 detail.setLayoutParams(btn);
        	switch(elements.get(i))
        	{
        	   case 1: imagetile.setBackgroundResource(R.drawable.cashi);
        	   		   imagetile.setId(1);
        	   		   detail.setText("Cash");
        	   		   setContentView(newLayout);
        	   					break;
        	   case 2: imagetile.setBackgroundResource(R.drawable.homei);
        	   					detail.setText("Home");
        	   					imagetile.setId(2);
        	   					setContentView(newLayout);
        	   					break;
        	   case 3: imagetile.setBackgroundResource(R.drawable.irrigationi);
								detail.setText("Irrigation");
								setContentView(newLayout);
								imagetile.setId(3);
								break;
        	   case 4:  imagetile.setBackgroundResource(R.drawable.policei);
						detail.setText("Police");
						setContentView(newLayout);
						imagetile.setId(4);
						break;
        	   case 5: imagetile.setBackgroundResource(R.drawable.schooli);
				       detail.setText("School");
				       setContentView(newLayout);
				       imagetile.setId(5);
				       break;
        	   case 6: imagetile.setBackgroundResource(R.drawable.logosi);
						detail.setText("Forrest");
						setContentView(newLayout);
						imagetile.setId(6);
				        break;
        	   case 7: imagetile.setBackgroundResource(R.drawable.roadi);
					   detail.setText("Road");
					   setContentView(newLayout);
					   imagetile.setId(7);
					   break;
        	   case 8: imagetile.setBackgroundResource(R.drawable.toileti);
	   		   		   detail.setText("Toilet");
	   		   		   setContentView(newLayout);
	   		   		   imagetile.setId(8);
	   				   break;
        	   case 9: imagetile.setBackgroundResource(R.drawable.electricityi);
	   					detail.setText("Electricity");
	   					setContentView(newLayout);
	   					imagetile.setId(9);
	   					break;
        	   case 10: imagetile.setBackgroundResource(R.drawable.factoryi);
						detail.setText("Factory");
						setContentView(newLayout);
						imagetile.setId(10);
						break;
        	   case 11:  imagetile.setBackgroundResource(R.drawable.handii);
						detail.setText("Handicraft");
						setContentView(newLayout);
						imagetile.setId(11);
						break;
        	   case 12: imagetile.setBackgroundResource(R.drawable.healthi);
		       			detail.setText("Health");
		       			setContentView(newLayout);
		       			imagetile.setId(12);
		       			break;
			   case 13: imagetile.setBackgroundResource(R.drawable.unemployi);
						detail.setText("Unemployment");
						setContentView(newLayout);
						imagetile.setId(13);
						break;
			   case 14: imagetile.setBackgroundResource(R.drawable.fishi);
					   detail.setText("Fish");
					   setContentView(newLayout);
					   imagetile.setId(14);
						break;
			   case 15: imagetile.setBackgroundResource(R.drawable.stampi);
						detail.setText("Stamp");
						setContentView(newLayout);
						imagetile.setId(15);
						break;
			   case 16: imagetile.setBackgroundResource(R.drawable.water_tapi);
						detail.setText("Water");
						setContentView(newLayout);
						imagetile.setId(16);
						break;
			   case 17:  imagetile.setBackgroundResource(R.drawable.elephenti);
			   			detail.setText("Elephant");
			   			setContentView(newLayout);
			   			imagetile.setId(17);
			   			break;
			   case 18: imagetile.setBackgroundResource(R.drawable.cowi);
			   		  detail.setText("Cow");
			   		  setContentView(newLayout);
			   		imagetile.setId(18);
			   		  break;
				case 19: imagetile.setBackgroundResource(R.drawable.drylandi);
					detail.setText("Dry Land");
					setContentView(newLayout);
					imagetile.setId(19);
					break;
				case 20: imagetile.setBackgroundResource(R.drawable.agriculturei);
				   detail.setText("Agriculture");
				   setContentView(newLayout);
				   imagetile.setId(20);
					break;
				case 21: imagetile.setBackgroundResource(R.drawable.foodi) ;
					detail.setText("Food");
					setContentView(newLayout);
					imagetile.setId(21);
					break;
				case 22: imagetile.setBackgroundResource(R.drawable.pollutioni);
						 detail.setText("Pollution");
						 setContentView(newLayout);
						 imagetile.setId(22);
						 break;
				case 23: imagetile.setBackgroundResource(R.drawable.childhungeri);
						 detail.setText("Child Hunger");
						 setContentView(newLayout);
						 imagetile.setId(23);
						 break;
				case 24: imagetile.setBackgroundResource(R.drawable.cigari);
					     detail.setText("Addiction");
					     setContentView(newLayout);
					     imagetile.setId(24);
					     break;
				case 25: imagetile.setBackgroundResource(R.drawable.lakei);
						detail.setText("Lake");
						setContentView(newLayout);
						imagetile.setId(25);
						break;
				case 26: imagetile.setBackgroundResource(R.drawable.corruptioni);
						detail.setText("Corruption");
						setContentView(newLayout);
						imagetile.setId(26);
						break;

        	}
        	
        }

        for(w=0;w<elements.size();w++)
        {
            if(elements.get(w)==1)
            {
                final ImageButton tile1 = (ImageButton) findViewById(1);

                tile1.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count1%2==0)
                                {
                                    //clickable
                                    if(counter<3&&counter>=0)
                                    {
                                        count1++;
                                        selected.add(1);
                                        counter=counter+1;
                                        tile1.setBackgroundColor(Color.WHITE);
                                        tile1.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter<=3&&counter>0)
                                    {
                                        int k;
                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==1)
                                            {
                                                count1++;
                                                selected.remove(k);
                                                tile1.setBackgroundResource(R.drawable.cashi);
                                                setContentView(newLayout);
                                                counter--;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                );
            }
            if(elements.get(w)==2)
            {
                final ImageButton tile2 = (ImageButton) findViewById(2);

                tile2.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count2%2==0)
                                {
                                    //clickable
                                    if(counter<3&&counter>=0)
                                    {
                                        count2++;
                                        selected.add(2);
                                        counter++;
                                        tile2.setBackgroundColor(Color.WHITE);
                                        tile2.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter<=3&&counter>0)
                                    {
                                        int k;
                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==2)
                                            {
                                                count2++;
                                                counter--;
                                                selected.remove(k);
                                                tile2.setBackgroundResource(R.drawable.homei);
                                                setContentView(newLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                );
            }
            if(elements.get(w)==3)
            {
                final ImageButton tile3 = (ImageButton) findViewById(3);
                tile3.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count3%2==0)
                                {
                                    //clickable
                                    if(counter<3&&counter>=0)
                                    {
                                        count3++;
                                        selected.add(3);
                                        counter++;
                                        tile3.setBackgroundColor(Color.WHITE);
                                        tile3.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter<=3&&counter>0)
                                    {
                                        int k;
                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==3)
                                            {
                                                count3++;
                                                counter--;
                                                selected.remove(k);
                                                tile3.setBackgroundResource(R.drawable.irrigationi);
                                                setContentView(newLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                );

            }
            if(elements.get(w)==4)
            {
                final ImageButton tile4 = (ImageButton) findViewById(4);
                tile4.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count4%2==0)
                                {
                                    //Clickable
                                    if(counter<3&&counter>=0)
                                    {
                                        count4++;
                                        selected.add(4);
                                        counter++;
                                        tile4.setBackgroundColor(Color.WHITE);
                                        tile4.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter>0&&counter<=3)
                                    {
                                        int k;
                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==4)
                                            {
                                                count4++;
                                                selected.remove(k);
                                                counter--;
                                                tile4.setBackgroundResource(R.drawable.policei);
                                                setContentView(newLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                );
            }
            if(elements.get(w)==5)
            {
                final ImageButton tile5 = (ImageButton) findViewById(5);
                tile5.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count5%2==0)
                                {
                                    //Clickable
                                    if(counter<3&&counter>=0)
                                    {
                                        count5++;
                                        selected.add(5);
                                        counter++;
                                        tile5.setBackgroundColor(Color.WHITE);
                                        tile5.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter>0&&counter<=3)
                                    {
                                        int k;
                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==5)
                                            {
                                                count5++;
                                                selected.remove(k);
                                                counter--;
                                                tile5.setBackgroundResource(R.drawable.schooli);
                                                setContentView(newLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                );

            }
            if(elements.get(w)==6)
            {
                final ImageButton tile6 = (ImageButton) findViewById(6);
                tile6.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count6%2==0)
                                {
                                    //clickable
                                    if(counter<3&&counter>=0)
                                    {
                                        count6++;
                                        selected.add(6);
                                        counter++;
                                        tile6.setBackgroundColor(Color.WHITE);
                                        tile6.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter<=3&&counter>0)
                                    {
                                        int k;
                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==6)
                                            {
                                                count6++;
                                                selected.remove(k);
                                                counter--;
                                                tile6.setBackgroundResource(R.drawable.logosi);
                                                setContentView(newLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                );
            }
            if(elements.get(w)==7)
            {
                final ImageButton tile7 = (ImageButton) findViewById(7);
                tile7.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count7%2==0)
                                {
                                    //clickable
                                    if(counter>=0&&counter<3)
                                    {
                                        selected.add(7);
                                        count7++;
                                        counter++;
                                        tile7.setBackgroundColor(Color.WHITE);
                                        tile7.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter<=3&&counter>0)
                                    {
                                        int k;

                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==7)
                                            {
                                                count7++;
                                                selected.remove(k);
                                                counter--;
                                                tile7.setBackgroundResource(R.drawable.roadi);
                                                setContentView(newLayout);

                                            }
                                        }
                                    }
                                }
                            }
                        }
                );
            }
            if(elements.get(w)==8)
            {
                final ImageButton tile8 = (ImageButton) findViewById(8);
                tile8.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count8%2==0)
                                {
                                    //clickable
                                    if(counter>=0&&counter<3)
                                    {
                                        selected.add(8);
                                        count8++;
                                        counter++;
                                        tile8.setBackgroundColor(Color.WHITE);
                                        tile8.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter<=3&&counter>0)
                                    {
                                        int k;

                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==8)
                                            {
                                                count8++;
                                                selected.remove(k);
                                                counter--;
                                                tile8.setBackgroundResource(R.drawable.toileti);
                                                setContentView(newLayout);

                                            }
                                        }
                                    }
                                }
                            }
                        }
                );
            }
            if(elements.get(w)==9)
            {
                final ImageButton tile9 = (ImageButton) findViewById(9);
                tile9.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count9%2==0)
                                {
                                    //clickable
                                    if(counter>=0&&counter<3)
                                    {
                                        selected.add(9);
                                        count9++;
                                        counter++;
                                        tile9.setBackgroundColor(Color.WHITE);
                                        tile9.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter<=3&&counter>0)
                                    {
                                        int k;

                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==9)
                                            {
                                                count9++;
                                                selected.remove(k);
                                                counter--;
                                                tile9.setBackgroundResource(R.drawable.electricityi);
                                                setContentView(newLayout);

                                            }
                                        }
                                    }
                                }
                            }
                        }
                );
            }
            if(elements.get(w)==10)
            {
                final ImageButton tile10 = (ImageButton) findViewById(10);
                tile10.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count10%2==0)
                                {
                                    //cliclable
                                    if(counter<3&&counter>=0)
                                    {
                                        selected.add(10);
                                        counter++;
                                        count10++;
                                        tile10.setBackgroundColor(Color.WHITE);
                                        tile10.getBackground().setAlpha(100);
                                        setContentView(newLayout);

                                    }
                                }
                                else
                                {
                                    if(counter<=3&&counter>0)
                                    {
                                        int k;
                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==10)
                                            {
                                                selected.remove(k);
                                                count10++;
                                                counter--;
                                                tile10.setBackgroundResource(R.drawable.factory);
                                                setContentView(newLayout);

                                            }
                                        }
                                    }
                                }
                            }
                        }
                );
            }
            if(elements.get(w)==11)
            {
                final ImageButton tile11 = (ImageButton) findViewById(11);
                tile11.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count11%2==0)
                                {
                                    //clickable
                                    if(counter<3&&counter>=0)
                                    {
                                        selected.add(11);
                                        counter++;
                                        count11++;
                                        tile11.setBackgroundColor(Color.WHITE);
                                        tile11.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter<=3&&counter>0)
                                    {
                                        int k;
                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==11)
                                            {
                                                count11++;
                                                selected.remove(k);
                                                counter--;
                                                tile11.setBackgroundResource(R.drawable.handii);
                                                setContentView(newLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                );
            }
            if(elements.get(w)==12)
            {
                final ImageButton tile12 = (ImageButton) findViewById(12);
                tile12.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count12%2==0)
                                {
                                    //clickable
                                    if(counter<3&&counter>=0)
                                    {
                                        selected.add(12);
                                        counter++;
                                        count12++;
                                        tile12.setBackgroundColor(Color.WHITE);
                                        tile12.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter<=3&&counter>0)
                                    {
                                        int k;
                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==12)
                                            {
                                                selected.remove(k);
                                                count12++;
                                                counter--;
                                                tile12.setBackgroundResource(R.drawable.healthi);
                                                setContentView(newLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                );
            }
            if(elements.get(w)==13)
            {
                final ImageButton tile13 = (ImageButton) findViewById(13);
                tile13.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count13%2==0)
                                {
                                    //clickable
                                    if(counter<3&&counter>=0)
                                    {
                                        selected.add(13);
                                        counter++;
                                        count13++;
                                        tile13.setBackgroundColor(Color.WHITE);
                                        tile13.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter<=3&&counter>0)
                                    {
                                        int k;

                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==13)
                                            {
                                                count13++;
                                                selected.remove(k);
                                                counter--;
                                                tile13.setBackgroundResource(R.drawable.unemployi);
                                                setContentView(newLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                );
            }
            if(elements.get(w)==14)
            {
                final ImageButton tile14 = (ImageButton) findViewById(14);
                tile14.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count14%2==0)
                                {
                                    //clickable
                                    if(counter<3&&counter>=0)
                                    {
                                        selected.add(14);
                                        counter++;
                                        count14++;
                                        tile14.setBackgroundColor(Color.WHITE);
                                        tile14.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter<=3&&counter>0)
                                    {
                                        int k;
                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==14)
                                            {
                                                count14++;
                                                selected.remove(k);
                                                counter--;
                                                tile14.setBackgroundResource(R.drawable.fishi);
                                                setContentView(newLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                );
            }
            if(elements.get(w)==15)
            {
                final ImageButton tile15 = (ImageButton) findViewById(15);
                tile15.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count15%2==0)
                                {
                                    //clickable
                                    if(counter<3&&counter>=0)
                                    {
                                        selected.add(15);
                                        counter++;
                                        count15++;
                                        tile15.setBackgroundColor(Color.WHITE);
                                        tile15.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter<=3&&counter>0)
                                    {
                                        int k;
                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==15)
                                            {
                                                count15++;
                                                selected.remove(k);
                                                counter--;
                                                tile15.setBackgroundResource(R.drawable.stampi);
                                                setContentView(newLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                );
            }
            if(elements.get(w)==16)
            {
                final ImageButton tile16 = (ImageButton) findViewById(16);
                tile16.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count16%2==0)
                                {
                                    //clickable
                                    if(counter<3&&counter>=0)
                                    {
                                        selected.add(16);
                                        counter++;
                                        count16++;
                                        tile16.setBackgroundColor(Color.WHITE);
                                        tile16.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter<=3&&counter>0)
                                    {
                                        int k;
                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==16)
                                            {
                                                count16++;
                                                selected.remove(k);
                                                counter--;
                                                tile16.setBackgroundResource(R.drawable.water_tapi);
                                                setContentView(newLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                );
            }
            if(elements.get(w)==17)
            {
                final ImageButton tile17 = (ImageButton) findViewById(17);
                tile17.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count17%2==0)
                                {
                                    //clickable
                                    if(counter<3&&counter>=0)
                                    {
                                        selected.add(17);
                                        counter++;
                                        count17++;
                                        tile17.setBackgroundColor(Color.WHITE);
                                        tile17.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter<=3&&counter>0)
                                    {
                                        int k;
                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==17)
                                            {
                                                count17++;
                                                selected.remove(k);
                                                counter--;
                                                tile17.setBackgroundResource(R.drawable.elephenti);
                                                setContentView(newLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                );
            }
            if(elements.get(w)==18)
            {
                final ImageButton tile18 = (ImageButton) findViewById(18);
                tile18.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count18%2==0)
                                {
                                    //clickable
                                    if(counter<3&&counter>=0)
                                    {
                                        selected.add(18);
                                        counter++;
                                        count18++;
                                        tile18.setBackgroundColor(Color.WHITE);
                                        tile18.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter<=3&&counter>0)
                                    {
                                        int k;
                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==18)
                                            {
                                                count18++;
                                                selected.remove(k);
                                                counter--;
                                                tile18.setBackgroundResource(R.drawable.cowi);
                                                setContentView(newLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                );
            }
            if(elements.get(w)==19)
            {
                final ImageButton tile19 = (ImageButton) findViewById(19);
                tile19.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count19%2==0)
                                {
                                    //clickable
                                    if(counter<3&&counter>=0)
                                    {
                                        selected.add(19);
                                        counter++;
                                        count19++;
                                        tile19.setBackgroundColor(Color.WHITE);
                                        tile19.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter<=3&&counter>0)
                                    {
                                        int k;
                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==19)
                                            {
                                                count19++;
                                                selected.remove(k);
                                                counter--;
                                                tile19.setBackgroundResource(R.drawable.drylandi);
                                                setContentView(newLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                );
            }
            if(elements.get(w)==20)
            {
                final ImageButton tile20 = (ImageButton) findViewById(20);
                tile20.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count20%2==0)
                                {
                                    //clickable
                                    if(counter<3&&counter>=0)
                                    {
                                        selected.add(20);
                                        counter++;
                                        count20++;
                                        tile20.setBackgroundColor(Color.WHITE);
                                        tile20.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter<=3&&counter>0)
                                    {
                                        int k;
                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==20)
                                            {
                                                count20++;
                                                selected.remove(k);
                                                counter--;
                                                tile20.setBackgroundResource(R.drawable.agriculturei);
                                                setContentView(newLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                );
            }
            if(elements.get(w)==21)
            {
                final ImageButton tile21 = (ImageButton) findViewById(21);
                tile21.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count21%2==0)
                                {
                                    //clickable
                                    if(counter<3&&counter>=0)
                                    {
                                        selected.add(21);
                                        counter++;
                                        count21++;
                                        tile21.setBackgroundColor(Color.WHITE);
                                        tile21.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter<=3&&counter>0)
                                    {
                                        int k;
                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==21)
                                            {
                                                count21++;
                                                selected.remove(k);
                                                counter--;
                                                tile21.setBackgroundResource(R.drawable.agriculturei);
                                                setContentView(newLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                );
            }
            if(elements.get(w)==22)
            {
                final ImageButton tile22 = (ImageButton) findViewById(22);
                tile22.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count22%2==0)
                                {
                                    //clickable
                                    if(counter<3&&counter>=0)
                                    {
                                        selected.add(22);
                                        counter++;
                                        count22++;
                                        tile22.setBackgroundColor(Color.WHITE);
                                        tile22.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter<=3&&counter>0)
                                    {
                                        int k;
                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==22)
                                            {
                                                count22++;
                                                selected.remove(k);
                                                counter--;
                                                tile22.setBackgroundResource(R.drawable.pollutioni);
                                                setContentView(newLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                );
            }
            if(elements.get(w)==23)
            {
                final ImageButton tile23 = (ImageButton) findViewById(23);
                tile23.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count23%2==0)
                                {
                                    //clickable
                                    if(counter<3&&counter>=0)
                                    {
                                        selected.add(23);
                                        counter++;
                                        count23++;
                                        tile23.setBackgroundColor(Color.WHITE);
                                        tile23.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter<=3&&counter>0)
                                    {
                                        int k;
                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==23)
                                            {
                                                count23++;
                                                selected.remove(k);
                                                counter--;
                                                tile23.setBackgroundResource(R.drawable.childhungeri);
                                                setContentView(newLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                );
            }
            if(elements.get(w)==24)
            {
                final ImageButton tile24 = (ImageButton) findViewById(24);
                tile24.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count24%2==0)
                                {
                                    //clickable
                                    if(counter<3&&counter>=0)
                                    {
                                        selected.add(24);
                                        counter++;
                                        count24++;
                                        tile24.setBackgroundColor(Color.WHITE);
                                        tile24.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter<=3&&counter>0)
                                    {
                                        int k;
                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==24)
                                            {
                                                count24++;
                                                selected.remove(k);
                                                counter--;
                                                tile24.setBackgroundResource(R.drawable.cigari);
                                                setContentView(newLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                );
            }
            if(elements.get(w)==25)
            {
                final ImageButton tile25 = (ImageButton) findViewById(25);
                tile25.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count25%2==0)
                                {
                                    //clickable
                                    if(counter<3&&counter>=0)
                                    {
                                        selected.add(25);
                                        counter++;
                                        count25++;
                                        tile25.setBackgroundColor(Color.WHITE);
                                        tile25.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter<=3&&counter>0)
                                    {
                                        int k;
                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==25)
                                            {
                                                count25++;
                                                selected.remove(k);
                                                counter--;
                                                tile25.setBackgroundResource(R.drawable.pollutioni);
                                                setContentView(newLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                );
            }
            if(elements.get(w)==26)
            {
                final ImageButton tile26 = (ImageButton) findViewById(26);
                tile26.setOnClickListener(
                        new ImageButton.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if(count26%2==0)
                                {
                                    //clickable
                                    if(counter<3&&counter>=0)
                                    {
                                        selected.add(26);
                                        counter++;
                                        count26++;
                                        tile26.setBackgroundColor(Color.WHITE);
                                        tile26.getBackground().setAlpha(100);
                                        setContentView(newLayout);
                                    }
                                }
                                else
                                {
                                    if(counter<=3&&counter>0)
                                    {
                                        int k;
                                        for(k=0;k<selected.size();k++)
                                        {
                                            if(selected.get(k)==26)
                                            {
                                                count26++;
                                                selected.remove(k);
                                                counter--;
                                                tile26.setBackgroundResource(R.drawable.corruptioni);
                                                setContentView(newLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                );
            }
        }
}
	
}

