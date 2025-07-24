/**
 * Java_Classes_practice
 * 
 * This class demonstrates various important concepts in Java, such as:
 * 1. **Class Definition:** The use of `public class` to define a class.
 * 2. **Instance Variables:** Examples include 'name', 'age', 'Friend', 'eatFlesh', and 'height'.
 * 3. **Access Modifiers:** 
 *    - `public`: Accessible from anywhere (e.g., `name` and `age`).
 *    - `private`: Accessible only within the class (e.g., `eatFlesh`).
 *    - `protected`: Accessible within the same package and subclasses (e.g., `height`).
 *    - `public static final`: Constant declaration for `MAX_HEIGHT`.
 * 4. **Constructors:** Demonstrates both parameterized and default constructors.
 * 5. **Methods:**
 *    - Instance methods (`makeMeLord`, `getName`), which act on objects of the class.
 *    - Static methods (`makeLord`), which can be called without creating an instance of the class.
 * 6. **Encapsulation:** The `eatFlesh` variable is private, with access controlled through `isEatFlesh`.
 * 7. **This Keyword Usage:** The example showcases self-referencing through the use of `this` implicitly.
 * 8. **Reference Types vs Base Types:** 
 *    - Reference types: `Friend` (instance of `Giant`) and `name` (String object).
 *    - Base types: `int` (age), `boolean` (eatFlesh), `double` (height).
 * 9. **Use of `null`:** `Friend` is initialized to `null` in the default constructor.
 * 10. **Static and Instance Context:** The difference between static (`makeLord`) and instance methods (`makeMeLord`).

 */
public class Java_Classes_practice {

    /**
     * The Giant class demonstrates basic OOP concepts such as instance variables, 
     * constructors, methods, and access control.
     */
    public static class Giant {
        // Instance variables
        public String name;
        public int age;
        public Giant Friend;
        private boolean eatFlesh = false;
        protected double height = 8; // in feet
        public static final int MAX_HEIGHT = 12; // maximum height
      
        // Constructors
        /**
         * Parameterized constructor for creating a Giant with specific properties.
         * 
         * @param nm    The name of the Giant.
         * @param ag    The age of the Giant.
         * @param etFl  Boolean indicating if the Giant eats flesh.
         * @param hg    The height of the Giant.
         */
        Giant(String nm, int ag, boolean etFl, double hg) {
            name = nm;
            age = ag;
            eatFlesh = etFl;
            height = hg;
        }
        /**
         * Default constructor for creating a Giant with default properties.
         */
        Giant() {
            name = "newTall";
            age = 100;
            Friend = null;
            height = 7;
        }
        // Methods
        /**
         * Static method to make a Giant a Lord.
         * 
         * @param G The Giant object to be made a Lord.
         */
        public static void makeLord(Giant G) {
            G.name = "Lord" + G.getRealName();
            G.eatFlesh = true; // Only the Giant class can reference this field
        }
        /**
         * Instance method to make the calling Giant object a Lord.
         */
        public void makeMeLord() {
            name = "Lord" + getRealName();
            eatFlesh = true;
        }
        /**
         * Checks if the Giant eats flesh.
         * 
         * @return True if the Giant eats flesh, false otherwise.
         */
        public boolean isEatFlesh() {
            return eatFlesh;
        }
        /**
         * Sets the height of the Giant.
         * 
         * @param newHeight The new height to set.
         */
        public void setHeight(int newHeight) {
            height = newHeight;
        }
        /**
         * Gets the name of the Giant. Overrides the real name with a restricted message.
         * 
         * @return A message stating that the name is forbidden.
         */
        public String getName() {
            return "It is Forbidden to know my name";
        }
        /**
         * Gets the real name of the Giant.
         * 
         * @return The real name of the Giant.
         */
        public String getRealName() {
            return "Okay ill tell you, it is " + name;
        }

        /**
         * Renames the Giant.
         * 
         * @param newName The new name to assign to the Giant.
         */
        public void renameGiant(String newName) {
            name = newName;
        }
    }

    /**
     * Main method - entry point of the program.
     */
    public static void main(String[] args) {
        // Creating instances of the Giant class using different constructors
        Giant defaultGiant = new Giant(); // Using the default constructor
        Giant paramGiant = new Giant("Goliath", 150, true, 9.5); // Using the parameterized constructor
    
        // Accessing and modifying public instance variables
        System.out.println("Default Giant Name: " + defaultGiant.name); // Outputs: newTall
        defaultGiant.name = "Gigantor"; // Modifying a public variable
        System.out.println("Updated Default Giant Name: " + defaultGiant.name);
    
        // Testing encapsulation: Accessing private variable via method
        System.out.println("Does paramGiant eat flesh? " + paramGiant.isEatFlesh()); // Outputs: true
    
        // Static method call: making paramGiant a Lord
        Giant.makeLord(paramGiant);
        System.out.println("Param Giant's name after makeLord: " + paramGiant.getRealName()); // Outputs: LordGoliath
    
        // Testing instance method: making defaultGiant a Lord
        defaultGiant.makeMeLord();
        System.out.println("Default Giant's name after makeMeLord: " + defaultGiant.getRealName()); // Outputs: LordGigantor
    
        // Modifying protected variable via method
        System.out.println("Height before modification: " + defaultGiant.height); // Outputs: 7
        defaultGiant.setHeight(10);
        System.out.println("Height after modification: " + defaultGiant.height); // Outputs: 10
    
        // Demonstrating access to a static constant
        System.out.println("Maximum height a Giant can have: " + Giant.MAX_HEIGHT); // Outputs: 12
    
        // Creating a reference to another Giant object
        paramGiant.Friend = defaultGiant;
        System.out.println("paramGiant's friend is: " + paramGiant.Friend.getRealName()); // Outputs: LordGigantor
    
        // Displaying forbidden name message via overridden method
        System.out.println("Trying to get paramGiant's name: " + paramGiant.getName()); // Outputs: It is Forbidden to know my name
    }
    
}
