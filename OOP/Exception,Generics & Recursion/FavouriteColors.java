public class FavouriteColors {
    public static void main(String[] args) {

        try {
            // Declaring and initializing array
            String[] colors = {"Red", "Blue", "Green", "Yellow"};

            // Accessing elements
            System.out.println("First color: " + colors[0]);

            // This will cause ArrayIndexOutOfBoundsException
            System.out.println("Invalid color: " + colors[10]);

        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds!");
        } 
        catch (NullPointerException e) {
            System.out.println("Error: Array is not initialized!");
        } 
        finally {
            System.out.println("Program execution completed.");
        }
    }
}
