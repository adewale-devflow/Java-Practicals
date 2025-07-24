
public class ControlF{

    
    public static void main(String[] args ){
            int rainLevel = 3;

        // if , else, else if statements 
        if (rainLevel < 2){
            System.out.println("The rain volume is low");
            }
        else if (rainLevel < 1){
            System.out.println("The rain volume is very low");
            }
        else {
            System.out.println("The volume is very high");
            }


        /*
         * The switch statement evaluates an integer or enum expression and causes 
control flow to jump to the code location labeled with the value of this expression. 
If there is no matching label, then control flow jumps to the location labeled 
"default." This is the only explicit jump performed by the switch
statement, however, so flow of control "falls through" to other cases if the code 
for each case is not ended with a break statement (which causes control flow to 
jump to the next line after the switch statement).
         */
        String d = "MON";
        
        switch (d) {
            case "MON":
                System.out.println("This is tough.");
            break;
            case "TUE":
                System.out.println("This is getting better.");
                break;
            case "WED":
                System.out.println("Half way there.");
                break;
            case "THU":
                System.out.println("I can see the light.");
                break;
            case "FRI":
                System.out.println("Now we are talking.");
                break;
            default:
                System.out.println("Day off ! ");
                break;
                }
        // LOOPS

        //For loops

        for (int i = 0; i < 5; i++  ){
            System.out.println("Hadewale is Great");

        }

        // While loops
        int count = 0;
        while (count < 5) {
            System.out.println("HI WELCOME");
            count++;
        }


    }




}