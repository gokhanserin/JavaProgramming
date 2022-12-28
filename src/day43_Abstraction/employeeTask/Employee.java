package day43_Abstraction.employeeTask;

public abstract class Employee extends Person {

    private final int iD;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, int iD, String jobTitle, double salary) {
        super(name, age, gender);
        if (iD<=0){
            throw new RuntimeException("Invalid ID: " + iD);
        }
        this.iD = iD;
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getiD() {
        return iD;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", iD=" + iD +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
