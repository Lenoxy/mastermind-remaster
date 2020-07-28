import java.util.*;

public class Controller{

    UserInterface ui;

    List<String> colors = Arrays.asList("Red", "Yellow", "Blue", "Green", "Black", "White");
    List<String> combination = new ArrayList<String>();


    public Controller(){
        this.initializeMap();
        this.initializeConfig();
        ui = new UserInterface();
    }


    private void initializeMap(){
    }

    private void initializeConfig(){
        for(int i = 0; i < 4; i++){
            int key = (int) Math.floor(Math.random() * colors.size());
            System.out.println(colors.get(key));
            combination.add(colors.get(key));
        }
    }

    public Solution compare(List<String> userInput){
        if(userInput.size() != 4){
            return null;
        }
        Solution s = new Solution();
        int userIndex = 0;
        for(String userColor : userInput){
            if(userColor.equals(combination.get(userIndex))){
                s.positionsCorrect++;
            }else{
                if(combination.contains(userColor)){
                    s.colorsCorrect++;
                }
            }
            userIndex++;
        }
        return s;

    }

    public boolean play(){
        for(int round = 0; round < 12; round++){
            List<String> userConfig = new ArrayList<String>();
            for(int pin = 0; pin < 4; pin++){
                userConfig.add(getValidUserInput(pin, round));
            }
            Solution s = compare(userConfig);
            if(s.positionsCorrect == 4){
                return ui.getRestart(true);
            }else{
                ui.printInfo(s);
            }

        }
        return ui.getRestart(false);
    }

    private String getValidUserInput(int pin, int round){
        String userInput;
        while(true){
            userInput = ui.getColor(pin + 1, round + 1);
            if(validate(userInput)){
                break;
            }else{
                ui.displayNotValid();
            }
        }
        return userInput;

    }

    private boolean validate(String s){
        return colors.contains(s);
    }

    private int getIdForString(String color){
        Integer matchingValue = null;
        for(int i = 0; i < colors.size(); i++){
            if(colors.get(i) == color){
                matchingValue = i;
            }
        }
        return matchingValue;
    }


}
