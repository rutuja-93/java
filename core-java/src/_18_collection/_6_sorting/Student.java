package _18_collection._6_sorting;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student() {}

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    // Default sorting logic (by id)
    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id, o.id);
        // OR use: return this.name.compareTo(o.name);  // for default by name
    }
}
