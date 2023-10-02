package New_folder;

public class Company {
    public static void main(String[] args) {
        employees emp = new employees();
        System.out.println("before address change");
        emp.displayEmployees();
        System.out.println("after address change");
        emp.changeAddress("satara");
        emp.displayEmployees();

    }

}
