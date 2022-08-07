package entities;

import entities.Employee;
import entities.Address;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private int payDay;

    List<Employee> emp = new ArrayList<Employee>();
    private Address address;

    public Department(){
    }

    public Department(String name, int payDay, Address address) {
        this.name = name;
        this.payDay = payDay;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPayDay() {
        return payDay;
    }

    public void setPayDay(int payDay) {
        this.payDay = payDay;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void addEmployee(Employee employee){
        emp.add(employee);
    }

    public void removeEmployee(Employee employee){
        emp.remove(employee);
    }

    public double payroll() {
        double sum = 0.0;
        for (Employee employee : emp) {
            sum += employee.getSalary();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Departamento Vendas = R$ ");
        sb.append(String.format("%.2f", payroll())).append("\n");
        sb.append("Pagamento realizado no dia ");
        sb.append(payDay).append("\n");
        sb.append("Funcionários:\n");
        for (Employee employee : emp) {
            sb.append(employee);
        }
        sb.append("Para dúvidas favor entrar em contato: ");
        sb.append(address);
        return sb.toString();
    }
}