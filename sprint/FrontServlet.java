/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class FrontServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
//     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//          processRequest(request, response);
//     }
//     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//          processRequest(request, response);
//     }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
            
          //PrintWriter out=response.getWriter();

          String url = request.getRequestURL().toString();
          System.out.println("URL : "+url);
          String contextPath = request.getContextPath();
          System.out.println("Context path : "+contextPath);
          String[] pathParts = contextPath.split("/");

          String sprintWeb = pathParts[pathParts.length - 1];
          System.out.println("sprint : "+sprintWeb);

          request.setAttribute("message",url+"<br>"+contextPath+"<br>"+sprintWeb);
          request.getRequestDispatcher("page1.jsp").forward(request, response);
            
    }

}
