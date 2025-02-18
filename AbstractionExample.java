abstract class Shape{
    abstract void draw();
    abstract void erase()
}

class Circle extends Shape{
    void draw()
    void erase(){
        System.out.println("Drawing Circle:");
    }
}
class Rectangle extends Shape{
    void draw()
    void erase(){
        System.out.println("Drawing rectangle:");

    }
}
class Square extends Shape{
    void draw()
    void erase(){
        System.out.println("Drawing square");
    }
}
class Triangle extends Shape{
    void draw()
    void erase(){
        System.out.println("Drawing triangle:");
    }
}

    public class AbstractionExample {
        public static void main(String[] args) {
            Shape c =new Circle();
            Shape r=new Rectangle();
            Shape s =new Square();
            Shape t =new Triangle();

            c.draw();
            c.erase();
            r.draw();
            r.erase();
            s.draw();
            s.erase();
            t.draw();
            t.erase();
        }
    
}
