package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle b = getIntent().getExtras();
        b.getSerializable("pokemon");
        pokemon p = (pokemon) b.getSerializable("pokemon");
        ImageView imageView = findViewById(R.id.imageView2);
        TextView name = findViewById(R.id.textView3);
        TextView attack = findViewById(R.id.textView5);
        TextView defence= findViewById(R.id.textView6);

        imageView.setImageResource(p.getImage());
        name.setText(p.getName());
        attack.setText("attack"+p.getAttack());
        defence.setText("defence"+p.getDefence());

    }
}