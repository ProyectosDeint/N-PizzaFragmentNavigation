package com.example.pizzafragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.Toast;

import com.example.pizzafragment.model.Pizza;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se ejecuta la primera vez
        if(savedInstanceState==null) {
            number=new Random().nextInt(101);
        }
        else {
            //Se ha reiniciado la actividad
            number= savedInstanceState.getInt("number");
        }
        Log.d(TAG,"MainActivity -> OnCreate()");

    }


    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG,"MainActivity -> onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG,"MainActivity -> onResume()");
        Toast.makeText(this,"Número aleatorio: "+number,Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG,"MainActivity -> onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG,"MainActivity -> onStop()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"MainActivity -> onDestroy()");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("number",number);
        Log.d(TAG,"MainActivity -> onSaveInstanceState");
    }
}
