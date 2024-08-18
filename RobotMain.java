import java.util.Arrays;
import java.util.Scanner;

public class RobotMain {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Presentation part
        Robot robot = new Robot("Jitters", "2024", "C3PO1012", true, "70 years", 25, "Tungsten");

        System.out.println("Hello, welcome to Cyberdime systems.\n");
        System.out.println(
                "We provide some of the world's most advanced, technology-led defence, aerospace and security solutions.");
        System.out.println("\nWe employ a skilled workforce of around 100,000 people in more than 40 countries.");
        System.out.println(
                "\nWorking with customers and local partners, we develop, engineer, manufacture, and support products and systems to deliver military capabilities.");
        System.out.println(
                "\nWe aid in protecting national security and people, keeping critical information and infrastructures secure.");

        System.out.println(
                "\n Today we are going to present to you a Revolutionary development in Cyberdime systems, Robotic expansion programme.\n");
        System.out.println(
                " Robotics is witnessing significant advancements in humanoids, designed to perform a wide range of tasks in various environments.\n");
        System.out.println("We are pleased to say we are at the forefront of that advancement.\n");
        System.out.println("Please allow us to show you further, is this okay?\n");

        boolean invalidInput;

        // User input part
        do {
            invalidInput = false; // Reset invalidInput at the beginning of each loop iteration

            System.out.println("Type yes to continue and no to exit webinar.");

            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Great! Let us continue.");
            } else if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for listening.\n");
                System.out.println(
                        "For additional information on the work we do here at Cyberdime Systems, please visit our website at WWW.CyberdimeSystems.co.uk");
                System.exit(0);
            } else {
                System.out.println("Invalid input. Please type 'yes' to continue or 'no' to exit.");
                invalidInput = true; // Set invalidInput to true to repeat the loop
            }

        } while (invalidInput); // Continue looping if the input was invalid

        sc.close(); // Close the scanner

        System.out.println("\n Allow us to reveal to you our latest technological advancement in A.I and Robotics.\n ");
        System.out.println(" I am pleased to introduce to you Jitter. \n ");
        System.out.println(
                "Jitter!, is the first of its kind. A sentient, fully automated security and defence machine, capable of multiple assignments and tasks.\n ");
        System.out.println(" Behold!! ");

        printJitters();

        System.out.println(" The following is Jitters specifications. \n");

        System.out.println("Name: " + robot.getName() + "\n" + "Date Manufactured: " + robot.getYear() + "\n"
                + "Catalogue Number: " + robot.getCatNum() + "\n" + "sentient? " + (robot.getSentient() ? "Yes" : "No")
                + "\n"
                + "Battery Lifespan: " + robot.getBattery() + "\n" + "Weapons number: " + robot.getWeapons() + "\n"
                + "Material: " +

                robot.getMaterial());

        Robot houseRobot = new Robot(robot);

        houseRobot.setName("Aid");
        houseRobot.setYear("2025");
        houseRobot.setCatNum("C4TY0897");
        houseRobot.setBattery("25 years");
        String[] utensils = { "Hoover", "Kettle", "Radio", "Toaster", "Air fryer", "Microwave", "Kitchen untensils",
                "Sterio", "" };

        houseRobot.setUtensils(utensils);

        System.out.println(" \n We will also be releasing our first commercial Robot. \n");
        System.out.println("Aid! \n");
        System.out.println(
                "Aid will be the first of its kind, helping its user with their every day needs from cooking to cleaning, to cutting your hair. \n"
                        +
                        "Aid will facilitate the every day chores we all can find mundane. \n");
        System.out.println(" Ladies and gentlemen we present to you, Aid!");

        printAid();

        System.out.println(" Below is a spec of what Aid has to offer \n");

        System.out.println("Name: " + houseRobot.getName() + "\n" + "Year: " + houseRobot.getYear() + "\n"
                + "Catalogue Number: " + houseRobot.getCatNum() +
                "\n" + "Battery " + houseRobot.getBattery() + "\n" + "Utensils: "
                + Arrays.toString(houseRobot.getUtensils()));

    }

    public static void printJitters() {
        System.out.println(Robot.getJitters());

    }

    public static void printAid() {
        System.out.println(Robot.getAid());

    }
}
