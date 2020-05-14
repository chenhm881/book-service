package com.heiio.book.service;

import com.heiio.book.model.report.Employee;
import com.heiio.book.model.report.Report;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.springframework.stereotype.Component;



@Component
public class ReportBiz {
    /**
     * fetch the list of report.
     * @param key report key
     * @param name report name
     * @return report list.
     */
    public List<Report> getReportList(String key, String name) {
        Employee employee = new Employee();
        employee.setEmpno(1);
        employee.setName("Jack");
        List<Employee> employees = new ArrayList<>();
        Report b = Report.builder()
                .key(key)
                .name(name)
                .employees(employees)
                .build();
        List<Report> reportList = new ArrayList<>();
        reportList.add(b);
        Collections.sort(employees, new Comparator<Employee>() {
            private static final String KEY_NAME = "complete_date";
            @Override
            public int compare(Employee a, Employee b) {
                return a.getEmpno().compareTo(b.getEmpno());
            }
        });
        return reportList;
    }

}
