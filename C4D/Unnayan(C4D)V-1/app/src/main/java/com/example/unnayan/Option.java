package com.example.unnayan;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class Option extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option);


        
        Intent in = getIntent();
        @SuppressWarnings("unchecked")
		final ArrayList<Integer> three =(ArrayList<Integer>) in.getSerializableExtra("key");
        final int pos = (Integer) in.getSerializableExtra("key1");
		final ArrayList<String> firstpage_entry =(ArrayList<String>) in.getSerializableExtra("entry1");
		final ArrayList<String> secondpage_entry =(ArrayList<String>) in.getSerializableExtra("entry2");

  
        final Button up = (Button) findViewById(R.id.up);
        final Button down = (Button) findViewById(R.id.down);
        
        
        up.setOnClickListener(
        		   new Button.OnClickListener()
        		   {
        			   public void onClick(View v)
        			   {
        				   if(pos==1)
        				   {
        					   Toast.makeText(getApplicationContext(), "Can't move up", Toast.LENGTH_LONG).show();
        					   Intent i = new Intent(Option.this,Dummy.class);
 	  	    				  i.putExtra("key3", three);
							   i.putExtra("entry1", firstpage_entry);
							   i.putExtra("entry2",secondpage_entry);
							   startActivity(i);
 	  	    				  finish();
        				   }
        				   else if(pos==2)
        				   {
        					  int temp3=three.get(2);
        					  int temp1=three.get(1);
							   int temp2=three.get(0);
							   three.remove(2);
        					  three.remove(1);
        					  three.remove(0);
							   three.add(temp1);
        					  three.add(temp2);
        					  three.add(temp3);
        					  Intent i = new Intent(Option.this,Dummy.class);
							  i.putExtra("entry1",firstpage_entry);
							  i.putExtra("entry2",secondpage_entry);
	  	    				  i.putExtra("key3", three);
	  	    				  startActivity(i);
	  	    				  finish();
        					    
        				   }
        				   else if(pos==3)
        				   {
        					  int temp3=three.get(2);
        					  int temp1=three.get(1);
        					  int temp2=three.get(0);
        					  three.remove(2);
        					  three.remove(1);
        					  three.add(temp3);
        					  three.add(temp1);
        					  Intent i = new Intent(Option.this,Dummy.class);
	  	    				  i.putExtra("key3", three);
							   i.putExtra("entry1", firstpage_entry);
							   i.putExtra("entry2",secondpage_entry);
							   startActivity(i);
	  	    				  finish();
        					    
        				   }

        				}
        		   });
        
        down.setOnClickListener(
     		   new Button.OnClickListener()
     		   {
     			   public void onClick(View v)
     			   {
     				   if(pos==3)
     				   {
     					  Toast.makeText(getApplicationContext(), "Can't move down", Toast.LENGTH_LONG).show();
   					      Intent i = new Intent(Option.this,Dummy.class);
  	    				  i.putExtra("key3", three);
						   i.putExtra("entry1", firstpage_entry);
						   i.putExtra("entry2",secondpage_entry);
						   startActivity(i);
  	    				  finish();
     				   }
     				   else if(pos==2)
     				   {
     					  int temp3=three.get(2);
     					  int temp2=three.get(1);
     					  three.remove(2);
     					  three.remove(1);
     					  three.add(temp3);
     					  three.add(temp2);
     					  Intent i = new Intent(Option.this,Dummy.class);
 	    				  i.putExtra("key3", three);
						   i.putExtra("entry1", firstpage_entry);
						   i.putExtra("entry2",secondpage_entry);
						   startActivity(i);
 	    				  finish();
     				   }
     				   else if(pos==1)
     				   {
     					  int temp3=three.get(2);
    					  int temp2=three.get(1);
    					  int temp1=three.get(0);
    					  three.remove(2);
    					  three.remove(1);
    					  three.remove(0);
    					  three.add(temp2);
    					  three.add(temp1);
    					  three.add(temp3);
    					  Intent i = new Intent(Option.this,Dummy.class);
  	    				  i.putExtra("key3", three);
						   i.putExtra("entry1",firstpage_entry);
						   i.putExtra("entry2",secondpage_entry);
						   startActivity(i);
  	    				  finish();
     				   }

     				}
     		   });
             

    }
}