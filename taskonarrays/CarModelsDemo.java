public class CarModelsDemo {

    public static void main(String[] args) {

        // Store 25 car models
        String[] cars = {
            "Toyota Corolla", "Honda Civic", "Hyundai Creta", "Maruti Swift", "Kia Seltos",
            "Toyota Fortuner", "Mahindra Thar", "Tata Nexon", "Honda City", "Hyundai Verna",
            "BMW 3 Series", "Audi A4", "Mercedes C-Class", "Skoda Octavia", "Volkswagen Polo",
            "Ford Mustang", "Chevrolet Camaro", "Nissan GTR", "Porsche 911", "Lamborghini Huracan",
            "Ferrari 488", "Rolls Royce Phantom", "Bentley Continental", "Bugatti Chiron", "McLaren 720S"
        };

        // Update an element
        cars[4] = "Kia Sonet";

        System.out.println("---- Printing All Car Models ----");

        // Print using loop
        for (int i = 0; i < cars.length; i++) {
            System.out.println(i + " : " + cars[i]);
        }

        System.out.println("\n---- Printing in Reverse Order ----");

        // Reverse order
        for (int i = cars.length - 1; i >= 0; i--) {
            System.out.println(cars[i]);
        }

        System.out.println("\n---- Demonstrating ArrayIndexOutOfBoundsException ----");

        try {
            // Invalid index
            System.out.println(cars[25]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}