
public class Student {
    
    String name;
    int age;
    String grade;

    
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    
    public static void main(String[] args) {
        
        Student student1 = new Student("Alice", 20, "A");
         student1.display();
    }
}
