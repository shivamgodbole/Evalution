public class Student {
    private String name;
    private String rollNumber;
    private int[] marks;

    public Student(String name, int age, String rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }
    public String getRollNumber() {
        return rollNumber;
    }

    public double calculateAverage() {
        if (marks == null || marks.length == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
}