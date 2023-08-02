package com.example.baithuhanh3;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "convert-money", value = "/convert")
public class ConverterServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
       float rate = Float.parseFloat(request.getParameter("rate"));
       float usd = Float.parseFloat(request.getParameter("usd"));
       float vnd = usd * rate;
       PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>usd :"+ usd+"</h1>");
        writer.println("<h1>rate :"+ rate+"</h1>");
        writer.println("<h1>vnd :"+ vnd+"</h1>");
        writer.println("</html>");
    }

    public void destroy() {
    }
}