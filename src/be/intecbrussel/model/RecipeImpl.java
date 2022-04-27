package be.intecbrussel.model;

public interface RecipeImpl {

    void addRecipe(Recipe recipe);

    Recipe getRecipeByIndex(int index);

    void removeRecipe(Recipe recipe);


    void updateRecipe (int index, Recipe recipe);


}
