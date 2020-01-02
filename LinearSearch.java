public class LinearSearch {
    public static void main(String[] args) {
        int num = 626, reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;
        // reversed integer is stored in variable 
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(reversedInteger + " is not a palindrome.");
    }
}