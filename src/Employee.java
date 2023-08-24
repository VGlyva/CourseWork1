public class Employee {
    private final String nick;
    private int salary;
    private int department;
    private static int count = 1;
    private int id;

    public Employee(String nick, int salary, int department) {
        this.setId(count++);
        this.nick = nick;
        this.salary = salary;
        this.department = department;
    }

    public String getNick() {
        return nick;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public static int getCount() {
        return count;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String toString() {
        return "ID № " + this.id + " ФИО: " + this.nick + "." + " Зарплата: " + this.salary + "." + " Депортамент № " + this.department;
    }

    // вызов всех сотрудников
    public static void showAll(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }

        }
    }

    // сумма всех зарплат
    public static int totalSalary(Employee[] employees) {
        int allSalary = 0;
        for (Employee employee : employees) {
            allSalary += employee.getSalary();
        }
        return allSalary;
    }

    // максимальная зарплата сотрудников
    public static int maxSalary(Employee[] arr) {
        int storageMaxSalary = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].salary > storageMaxSalary) {
                storageMaxSalary = arr[i].salary;
            }
        }
        return storageMaxSalary;
    }

    public static int minSalary(Employee[] arr) {
        int storageMinSalary = arr[0].salary;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].salary < storageMinSalary) {
                storageMinSalary = arr[i].salary;
            }

        }
        return storageMinSalary;
    }

    public static void printFio(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getNick());
        }
    }

    public static void divider() {
        System.out.println("=====================");
    }

}




