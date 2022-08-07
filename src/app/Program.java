package app;

import entities.Employee;
import entities.Address;
import entities.Department;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String name = sc.nextLine();
        System.out.print("Dia do pagamento: ");
        int payDay = sc.nextInt();
        System.out.print("Email: ");
        sc.nextLine();
        String email = sc.nextLine();
        System.out.print("Telefone: ");
        String phone = sc.nextLine();

        Address address = new Address(email, phone);

        Department dept = new Department(name, payDay, address);

        System.out.print("Quantos funcionários tem o departamento? ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            System.out.println("Dados do funcionário " + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String funcName = sc.nextLine();
            System.out.print("Salário: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(funcName, salary);

            dept.addEmployee(emp);
        }

        showReport(dept);

        sc.close();
    }

    private static void showReport(Department dept) {
        System.out.println();
        System.out.println("FOLHA DE PAGAMENTO:");
        System.out.println(dept);
    }
}