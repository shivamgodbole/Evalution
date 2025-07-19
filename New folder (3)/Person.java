public abstract class Person {
    private String name;
    private int rollNumber;

    public Person(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public abstract void displayInfo();
}