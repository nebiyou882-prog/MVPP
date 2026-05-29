abstract class Job {
    protected String name;
    protected String location;
    protected String age;
    protected int time;
    protected double basePrice;

    public Job(String name, String location, String age, int time, double basePrice) {
        this.name = name;
        this.location = location;
        this.age = age;
        this.time = time;
        this.basePrice = basePrice;
    }

    public void showDetails() {
        System.out.println("Title: " + name);
        System.out.println("Location: " + location);
        System.out.println("Age: " + age);
        System.out.println("Working Time: " + time + " hours/day");
        System.out.println("Salary: " + basePrice);
    }
}

class User {
    private String name;
    private int age;
    private long phoneNumber;

    public User(String name, int age, long phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getName() { 
        return name; }
    public int getAge() { 
        return age; }
    public long getPhoneNumber() { 
        return phoneNumber; }

    // Setters
    public void setName(String name) {
         this.name = name; }
    public void setAge(int age) { 
        this.age = age; }
    public void setPhoneNumber(long phoneNumber) { 
        this.phoneNumber = phoneNumber; }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Age: " + age);
    }
}
