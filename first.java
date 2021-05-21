//                         +++++++++++++++++++++++++++++++++++++  
//                          UNDERSTANDING TYPES UNDER PRIMITIVE
//                         +++++++++++++++++++++++++++++++++++++ 
public class first {
    public static void main(String[] args){
    byte myAge = 18; 
        //(1 byte)can store values of the range [-128,127]
    short randomNumber = 12345; 
        //(2 bytes)can store the values of the range [-32l,32k ]
    int myRollNumber = 2_030_312_427;
        //(4 bytes) can store the values of the range[-2B,2B]
        // NOTE: underscores (_) are used just like how we use ',' in writing a number. 
    long longNumber = 1234_567_890_123_124_234L; 
        //(8 bytes) can store a larger value than an int;
        //Also don't forget to use a suffix 'L' or 'l' as java by default thinks long as an int 
    float randomNumberF =123.32423F;
         //(4 bytes)can store a decent range of values and just like in a long
        // use a suffix 'f' or 'F'
    double randomNumberD =234.53465D; 
        // (8 bytes)can store a value greater than that of a float
        // use  a suffix 'd'or 'D'
 
        // (2 bytes) can store a character like all the other languages 
    System.out.println(randomNumberD);
    System.out.println(randomNumberF);
    System.out.println(longNumber);
    System.out.println(myRollNumber);
    System.out.println(randomNumber);
    System.out.println(myAge);
 
    
}
}