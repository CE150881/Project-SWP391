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
@WebServlet(name = "cart2", urlPatterns = {"/cart2"})
public class cart2 extends HttpServlet {

    private final String Success_Page = "hoa-don.jsp";

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
        /* get param to insert bill */
        String total = request.getParameter("txtSum");
        double total2 = Double.parseDouble(total);
        
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("acc");
        String username = user.getUserName();
        
        String address = request.getParameter("txtAddress");
        
        /* get param to insert cart */
           
        
        String foodID[] = request.getParameterValues("txtFoodID");
        Integer foodIDInt[] = new Integer[foodID.length];
        for (int i = 0; i < foodID.length; i++) {
            foodIDInt[i] = Integer.parseInt(foodID[i]);
        }        
        String foodName[] = request.getParameterValues("txtFoodName");
        
        String foodPrice[] = request.getParameterValues("txtFoodPrice");
        Integer foodPriceInt[] = new Integer[foodPrice.length];
        for (int i = 0; i < foodPrice.length; i++) {
            foodPriceInt[i] = Integer.parseInt(foodPrice[i]);
        }        
        
        String amount[] = request.getParameterValues("txtAmount");
        Integer quanlity[] = new Integer[amount.length];
        for (int i = 0; i < foodPrice.length; i++) {
            quanlity[i] = Integer.parseInt(amount[i]);
        }      
        
        /* print hoa-don */
        String url = Success_Page;

        try {
            DAO dao = new DAO();
            /* insert bill to database */
            int billID = dao.getLastBillID();
            System.out.println("billID: " + billID);
            dao.insertBill(billID, username, total2, address);            
            /* insert cart to database */
            for (int i = 0; i < foodID.length; i++) {
                dao.insertCart(billID, foodIDInt[i], foodName[i], foodPriceInt[i], quanlity[i]); 
            }                               
            /* if buy success then print hoa-don.jsp */
            String phone = dao.getTelephone(username);
            request.setAttribute("SUM", total2);
            request.setAttribute("ADDRESS", address);
            request.setAttribute("TELE", phone);
            request.setAttribute("USERNAME", username);
        } catch (Exception e) {
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
