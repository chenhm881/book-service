package com.heiio.book;

import static java.nio.charset.Charset.defaultCharset;

import com.codahale.metrics.annotation.Timed;
import java.io.IOException;
import java.io.InputStream;
import javax.servlet.http.HttpServletResponse;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PlaygroundController {
    /**
     * ui tool for graphql.
     * @param response output to playground
     * @throws IOException exception
     */
    @RequestMapping(value = "/playground")
    @Timed
    public void playground(HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");

        InputStream inputStream = new ClassPathResource("playground.html").getInputStream();
        String page = StreamUtils.copyToString(inputStream, defaultCharset());
        response.getOutputStream().write(page.getBytes(defaultCharset()));
    }
}
