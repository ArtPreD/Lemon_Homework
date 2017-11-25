public class GamePlayer {

    public void start() {
         int turn = 0;
         Player playerOne = new Player("Игрок 1");
         Player playerTwo = new Player("Игрок 2");

         while (true){
             System.out.println("Ходит " + playerOne.getName() + ": Ставь крестик ");
             playerOne.addPlayerTurn();
             if ((playerOne.getTurnCount() >= 3)) {
                 if (playerOne.isWin()) {
                     System.out.println(playerOne.getName() + " выиграл");
                     playerOne.win();
                     playerTwo.louse();
                     break;
                 }
                 if(XOField.getGameTurns() > 8){
                     System.out.println("Ничья. Игра окончена.");
                     break;
                 }
             }

             System.out.println("Ходит " + playerTwo.getName() + ": Ставь нолик ");
             playerTwo.addPlayerTurn();
             if (playerTwo.getTurnCount() >= 3){
                 if (playerTwo.isWin()){
                     System.out.println(playerTwo.getName() + " выиграл");
                     playerTwo.win();
                     playerOne.louse();
                     break;
                 }
             }
         }
    }
}
