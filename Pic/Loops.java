
public class Loops
{
    public static void main()
    {
        for(int i = 0; i < 9; i++)
        {
            System.out.println("The value of the counter is: " + i*5 + ".");
        }
    }
    public static void pic2()
    {
        int [] myArray = new int[20];
        
        System.out.println("");
        
        myArray[0] = 55;
        myArray[1] = 17;
        myArray[3] = 100;
        myArray[myArray.length-2] = 7;
        myArray[11] = 73;
        
        for(int i=0; i<myArray.length; i++){
            System.out.println("The value of element: " + i + " in the array is " + myArray[i]);
        }
    }
    public static void pic3()
    {
        int [] myArray = new int[100];
        
   
        
        for(int i=0; i<myArray.length; i++){
            myArray[i] = i * 5;
            System.out.println("item " + (i+1) + " in the array is equal to: " + myArray[i]);
        }
    }
    public static void pic4()
    {
        String[] nameArray = {"Preston","Riley","Connor","Mom"};
        
        int[] ageArray = {13,17,20,46};
        double[] gpaArray = {3.2,3.8,4.0,0};
   
        
        for(int i=0; i<nameArray.length; i++){
            System.out.println(nameArray[i] + " is " + ageArray[i] + " years old and has a gpa of " + gpaArray[i] + ".");
        }
    }
}