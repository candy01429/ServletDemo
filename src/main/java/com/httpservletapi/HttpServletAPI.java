//package com.httpservletapi;
//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet("/HttpServletAPI")
//public class HttpServletAPI extends HttpServlet {
//
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String method = req.getMethod();
//        if(method.equals(METHOD_GET)){
//            long lastModified = getLastModified(req);
//            if(lastModified == -1){
//                // 
//                // 
//                doGet(req, resp);
//            }else{
//                long ifModifiedSince;
//                try{
//                    ifModifiedSince = req.getDateHeader(HEADER_IFMODSINCE);
//                }catch(IllegalArgumentException iae){
//                    // 
//                    ifModifiedSince = -1;
//                }
//                if(ifModifiedSince < (lastModified / 1000*1000)){
//                    //
//                    //
//                    // 
//                    maybeSetLastModified(resp,lastModified);
//                    doGet(req, resp);
//                }else{
//                    resp.setStatus(HttpServletResponse.SC_NOT_MODIFIED);
//                }
//            }
//    }else if(method.equals(METHOD_HEAD)){
//        
//    }
//
//    @Override
//    // doPOST實作內容
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String protocol = req.getProtocol();
//        String msg = lStrings.getString("http.method_post_not_supported");
//        if (protocol.endsWith("1.1")) {
//            resp.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, msg);
//        } else {
//            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, msg);
//        }
//    }
//
//    @Override
//    // doGET實作內容
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String protocol = req.getProtocol();
//        String msg = lStrings.getString("http.method_post_not_supported");
//        if (protocol.endsWith("1.1")) {
//            resp.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, msg);
//        } else {
//            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, msg);
//        }
//    }
//}
//
//}
