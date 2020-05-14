package com.heiio.book.quiz.thread;

import com.heiio.book.model.report.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class TestThread {

    public List<Employee> quizThread() {
        List<Employee> employees = new ArrayList<>();
        String localDate = "";

        localDate = ThreadLocalDateUtilTwo.format(new Date());

        Employee employee = new Employee();
        employee.setEmpno(1);
        employee.setName(localDate);
        employees.add(employee);

        return employees;
    }
}
