package com.kyleram.cookingrecipesbykyle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecipesAdapter extends RecyclerView.Adapter<RecipesAdapter.RecipeViewHolder> {

    private Recipe[] recipes;

    public RecipesAdapter(Recipe[] recipes) {
        this.recipes = recipes;
    }

    @Override
    public int getItemCount() {
        return recipes.length;
    }

    @NonNull
    @Override
    public RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recipe, parent, false);

        return new RecipeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeViewHolder holder, int position) {
        holder.bind(recipes[position]);
    }



    static class RecipeViewHolder extends RecyclerView.ViewHolder {
        ImageView recipeImage;
        TextView recipeTitle;
        TextView recipeDescription;

        public RecipeViewHolder(@NonNull View itemView) {
            super(itemView);
            recipeImage = itemView.findViewById(R.id.image_view_recipe_pic);
            recipeTitle = itemView.findViewById(R.id.text_view_recipe_title);
            recipeDescription = itemView.findViewById(R.id.text_view_recipe_instructions);
        }

        public void bind(Recipe recipe){
            recipeTitle.setText(recipe.name);
            recipeDescription.setText(recipe.directions);
            recipeImage.setImageResource(recipe.picture);
        }
    }
}
