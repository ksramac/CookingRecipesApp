package com.kyleram.cookingrecipesbykyle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RegRecipesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_recipes);

        RecyclerView list = findViewById(R.id.recycler_view_reg_recipes);

        Recipe[] recipes = {
                new Recipe("Creamy Pasta", "- sautee onions and mushrooms then garlic (cook until translucent)\n" +
                        "- add chop tomatoes and cook down\n" +
                        "- add whipping cream (medium low heat)\n" +
                        "- (Cook until thicker)\n" +
                        "- add cheese until desired thiccness\n" +
                        "- add chop spinach\n" +
                        "- cook down\n" +
                        "- add lemon juice\n" +
                        "- add parsley\n" +
                        "Toss pasta in sauce.", R.drawable.creamy_pasta),
                new Recipe("Chicken Stir-Fry", "Cornstarch on chicken breast strips\n" +
                        "(Salt and pepper)\n" +
                        "Fry until browned\n" +
                        "Remove from wok \n" +
                        "Add in carrots \n" +
                        "Then onions and garlic\n" +
                        "Then broccoli\n" +
                        "Add in chicken broth\n" +
                        "Steam \n" +
                        "Add back in chicken\n" +
                        "Add soy sauce ", R.drawable.stir),
                new Recipe("Pork Tenderloin", "Preheat oven to 400\n" +
                        "Season pork tenderloin \n" +
                        "Cut garlic cloves (5?) and dice 1 onion\n" +
                        "Sear pork on all sides\n" +
                        "Throw in garlic and onion\n" +
                        "Add broth (and vinegar and wine)\n" +
                        "Add rosemary, thyme, herbs\n" +
                        "Cover with foil and put in oven\n" +
                        "Bake for 20-25 min until 165 internal", R.drawable.pork_tender)
        };

        RecipesAdapter adapter = new RecipesAdapter(recipes);

        list.setAdapter(adapter);
    }
}