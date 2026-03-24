public class TouristSpotsDemo {

    public static void main(String[] args) {

        // Store 30 tourist spots
        String[] spots = {
            "Taj Mahal", "Great Wall of China", "Eiffel Tower", "Statue of Liberty", "Machu Picchu",
            "Colosseum", "Pyramids of Giza", "Burj Khalifa", "Sydney Opera House", "Mount Everest",
            "Niagara Falls", "Grand Canyon", "Stonehenge", "Santorini", "Petra",
            "Angkor Wat", "Big Ben", "Golden Gate Bridge", "Mount Fuji", "Disneyland",
            "Louvre Museum", "Times Square", "Great Barrier Reef", "Christ the Redeemer", "Buckingham Palace",
            "Red Fort", "Hampi", "Goa Beach", "Mysore Palace", "Kerala Backwaters"
        };

        // Update an element
        spots[5] = "Leaning Tower of Pisa";

        System.out.println("---- Printing All Tourist Spots ----");

        // Print using loop
        for (int i = 0; i < spots.length; i++) {
            System.out.println(i + " : " + spots[i]);
        }

        System.out.println("\n---- Printing in Reverse Order ----");

        // Reverse order
        for (int i = spots.length - 1; i >= 0; i--) {
            System.out.println(spots[i]);
        }

        System.out.println("\n---- Demonstrating ArrayIndexOutOfBoundsException ----");

        try {
            // Invalid index access
            System.out.println(spots[30]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}