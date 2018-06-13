import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student[] students = {new Student("Vasya",18,4.56),new Student("Ivan",17,4.03),new Student("Svetlana",18,4.78)
                ,new Student("Petro",18,4.7),new Student("Jora",18,3.4),new Student("Irina",17,4.0)};
        Arrays.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("----------AgeComparator------------");
        Arrays.sort(students,new AgeComparator());
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("----------AverageMarkComparator------------");
        Arrays.sort(students,new AverageMarkComparator());
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("----------Java8_Comparator------------");
        Arrays.sort(students,Comparator.comparingDouble(Student::getAge).thenComparing(Student::getAverageMark).thenComparing(Student::getName));
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
