public class Inheritance {

    public class Progression {
        
        protected long first;
        protected long current;

        Progression() {
            current = first = 0;
        }

        protected long firstValue() {
            current = first;
            return current;
        }

        protected long nextValue() {
            return ++current;
        }

        public void printProgression(int n) {
            System.out.print(firstValue() + " ");
            for (int i = 1; i < n; i++) {
                System.out.print(nextValue() + " ");
            }
            System.out.println();
        }
    }

    // ArithProgression class outside Progression but inside Inheritance
    public class ArithProgression extends Progression {
        protected long increment;

        ArithProgression() {
            this(1);
        }

        ArithProgression(long inc) {
            increment = inc;
        }

        protected long nextValue() {
            current += increment;
            return current;
        }
    }

    // GeomProgression class outside Progression but inside Inheritance
    public class GeomProgression extends Progression {
        protected long base;

        GeomProgression() {
            this(2);
        }

        GeomProgression(long bse) {
            base = bse;
            first = 1;
            current = first;
        }

        protected long nextValue() {
            current *= base;
            return current;
        }
    }

    // FibonacciProgression class outside Progression but inside Inheritance
    public class FibonacciProgression extends Progression {
        long prev;

        FibonacciProgression() {
            this(0, 1);
        }

        FibonacciProgression(long value1, long value2) {
            first = value1;
            prev = value2 - value1;
            current = first;
        }

        protected long nextValue() {
            long temp = prev;
            prev = current;
            current += temp;
            return current;
        }
    }

    // TestProgression class outside Progression but inside Inheritance
    public static class TestProgression {

        public static void main(String[] args) {
            Inheritance outer = new Inheritance();

            // Testing the Arithmetic progression
            System.out.println("Arithmetic progression with default increment:");
            ArithProgression arithProg = outer.new ArithProgression();
            arithProg.printProgression(10);

            // Testing the Geometric progression
            System.out.println("Geometric progression with base 2:");
            GeomProgression geomProg = outer.new GeomProgression();
            geomProg.printProgression(10);

            // Testing the Fibonacci progression
            System.out.println("Fibonacci progression:");
            FibonacciProgression fibProg = outer.new FibonacciProgression();
            fibProg.printProgression(10);




            // Testing the parameterized constructor of ArithProgression
            System.out.println("Arithmetic progression with increment 5:");
            Inheritance.ArithProgression arithProgParm = outer.new ArithProgression(5);
            arithProgParm.printProgression(10);

            // Testing the parameterized constructor of GeomProgression
            System.out.println("Geometric progression with base 3:");
            Inheritance.GeomProgression geomProgParm = outer.new GeomProgression(3);
            geomProgParm.printProgression(10);

            // Testing the parameterized constructor of FibonacciProgression
            System.out.println("Fibonacci progression starting with 4 and 6:");
            Inheritance.FibonacciProgression fibProgParm = outer.new FibonacciProgression(4, 6);
            fibProgParm.printProgression(10);
        }
    }
}
