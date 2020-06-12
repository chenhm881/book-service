package com.heiio.book.datatype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyStream {


    public static void main(String[] args) {
        Map<Integer, Long> lists = IntStream.of(1, 3, 4, 6, 2, 5, 6, 2, 3).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        Map<String, Map<Integer, Long>> maps = new HashMap<>();
        maps.put("1", lists);
        maps.put("2", lists);
        maps.put("3", lists);
        Object ob = maps.entrySet().stream().flatMap(a -> {
            Integer abc = 0;
            Map<Integer, Long> b = a.getValue();
            return b.entrySet().stream();
        }).collect(Collectors.toList());
        System.out.println(lists);

    }
}
