/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Entity.User;
import dao.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author msi-pc
 */
@WebServlet(name = "SignUpControl", urlPatterns = {"/signup"})
public class SignupControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        String re_pass = request.getParameter("repass");
        String phone = request.getParameter("phone");
        String email = request.getParameter("mail");
        String gender = request.getParameter("gender");

        if (!pass.equals(re_pass)) {
            request.setAttribute("error5", "Password not match");
            request.setAttribute("user", user);
            request.setAttribute("phone", phone);
            request.setAttribute("mail", email);
            request.setAttribute("pass", pass);
            request.setAttribute("re_pass", re_pass);
            request.getRequestDispatcher("signup.jsp").forward(request, response);

        } else {
            DAO dao = new DAO();
            User u = dao.checkAccountExist(user);
            User p = dao.checkPhoneExist(phone);
            User m = dao.checkEmailExist(email);
            if (u == null && p == null && m == null) {
                // duocj sign up
                dao.signup(user, pass, phone, email, gender);
                response.sendRedirect("login.jsp");

            } else if (p == null && m == null) {
                // day ve trang login.jsp
                request.setAttribute("error1", "Tên đăng nhập đã được sử dụng");
                request.setAttribute("user", user);
                request.setAttribute("phone", phone);
                request.setAttribute("mail", email);
                request.setAttribute("pass", pass);
                request.setAttribute("re_pass", re_pass);
                request.getRequestDispatcher("signup.jsp").forward(request, response);

            } else if (u == null && m == null) {
                // day ve trang login.jsp
                request.setAttribute("error2", "Số điện thoại đã được sử dụng");
                request.setAttribute("user", user);
                request.setAttribute("phone", phone);
                request.setAttribute("mail", email);
                request.setAttribute("pass", pass);
                request.setAttribute("re_pass", re_pass);
                request.getRequestDispatcher("signup.jsp").forward(request, response);
            } else if (p == null && u == null) {
                // day ve trang login.jsp
                request.setAttribute("error3", "Email đã được sử dụng");
                request.setAttribute("user", user);
                request.setAttribute("phone", phone);
                request.setAttribute("mail", email);
                request.setAttribute("pass", pass);
                request.setAttribute("re_pass", re_pass);
                request.getRequestDispatcher("signup.jsp").forward(request, response);
            } else if (u == null) {
                request.setAttribute("error2", "Số điện thoại đã được sử dụng");
                request.setAttribute("user", user);
                request.setAttribute("phone", phone);
                request.setAttribute("mail", email);
                request.setAttribute("pass", pass);
                request.setAttribute("re_pass", re_pass);
                request.setAttribute("error3", "Email đã được sử dụng");
                request.getRequestDispatcher("signup.jsp").forward(request, response);
            } else if (p == null) {
                request.setAttribute("error1", "Tên đăng nhập đã được sử dụng");
                request.setAttribute("user", user);
                request.setAttribute("phone", phone);
                request.setAttribute("mail", email);
                request.setAttribute("pass", pass);
                request.setAttribute("re_pass", re_pass);
                request.setAttribute("error3", "Email đã được sử dụng");
                request.getRequestDispatcher("signup.jsp").forward(request, response);
            } else if (m == null) {
                request.setAttribute("error1", "Tên đăng nhập đã được sử dụng");
                request.setAttribute("user", user);
                request.setAttribute("phone", phone);
                request.setAttribute("mail", email);
                request.setAttribute("pass", pass);
                request.setAttribute("re_pass", re_pass);
                request.setAttribute("error2", "Số điện thoại đã được sử dụng");
                request.getRequestDispatcher("signup.jsp").forward(request, response);
            } else {
                request.setAttribute("error1", "Tên đăng nhập đã được sử dụng");
                request.setAttribute("user", user);
                request.setAttribute("error2", "Số điện thoại đã được sử dụng");
                request.setAttribute("phone", phone);
                request.setAttribute("error3", "Email đã được sử dụng");
                request.setAttribute("mail", email);
                request.setAttribute("pass", pass);
                request.setAttribute("re_pass", re_pass);
                request.getRequestDispatcher("signup.jsp").forward(request, response);
            }
        }
        // sign uo truyen user vao bang account

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
