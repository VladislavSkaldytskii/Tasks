package ru.skaldytskiivladislav.task5_1;

public class DiscountedProduct extends Product {
    private double discountPercent;

    public DiscountedProduct(int id, String name, double price, double discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Скидка: %.1f %%, итоговая цена %.2f руб.", discountPercent, getFinalPrice());
    }

    public double getFinalPrice() {
        return price - price * discountPercent / 100;
    }
}
