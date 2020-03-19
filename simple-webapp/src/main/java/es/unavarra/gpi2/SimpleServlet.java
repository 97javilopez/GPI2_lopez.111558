package es.unavarra.gpi2;

/**
 * Hello world!
 *
 */
public class SimpleServlet extends HttpServlet {

    // Maneja el método GET de HTPP para 
    // construir una sencilla página Web.

    public void doGet (HttpServletRequest request, HttpServletResponse response)
              throws ServletException, IOException {
    PrintWriter out;
    String title = "Simple Servlet Output";

    // primero selecciona el tipo de contenidos y otros campos de cabecera de la respuesta
    response.setContentType("text/html");
    // Luego escribe los datos de la respuesta
    out = response.getWriter();
    out.println("<HTML><HEAD><TITLE>");
    out.println(title);
    out.println("</TITLE></HEAD><BODY>");
    out.println("<H1>" + title + "</H1>");
    out.println("<P>This is output from SimpleServlet.");
    out.println("</BODY></HTML>");
    out.close();
    }
}
