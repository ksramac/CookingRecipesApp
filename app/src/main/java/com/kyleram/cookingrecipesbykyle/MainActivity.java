package com.kyleram.cookingrecipesbykyle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView staplesCard;
    CardView filipinoCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        staplesCard = findViewById(R.id.card_view_staple_recipes);
        filipinoCard = findViewById(R.id.card_view_filipino_recipes);

        staplesCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent staplesIntent = new Intent(MainActivity.this, RegRecipesActivity.class);
                startActivity(staplesIntent);
            }
        });

        filipinoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent filIntent = new Intent(MainActivity.this, FilRecipesActivity.class);
                startActivity(filIntent);
            }
        });

    }
}