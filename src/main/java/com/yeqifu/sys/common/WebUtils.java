package com.yeqifu.sys.common;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author: 落亦-
 * @Date: 2019/11/21 21:43
 */
public class WebUtils {

    /**
     * 得到request
     *
     * @return
     */
    public static HttpServletRequest getRequest() {
        return getServletRequestAttributes().getRequest();
    }

    /**
     * 得到session
     *
     * @return
     */
    public static HttpSession getSession() {
        return getRequest().getSession();
    }

    public static ServletRequestAttributes getServletRequestAttributes() {
        return (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
    }
}
