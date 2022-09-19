import java.util.Random;
import java.util.Scanner;

public class stonePaperScissor {
    public static String generateComputerChoice(Random random) {
        int wordNumber;
        String computersChoice = "";
        wordNumber = random.nextInt(3);
        if (wordNumber == 0)
            computersChoice = "stone";
        else if (wordNumber == 1)
            computersChoice = "paper";
        else
            computersChoice = "scissor";
        System.out.println("\nComputer made it's choice");
        return computersChoice;
    }

    public static String getUserChoice(Scanner scanner) {
        System.out.println("Hit number of your Choice : ");
        System.out.println("\n1.Stone\n2.Paper\n3.Scissor");
        int option = scanner.nextInt();
        String usersChoice = "";
        switch (option) {
            case 1:
                usersChoice = "stone";
                break;
            case 2:
                usersChoice = "paper";
                break;
            case 3:
                usersChoice = "scissor";
                break;
            default:
                break;
        }
        return usersChoice;
    }

    public static String chooseWinner(String computerChoice, String userChoice) {
        String customMessage = "";
        String finalMessage = "";
        String winner="No one ";
        String stoneCustomMessage = "Woo-Hoo ! Stone splinters the scissor";
        String scissorCustomMessage = "Woo-Hoo ! Scissor cuts the paper";
        String paperCustomMessage = "Woo-Hoo ! Paper wraps the Stone";
        if (computerChoice.equals("stone")) {
            if (userChoice.equals("scissor")) {
                winner = "Computer";
                customMessage = stoneCustomMessage;
            } else if (userChoice.equals("paper")) {
                winner = "User";
                customMessage = scissorCustomMessage;
            } else {
                winner = "";
                customMessage = "Tie.Both Choice are same";
            }
        }
        else if (computerChoice.equals("paper")) {
            if (userChoice.equals("scissor")) {
                winner = "User";
                customMessage = scissorCustomMessage;
            }
            else if (userChoice.equals("stone")) {
                winner = "Computer";
                customMessage = paperCustomMessage;
            }
            else {
                winner = "Tie";
                customMessage = "Both Choice are same";
            }
        }
        else {
            if (userChoice.equals("paper")) {
                winner = "Computer";
                customMessage = scissorCustomMessage;
            }
            else if (userChoice.equals("stone")) {
                winner = "User";
                customMessage = stoneCustomMessage;
            }
            else{
                winner = "Tie";
                customMessage = "Both Choice are same";
            }
        }
        finalMessage = winner + " won the game ( " + customMessage + " )";
        return finalMessage;
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String winner;
        String computerChoice = generateComputerChoice(random);
        String userChoice = getUserChoice(scanner);
        winner = chooseWinner(computerChoice, userChoice);
        System.out.println("\nYour choice : " + userChoice + "\nComputer choice : " + computerChoice);
        System.out.println(winner);
    }
}
