/******************************************************************************
 *  Compilation:  javac UseArgument.java
 *  Execution:    java UseArgument name1 name2 name3
 *
 *  Prints "Hi name3, name2, and name1. How are you?" where name1, name2, and name3 are replaced by the
 *  command-line argument.
 *
 *  % java UseArgument Alice Bob Carol
 *  Hi Carol, Bob, and Alice. How are you?
 *
 ******************************************************************************/

public class UseThree {

    public static void main(String[] args) {
        System.out.print("Hi ");
        System.out.print(args[2]+", ");
		System.out.print(args[1]+", and ");
		System.out.print(args[0]);
        System.out.println(". How are you?");
    }

}