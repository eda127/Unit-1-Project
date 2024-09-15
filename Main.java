import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        // Creating the scanner
        Scanner input = new Scanner(System.in);
        
        // Asking questions for the Mad Lib
        System.out.print("Input a last name: ");
        String lastName = input.nextLine();
        
        System.out.println("Input an adjective: ");
        String adjAnimals = input.nextLine();
        
        System.out.println("Input any random number: ");
        int num = input.nextInt();
        // Need this after anything that isn't a input.NextLine(); or else it skips the next scanner
        // They explain why here: https://www.freecodecamp.org/news/java-scanner-nextline-call-gets-skipped-solved/
        input.nextLine();
        
        System.out.println("Input a zoo animal: ");
        String animal = input.nextLine();
        
        System.out.println("Choose one: True or False? ");
        boolean isTigers = input.nextBoolean(); 
        input.nextLine();

        System.out.println("Input a bird species: ");
        String bird = input.nextLine();
        
        System.out.println("Input any random number with a deciamal point: ");
        double birdChildren = input.nextDouble();
        input.nextLine();
        
        System.out.println("Input another zoo animal: ");
        String newAnimal = input.nextLine();
        
        System.out.println("Input a verb: ");
        String disgustingVerb = input.nextLine();
        
        System.out.println("Input any random number: ");
        int newNum = input.nextInt();
        input.nextLine();
        
        // Testing to see if the words printed correctly
        System.out.println("Here are your words: ");
        System.out.println(lastName);
        System.out.println(adjAnimals);
        System.out.println(num);
        System.out.println(animal);
        System.out.println(isTigers);
        System.out.println(bird);
        System.out.println(birdChildren);
        System.out.println(newAnimal);
        System.out.println(disgustingVerb);
        System.out.println(newNum);
        
        // story
        System.out.println("Story goes here");
    }
}