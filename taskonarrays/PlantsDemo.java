public class PlantsDemo {

    public static void main(String[] args) {

        // Store 25 plant names
        String[] plants = {
            "Rose", "Tulip", "Sunflower", "Lily", "Jasmine",
            "Lotus", "Daisy", "Orchid", "Lavender", "Hibiscus",
            "Bamboo", "Cactus", "Mint", "Aloe Vera", "Neem",
            "Mango Plant", "Banana Plant", "Coconut Tree", "Peepal Tree", "Banyan Tree",
            "Guava Plant", "Papaya Plant", "Tomato Plant", "Potato Plant", "Spinach"
        };

        // Update an element
        plants[4] = "Marigold";

        System.out.println("---- Printing All Plant Names ----");

        // Print using loop
        for (int i = 0; i < plants.length; i++) {
            System.out.println(i + " : " + plants[i]);
        }

        System.out.println("\n---- Printing in Reverse Order ----");

        // Reverse order
        for (int i = plants.length - 1; i >= 0; i--) {
            System.out.println(plants[i]);
        }

        System.out.println("\n---- Demonstrating ArrayIndexOutOfBoundsException ----");

        try {
            // Invalid index
            System.out.println(plants[25]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}