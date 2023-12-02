package JavaAdvanceCoding.Exercise24_25;

public class Basket {
    private int numberOfItems;

    public Basket() {
        this.numberOfItems = 0;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void addToBasket() throws CheckedBasketFullException {
        if (getNumberOfItems() < 10) {
            numberOfItems++;
        } else {
            throw new CheckedBasketFullException("Your basket is full!");
        }
    }

    public void removeFromBasket() {
        if (getNumberOfItems() > 0) {
            numberOfItems--;
        } else {
            throw new UnCheckedBasketEmptyException("Your basket is empty!");
        }
    }
}
