package Comparator;

public class shoppingCenter {
    public static void main(String[] args) {
        Items items = new Items(1,"Slipper", 250);
        var beforePrice=items.getPrice();
        System.out.println("Sale !!!!! slipper by 50% off");

        items.setPrice(shoppingCenter.calculateDiscountedPrice(items.getPrice(),50));
        System.out.println("Original Price -> "+beforePrice +"\nSale Price -> " +items.getPrice());
    }

    private static double calculateDiscountedPrice(double price, int discountPercentage) {
        double discountedPrice  = (price *discountPercentage)/100;
        return discountedPrice;
    }
}
