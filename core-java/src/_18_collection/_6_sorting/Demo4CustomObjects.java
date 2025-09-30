package _18_collection._6_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo4CustomObjects {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(101, "Suraj"));
        studentList.add(new Student(12, "Rahul"));
        studentList.add(new Student(1, "Vishnu"));
        studentList.add(new Student(5, "Altaf"));
        studentList.add(new Student(7, "Baba"));

        System.out.println("Before sorting:");
        studentList.forEach(System.out::println);

        // ✅ Default sort (based on compareTo in Student)
        Collections.sort(studentList);
        System.out.println("\nAfter sorting by ID (default):");
        studentList.forEach(System.out::println);

        // ✅ Sort by Name (A → Z)
        Collections.sort(studentList, Comparator.comparing(Student::getName));
        System.out.println("\nAfter sorting by Name (A-Z):");
        studentList.forEach(System.out::println);

        // ✅ Sort by Name (Z → A)
        Collections.sort(studentList, Comparator.comparing(Student::getName).reversed());
        System.out.println("\nAfter sorting by Name (Z-A):");
        studentList.forEach(System.out::println);

        // ✅ Sort by ID (Descending)
        Collections.sort(studentList, Comparator.comparingInt(Student::getId).reversed());
        System.out.println("\nAfter sorting by ID (Descending):");
        studentList.forEach(System.out::println);
    }
}
