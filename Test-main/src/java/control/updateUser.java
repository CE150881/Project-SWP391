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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ngonh
 */
@WebServlet(name = "updateUser", urlPatterns = {"/updateUser"})
public class updateUser extends HttpServlet {

    private final String Success_Page = "logout";
    private final String Falied_Page = "updateUser.jsp";

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
        PrintWriter out = response.getWriter();
        /* TODO output your page here. You may use following sample code. */
        String url = Success_Page;
        String phone = request.getParameter("txtPhone");
        String email = request.getParameter("txtEmail");
        String gender = request.getParameter("txtGender");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("acc");
        String username = user.getUserName();
//        check null
        if (phone.isEmpty()) {
            String msg = "Số điện thoại không được để trống";
            request.setAttribute("PHONEFAILED", msg);
            url = Falied_Page;
        }
        if (email.isEmpty()) {
            String msg = "Email của bạn không được để trống";
            request.setAttribute("EMAILFAILED", msg);
            url = Falied_Page;
        }
        try {
            DAO dao = new DAO();
            boolean existPhone = dao.checkExistPhone(phone);
            boolean existEmail = dao.checkExistEmail(email);
            if (existPhone && !user.getUserPhone().equals(phone) ) {
                String msg = "Số điện thoại của bạn đã trùng với một số điện thoại khác";
                request.setAttribute("PHONEEXIST", msg);
                url = Falied_Page;
            } else {
                if (existEmail && !user.getUserEmail().equals(email)) {
                    String msg = "Email của bạn đã trùng với một Email khác";
                    request.setAttribute("EMAILEXIST", msg);
                    url = Falied_Page;
                } else {
                    boolean result = dao.updateUser(email, phone, gender, username);
                    if (result) {
                        url = Success_Page;
                    } else {
                        String msg = "Update Failed";
                        request.setAttribute("UPDATEFAILED", msg);
                    }
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
        } finally {
            RequestDispatcher rd = request.getRequestDispatcher(url);
            rd.forward(request, response);
            out.close();
        }
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
