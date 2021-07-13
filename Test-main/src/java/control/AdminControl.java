/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Entity.Category;
import Entity.Food;
import dao.BillDAO;
import dao.CategoryDAO;
import dao.FoodDAO;
import dao.UserDAO;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.Hashtable;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author msi-pc
 */
public class AdminControl extends HttpServlet {

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
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AdminController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AdminController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
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
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String path = request.getRequestURI();

        if (path.endsWith("/admin")) {
            request.getRequestDispatcher("admin.jsp").forward(request, response);
        }

        if (path.endsWith("/allFood")) {
            ResultSet rs = FoodDAO.getAllFood();
            if (rs == null) {
                response.sendRedirect("index.jsp");
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("allFood", rs);
                request.getRequestDispatcher("/adminAllFood.jsp").forward(request, response);
            }
        }
        
        if (path.endsWith("/allCategory")) {
            ResultSet rs = CategoryDAO.getAllCategory();
            if (rs == null) {
                response.sendRedirect("index.jsp");
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("allCategory", rs);
                request.getRequestDispatcher("/adminAllCategory.jsp").forward(request, response);
            }

        }
        
        if (path.endsWith("/allBill")) {
            ResultSet rs = BillDAO.getAllBill();
            if (rs == null) {
                response.sendRedirect("index.jsp");
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("allBill", rs);
                request.getRequestDispatcher("/adminAllBill.jsp").forward(request, response);
            }

        }
        
        if (path.endsWith("/allUser")) {
            ResultSet rs = UserDAO.getAllUser();
            if (rs == null) {
                response.sendRedirect("index.jsp");
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("allUser", rs);
                request.getRequestDispatcher("/adminAllUser.jsp").forward(request, response);
            }

        }

        if (path.endsWith("/add")) {
            ResultSet rs2 = CategoryDAO.getAllCategory();
            if (rs2 == null) {
                response.sendRedirect(request.getContextPath()+ "/admin");
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("category", rs2);
                request.getRequestDispatcher("/adminFoodAdd.jsp").forward(request, response);
            }
        }
        
        if (path.endsWith("/addCategory")) {               
                request.getRequestDispatcher("/adminCategoryAdd.jsp").forward(request, response);
        }

        if (path.startsWith(request.getContextPath()+"/admin/edit")) {
            String[] s = path.split("/");
            String foodID = s[s.length - 1];
            int foodID2 = Integer.parseInt(foodID);
            Food food = FoodDAO.getFoodByID(foodID2);
            ResultSet rs2 = CategoryDAO.getAllCategory();
            if (food == null) {
                response.sendRedirect(request.getContextPath()+"/admin");
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("food", food);
                session.setAttribute("category", rs2);
                request.getRequestDispatcher("/adminFoodEdit.jsp").forward(request, response);
            }
        }
        
        if (path.startsWith(request.getContextPath()+"/admin/categoryEdit")) {
            String[] s = path.split("/");
            String categoryID = s[s.length - 1];
            Category category = CategoryDAO.getCategoryByID(Integer.parseInt(categoryID));
            
            if (category == null) {
                response.sendRedirect(request.getContextPath()+"/admin");
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("category", category);
                
                request.getRequestDispatcher("/adminCategoryEdit.jsp").forward(request, response);
            }
        }

        if (path.startsWith(request.getContextPath()+"/admin/delete")) {
            String[] s = path.split("/");
            String foodID = s[s.length - 1];

            Food f = FoodDAO.getFoodByID(Integer.parseInt(foodID));
            String folder = "upload";
            String test = request.getServletContext()
                                    .getRealPath("") + "/" + folder + "/" +f.getImage();                                                  
            File file = new File(test);
            file.delete();
            int count = FoodDAO.deleteFood(Integer.parseInt(foodID));
            response.sendRedirect(request.getContextPath()+"/admin/allFood");
        }
        
        if (path.startsWith(request.getContextPath()+"/admin/categoryDelete")) {
            String[] s = path.split("/");
            String categoryID = s[s.length - 1];
            
            int count = CategoryDAO.deleteCategory(Integer.parseInt(categoryID));
            response.sendRedirect(request.getContextPath()+"/admin/allCategory");
        }
        

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
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        
        String btn = null;
        int foodID = 0, foodPrice, categoryID = 0;
        String foodName, image;
        
        String image2 = "";
        Hashtable params = new Hashtable();

        DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(fileItemFactory);
        try {
            List<FileItem> fileItems = upload.parseRequest(request);
            for (FileItem fileItem : fileItems) {
                if (fileItem.isFormField()) {
                    params.put(fileItem.getFieldName(), fileItem.getString("UTF-8"));

                }
            }

            btn = (String) params.get("Add");
            if (btn != null) {
                for (FileItem fileItem : fileItems) {
                    if (!fileItem.isFormField()) {
                        // xử lý file
                        String nameimg = fileItem.getName();
                        if (!nameimg.equals("")) {
                            String folder = "upload";
                            String dirUrl = request.getServletContext()
                                    .getRealPath("") + "/" + folder;
                            File dir = new File(dirUrl);
                            if (!dir.exists()) {
                                dir.mkdir();
                            }
                            String nameimg2 = System.nanoTime() + "-" + nameimg;
                            String fileImg = dirUrl + "/" + nameimg2;
                            File file = new File(fileImg);
                            try {
                                fileItem.write(file);
                                System.out.println("UPLOAD THÀNH CÔNG...!");
                                System.out.println("ĐƯỜNG DẪN KIỂM TRA UPLOAD HÌNH ẢNH : \n" + dirUrl);

                                image2 = nameimg2;

                            } catch (Exception e) {
                                System.out.println("CÓ LỖ TRONG QUÁ TRÌNH UPLOAD!");
                                e.printStackTrace();
                            }
                        }
                    }
                }
                
                foodName = (String) params.get("foodName");
                image = image2;
                String categoryIDcheck = (String) params.get("categoryID");
                String foodPricecheck = (String) params.get("foodPrice");
                
                if (categoryIDcheck.equals("") || foodPricecheck.equals("")) {
                    categoryID = 0;
                    foodPrice = 0;
                }else{               
                    categoryID = Integer.parseInt((String) params.get("categoryID"));
                    foodPrice = Integer.parseInt((String) params.get("foodPrice"));
                }
                if (foodName.equals("") || image.equals("") || categoryID == 0 || foodPrice == 0) {
                    response.sendRedirect(request.getContextPath()+"/admin/allFood");
                } else {
                    Food f = new Food(foodID, image,foodName, foodPrice, categoryID);
                    int count = FoodDAO.addFood(f);
                    if (count > 0) {
                        response.sendRedirect(request.getContextPath()+"/admin/allFood");
                    } else {
                        response.sendRedirect(request.getContextPath()+"/admin/add");
                    }
                }
            }

            btn = (String) params.get("edit");
            if (btn != null) {

                foodID = Integer.parseInt((String) params.get("foodID"));
                Food f2 = FoodDAO.getFoodByID(foodID);

                for (FileItem fileItem : fileItems) {
                    if (!fileItem.isFormField()) {
                        // xử lý file
                        
                        String nameimg =  fileItem.getName();
                        if (!nameimg.equals("")) {
                            nameimg = fileItem.getName();
                            String folder = "upload";
                            String dirUrl = request.getServletContext()
                                    .getRealPath("") + "/" + folder;
                            File dir = new File(dirUrl);
                            if (!dir.exists()) {
                                dir.mkdir();
                            }
                            String nameimg2 = System.nanoTime() + "-" + nameimg;
                            String fileImg = dirUrl + "/" +  nameimg2;
                            File file = new File(fileImg);
                            try {
                                fileItem.write(file);
                                System.out.println("UPLOAD THÀNH CÔNG...!");
                                String test = request.getServletContext()
                                    .getRealPath("") + "/" + folder + "/" +f2.getImage();
                                
                                file = new File(test);
                                file.delete();
                                System.out.println("ĐƯỜNG DẪN KIỂM TRA UPLOAD HÌNH ẢNH : \n" + dirUrl);

                                image2 = nameimg2;

                            } catch (Exception e) {
                                System.out.println("CÓ LỖ TRONG QUÁ TRÌNH UPLOAD!");
                                e.printStackTrace();
                            }
                        }else{                           
                            break;                          
                        }
                    }
                }
                
                

                foodID = Integer.parseInt((String) params.get("foodID"));
                foodName = (String) params.get("foodName");
                image = image2;
                String categoryIDcheck = (String) params.get("categoryID");
                String foodPricecheck = (String) params.get("foodPrice");
                if (categoryIDcheck.equals("") || foodPricecheck.equals("")) {
                    categoryID = 0;
                    foodPrice = 0;
                }else{               
                    categoryID = Integer.parseInt((String) params.get("categoryID"));
                    foodPrice = Integer.parseInt((String) params.get("foodPrice"));
                }
                
                if (foodName.equals("") || image.equals("") || categoryID == 0 || foodPrice == 0) {
                    response.sendRedirect(request.getContextPath()+"/admin/allFood");
                } else {
                Food f = new Food(foodID, image,foodName, foodPrice, categoryID);
                int count = FoodDAO.editFood(f);
                    if (count > 0) {
                        response.sendRedirect(request.getContextPath()+"/admin/allFood");
                    } else {
                        response.sendRedirect(request.getContextPath()+"/admin/editFood");
                    }
                }
                
            }

        } catch (FileUploadException e) {
            e.printStackTrace();
        }
        
        
        String categoryName;
        
        btn = request.getParameter("addCategory");
        if (btn != null) {
            
            categoryName = request.getParameter("categoryName");
            
            if (categoryName.equals("")) {
                response.sendRedirect(request.getContextPath()+"/admin/addCategory");
            } else {
                Category c = new Category(categoryID, categoryName);
                int count = CategoryDAO.addCategory(c);
                if (count > 0) {
                    response.sendRedirect(request.getContextPath()+"/admin/allCategory");
                } else {
                    response.sendRedirect(request.getContextPath()+"/admin/addCategory");
                }
            }
        }
        
        btn = request.getParameter("editCategory");
            if (btn != null) {
                categoryID = Integer.parseInt(request.getParameter("categoryID"));
                categoryName = request.getParameter("categoryName");
                
                if (categoryName.equals("")) {
                response.sendRedirect(request.getContextPath()+"/admin/editCategory");
            } else {
                Category c = new Category(categoryID, categoryName);
                int count = CategoryDAO.editCategory(c);
                if (count > 0) {
                    response.sendRedirect(request.getContextPath()+"/admin/allCategory");
                } else {
                    response.sendRedirect(request.getContextPath()+"/admin/editCategory");
                }
            }
            }

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
