package com.example.gabri.exercicio;

import android.app.Activity;
import android.app.AlarmManager;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void configura(View view){
    Intent intent=new Intent(Settings.ACTION_SETTINGS);
        startActivity(intent);
    }

    public void mapa (View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps"));
        startActivity(intent);
    }

    public void music (View view){
    Intent intent = new Intent(MediaStore.INTENT_ACTION_MUSIC_PLAYER);
        startActivity(intent);

    }

    public void sms (View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms","000000000",null));
        startActivity(intent);

    }

    public void alarm (View view){
        Intent intent = new Intent (AlarmManager.ACTION_NEXT_ALARM_CLOCK_CHANGED);
        startActivity(intent);
    }

    public void busca (View view){
        EditText buscatxt;

        buscatxt= (EditText) findViewById(R.id.buscaTxt);

        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(buscatxt.getText().toString()));
        startActivity(intent);

    }
}
