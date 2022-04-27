package be.intecbrussel.model;

import java.util.List;

public class Recipe implements IngredientImpl {

    private String name;
    private Author author;
    private String procedure;
    private List<Ingredient> ingredients;

    public Recipe(String name, Author author, String procedure, List<Ingredient> ingredients) {

        this.name = name;
        this.author = author;
        this.procedure = procedure;
        this.ingredients = ingredients;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public Ingredient getIngredientByIndex(int index) {
        return ingredients.get(index);
    }

    @Override
    public void removeIngredient(Ingredient ingredient) {
        ingredients.remove(ingredient);
    }

    @Override
    public void updateIngredient(int index, Ingredient ingredient) {
        ingredients.set(index, ingredient);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", procedure='" + procedure + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
