class Course {
    private String name;
    private int marks;

    public Course(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() { return name; }
    public int getMarks() { return marks; }

    @Override
    public String toString() {
        return name + ": " + marks;
    }
}

class Student {
    private String name;
    private Course[] courses;

    public Student(String name, Course[] courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() { return name; }
    public Course[] getCourses() { return courses; }

    public String calculateMark(int marks) {
        if (marks >= 90) return "Excellent";
        else if (marks >= 75) return "Good";
        else if (marks >= 50) return "Average";
        else if (marks >= 35) return "Poor";
        else return "Poor";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Student: " + name + "\nCourses:\n");
        for (Course c : courses) {
            sb.append("  ").append(c).append(" (").append(calculateMark(c.getMarks())).append(")\n");
        }
        return sb.toString();
    }
}

public class StudentPerformance {
    public static void main(String[] args) {
        Student[] students = {
            new Student("John Doe", new Course[]{new Course("Maths", 84), new Course("Science", 92), new Course("English", 78)}),
            new Student("Jane Smith", new Course[]{new Course("Maths", 65), new Course("Science", 70), new Course("English", 80)}),
            new Student("Alice Johnson", new Course[]{new Course("Maths", 45), new Course("Science", 50), new Course("English", 55)}),
            new Student("Bob Brown", new Course[]{new Course("Maths", 30), new Course("Science", 40), new Course("English", 35)}),
            new Student("Charlie White", new Course[]{new Course("Maths", 95), new Course("Science", 88), new Course("English", 90)})
        };

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
