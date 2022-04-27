package be.intecbrussel.model;

public interface IngredientImpl {

    void addIngredient(Ingredient ingredient);

    Ingredient getIngredientByIndex(int index);

    void removeIngredient(Ingredient ingredient);

    void updateIngredient (int index, Ingredient ingredient);
}
