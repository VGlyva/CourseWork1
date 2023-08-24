public class Main {
    public static void main(String[] args) {
        Employee.divider();
        System.out.println("Курсовая работа №1");
        Employee.divider();
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Денис Викторович", 100000, 1);
        employees[1] = new Employee("Петров Виктор Геннадьевич", 90000, 3);
        employees[2] = new Employee("Семенов Виталий Сергеевич", 80000, 3);
        employees[3] = new Employee("Романов Степан Витальевич", 70000, 2);
        employees[4] = new Employee("Гурин Кирилл Сергеевич", 60000, 5);
        employees[5] = new Employee("Аршавин Андрей Александрович", 50000, 1);
        employees[6] = new Employee("Павлова Виктория Валерьевна", 40000, 4);
        employees[7] = new Employee("Дорохова Мария Викторовна", 30000, 2);
        employees[8] = new Employee("Кирилова Екатерина Витальевна", 20000, 1);
        employees[9] = new Employee("Сидорова Мария Петровна", 10000, 3);
        Employee.showAll(employees);
        Employee.divider();
        Employee.totalSalary(employees);
        System.out.println("Сумма затрат на зарплаты сотрудинков составляет: " +Employee.totalSalary(employees) + " рублей");
        Employee.maxSalary(employees);
        Employee.divider();
        System.out.println("Максимальная зарплата сотрудников составляет: " +Employee.maxSalary(employees) + "рублей");
        Employee.minSalary(employees);
        Employee.divider();
        System.out.println("Минимальная зарплвта сотрудников составляет: " + Employee.minSalary(employees) + "рублей");
        Employee.totalSalary(employees);
        Employee.divider();
        System.out.println("Среднее арифметическое зарплат сотрудников составляет: " + Employee.totalSalary(employees) / employees.length + " рублей");
        Employee.divider();
        Employee.printFio(employees);
    }
}