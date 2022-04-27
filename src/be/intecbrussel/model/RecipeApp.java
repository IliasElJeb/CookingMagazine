package be.intecbrussel.model;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class RecipeApp {

    public static void main(String[] args) {

           List<Author> authors = new ArrayList<>();

        Author author1 = new Author("Jan", "Kalala");
        Author author2 = new Author("Ilias", "El Jebari");
        Author author3 = new Author("Piet", "Dekever");

        authors.add(author1);
        authors.add(author2);
        authors.add(author3);

        List<Ingredient> ingredients = new ArrayList<>();

        Ingredient ingredient1 = new Ingredient("Sugar");
        Ingredient ingredient2 = new Ingredient("Cheese");
        Ingredient ingredient3 = new Ingredient("Salt");

        ingredients.add(ingredient1);
        ingredients.add(ingredient2);
        ingredients.add(ingredient3);

        List<Recipe> recepies = new ArrayList<>();

        Recipe recipe1 = new Recipe("Lasagne",author2,"Put lasagne in the oven",ingredients);
        Recipe recipe2 = new Recipe("Spaghetti",author3,"Boil spaghetti in the water",ingredients);

        recepies.add(recipe1);
        recepies.add(recipe2);

        CookingMagazine cookingMagazine1 = new CookingMagazine("IliasMagazine",recepies);
        CookingMagazine cookingMagazine2= new CookingMagazine("WTFmagazine",recepies);

        List<CookingMagazine> cookingMagazines = new ArrayList<>();

        cookingMagazines.add(cookingMagazine1);
        cookingMagazines.add(cookingMagazine2);

        BookStore bookStore = new BookStore(cookingMagazines);

        System.out.println(bookStore);
    }

}
