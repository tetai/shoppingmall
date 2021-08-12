//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.zkz.litemall.wx.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Service("printRequestFilter")
public class PrintRequestFilter implements Filter {
    private static final Logger LOG = LoggerFactory.getLogger(PrintRequestFilter.class);
    private Set<String> ignoreSuffixUris = new HashSet();
    private Set<String> needPrintDetailUris = new HashSet();
    private Set<String> ignoreParams = new HashSet();

    public PrintRequestFilter() {
    }

    public void init(FilterConfig filterConfig) throws ServletException {
        LOG.info("PrintRequestFilter init");
    }

    public void setIgnoreSuffixUris(Set<String> ignoreSuffixUris) {
        this.ignoreSuffixUris = ignoreSuffixUris;
    }

    public void setNeedPrintDetailUris(Set<String> needPrintDetailUris) {
        this.needPrintDetailUris = needPrintDetailUris;
    }

    public void setIgnoreParams(Set<String> ignoreParams) {
        this.ignoreParams = ignoreParams;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request2 = (HttpServletRequest)request;
        String uri = request2.getRequestURI();
        if (!this.isEndsWithIgnoreSuffix(uri)) {
            LOG.info(String.format("%s[%s]", request2.getRequestURI(), request2.getRemoteAddr()));
        }


        chain.doFilter(request, response);
    }

    public void destroy() {
        LOG.info("PrintRequestFilter destroy");
    }

    public boolean isEndsWithIgnoreSuffix(String uri) {
        Iterator i$ = this.ignoreSuffixUris.iterator();

        String ignoreSuffixUri;
        do {
            if (!i$.hasNext()) {
                return false;
            }

            ignoreSuffixUri = (String)i$.next();
        } while(!uri.endsWith(ignoreSuffixUri));

        return true;
    }

    public static void main(String[] args) {
        Set<String> needPrintSet = new HashSet();
        needPrintSet.add("a*");
        System.out.println(needPrintSet.contains("a"));
    }
}
