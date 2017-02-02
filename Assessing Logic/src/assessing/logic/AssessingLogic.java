package assessing.logic;

public class AssessingLogic {

    public static void main(String[] args) {
        //Initialise two Boolean variables
        boolean yes = true;
        boolean no =  false;
        
        //If Both two conditions are true
        System.out.println("Both YesYes True: " + (yes && yes));
        System.out.println("Both YesNo False: " + (yes && no));
        
        //If either of two conditions is true
        System.out.println("Either YesYes True: " + (yes||yes));
        System.out.println("Either YesNo True: " + (yes||no));
        System.out.println("Either NoNo True: " + (no||no));
        
        //Show an original and inverse value
        System.out.println("Original Yes Value: " + yes);
        System.out.println("Inverse Yes Value: " + !yes);
        
    }   
}
