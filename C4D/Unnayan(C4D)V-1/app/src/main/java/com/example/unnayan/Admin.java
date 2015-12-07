package com.example.unnayan;


import android.app.Activity;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.provider.MediaStore;
import android.graphics.Bitmap;
import android.content.pm.PackageManager;

public class Admin extends Activity
{
    static final int REQUEST_IMAGE_CAPTURE=1;
    ImageView myImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin);

        Button capture = (Button) findViewById(R.id.capture);
        Button done = (Button) findViewById(R.id.done);
        myImage = (ImageView) findViewById(R.id.photo);

        capture.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                         launchCamera(view);
                    }
                }
        );


    }

    public void launchCamera(View view)
    {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,REQUEST_IMAGE_CAPTURE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
       // super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK)
        {
            Bundle extras = data.getExtras();
            Bitmap photo = (Bitmap) extras.get("data");
            myImage.setImageBitmap(photo);
        }
    }
}
