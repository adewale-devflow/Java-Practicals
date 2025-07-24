public class Enums {

    // Defining an enum for Days of the week
    public enum Day { MON, TUE, WED, THU, FRI, SAT, SUN }

    public static void main(String[] args) {
        
        // Creating an instance of the enum and assigning a value
        Day day = Day.MON; // Initializing with MON
        System.out.println("\nInitially, day is " + day); // Outputs: MON

        // Changing the enum value
        day = Day.WED;
        System.out.println("Now, day is " + day); // Outputs: WED

        // Converting a string to an enum using valueOf()
        Day t = Day.valueOf("THU"); // Converts "WED" to the corresponding enum value
        
        // Comparing enum values
        System.out.println("I say day and t are not the same: " + (day == t)); // Outputs: true
    }
}
