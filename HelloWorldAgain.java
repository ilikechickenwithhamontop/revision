import java.util.Scanner;
public class HelloWorldAgain{
    public static void main(String[] args){
    System.out.println("Hello World");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Pick a number");
    NumberSequence num = new NumberSequence(scanner.nextInt());
    System.out.println(num.square(num.getNum()));
    System.out.println(num.triangle(num.getNum()));
    for(int i = 0; i <= num.getNum(); i++){
    System.out.println(num.Cubic(num.getNum()));
    System.out.println(num.fibonacci(num.getNum()));
    }
    
    }
    }
