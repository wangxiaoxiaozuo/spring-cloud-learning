package com.springcloud.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: wangjian
 * @Date: 2019/4/15 10:26
 * @Description: 路由网管过滤器
 */
@Slf4j
//@Component
public class AccessFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext cts = RequestContext.getCurrentContext();
        HttpServletRequest request = cts.getRequest();
        String accessToken = request.getParameter("accessToken");
        log.info("网关拦截---------->>>>>>>>>>");
//        try {
//            log.info("正常放行");
//        } catch (Exception e) {
//            cts.set("error.status_code", HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
//            cts.set("error.exception", e);
//        }
        return null;
    }
}
