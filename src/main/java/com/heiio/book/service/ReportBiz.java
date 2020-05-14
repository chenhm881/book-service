package com.heiio.book.service;

import com.heiio.book.model.report.Employee;
import com.heiio.book.model.report.Report;
import java.util.ArrayList;
import java.util.List;

import com.heiio.book.quiz.compare.TestCollections;
import com.heiio.book.quiz.thread.TestThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class ReportBiz {

    @Autowired
    private TestCollections testCollections;

    @Autowired
    private TestThread testThread;

    /**
     * fetch the list of report.
     * @param key report key
     * @param name report name
     * @return report list.
     */
    public List<Report> getReportList(String key, String name) {

        Report b = Report.builder()
                .key(key)
                .name(name)
                .employees(getEmployees(key))
                .build();
        List<Report> reportList = new ArrayList<>();
        reportList.add(b);
        return reportList;
    }

    private List<Employee> getEmployees(String key) {
        List<Employee> employees;
        switch (key) {
            case "thread":
                employees = testThread.quizThread();
                break;
            default:
                employees = testCollections.quizCollections();
                break;
        }
        return employees;
    }

}
