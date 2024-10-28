public class Cart{
    private int qtyOrdered; 
    // static void totalCost(){
        
    // }

    public static final int MAX_NUMBERS_ORDERED = 20; 
    private DigitalVideoDisc itemsOrdered[] =
        new DigitalVideoDisc [MAX_NUMBERS_ORDERED];

    // static void addDigitalVideoDisc(DigitalVideoDisc disc){

    // }

    // static void removeDigitalVideoDisc(DigitalVideoDisc disc){

    // }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) { 
            itemsOrdered[qtyOrdered] = disc; 
            qtyOrdered++; 
            // System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is full. Cannot add more DVDs.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) { 
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null; 
                qtyOrdered--; 
                found = true;
                System.out.println("The disc has been removed.");
                break;
            }
        }
        if (!found) {
            System.out.println("The disc was not found in the cart.");
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost(); 
        }
        return total;
    }
}

