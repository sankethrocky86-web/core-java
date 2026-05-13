public class GunModelsDemo {

    public static void main(String[] args) {

        // Store 30 gun models
        String[] guns = {
            "Glock 17","Glock 19","Beretta 92FS","SIG Sauer P320","Colt M1911",
            "Smith & Wesson M&P9","CZ 75","Ruger SR9","Walther P99","FN Five-seveN",
            "AK-47","AK-74","M16","AR-15","FN SCAR",
            "Steyr AUG","HK G36","FAMAS","Dragunov SVD","Barrett M82",
            "Remington 870","Mossberg 500","Benelli M4","Winchester 1897","Browning Auto-5",
            "Uzi","MP5","Thompson SMG","P90","Desert Eagle"
        };

        // Update an element
        guns[5] = "Smith & Wesson M&P Shield";

        System.out.println("---- Printing All Gun Models ----");

        // Read and print using loop
        for(int i = 0; i < guns.length; i++) {
            System.out.println(i + " : " + guns[i]);
        }

        System.out.println("\n---- Printing in Reverse Order ----");

        // Reverse order
        for(int i = guns.length - 1; i >= 0; i--) {
            System.out.println(guns[i]);
        }

        System.out.println("\n---- Demonstrating ArrayIndexOutOfBoundsException ----");

        try {
            // Accessing invalid index
            System.out.println(guns[30]);
        } 
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}