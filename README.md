# Lemon_Homework
School Tasks

План:
1. Архитектура
2. Поведение системы
3. Implimentation
4. UI/Swing
5. Сетевая игра

КРЕСТИКИ НОЛИКИ

1. Поле 3 на 3
2. Фишки: "Х" - "О"
3. Условие выигрыша - 8 комбинаций.
4. Учет ходов.


public class XOField {

	private String winCombination = "123,456,789,147,258,369,159,357";
  
	public String getWinCombination() {
		return winCombination;
	}
}


	public class App {
		
		public static void main(String[] args) {
		
			String first = "123";
			String second = "169";
			
			System.out.println("Do you win?");
			System.out.println("Ansver: " + isWin(first));
			System.out.println("And now?");
			System.out.println("Ansver: " + isWin(second));
			
		}
	
		private static boolean isWin(String combination) {
			XOField field = new XOField();
			boolean isWin = field.getWinCombination().contains(combination);
			return isWin;
		}
		
