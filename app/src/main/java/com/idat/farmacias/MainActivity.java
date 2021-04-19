package com.idat.farmacias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.idat.farmacias.databinding.ActivityLoginBinding;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void formulario(View v)
    {
        Intent i=new Intent(this, Login.class);
        startActivity(i);
    }
}