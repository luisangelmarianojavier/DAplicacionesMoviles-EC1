package com.idat.farmacias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.idat.farmacias.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityLoginBinding bindig;
    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindig = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(bindig.getRoot());

        bindig.btningresar.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        et1=(EditText)findViewById(R.id.txtusuario);
        String usuario= et1.getText().toString();

        if(usuario.equals(""))
        {
            Toast.makeText(this, "Digite su usuario", Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, BienvenidaActivity.class);
            i.putExtra("usuario", usuario);
            startActivity(i);
        }

    }
}