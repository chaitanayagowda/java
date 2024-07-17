public class Shopping {


    public static double calculateTotalPrice(boolean item1InStock, boolean item2InStock) {
        double totalPrice = 0.0;
        double item1Price = 50.0; 
        double item2Price = 75.0; 
        
        if (item1InStock) {
            totalPrice += item1Price;
        } else {
            System.out.println("Item 1 is out of stock.");
        }
        
        if (item2InStock) {
            totalPrice += item2Price;
        } else {
            System.out.println("Item 2 is out of stock.");
        }
        
        return totalPrice;
    }
    
    public static boolean isFreeShippingAvailable(double totalPrice, boolean isPrimeMember) {
        if (isPrimeMember) {
            return totalPrice >= 100.0; 
        } else {
            return totalPrice >= 200.0; 
        }
    }
    
    public static void main(String[] args) {
        boolean item1Available = true;
        boolean item2Available = false;
        boolean isPrimeMember = true;
        
        double totalPrice = calculateTotalPrice(item1Available, item2Available);
        System.out.println("Total price: $" + totalPrice);
        
       
        boolean freeShipping = isFreeShippingAvailable(totalPrice, isPrimeMember);
        if (freeShipping) {
            System.out.println("Free shipping is available!");
        } else {
            System.out.println("Free shipping is not available.");
        }
    }
}
