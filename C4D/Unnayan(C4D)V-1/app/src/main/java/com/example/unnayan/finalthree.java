package com.example.unnayan;

import android.R.color;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.*;
import android.app.AlertDialog;
import android.view.View;
import android.widget.*;
import android.widget.ImageView.ScaleType;
import android.graphics.*;

public class finalthree extends Activity
{
	ArrayList<String> needs = new ArrayList<String>();
	int resume=0;
	MyDBHandler dbHandler;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Intent in = getIntent();
		@SuppressWarnings("unchecked")
		final ArrayList<Integer> three =(ArrayList<Integer>) in.getSerializableExtra("key");
		final ArrayList<String> firstpage_entry =(ArrayList<String>) in.getSerializableExtra("entry1");
		final ArrayList<String> secondpage_entry =(ArrayList<String>) in.getSerializableExtra("entry2");
		dbHandler = new MyDBHandler(this,null,null,1);
		int length = three.size();
		int ar[] = new int[3];
		ar[0]=three.get(0);
		ar[1]=three.get(1);
		ar[2]=three.get(2);
		resume=1;

		draw(ar);

		final Button sub = (Button) findViewById(1001);

		sub.setOnClickListener(
				new Button.OnClickListener()
				{
					public void onClick(View v)
					{
						Entries entries = new Entries(firstpage_entry.get(0),firstpage_entry.get(1),firstpage_entry.get(2),firstpage_entry.get(3),firstpage_entry.get(4),firstpage_entry.get(4),secondpage_entry.get(0),secondpage_entry.get(1),secondpage_entry.get(2),secondpage_entry.get(3),secondpage_entry.get(4),secondpage_entry.get(5),needs.get(0),needs.get(1),needs.get(2));
						dbHandler.addEntries(entries);
						Intent i = new Intent(finalthree.this,Finale.class);
						startActivity(i);
						finish();


					}
				});

		ImageButton btn1 = (ImageButton)findViewById(ar[0]);
		ImageButton btn2 = (ImageButton)findViewById(ar[1]);
		ImageButton btn3 = (ImageButton)findViewById(ar[2]);

		final int pos1=1,pos2=2,pos3=3;

