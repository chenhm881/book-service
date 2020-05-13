package com.heiio.book.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.heiio.book.model.report.Report;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * Graphql end.
 */
@Component
public class ReportQuery implements GraphQLQueryResolver {
    /**
     * query the report.
     * @return List
     */
    public List<Report> reportList() {
        Report b = Report.builder()
                .key("book")
                .name("Python")
                .build();
        List<Report> reportList = new ArrayList<>();
        reportList.add(b);
        return reportList;
    }
}
