public class Student {
    String name;
    int age;
    int studentID;
    int number;
    boolean valid;
    int average;





    void sayHello() {
        System.out.println("Hello from " + name);
    }

    void displayName() {
        System.out.println("My name is " + name);
    }

    void displayAge() {
        System.out.println("I am " + age + " years old");
    }

    void displayGrade() {
        System.out.println("Name: " + name + "Semestr: "+ number+ "Avarage grade: "+average);
    }
    void displayID() {
        System.out.println(name+" "+"Status: "+valid);
    }
    void changeValid() {
        valid =! valid;
    }
}
