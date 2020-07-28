import java.util.Scanner;

public class UserInterface{
    Scanner sc = new Scanner(System.in);

    public UserInterface(){
        System.out.println("Welcome bla bla");
    }

    public void printInfo(Solution s){
        System.out.println("You have " + s.positionsCorrect + " correct positions and " + s.colorsCorrect + " correct colors but wrong positions.");
    }

    public String getColor(int amount, int round){
        System.out.println("Choose the color for field " + amount + " - Round " + round);
        return sc.nextLine();
    }


    public boolean getRestart(boolean won){
        if(won){
            System.out.println("Congratulations! You've figured out the combination");
        }else{
            System.out.println("You couldn't figure out the combination. Try again!");
        }

        System.out.println("Do you want to play again? (Y/N)");
        while(true){
            String userInput = sc.nextLine();
            if(userInput.toLowerCase().equals("y")){
                return true;
            }else if(userInput.toLowerCase().equals("n")){
                return false;
            }
        }
    }

    public void displayNotValid(){
        System.out.println("Not a valid color. Please choose between \"Red\", \"Yellow\", \"Blue\", \"Green\", \"Black\" or \"White\"");
    }
}
