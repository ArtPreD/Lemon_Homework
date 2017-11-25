public class XOField {

    private static final String WIN_COMBINATION = "123,456,789,147,258,369,159,357";
    private static int gameTurns = 0;
    private static int[] turnList = new int[9];

     static boolean isWin(String[] combinations){
        boolean isWin = false;
        for (String com : combinations){
            if (WIN_COMBINATION.contains(String.valueOf(com))) {
                System.out.println("Комбинация" + com);
                isWin = true;
                break;
            }
        }
        return isWin;
    }

    public static int[] getTurnList() {
        return turnList;
    }

    public static void addTurnToTernList(int turn){
        turnList[gameTurns] = turn;
    }

     static int getGameTurns() {
        return gameTurns;
    }

     static void addGameTurns() {
            gameTurns++;
    }
}
