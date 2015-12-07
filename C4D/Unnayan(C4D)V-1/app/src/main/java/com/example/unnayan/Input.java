package com.example.unnayan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import java.util.*;

public class Input extends Activity{

	private Spinner gender,cat,edu,clas;
	private EditText age,occ;
	Button proceed;
	ArrayList<String> secondpage_entry = new ArrayList<String>();
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.input);
	        
	        
	        Intent in = getIntent();
	        @SuppressWarnings("unchecked")
			final ArrayList<Integer> list =(ArrayList<Integer>) in.getSerializableExtra("key");
		 	final ArrayList<String> firstpage_entry = (ArrayList<String>) in.getSerializableExtra("entry1");
	         proceed = (Button)findViewById(R.id.proceed);

			 age = (EditText) findViewById(R.id.age);
		 	 occ = (EditText) findViewById(R.id.occ);
		 	 gender = (Spinner) findViewById(R.id.gender);
		 	 cat = (Spinner) findViewById(R.id.cat);
		 	 edu = (Spinner) findViewById(R.id.edu);
		 	 clas = (Spinner) findViewById(R.id.clas);

		 	addListenerOnSpinnerItemSelection();
	        proceed.setOnClickListener(
	        		new Button.OnClickListener()
	        		{
	        			public void onClick(View v)
	        			{
							if(list.size()==0)
							{
								Toast.makeText(getApplicationContext(), "Sorry!!!There would be nothing to select.", Toast.LENGTH_LONG).show();
							}
							else
							{
								if(checkNumber(age.getText().toString()))
								{
									if(Integer.parseInt(age.getText().toString())>0 && Integer.parseInt(age.getText().toString())<=130 && occ.getText().toString().length()>0 && gender.getSelectedItemPosition()>=0 && edu.getSelectedItemPosition()>=0 && clas.getSelectedItemPosition()>=0 && cat.getSelectedItemPosition()>=0)
									{
										fillDetails();
										Intent i = new Intent(Input.this,SelectedTile.class);
										i.putExtra("key1", list);
										i.putExtra("entry1",firstpage_entry);
										i.putExtra("entry2",secondpage_entry);
										startActivity(i);
									}
									else
									{
										if(occ.getText().toString().length()==0)
											occ.setError("Occupation can not be left blank");
									}
								}
								else
								{
									age.setError("Invalid Age Input");
								}
							}
	        			}
	        		});
	     
	 }
	public void addListenerOnSpinnerItemSelection() {
		gender = (Spinner) findViewById(R.id.gender);
		cat = (Spinner) findViewById(R.id.cat);
		edu = (Spinner) findViewById(R.id.edu);
		clas = (Spinner) findViewById(R.id.clas);

	}
	public boolean checkNumber(String input)
	{
		try
		{
			Integer.parseInt(input);
		}
		catch(NumberFormatException ex)
		{
			return false;
		}
		return true;
	}
	public void fillDetails()
	{
		age = (EditText) findViewById(R.id.age);
		occ = (EditText) findViewById(R.id.occ);
		gender = (Spinner) findViewById(R.id.gender);
		cat = (Spinner) findViewById(R.id.cat);
		edu = (Spinner) findViewById(R.id.edu);
		clas = (Spinner) findViewById(R.id.clas);
		secondpage_entry.add(age.getText().toString());

		//adding gender
		if(gender.getSelectedItemPosition()==0)
			secondpage_entry.add("Male");
		else if(gender.getSelectedItemPosition()==1)
			secondpage_entry.add("Female");
		else if(gender.getSelectedItemPosition()==2)
			secondpage_entry.add("Others");

		//adding category
		if(cat.getSelectedItemPosition()==0)
			secondpage_entry.add("General");
		else if(cat.getSelectedItemPosition()==1)
			secondpage_entry.add("O.B.C");
		else if(cat.getSelectedItemPosition()==2)
			secondpage_entry.add("S.C");
		else if(cat.getSelectedItemPosition()==3)
			secondpage_entry.add("S.T");

		//adding education

		if(edu.getSelectedItemPosition()==0)
			secondpage_entry.add("Illiterate");
		else if(edu.getSelectedItemPosition()==1)
			secondpage_entry.add("Below Primary");
		else if(edu.getSelectedItemPosition()==2)
			secondpage_entry.add("Primary");
		else if(edu.getSelectedItemPosition()==3)
			secondpage_entry.add("Middle");
		else if(edu.getSelectedItemPosition()==4)
			secondpage_entry.add("10th Passed");
		else if(edu.getSelectedItemPosition()==5)
			secondpage_entry.add("12th Passed");
		else if(edu.getSelectedItemPosition()==6)
			secondpage_entry.add("Bachelor");
		else if(edu.getSelectedItemPosition()==7)
			secondpage_entry.add("Masters");
		else if(edu.getSelectedItemPosition()==8)
			secondpage_entry.add("Doctoral");
		else if(edu.getSelectedItemPosition()==9)
			secondpage_entry.add("Vocational");
		else if(edu.getSelectedItemPosition()==10)
			secondpage_entry.add("Others");

		secondpage_entry.add(occ.getText().toString());

		//adding class
		if(clas.getSelectedItemPosition()==0)
			secondpage_entry.add("Upper Class");
		else if(clas.getSelectedItemPosition()==1)
			secondpage_entry.add("Upper Middle Class");
		else if(clas.getSelectedItemPosition()==2)
			secondpage_entry.add("Lower Middle Class");
		else if(clas.getSelectedItemPosition()==3)
			secondpage_entry.add("Lower");

	}
	 	 
}

