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
