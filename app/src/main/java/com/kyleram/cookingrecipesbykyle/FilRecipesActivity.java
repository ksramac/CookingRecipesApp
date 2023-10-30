package com.kyleram.cookingrecipesbykyle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class FilRecipesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fil_recipes);

        RecyclerView list = findViewById(R.id.recycler_view_fil_recipes);

        Recipe[] recipes = {
                new Recipe("Pork Sinigang", "Rinse pork thoroughly \n" +
                        "Put pork in large pot and add enough water to cover\n" +
                        "Boil for 10-15 minutes\n" +
                        "Drain completely \n" +
                        "Rinse/rub off impurities\n" +
                        "Return ribs to pot and add in 10 cups of water\n" +
                        "Add 3 tomatoes chopped (take out seeds)\n" +
                        "Add 1 medium onion chopped\n" +
                        "Mix together \n" +
                        "Cover and boil on medium high for 45 minutes\n" +
                        "Add in whole sinigang mix package\n" +
                        "Add in 6 pieces of taro (peeled) - boil for 10 minutes \n" +
                        "Add 2 cups of long green beans cut into 2 inch pieces\n" +
                        "Add 5-6 pieces of sweet chilis\n" +
                        "Cover and simmer for 5 minutes \n" +
                        "Add 2 bunches of baby bok choy \n" +
                        "Cook for 2 minutes \n" +
                        "Season w salt and pepper as needed", R.drawable.sinigang),
                new Recipe("Beef Bagis", "Sauté onions in pan \n" +
                        "Sauté garlic (3-4 cloves)\n" +
                        "Add ground beef and brown\n" +
                        "Season\n" +
                        "- pepper\n" +
                        "- 2-3 tbsp vinegar\n" +
                        "- 3 bay leaves\n" +
                        "- 3-4 red chilis (or jalapeños)\n" +
                        "- Lemon juice (2 tbsp?)", R.drawable.beef_pares_8053804_640),

                new Recipe("Honey-Soy Pork Chops", "Season pork (4 seasonings \uD83E\uDDC2)\n" +
                        "Sear pork in pan\n" +
                        "Take off pork and add 2 tbsp of butter\n" +
                        "Add 5 cloves of garlic and sauté for a little \n" +
                        "Add back in pork (cook and flip)\n" +
                        "Add 1 tbsp of soy sauce\n" +
                        "Add 1.5 tbsp of honey\n" +
                        "Cook until looks good\n" +
                        "\n" +
                        "Add parsley for presentation \n", R.drawable.barbecued_pork_ribs_2097994_640)

        };

        RecipesAdapter adapter = new RecipesAdapter(recipes);

        list.setAdapter(adapter);
    }


}