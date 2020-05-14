package com.heiio.book.model.report;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor(force = true)
@Data
public class Report {
    private String key;
    private String name;
    private List<Employee> employees;
}
