/*
If Statement 01
Exercise: If Statement 1

define a variable called myName and assign your name to it
using the if-else statement, print if the number of letters in your name is even or odd
 */
public class Main {
    public static void main(String[] args) {
        var myName = "Davide";

        if (0 == (myName.length() % 2)){
            System.out.printf("%s is an even lettered name ",myName);
        } else {
            System.out.printf("%s is a name with odd letters ",myName);
        }
    }
}
