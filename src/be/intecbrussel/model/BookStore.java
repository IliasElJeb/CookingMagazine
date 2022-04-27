package be.intecbrussel.model;
import java.util.List;

public class BookStore implements MagazineImpl{



    private List<CookingMagazine> magazines;

    public BookStore(List<CookingMagazine> magazines) {
        this.magazines = magazines;
    }

    @Override
    public void addMagazine(CookingMagazine magazine) {
        magazines.add(magazine);
    }

    @Override
    public CookingMagazine getMagazineByIndex(int index) {
        return magazines.get(index);
    }

    @Override
    public void removeMagazine(CookingMagazine magazine) {
    magazines.remove(magazine);
    }

    @Override
    public void updateMagazine(int index, CookingMagazine magazine) {
        magazines.set(index,magazine);
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "magazines=" + magazines +
                '}';
    }
}
