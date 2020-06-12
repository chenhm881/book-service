package com.heiio.book.quiz.compare;

import com.heiio.book.model.report.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Component
public class TestCollections {

    public List<Employee> quizCollections() {
        List<Employee> employees = new ArrayList<>();

        Employee employee = new Employee();
        employee.setEmpno(1);
        employee.setName("Jack");
        employees.add(employee);

        employee = new Employee();
        employee.setEmpno(9);
        employee.setName("Tom");
        employees.add(employee);

        employee = new Employee();
        employee.setEmpno(2);
        employee.setName("Nick");
        employees.add(employee);

        // 匿名方法
        //anonymousSort(employees);
        // Lambda 表达式
        //lambdaSort(employees);
        // 方法引用
        comparingMethodSort(employees);

        return employees;
    }

    public void anonymousSort(List<Employee> employees) {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee a, Employee b) {
                return a.getEmpno().compareTo(b.getEmpno());
            }
        });
    }

    public void lambdaSort(List<Employee> employees) {
        Collections.sort(employees, (a, b) -> {
            return  Integer.compare(a.getEmpno(), b.getEmpno());
        });
    }

    public void comparingMethodSort(List<Employee> employees) {
        Collections.sort(employees, Comparator.comparingInt(Employee::getEmpno));
    }
}
