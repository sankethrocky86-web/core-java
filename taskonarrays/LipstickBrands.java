public class LipstickBrands {

    public static void main(String[] args) {

        // Store 10 lipstick brands
        String[] brands = {
            "Maybelline",
            "Lakme",
            "MAC",
            "L'Oreal",
            "Revlon",
            "Colorbar",
            "Nykaa",
            "Sugar",
            "Faces Canada",
            "Elle18"
        };

        // Update an element
        brands[3] = "Huda Beauty";   // Replacing L'Oreal

        System.out.println("---- Printing All Lipstick Brands ----");

        // Read and print using loop
        for(int i = 0; i < brands.length; i++) {
            System.out.println("Brand " + i + " : " + brands[i]);
        }

        System.out.println("\n---- Printing in Reverse Order ----");

        // Access elements in reverse direction
        for(int i = brands.length - 1; i >= 0; i--) {
            System.out.println(brands[i]);
        }

        System.out.println("\n---- Demonstrating ArrayIndexOutOfBoundsException ----");

        try {
            System.out.println(brands[10]); // Invalid index (array size is 10, last index = 9)
        } 
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e);
        }

    }
}