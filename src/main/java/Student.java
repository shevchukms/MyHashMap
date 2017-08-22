public class Student {
    private Integer id;
    private String name;

    Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        // this ensures all hashcodes are between 0 and 15
        return id % 10;
    }

    @Override
    public boolean equals(Object obj) {
        Student otherStudent = (Student) obj;
        return this.name.equals(otherStudent.name);
    }

    @Override
    public String toString() {
        return this.id + "-" + name;
    }
}
