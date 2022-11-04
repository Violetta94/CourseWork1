public class Main {

    private static Employee[] employees;

    public static void main(String[] args) {

        employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 35000);
        employees[1] = new Employee("Легинсова Лариса Анатольевна", 4, 50000);
        employees[2] = new Employee("Тарелкин Фёдор Николаевич", 2, 40000);
        printArray();
        System.out.println("Сумма затрат на зарплаты: " + sumSalaries());
        System.out.println("Сотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary());
        System.out.println("Среднее значение зарплат: " + averageSalary());
        System.out.println("Ф.И.О. сотрудников: ");
        fio();

    }

    public static void printArray() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public static int sumSalaries() {
        int result = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                result += employees[i].getSalary();
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee result = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < result.getSalary()) {
                result = employees[i];
            }
        }
        return result;
    }
    public static Employee findEmployeeWithMaxSalary() {
        Employee result = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > result.getSalary()) {
                result = employees[i];
            }
        }
        return result;
    }

    public static double averageSalary() {
        int counternotnull = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                counternotnull++;
            }
        }
        return sumSalaries() / counternotnull;
    }

    public static void fio() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }
    }
}