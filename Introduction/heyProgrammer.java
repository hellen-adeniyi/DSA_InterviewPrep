package Introduction;



/**
 * This function greet takes a string argumenr,s, and returns the string "hey s"
 * where s is the string passed to the function.
 */
public class heyProgrammer {

    public static String greet(String s){
        return "hey "+ s;
    }
    public static void main(String[] args) {

        // Regression tests
        String al = heyProgrammer.greet("alvin");
        String ja= heyProgrammer.greet("jason");

        if(al != "hey alvin")
            {System.out.println("Test Case Failed");}

        
        if(ja != "hey jason")
            {System.out.println("Test Case Failed");}
        
    }
    
}
