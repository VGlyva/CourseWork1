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

    public static void showAll(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }

        }
    }

    public static int totalSalary(Employee[] employees) {
        int allSalary = 0;
        for (Employee employee : employees) {
            allSalary += employee.getSalary();
        }
        return allSalary;
    }

    public static Employee maxSalary(Employee[] employees) {
        int index = 0;
        int maxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
                index = i;
            }
        }
        return employees[index];
    }

    public static Employee minSalary(Employee[] employees) {
        int index = 0;
        int storageMinSalary = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < storageMinSalary) {
                storageMinSalary = employees[i].salary;
                index = i;
            }
        }
        return employees[index];
    }



    public static void printFio(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getNick());
        }
    }
    public static int middleSalary(Employee[] employees) {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                count++;
                if (count == 0) {
                    return 0;
                }
            }
        }
        int totalSalaryTwo = totalSalary(employees);
        int middleSalary = totalSalaryTwo / count;
        System.out.println("Средняя зарплата сотрудников cоставляет = " + middleSalary);
        return middleSalary;
    }

    public static void divider() {
        System.out.println(" =====================");
    }
}




