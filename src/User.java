public class User {

    //Fields (for attributes)
    public String name;

    //Constructor yapısı için
    public User(String name, int age){
        this.name = name;
    }
    //Methods
    public void sayHello(){
        System.out.println("Hi! My name is çiki çiki slim " + name + "! :)");
    }
}
