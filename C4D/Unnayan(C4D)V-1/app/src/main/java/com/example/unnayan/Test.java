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

public class Test extends Activity 
{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent in = getIntent();
		@SuppressWarnings("unchecked")
		final ArrayList<Integer> elements =(ArrayList<Integer>) in.getSerializableExtra("key1");
		int length = elements.size();
		String s = Integer.toString(length);
		final RelativeLayout newLayout = new RelativeLayout(this);
        newLayout.setBackgroundColor(Color.rgb(88,88, 91));
        TextView detail = new TextView(this);
        detail.setText(s);
        newLayout.addView(detail);
        setContentView(newLayout);
        int i;
        for(i=0;i<length;i++)
        {
            s=Integer.toString(elements.get(i));
            detail.setText(s);
            newLayout.addView(detail);
            setContentView(newLayout);

        }
	}
    
}
