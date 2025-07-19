class Student {
    private String name;
    private int rollNo;
    private int[] marks;

    public Student(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public double getAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    public boolean isScholarshipEligible() {
        return getAverage() >= 75;
    }

    @Override
    public String toString() {
        return String.format(
            "Student: %s | Roll No: %d | Average: %.2f\nScholarship Eligible: %b\n",
            name, rollNo, getAverage(), isScholarshipEligible()
        );
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Student A = new Student("Alice", 20, new int[]{80, 90, 85});
            Student B = new Student("Bob", 22, new int[]{60, 65, 68, 64});
            System.out.println(A);
            System.out.println(B);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}