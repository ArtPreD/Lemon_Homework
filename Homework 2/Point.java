public class Point {

    private int x, y;
    private static int count = 0;
    private String name;

    public static void main(String[] args) {
        Point pointOne = new Point(3,3);
        Point pointTwo = new Point(6, 7);
        pointOne.shiftX(1);
        pointTwo.shiftY(5);
        System.out.println(pointTwo.distanceFromStart());
        System.out.println(pointOne.calculateDistance(pointTwo));

    }

    public Point(int x, int y){
        count++;
        name = "Точка " + count;
        System.out.println("Создаем точку " + count + " в координатах" + " x = " + x + ", y = " + y);
        this.x = x;
        this.y = y;
    }

    public double calculateDistance(Point b){
        return  Math.sqrt(Math.pow(x - b.getX(), 2) + Math.pow(y - b.getY(), 2));
    }

   public double distanceFromStart(){
       return Math.sqrt(Math.pow(0 - x, 2) + Math.pow(0 - y, 2));
    }

    public void shiftX(int x) {
       this.x += x;
       System.out.println(name +" смещена по оси х на " + x + ". Новые координаты точки: " + this.x + "," + y);
    }

    public void shiftY(int y) {
        this.y += y;
        System.out.println(name + " смещена по оси y на " + y + ". Новые координаты точки: " + x + "," + this.y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}