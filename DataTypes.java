public class DataTypes {
    public static void main(String[] args) {
        boolean myBool = true;
        byte myByte = 100;
        short myShort = 10000;
        int myInt = 123456;
        long myLong = 123456789L;
        float myFloat = 5.75f;
        double myDouble = 19.99;
        char myChar = 'A';

        String myString = "Hello World";

        System.out.println("myBool is of type: " + ((Object)myBool).getClass().getSimpleName());
        System.out.println("myByte is of type: " + ((Object)myByte).getClass().getSimpleName());
        System.out.println("myShort is of type: " + ((Object)myShort).getClass().getSimpleName());
        System.out.println("myInt is of type: " + ((Object)myInt).getClass().getSimpleName());
        System.out.println("myLong is of type: " + ((Object)myLong).getClass().getSimpleName());
        System.out.println("myFloat is of type: " + ((Object)myFloat).getClass().getSimpleName());
        System.out.println("myDouble is of type: " + ((Object)myDouble).getClass().getSimpleName());
        System.out.println("myChar is of type: " + ((Object)myChar).getClass().getSimpleName());
        System.out.println("myString is of type: " + myString.getClass().getSimpleName());
    }
}