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
import static dao.FoodDAO.getFoodByID;
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
        // Forward to admin page if url ends with admin
        if (path.endsWith("/admin")) {
            request.getRequestDispatcher("admin.jsp").forward(request, response);
        }
        // Forward to all food page if url ends with allFood
        // Get all food information and display in adminAllFood page
        if (path.endsWith("/allFood")) {
            // Get all food information
            ResultSet rs = FoodDAO.getAllFood();
            if (rs == null) {
                // Forward to admin page if system cannot get all food information
                response.sendRedirect("admin.jsp");
            } else {
                // Create session and foward all food information to adminAllFood page
                HttpSession session = request.getSession();
                session.setAttribute("allFood", rs);
                request.getRequestDispatcher("/adminAllFood.jsp").forward(request, response);
            }
        }
        // Forward to all category page if url ends with allCategory
        // Get all category information and display in adminAllCategory page
        if (path.endsWith("/allCategory")) {
            // Get all category information
            ResultSet rs = CategoryDAO.getAllCategory();
            if (rs == null) {
                // Forward to admin page if system cannot get all category information
                response.sendRedirect("admin.jsp");
            } else {
                // Create session and foward all category information to adminAllCategory page
                HttpSession session = request.getSession();
                session.setAttribute("allCategory", rs);
                request.getRequestDispatcher("/adminAllCategory.jsp").forward(request, response);
            }

        }
        // Forward to all bill page if url ends with allBill
        // Get all bill information and display in adminAllBill page
        if (path.endsWith("/allBill")) {
            // Get all category information
            ResultSet rs = BillDAO.getAllBill();
            if (rs == null) {
                // Forward to admin page if system cannot get all bill information
                response.sendRedirect("admin.jsp");
            } else {
                // Create session and foward all bill information to adminAllBill page
                HttpSession session = request.getSession();
                session.setAttribute("allBill", rs);
                request.getRequestDispatcher("/adminAllBill.jsp").forward(request, response);
            }

        }
        // Forward to all food page if url ends with allUser
        // Get all user information and display in adminAllFood page
        if (path.endsWith("/allUser")) {
            // Get all category information
            ResultSet rs = UserDAO.getAllUser();
            if (rs == null) {
                // Forward to admin page if system cannot get all user information
                response.sendRedirect("admin.jsp");
            } else {
                // Create session and foward all user information to adminAllUser page
                HttpSession session = request.getSession();
                session.setAttribute("allUser", rs);
                request.getRequestDispatcher("/adminAllUser.jsp").forward(request, response);
            }

        }
        // Forward to add food page if url ends with add
        if (path.endsWith("/add")) {
            // Get all category information
            ResultSet rs2 = CategoryDAO.getAllCategory();
            if (rs2 == null) {
                // Forward to admin page if system cannot get all category information
                response.sendRedirect(request.getContextPath()+ "/admin");
            } else {
                // Create session and foward all category information to adminFoodAdd page
                HttpSession session = request.getSession();
                session.setAttribute("category", rs2);
                request.getRequestDispatcher("/adminFoodAdd.jsp").forward(request, response);
            }
        }
        // Forward to add category page if url ends with addCategory
        if (path.endsWith("/addCategory")) {               
                request.getRequestDispatcher("/adminCategoryAdd.jsp").forward(request, response);
        }
        // Forward to edit food page if url has admin/edit/ 
        // Get food information and display in adminFoodEdit page
        if (path.startsWith(request.getContextPath()+"/admin/edit")) {
            String[] s = path.split("/");
            String foodID = s[s.length - 1];
            int foodID2 = Integer.parseInt(foodID);
            Food food = FoodDAO.getFoodByID(foodID2);
            ResultSet rs2 = CategoryDAO.getAllCategory();
            if (food == null) {
                // Forward to admin page if system cannot get food information
                response.sendRedirect(request.getContextPath()+"/admin");
            } else {
                // Create session and foward all food, category information to adminFoodEdit page
                HttpSession session = request.getSession();
                session.setAttribute("food", food);
                session.setAttribute("category", rs2);
                request.getRequestDispatcher("/adminFoodEdit.jsp").forward(request, response);
            }
        }
        // Forward to edit food page if url has admin/categoryEdit/ 
        // Get category information and display in adminCategoryEdit page
        if (path.startsWith(request.getContextPath()+"/admin/categoryEdit")) {
            String[] s = path.split("/");
            String categoryID = s[s.length - 1];
            Category category = CategoryDAO.getCategoryByID(Integer.parseInt(categoryID));
            
            if (category == null) {
                // Forward to admin page if system cannot get category information
                response.sendRedirect(request.getContextPath()+"/admin");
            } else {
                // Create session and foward all category information to adminCategoryEdit page
                HttpSession session = request.getSession();
                session.setAttribute("category", category);               
                request.getRequestDispatcher("/adminCategoryEdit.jsp").forward(request, response);
            }
        }
        // Delete Food by ID
        if (path.startsWith(request.getContextPath()+"/admin/delete")) {
            String[] s = path.split("/");
            String foodID = s[s.length - 1];
            // Get food information by ID
            Food f = FoodDAO.getFoodByID(Integer.parseInt(foodID));
            String folder = "upload";
            String test = request.getServletContext()
                                    .getRealPath("") + "/" + folder + "/" +f.getImage();                                                  
            File file = new File(test);
            // Delete food image in folder
            file.delete();
            // Delete food information in database
            int count = FoodDAO.deleteFood(Integer.parseInt(foodID));
            // Forward to adminAllFood page
            response.sendRedirect(request.getContextPath()+"/admin/allFood");
        }
        // Delete category by ID
        if (path.startsWith(request.getContextPath()+"/admin/categoryDelete")) {
            String[] s = path.split("/");
            String categoryID = s[s.length - 1];
            // Delete category information in database
            int count = CategoryDAO.deleteCategory(Integer.parseInt(categoryID));
            // Forward to adminAllCategory page
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
        // Create neccessary variables
        String btn = null;
        int foodID = 0, foodPrice, categoryID = 0;
        String foodName, image;       
        String image2 = "";
        Hashtable params = new Hashtable();
        // Upload image to folder
        DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(fileItemFactory);
        try {
            // Create list to store information
            List<FileItem> fileItems = upload.parseRequest(request);
            // Store information is not image to list
            for (FileItem fileItem : fileItems) {
                if (fileItem.isFormField()) {
                    params.put(fileItem.getFieldName(), fileItem.getString("UTF-8"));

                }
            }
            // Get information of adminAddFood page
            btn = (String) params.get("Add");
            if (btn != null) {
                // Get image file
                for (FileItem fileItem : fileItems) {
                    if (!fileItem.isFormField()) {
                        // Create a folder and upload image to folder
                        String nameimg = fileItem.getName();
                        if (!nameimg.equals("")) {
                            String folder = "upload";
                            String dirUrl = request.getServletContext()
                                    .getRealPath("") + "/" + folder;
                            File dir = new File(dirUrl);
                            if (!dir.exists()) {
                                dir.mkdir();
                            }
                            // Change file name to prevent same name problem
                            String nameimg2 = System.nanoTime() + "-" + nameimg;
                            String fileImg = dirUrl + "/" + nameimg2;
                            File file = new File(fileImg);
                            try {
                                // Upload file to folder
                                fileItem.write(file);                               
                                image2 = nameimg2;
                            } catch (Exception e) {                              
                                e.printStackTrace();
                            }
                        }
                    }
                }
                // Get all food information in adminAddFood
                foodName = (String) params.get("foodName");
                image = image2;
                String categoryIDcheck = (String) params.get("categoryID");
                String foodPricecheck = (String) params.get("foodPrice");
                // If category and price are not entered they will have 0 value
                if (categoryIDcheck.equals("") || foodPricecheck.equals("")) {
                    categoryID = 0;
                    foodPrice = 0;
                }else{
                    // If category and price are entered, the system will get information in form
                    categoryID = Integer.parseInt((String) params.get("categoryID"));
                    foodPrice = Integer.parseInt((String) params.get("foodPrice"));
                }
                // If any food name, image, category or price is not entered, forward to adminAllFood page
                if (foodName.equals("") || image.equals("") || categoryID == 0 || foodPrice == 0) {
                    response.sendRedirect(request.getContextPath()+"/admin/allFood");
                } else {
                    // Add food to database
                    Food f = new Food(foodID, image,foodName, foodPrice, categoryID);
                    int count = FoodDAO.addFood(f);
                    if (count > 0) {
                        response.sendRedirect(request.getContextPath()+"/admin/allFood");
                    } else {
                        response.sendRedirect(request.getContextPath()+"/admin/add");
                    }
                }
            }
            // Get all food information in adminFoodEdit page
            btn = (String) params.get("edit");
            if (btn != null) {
                foodID = Integer.parseInt((String) params.get("foodID"));
                Food f2 = FoodDAO.getFoodByID(foodID);
                // Get image in adminFoodEdit page
                for (FileItem fileItem : fileItems) {
                    if (!fileItem.isFormField()) {                       
                        // Upload file to folder
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
                            // Change file name to prevent same name problem
                            String nameimg2 = System.nanoTime() + "-" + nameimg;
                            String fileImg = dirUrl + "/" +  nameimg2;
                            File file = new File(fileImg);
                            try {
                                // Upload file to folder
                                fileItem.write(file);                                
                                String test = request.getServletContext()
                                    .getRealPath("") + "/" + folder + "/" +f2.getImage();
                                
                                file = new File(test);
                                // Delete old image in folder
                                file.delete();                               
                                image2 = nameimg2;
                            } catch (Exception e) {                               
                                e.printStackTrace();
                            }
                        }else{                           
                            break;                          
                        }
                    }
                }
                
                
                // Get food information in adminFoodEdit page
                foodID = Integer.parseInt((String) params.get("foodID"));
                foodName = (String) params.get("foodName");
                image = image2;
                String categoryIDcheck = (String) params.get("categoryID");
                String foodPricecheck = (String) params.get("foodPrice");
                categoryID = Integer.parseInt((String) params.get("categoryID"));
                foodPrice = Integer.parseInt((String) params.get("foodPrice"));
                // If category and price are not entered they will have 0 value
                if (categoryIDcheck.equals("") || foodPricecheck.equals("")) {
                    categoryID = 0;
                    foodPrice = 0;                    
                }else{
                    // If category and price are entered, the system will get information in form
                    categoryID = Integer.parseInt((String) params.get("categoryID"));
                    foodPrice = Integer.parseInt((String) params.get("foodPrice"));
                }
                // If image is not uploaded get information in database
                if(image.equals("")){
                    Food f3 = getFoodByID(foodID);
                    image = f3.getImage();
                }
                // If any food name, image, category or price is not entered, forward to adminAllFood page
                if (foodName.equals("") || image.equals("") || categoryID == 0 || foodPrice == 0) {
                    response.sendRedirect(request.getContextPath()+"/admin/allFood");
                } else {
                // Update food to database    
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
        
        // Get all information in adminCategoryAdd page
        // Create neccessary variables
        String categoryName;
        btn = request.getParameter("addCategory");
        if (btn != null) {
            // Get category name
            categoryName = request.getParameter("categoryName");
            // If category name is not entered, forward to adminCategoryAdd
            if (categoryName.equals("")) {
                response.sendRedirect(request.getContextPath()+"/admin/addCategory");
            } else {
                // Add category to database
                Category c = new Category(categoryID, categoryName);
                int count = CategoryDAO.addCategory(c);
                if (count > 0) {
                    response.sendRedirect(request.getContextPath()+"/admin/allCategory");
                } else {
                    response.sendRedirect(request.getContextPath()+"/admin/addCategory");
                }
            }
        }
        // Get all information in adminCategoryEdit page
        btn = request.getParameter("editCategory");
            if (btn != null) {
                // Get category name in adminCategory page
                categoryID = Integer.parseInt(request.getParameter("categoryID"));
                categoryName = request.getParameter("categoryName");
                // If category is not entered, forward to admin page
                if (categoryName.equals("")) {
                response.sendRedirect(request.getContextPath()+"/admin/editCategory");
            } else {
                // Update category to database
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
