/*Create a class box that uses a paramatrized constructor to initialize the dimensions of a box
. the dimensions of the box are width, height and depth . the class should have a method that can return
the volume of the box. Create an object of the box class and test the functionallities.
 */
public class Box {
    int width;
    int height;
    int depth;

    public Box(int w, int h, int d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }
    void Volume(){
        int volume=width*height*depth;
        System.out.println("Volume of the box is:"+volume);
    }

    public static void main(String[] args) {
        Box v=new Box(3,4,5);
        v.Volume();
    }
}
