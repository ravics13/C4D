package com.example.unnayan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.*;
import android.view.View;
import android.widget.*;



public class MainActivity extends Activity {
	
	private EditText sub_div,psblock,vill,svill,lang,group;
	ArrayList<String> firstpage_entry = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       Button next = (Button)findViewById(R.id.proceed);
       
       sub_div = (EditText) findViewById(R.id.subdiv);
       
       psblock = (EditText) findViewById(R.id.ps_block);
       
       vill = (EditText) findViewById(R.id.village);
       
       svill = (EditText) findViewById(R.id.svillage);
       
       lang = (EditText) findViewById(R.id.lang);
       
       group = (EditText) findViewById(R.id.group);
       
       
       next.setOnClickListener(
    		   new Button.OnClickListener()
    		   {
    			   public void onClick(View v)
				   {
    				   if(sub_div.getText().toString().length()>0 && psblock.getText().toString().length()>0 && vill.getText().toString().length()>0 && svill.getText().toString().length()>0 && lang.getText().toString().length()>0 && group.getText().toString().length()>0 )
    				   {
						   firstpage_entry.add(sub_div.getText().toString());
						   firstpage_entry.add(psblock.getText().toString());
						   firstpage_entry.add(vill.getText().toString());
						   firstpage_entry.add(svill.getText().toString());
						   firstpage_entry.add(lang.getText().toString());
						   firstpage_entry.add(group.getText().toString());
						   Intent i = new Intent(MainActivity.this, App_Tiles.class);
						   i.putExtra("entry1",firstpage_entry);
						   startActivity(i);
    				   }
    				   else
    				   {
    					   if(sub_div.getText().toString().length()==0)
    						   sub_div.setError("Subdivision can not be left blank");
    					   if(psblock.getText().toString().length()==0)
    						   psblock.setError("P.S/Block can not be left empty");
    					   if(vill.getText().toString().length()==0)
    						   vill.setError("Village can not be empty");
    					   if(svill.getText().toString().length()==0)
    						   svill.setError("Sub Village can not be empty");
    					   if(lang.getText().toString().length()==0)
    						   lang.setError("Language can not be empty");
    					   if(group.getText().toString().length()==0)
    						   group.setError("Group can not be empty");

    				   }
    			   }
    		   }
    	);
    }


}
