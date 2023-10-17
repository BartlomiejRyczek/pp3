public class StudentTest {
    public static void main(String[] args) {

        // Object creation
        Student s = new Student();

        // Object manipulation
        s.name = "Peter";
        s.age = 21;
        s.studentID = 227864;
        s.number = 3;
        s.valid = true;
        s.average = 4;


        s.sayHello();
        s.displayName();
        s.displayAge();
        s.displayGrade();
        s.displayID();
        s.changeValid();
        
        Student s2 = new Student();

    
        s2.name = "jacek";
        s2.age = 21;
        s2.studentID = 227864;
        s2.number = 3;
        s2.valid = true;
        s2.average = 4;


        s2.sayHello();
        s2.displayName();
        s2.displayAge();
        s2.displayGrade();
        s2.displayID();
        s2.changeValid();
    }
}
