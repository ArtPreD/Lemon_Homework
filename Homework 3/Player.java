import java.util.Scanner;

public class Player {

    private int[] turns = new int[5];
    private int win, louse, turnCount;
    private String name;
    Scanner scanner = new Scanner(System.in);

    Player(String name){
        this.name = name;
    }

    private String combination(int[] turns){
        String strCombination = "";

        for(int i = 0; i < turns.length; i++){
            if (turns[i] == 0) {
                continue;
            }
            for (int j = 0; j < turns.length; j++){
                if (turns[j] == 0) {
                    continue;
                }
                for (int k = 0; k < turns.length; k++){
                    if (turns[k] == 0) {
                        continue;
                    }
                    if(turns[i] != turns[j] && turns[i] != turns[k] && turns[k] != turns[j]) {
                        strCombination += turns[i] + "" + turns[j] + "" + turns[k] + ",";
                    }
                }
            }
        }

        return strCombination;
    }

    private String[] combinationList(String numbers){
        String[] combinationArray;
        String delimiter = ",";
        combinationArray = numbers.split(delimiter);

        return combinationArray;

    }

    int makerTurn(){
        int turn = scanner.nextInt();
        for (int num : XOField.getTurnList()){
            if (num == turn){
                System.out.println("Такой ход уже был");
                turn = makerTurn();
                break;
            }
        }
        return turn;
    }

    void addPlayerTurn(){
        if (turnCount <= 4) {
            int turn = makerTurn();
            turns[turnCount] = turn;
            XOField.addTurnToTernList(turn);
            turnCount++;
            XOField.addGameTurns();
        }
    }

    boolean isWin(){
        return XOField.isWin(combinationList(combination(turns)));
    }

    public void win() {
        win++;
    }

    public void louse() {
        louse++;
    }

    public int getWin() {
        return win;
    }

    public int getLouse() {
        return louse;
    }

     int getTurnCount() {
        return turnCount;
    }

     String getName() {

        return name;
    }
}
