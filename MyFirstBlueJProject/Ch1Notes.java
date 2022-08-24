
/**
 * Dylan Swanson
 * 8/23/22
 * Chapter 1 Notes
 * Class notes on basic concepts
 * Who helped me:
 * 
 */

public class Ch1Notes
{
    /**
     * This is our code notes
     *
     */
    public static void main(String[] args)
    {
        //basic data types
        double number = 8.9, number2;
        int x = 9, y, z;
        boolean choice = false;
        char letter = 'b';
        float number3 = 8;
        long n2 = 3;
        short n3 = 7;
        
        //notes 8/24/22
        //identifier cannot start with a number, no spaces, 
        //can only include _ and $ as special characters, no reserve words, 
        //and only 40 characters
        
        //reserved words = boolean, if, main, void, etc.
        
        //String var = new String("bruh")
        
        //System.out.println("5 + 4 = " + 5 + 4)    outputs -> 5 + 4 = 54
        
        //these are classes and objects
        //class     ID          memory  construction
        //name      
        Integer     n1      =   new     Integer(47);
        String      word    =   new     String("Dylan");
        Double      number4 =   new     Double(6.7);
        
        
        System.out.print(word.length());
    }
}
