package gameOOP.requests;

import java.util.Scanner;

public class RequestsForInput {

    private String mainCharName = requestCharName();

    String requestCharName() {
        /*Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();*/
        return "bobonameofMainHerocozIdontCare";
    }

    public String getMainCharName() {
        return mainCharName;
    }

    public void setMainCharName(String mainCharName) {
        this.mainCharName = mainCharName;
    }
}