		btn1.setOnLongClickListener(
				new ImageButton.OnLongClickListener()
				{
					public boolean onLongClick(View v)
					{
						Intent i = new Intent(finalthree.this,Option.class);
						i.putExtra("key", three);
						i.putExtra("key1",pos1);
						i.putExtra("entry1",firstpage_entry);
						i.putExtra("entry2",secondpage_entry);
						startActivity(i);
						finish();
						return true;
					}
				}
		);
		btn2.setOnLongClickListener(
				new ImageButton.OnLongClickListener()
				{
					public boolean onLongClick(View v)
					{
						Intent i = new Intent(finalthree.this,Option.class);
						i.putExtra("key", three);
						i.putExtra("key1",pos2);
						i.putExtra("entry1",firstpage_entry);
						i.putExtra("entry2",secondpage_entry);
						startActivity(i);
						finish();
						return true;
					}
				}
		);
		btn3.setOnLongClickListener(
				new ImageButton.OnLongClickListener()
				{
					public boolean onLongClick(View v)
					{
						Intent i = new Intent(finalthree.this,Option.class);
						i.putExtra("key", three);
						i.putExtra("key1",pos3);
						i.putExtra("entry1",firstpage_entry);
						i.putExtra("entry2",secondpage_entry);
						startActivity(i);
						finish();
						return true;
					}
				}
		);

	}

	private void draw(int[] ar)
	{
		final RelativeLayout newLayout = new RelativeLayout(this);
		//newLayout.setBackgroundColor(Color.rgb(88,88, 91));
		newLayout.setBackgroundResource(R.drawable.back);

		RelativeLayout.LayoutParams ntxt = new RelativeLayout.LayoutParams(385,110);

		Button next = new Button(this);
		//next.setText("Submit");
		next.setBackgroundResource(R.drawable.submit);
		//next.setBackgroundColor(Color.rgb(00, 255, 206));
		next.setId(1001);
		ntxt.setMargins(100,750,0,0);
		next.setLayoutParams(ntxt);
		newLayout.addView(next);
		setContentView(newLayout);


		int i,x=200,y=40;
		int length = ar.length;

		for(i=0;i<length;i++)
		{
			ImageButton imagetile = new ImageButton(this);
			TextView detail = new TextView(this);
			detail.setTextSize(30);
			newLayout.addView(imagetile);
			newLayout.addView(detail);
			RelativeLayout.LayoutParams btn = new RelativeLayout.LayoutParams(200,200);
			btn.setMargins(x,y,0,0);
			y=y+230;

			imagetile.setLayoutParams(btn);
			detail.setLayoutParams(btn);
			imagetile.setScaleType(ScaleType.FIT_XY);

			switch(ar[i])
			{
				case 1: imagetile.setBackgroundResource(R.drawable.cash);
					imagetile.setId(1);
					detail.setText("Cash");
					needs.add("Cash");
					setContentView(newLayout);
					break;
				case 2: imagetile.setBackgroundResource(R.drawable.home);
					detail.setText("Home");
					needs.add("Home");
					imagetile.setId(2);
					setContentView(newLayout);
					break;
				case 3:
					imagetile.setBackgroundResource(R.drawable.irrigation);
					detail.setText("Irrigation");
					needs.add("Irrigation");
					setContentView(newLayout);
					imagetile.setId(3);
					break;
				case 4:
					imagetile.setBackgroundResource(R.drawable.police);
					detail.setText("Police");
					needs.add("Police");
					setContentView(newLayout);
					imagetile.setId(4);
					break;
				case 5: imagetile.setBackgroundResource(R.drawable.school);
					detail.setText("School");
					needs.add("School");
					setContentView(newLayout);
					imagetile.setId(5);
					break;
				case 6: imagetile.setBackgroundResource(R.drawable.logos);
					detail.setText("Forrest");
					needs.add("Forrest");
					setContentView(newLayout);
					imagetile.setId(6);
					break;
				case 7: imagetile.setBackgroundResource(R.drawable.road_01);
					detail.setText("Road");
					needs.add("Road");
					setContentView(newLayout);
					imagetile.setId(7);
					break;
				case 8: imagetile.setBackgroundResource(R.drawable.toilet);
					detail.setText("Toilet");
					needs.add("Toilet");
					setContentView(newLayout);
					imagetile.setId(8);
					break;
				case 9:
					imagetile.setBackgroundResource(R.drawable.electricity);
					detail.setText("Electricity");
					needs.add("Electricity");
					setContentView(newLayout);
					imagetile.setId(9);
					break;
				case 10:
					imagetile.setBackgroundResource(R.drawable.factoryi);
					detail.setText("Factory");
					needs.add("Factory");
					setContentView(newLayout);
					imagetile.setId(10);
					break;
				case 11:
					imagetile.setBackgroundResource(R.drawable.handi);
					detail.setText("Handicraft");
					needs.add("Handicraft");
					setContentView(newLayout);
					imagetile.setId(11);
					break;
				case 12: imagetile.setBackgroundResource(R.drawable.health);
					detail.setText("Health");
					needs.add("Health");
					setContentView(newLayout);
					imagetile.setId(12);
					break;
				case 13:
					imagetile.setBackgroundResource(R.drawable.unemploy);
					detail.setText("Unemployment");
					needs.add("Unemployment");
					setContentView(newLayout);
					imagetile.setId(13);
					break;
				case 14: imagetile.setBackgroundResource(R.drawable.fishi);
					detail.setText("Fish");
					needs.add("Fish");
					setContentView(newLayout);
					imagetile.setId(14);
					break;
				case 15: imagetile.setBackgroundResource(R.drawable.stamp);
					detail.setText("Stamp");
					needs.add("Stamp");
					setContentView(newLayout);
					imagetile.setId(15);
					break;
				case 16:
					imagetile.setBackgroundResource(R.drawable.water_tap);
					detail.setText("Water");
					needs.add("Water");
					setContentView(newLayout);
					imagetile.setId(16);
					break;
				case 17:
					imagetile.setBackgroundResource(R.drawable.elephent);
					detail.setText("Elephant");
					needs.add("Elephant");
					setContentView(newLayout);
					imagetile.setId(17);
					break;
				case 18: imagetile.setBackgroundResource(R.drawable.cow);
					detail.setText("Cow");
					needs.add("Cow");
					setContentView(newLayout);
					imagetile.setId(18);
					break;
				case 19:
					imagetile.setBackgroundResource(R.drawable.dryland);
					detail.setText("Dry Land");
					needs.add("Dry Land");
					setContentView(newLayout);
					imagetile.setId(19);
					break;
				case 20:
					imagetile.setBackgroundResource(R.drawable.agriculture);
					detail.setText("Agriculture");
					needs.add("Agriculture");
					setContentView(newLayout);
					imagetile.setId(20);
					break;
				case 21: imagetile.setBackgroundResource(R.drawable.food);
					detail.setText("Food");
					needs.add("Food");
					setContentView(newLayout);
					imagetile.setId(21);
					break;
				case 22:
					imagetile.setBackgroundResource(R.drawable.pollution);
					detail.setText("Pollution");
					needs.add("Pollution");
					setContentView(newLayout);
					imagetile.setId(22);
					break;
				case 23:
					imagetile.setBackgroundResource(R.drawable.childhunger);
					detail.setText("Child Hunger");
					needs.add("Child Hunger");
					setContentView(newLayout);
					imagetile.setId(23);
					break;
				case 24:
					imagetile.setBackgroundResource(R.drawable.cigar);
					detail.setText("Addiction");
					needs.add("Addiction");
					setContentView(newLayout);
					imagetile.setId(24);
					break;
				case 25: imagetile.setBackgroundResource(R.drawable.lake);
					detail.setText("Lake");
					needs.add("Lake");
					setContentView(newLayout);
					imagetile.setId(25);
					break;
				case 26:
					imagetile.setBackgroundResource(R.drawable.corruption);
					detail.setText("Corruption");
					needs.add("Corruption");
					setContentView(newLayout);
					imagetile.setId(26);
					break;
			}
		}

	}
}