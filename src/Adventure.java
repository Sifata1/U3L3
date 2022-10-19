import java.util.Scanner;

public class Adventure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You are on an island surrounded by water.\nThere is a path to the woods to the north, the sea to the south, and a beach shack to the east. \nWhich way do you want to go (n,e,s,w)?");
        String command = scan.nextLine();

        if (command.equals("n"))
        {
            System.out.println("You enter the forest and hear some rustling.\nThere may be tigers here or maybe it's just monkeys.");
            System.out.println("You keep wandering the desert and see a man exploring. You see that a man is one of your old friends and he helps you escape the island.");

            /* add nested if statements for possible next actions! */

        }
        else if (command.equals("s")) {
            System.out.println("You see a fin in the sea. /n It may be a shark or maybe it's a person trying to prank you.");
            System.out.println("Do you run away or go closer to the sea? Type Yes to go closer or type No to run away.");
            String answer = scan.nextLine();
            if (answer.equals("Yes")) {
                System.out.println("You get closer and see a man slowly getting to shore as he finishes swimming. You feel relieved!");
            }
            if (answer.equals("No")) {
                System.out.println("You attempt to run away but something makes a huge noise. To your surprise it is a shark. It gets on shore and kills you before you can escape! ");
            }

        }
        else if (command.equals("e")) {
            System.out.println("You head towards the beach shack and see lights turned on inside.");
            System.out.println("Do you enter the beach shack?");
            String answer = scan.nextLine();
            if (answer.equals("Yes")) {
                System.out.println("You enter the shack and you see a button. You press on the button and booby traps appear and the doors of a shack close. You are now stuck here for eternity.");
            }
            if (answer.equals("No")) {
                System.out.println("You attempt to run away but something makes a huge noise. To your surprise it is a shark. It gets on shore and kills you before you can escape! ");
            }
        }
        else if (command.equals("w")) {
            System.out.println("You walk west and to your surprise find a map!");
            System.out.println("You find directions to a secret spot. Do you follow directions to get to the secret spot.");
            String answer = scan.nextLine();
            if (answer.equals("Yes")) {
                System.out.println("After walking hours, you arrive to the secret spot and to your surprise find out that your friends had kidnapped you onto the island to host a surprise party.");
            }
            if (answer.equals("No")) {
                System.out.println("You do not follow the map and soon die after a few days due to starvation. ");
            }
        }
        else {
            System.out.println("You cannot go in that direction. You unfortunately die!");
        }
        // Add else-ifs for s, e, and an else for any other input. Be creative!




        System.out.println("End of adventure!");
    }
}
