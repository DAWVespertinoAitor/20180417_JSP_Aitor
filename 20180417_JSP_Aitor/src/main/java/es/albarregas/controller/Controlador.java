/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.controller;

import es.albarregas.beans.Direccion;
import es.albarregas.beans.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;

/**
 *
 * @author Daw2
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            String tipo = request.getParameter("tipo");
            System.out.println(tipo);
            Persona persona = new Persona();
            Direccion direccion = new Direccion();
            String url = "";

            try {
                System.out.println("Entro al try");
                BeanUtils.populate(persona, request.getParameterMap());
                BeanUtils.populate(direccion, request.getParameterMap());
                System.out.println("Salgo del try");
            } catch (IllegalAccessException ex) {
                System.out.println("eeeeeeeeeeeeeeeeeeeee1");
                ex.printStackTrace();
            } catch (InvocationTargetException ex) {
                System.out.println("eeeeeeeeeeeeeeeeeeeee2");
                ex.printStackTrace();
            }
            
            persona.setDireccion(direccion);
            System.out.println("Meto direccion en persona");
            System.out.println(persona.toString());
            request.setAttribute("persona", persona);
            System.out.println("Subo persona a peticion");
            if (request.getParameter("enviar") != null) {
                System.out.println("Entro al if");
                switch (tipo) {
                    case "JSP":
                        System.out.println("Entro a case JSP");
                        url = "JSP/salida.jsp";
                        break;
                    case "EL":
                        System.out.println("Entro a case EL");
                        url = "JSP/salidaEL.jsp";
                        break;
                }
            }
        request.getRequestDispatcher(url).forward(request, response);
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
