package com.mashibing.cloudzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 鉴权filter   过滤器
 */
@Component
public class AuthFilter extends ZuulFilter {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 该过滤器是否生效     shouldFiter() 判断是否执行
     */
    @Override
    public boolean shouldFilter() {
        //获取上下文
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();

        String uri = request.getRequestURI();
        System.out.println("来源uri:" + uri);
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        return null;
    }

    /**
     * 拦截类型，4种类型
     */
    @Override
    public String filterType(){
        return FilterConstants.PRE_TYPE;
    }

    /**
     * 值越小，越在前
     */
    @Override
    public int filterOrder(){
        return -1;
    }
}
