package com.heiio.book.quiz.design.memeno;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Mememo {
   private String left;
   private String right;
}
