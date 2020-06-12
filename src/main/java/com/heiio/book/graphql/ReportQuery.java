package com.heiio.book.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.heiio.book.model.report.Report;
import com.heiio.book.service.ReportBiz;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Graphql end.
 */
@Component
public class ReportQuery implements GraphQLQueryResolver {

    @Autowired
    private ReportBiz reportBiz;

    /**
     * query the report.
     * @return List
     */
    public List<Report> reportList(String key, String name) {
        return reportBiz.getReportList(key, name);
    }
}
