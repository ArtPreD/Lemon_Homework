public class GameComputer {

    public void start() {
        int turn = 0;
        Player playerOne = new Player("Игрок");
        Computer computer = new Computer();

        while (true){
            System.out.println("Ходит " + playerOne.getName() + ": Ставь крестик ");
            playerOne.addPlayerTurn();
            if ((playerOne.getTurnCount() >= 3)) {
                if (playerOne.isWin()) {
                    System.out.println(playerOne.getName() + " выиграл");
                    playerOne.win();
                    computer.louse();
                    break;
                }
                if (XOField.getGameTurns() > 8) {
                    System.out.println("Ничья. Игра окончена.");
                    break;
                }
            }

            System.out.println("Ходит " + computer.getName() + ": Ставь нолик ");
            computer.addComputerTurn();
            if (computer.getTurnCount() >= 3){
                if (computer.isWin()){
                    System.out.println(computer.getName() + " выиграл");
                    computer.win();
                    playerOne.louse();
                    break;
                }
            }
        }
    }
}
