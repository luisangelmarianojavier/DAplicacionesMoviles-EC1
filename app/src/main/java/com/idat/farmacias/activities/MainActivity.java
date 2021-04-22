package com.idat.farmacias.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.idat.farmacias.R;
import com.idat.farmacias.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        mainBinding.btnmariano.setOnClickListener(this);
        mainBinding.btnestefani.setOnClickListener(this);
        mainBinding.btnluis.setOnClickListener(this);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity(Class activity) {
        Intent i = new Intent(this, activity);
        startActivity(i);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == mainBinding.btnmariano.getId()) {
            goToActivity(LoginActivity.class);
            return;
        }
        if (v.getId() == mainBinding.btnestefani.getId()) {
            goToActivity(ListadoMedicamentosActivity.class);
            return;
        }
        if (v.getId() == mainBinding.btnluis.getId()) {
            goToActivity(ListadoDevsActivity.class);
            return;
        }
        if (v.getId() == mainBinding.btnQuienesSomos.getId()) {
            goToActivity(AcerdadeActivity.class);
            return;
        }
        if (v.getId() == mainBinding.btnContactarDueno.getId()) {
            Intent intentPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 928644700));
            intentPhone.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intentPhone.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            intentPhone.addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
            startActivity(intentPhone);
            return;
        }
        if (v.getId() == mainBinding.btnVisitarWeb.getId()) {
            Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://inkafarma.pe/"));
            startActivity(intentWeb);
            return;
        }
        if (v.getId() == mainBinding.btnEnviarCorreo.getId()) {
            Intent iEmail = new Intent(Intent.ACTION_SEND, Uri.parse("maximopeoficiales@gmail.com"));
            iEmail.setType("plain/text");
            iEmail.putExtra(Intent.EXTRA_SUBJECT, "Necesito un Medicamento");
            iEmail.putExtra(Intent.EXTRA_TEXT, "Te contacto porque necesito un medicamento Urgente");
            iEmail.putExtra(Intent.EXTRA_EMAIL, new String[]{"maximopeoficiales1@gmail.com", "maximopeoficiales2@gmail.com"});
            iEmail.setPackage("com.google.android.gm");
            if (iEmail.resolveActivity(getPackageManager()) != null) {
                startActivity(iEmail);
//                startActivity(Intent.createChooser(iEmail, "Elige cliente de correo"));
            } else {
                Toast.makeText(this, "Gmail App is not installed", Toast.LENGTH_SHORT).show();

            }
            return;
        }
        Toast.makeText(this, "No existe esa opción", Toast.LENGTH_SHORT).show();
    }
}