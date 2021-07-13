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
@WebServlet(name = "updatePass", urlPatterns = {"/updatePass"})
public class updatePass extends HttpServlet {

    private final String Success_Page = "logout";
    private final String Failed_Page = "updatePass.jsp";

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
        String url = Failed_Page;
        String passwordCurrent = request.getParameter("txtPasswordCurrent");
        String newPassword = request.getParameter("txtNewPassword");
        String reNewPassword = request.getParameter("txtReNewPassword");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("acc");
        String password = user.getPassword();
        String userName = user.getUserName();
        
        try {
            if (password.equals(passwordCurrent)){
                if (newPassword.equals(reNewPassword)){
                    DAO dao = new DAO();
                    boolean rs = dao.updatePassword(newPassword, userName);
                    if (rs){
                        url = Success_Page;
                    }
                } else {
                    String msg = "New Password is not match to Renew Password";
                    request.setAttribute("FALIEDRENEWPASS", msg);
                }
            } else {
                String msg = "Password is not correct";
                request.setAttribute("FAILEDCURRENTPASS", msg);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(updatePass.class.getName()).log(Level.SEVERE, null, ex);
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
