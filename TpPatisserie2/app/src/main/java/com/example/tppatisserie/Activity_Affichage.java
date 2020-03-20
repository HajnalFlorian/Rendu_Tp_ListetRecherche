package com.example.tppatisserie;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_Affichage extends AppCompatActivity {
    private String EXTRA_PAT_RES = "recette";
    private String EXTRA_PAT_IMG= "image";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affichage);
        Intent intent= getIntent();
        ImageView imageView = (ImageView)findViewById(R.id.activity_affichage_image);
        TextView textView=(TextView)findViewById((R.id.activity_affichage_recette));
        String recette = intent.getStringExtra(EXTRA_PAT_RES);
        int image=intent.getIntExtra(EXTRA_PAT_IMG,0);
        imageView.setImageResource(image);
        textView.setText(recette);
        Button bouton = (Button)findViewById(R.id.activity_affichage_bouton);
        bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
