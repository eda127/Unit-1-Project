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
        
        System.out.println("Input a verb (NOT ending in -ing or -ed): ");
        String verb = input.nextLine();
        
        System.out.println("Input any random number: ");
        int newNum = input.nextInt();
        input.nextLine();
        
        // story
        System.out.println("\n'Ok kids,' said Mrs. " + lastName + " 'We're at the zoo today to learn about these " + adjAnimals + " animals.'");
        System.out.println("'Let's do a headcount first. I see there are " + num + " kids here. Alright, let's go in now!'");
        System.out.println("Mrs. " + lastName + "- 'Which animals do we want to see first?'");
        System.out.println("Child- 'Let's see the " + animal + " first!");
        System.out.println("Mrs. " + lastName + "- 'I don’t care. We are at the tigers. I’m going to say this fact out and you are going to determine if it’s real or not. \nAre there more tiger in the U.S. in captivity then there are in the wild?'");
        System.out.println("Child- '" + isTigers + "'");
        System.out.println("Mrs. " + lastName + "- That fact was true. We are going to the bird sanctuary now.");
        System.out.println("Mrs. " + lastName + "- The " + bird + " has " + birdChildren + " amount of children on average each year.'");
        System.out.println("Child- 'Can we see the " + newAnimal + " now? I've been waiting all day to see them!'");
        System.out.println("Mrs. " + lastName + "- 'I don't know, the " + newAnimal + "'s habitat is kinda... unsafe. They " + verb + " everywhere, all the time. The zookeepers don't even go there anymore since it's so risky for them. But we'll go see it anyway.'");
        System.out.println("    As the group enters the " + newAnimal + " habitat, they see people running in terror the opposite direction.");
        System.out.println("Mrs. " + lastName + "- 'Here is the " + newAnimal + ". I did say that the... OH GOD, THEY ESCAPED! RUN!'");
        System.out.println("    The group runs back to the zoo's entrance.");
        System.out.println("Mrs. " + lastName + "- 'Hold on everyone, stop! Even though the " + newAnimal + " is chasing us, we need another headcount! Interesting, now there are " + newNum + " kids now. IT DOESN’T MATTER, WE DON’T HAVE TIME! RUN!");
    }
}