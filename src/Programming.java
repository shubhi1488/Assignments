/*Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
 then the message "I love programming languages" should be printed.
 If some String is passed to it, then in place of "programming languages" the name of that
  String variable should be printed.
For example, while creating object if we pass "Java", then "I love Java" should be printed.*/
public class Programming {
    String language;
    Programming(){
        System.out.println("I love Programming lamguage.");
    }

    public Programming(String language) {
        this.language = language;
        System.out.println("I love"+" "+language);
    }

    public static void main(String[] args) {
        Programming p=new Programming();
        Programming p1=new Programming("java");
    }
}
