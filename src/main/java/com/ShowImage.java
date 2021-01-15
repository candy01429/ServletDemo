package com.httpservletseaponseapi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/showImage")
public class ShowImage extends HttpServlet {

    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        showImage1(resp);
    }

    // I/O輸出
    private void showImage1(HttpServletResponse resp) throws IOException {

        resp.setContentType("image/jpeg");
        String p1 = getServletContext().getRealPath(File.separator) + "/cat.jpg";
//
        byte[] b = new byte[128];
        int bLen = b.length;
        try (FileInputStream fis = new FileInputStream(p1);
                ServletOutputStream out = resp.getOutputStream();) {
            System.out.println("Need to copy bytes: " + fis.available());
            int read = 0;
            while ((read = fis.read(b))!= -1) {
              if(read < bLen){
                  out.write(b,0,read);
              }else{
                  out.write(b);
              }
            }
        } 
    }
//    private void showImage2(HttpServletResponse resp)throws IOException{
//        resp.setContentType("image/jpeg");
//        String p1 = getServletContext().getRealPath(File.separator) + "/Images/cat.jpg";
//        Files.copy(Paths.get(p1), resp.getOutputStream());
//    }
}
