public class Employee {
    private static int count =0;
    private int id;
    private final String fullName;
    private int department; // 1-5
    private int salary;


    public Employee (String fullName, int department, int salary){
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;

        count++; // 1 сотрудник ид = 0, каунт = 0 для дз
       id = count;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String toString() {
        return "Служащиий " + id + " :" + " " + fullName +
                "; департамент - " + department +
                "; зарплата - " + salary;
    }
}
