package be.intecbrussel.model;

public interface MagazineImpl {

    void addMagazine(CookingMagazine magazine);

    CookingMagazine getMagazineByIndex(int index);

    void removeMagazine(CookingMagazine magazine);


    void updateMagazine (int index, CookingMagazine magazine);

}
