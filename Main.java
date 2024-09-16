//Name: Eclipse and Eduardo                Title: Unit 1 Project                    Date: 9/13/24

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        // Creating the scanner
        Scanner input = new Scanner(System.in);
        
        // Asking questions for the Mad Lib
        System.out.print("Choose the weather: ");
        String weather  = input.nextLine();
        
        System.out.print("Input a last name: ");
        String lastName = input.nextLine();
        
        System.out.println("Input any random number: ");
        int randNum = input.nextInt();
        // Need this after anything that isn't a input.NextLine(); or else it skips the next scanner
        // They explain why here: https://www.freecodecamp.org/news/java-scanner-nextline-call-gets-skipped-solved/
        input.nextLine();
        
        System.out.println("Input a zoo animal (make plural): ");
        String animals = input.nextLine();
        
        System.out.println("Input a verb (make it end with -ed: ");
        String verbEndinginEd = input.nextLine();
        
        System.out.println("Input any random number: ");
        int age = input.nextInt();
        input.nextLine();
        
        System.out.println("Input any random number: ");
        int time = input.nextInt();
        input.nextLine();
        
        System.out.println("Input an adjective: ");
        String adjTeacher = input.nextLine();
        
        System.out.println("Choose one: True or False? ");
        boolean questions = input.nextBoolean(); 
        input.nextLine();
        
        System.out.println("Enter a decimal ");
        double years = input.nextDouble();
        input.nextLine();
        
        System.out.println("Enter an occupation: ");
        String occupation = input.nextLine();
        
        System.out.println("Input a name: ");
        String name = input.nextLine();
        
        System.out.println("Choose one: True or False? ");
        boolean fact = input.nextBoolean(); 
        input.nextLine();
        
        // story
        System.out.println("\nIt was a " + weather + " day when Ms. " + lastName + " decided to take her kids out to the zoo.");
        System.out.println("She had promised them that they would visit at least " + randNum + " exhibits today, and if they couldn’t, they would do it later.");
        System.out.println("The kids wanted to visit the " + animals + " first so they " + verbEndinginEd + " to the exhibit. ");
        System.out.println("There they saw a zoo keeper who looked around to be around " + age + ". The zoo keeper told her that the animals were having their feeding time so they had to wait " + time + " minutes.");
        System.out.println("It was no matter, she had all the time in the world to wait, the kids however didn't. ");
        System.out.println("Being a " + adjTeacher + " teacher, Ms. " +  lastName + " asked the kids true and false questions to pass the time and of course as par first-grader behavior, they’d mostly said " + questions + " to these statements.");
        System.out.println("She found joy in telling them they were wrong.");
        System.out.println("Once the animals were let out, she let the kids fawn over them.");
        System.out.println("To the remaining ones who still wanted to play her little game, she let the zoo keeper tell them cool facts, laying back to enjoy the scenery.");
        System.out.println("After all they only lived for " + years + " years, she could wait until they were ripe enough to eat. ");
        System.out.println("She was so happy she found this job after her last job as an " + occupation + " where they fired her after " + name + " disappeared.");
        System.out.println("It wasn't even " + fact + " either!");
        
    }
}
