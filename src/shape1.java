/* WAP to create a class named shape. It should contain two methods draw() and erase() that prints "Drawing
Shape" and "Erasing Shape" respectively.
 */
public class shape1 {
    void draw(){
        System.out.println("Drawing Shape");
    }
    void erase(){
        System.out.println("Erasing shape");
    }

    public static void main(String[] args) {
        shape1 s=new shape1();
        s.draw();
        s.erase();
    }
}
