package Interface;
interface CalculateArea{
  void calculateArea();
}
class Circle{

}
class Rectangle{

}
class Square implements CalculateArea{
    int length;
    int breadth;
    @Override
    public void calculateArea(){
        System.out.println("Area of sqaure");
    }
    public void calculateArea(int length,int breadth) {
        this.length=length;
        this.breadth=breadth;
        int areOfSqaure=length*breadth;
        System.out.println(areOfSqaure);

    }
}
public class CalculateAreaApp {
    public static void main(String[] args) {
        Square square=new Square();
        square.calculateArea();
        square.calculateArea(25,20);
    }
}
