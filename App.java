public class App {
    public static void main(String[] args) {
        Employee ceo = new Employee("Settha", "CEO", 500000);

        Employee headSales = new Employee("Kamphaka", "Head Sales", 300000);
        Employee headMarketing = new Employee("UngInk", "Head Marketing", 300000);
        ceo.children.add(headSales);
        ceo.children.add(headMarketing);

        Employee salesEmployee1 = new Employee("Wiroj", "Sales", 150000);
        Employee salesEmployee2 = new Employee("Weeranan", "Sales", 100000);
        headSales.children.add(salesEmployee1);
        headSales.children.add(salesEmployee2);

        Employee marketingEmployee1 = new Employee("Oak", "Marketing", 200000);
        Employee marketingEmployee2 = new Employee("Aem", "Marketing", 250000);
        headMarketing.children.add(marketingEmployee1);
        headMarketing.children.add(marketingEmployee2);

        printAllEmployee(ceo);
    }

    public static void printAllEmployee(Employee ceo) {
        System.out.println(ceo);
    }
}
