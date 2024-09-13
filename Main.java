import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Give a last name: ");
        String lastName = input.nextLine();
        System.out.println("Give an adjective to describe animals: ");
        String adjAnimals = input.nextLine();
        System.out.println("Give a random number: ");
        int num = input.nextInt();
        System.out.println("Give a random animal: ");
        String animal = input.nextLine();
        System.out.println("True or False? ");
        boolean isTigers = input.nextBoolean();        
        
    }
}