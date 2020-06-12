package com.heiio.book.quiz.thread;

import com.heiio.book.model.report.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

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
        employee.setEmpno(3);
        employee.setName(localDate);
        employees.add(employee);
        employee.setEmpno(2);
        employee.setName(localDate);
        employees.add(employee);


        List<Integer> list1 = IntStream.range(1,4).boxed().map( i -> get()).collect(toList());


        List<Comparator<Integer>> tasks = IntStream.range(1, 5).boxed()
                .map(i -> (Comparator<Integer>) (a, b) -> get()).collect(toList());
        tasks.get(0).compare(1,3);

        List<Comparator<Integer>> tasks1 = IntStream.range(1, 5).boxed()
                .map(i -> Comparator.comparingInt(Integer::bitCount)).collect(toList());
        tasks1.get(0).compare(4, 2);

        return employees;
    }

    private int get() {
        int value = ThreadLocalRandom.current().nextInt(20);
        try {
            TimeUnit.SECONDS.sleep(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return value;

    }
}
