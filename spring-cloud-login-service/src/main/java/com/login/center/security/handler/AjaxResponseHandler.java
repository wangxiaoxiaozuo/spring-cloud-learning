package com.login.center.security.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author limin
 * @date 2018-11-02
 * json响应handler
 */
public class AjaxResponseHandler {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static void handle(HttpServletResponse response, HttpStatus httpStatus, Object body) throws IOException {
        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        response.setStatus(httpStatus.value());
        response.getWriter().print(objectMapper.writeValueAsString(body));
    }
}
