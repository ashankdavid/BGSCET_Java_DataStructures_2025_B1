package OOPs;

public class Student {
    String name;
    int usn;

    Student(String n, int u){
        name = n;
        usn = u;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ashank", 123);
    }
}
