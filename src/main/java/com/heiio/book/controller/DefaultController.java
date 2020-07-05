package com.heiio.book.controller;

import com.heiio.book.caching.MyRedis;
import com.heiio.book.caching.StoreTicket;
import com.heiio.book.caching.TicketModel;
import com.heiio.book.kafka.MyProducer;
import com.heiio.book.model.report.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@EnableWebSecurity
@Controller
public class DefaultController {
    @Autowired
    private MyRedis myRedis;

    @Autowired
    private StoreTicket ticket;

    @Autowired
    private MyProducer producer;

    @RequestMapping("")
    public String helloWorld() {
        return "Spring boot to docker test";
    }

    @RequestMapping("/list/{id}")
    public ModelAndView list(Map<String, Object> ms, @PathVariable Integer id, Report report) {
        ms.put("msg", "Hello World");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("jsp/book-list");
        return modelAndView;
    }

    @RequestMapping("/booklist")
    public String bookList(Map<String, Object> model) {
        model.put("msg", "Hello World");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("thymeleaf/book-list");
        return "thymeleaf/book-list";
    }

    @RequestMapping("/booklist2")
    public String bookList2(Map<String, Object> model) {
        model.put("msg", "Hello World");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("thymeleaf/book-list");
        return "login";
    }

    @RequestMapping("/myRedis")
    @ResponseBody
    public String myRedis() {
         myRedis.setRedisValue();
         return "";
    }

    @RequestMapping("/store")
    @ResponseBody
    public String storeRedis() {
        TicketModel model = ticket.getTicket("ticket01");
        return model.getSponsor();
    }

//    @RequestMapping("/pkafka/{message}")
//    @ResponseBody
//    public String producerKafka(@PathVariable String message) {
//       return producer.getProducer(message);
//    }
}




