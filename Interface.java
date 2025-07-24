/**
 * This class demonstrates the use of interfaces in Java.
 * Interfaces define a contract that classes can implement,
 * allowing for consistent method signatures across different classes.
 */
public class Interface {

        /**
         * The Sellable interface defines a contract for items that can be sold.
         * Any class implementing this interface must provide implementations for
         * the methods declared here.
         */
        public interface Sellable {
            /**
             * Provides a description of the sellable item.
             * @return A String representing the item description.
             */
            public String description();
    
            /**
             * Retrieves the listed price of the item.
             * @return The list price as an integer.
             */
            public int listPrice();
    
            /**
             * Retrieves the lowest price at which the item can be sold.
             * @return The lowest price as an integer.
             */
            public int lowestPrice();
        }
    
        /**
         * The Photograph class implements the Sellable interface,
         * which means it provides concrete implementations for all the methods
         * defined in the Sellable interface.
         */
        public class Photograph implements Sellable {
            private String descript;
            private int price;
    
            /**
             * Constructor to initialize a Photograph object with a description and price.
             * @param descript The description of the photograph.
             * @param price The list price of the photograph.
             */
            public Photograph(String descript, int price) {
                this.descript = descript;
                this.price = price;
            }
    
            /**
             * Provides the description of the photograph.
             * @return The photograph's description.
             */
            public String description() {
                return descript;
            }
    
            /**
             * Retrieves the listed price of the photograph.
             * @return The list price as an integer.
             */
            public int listPrice() {
                return price;
            }
    
            /**
             * Retrieves the lowest price at which the photograph can be sold.
             * @return 80% of the list price as an integer.
             */
            public int lowestPrice() {
                return (int) (price * 0.8);
            }
        }
    
        /**
         * The Transportable interface defines a contract for items that can be transported.
         * Any class implementing this interface must provide implementations for
         * the methods declared here.
         */
        public interface Transportable {
            /**
             * Provides the weight of the transportable item.
             * @return The weight as an integer.
             */
            public int weight();
    
            /**
             * Indicates whether the transportable item is hazardous.
             * @return True if hazardous, false otherwise.
             */
            public boolean isHazardous();
        }
    
        /**
         * The BoxedItem class implements both the Sellable and Transportable interfaces,
         * meaning it must provide concrete implementations for all methods defined
         * in both interfaces. This demonstrates how multiple interfaces can be implemented
         * by a single class in Java.
         */
        public class BoxedItem implements Sellable, Transportable {
    
            private String descript;
            private int price;
            private int weight;
            private boolean haz;
            private int height = 0;
            private int width = 0;
            private int depth = 0;
    
            /**
             * Constructor to initialize a BoxedItem object with the necessary attributes.
             * @param desc The description of the boxed item.
             * @param pr The list price of the boxed item.
             * @param wgt The weight of the boxed item.
             * @param hz Indicates whether the item is hazardous.
             */
            public BoxedItem(String desc, int pr, int wgt, boolean hz) {
                descript = desc;
                price = pr;
                weight = wgt;
                haz = hz;
            }
    
            /**
             * Provides the description of the boxed item.
             * @return The boxed item's description.
             */
            public String description() {
                return descript;
            }
    
            /**
             * Retrieves the listed price of the boxed item.
             * @return The list price as an integer.
             */
            public int listPrice() {
                return price;
            }
    
            /**
             * Provides the weight of the boxed item.
             * @return The weight as an integer.
             */
            public int weight() {
                return weight;
            }
    
            /**
             * Indicates whether the boxed item is hazardous.
             * @return True if hazardous, false otherwise.
             */
            public boolean isHazardous() {
                return haz;
            }
    
            /**
             * Retrieves the height of the boxed item.
             * @return The height as an integer.
             */
            public int getHeight() {
                return height;
            }
    
            /**
             * Retrieves the width of the boxed item.
             * @return The width as an integer.
             */
            public int getWidth() {
                return width;
            }
    
            /**
             * Retrieves the depth of the boxed item.
             * @return The depth as an integer.
             */
            public int getDepth() {
                return depth;
            }
    
            /**
             * Retrieves the lowest price at which the boxed item can be sold.
             * @return Half of the list price as an integer.
             */
            public int lowestPrice() {
                return price / 2;
            }
        }
    }
    