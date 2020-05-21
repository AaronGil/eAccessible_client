package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SvlCercaLlarga
 */
@WebServlet("/SvlCercaLlarga")
public class SvlCercaLlarga extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlCercaLlarga() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doFer(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doFer(request, response);
	}
	
	private void doFer(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession(true);
		
		String codiTipoLocal = request.getParameter("codiTipoLocal");
		String nomLocal = request.getParameter("nomLocal");
		String numeroLocal = request.getParameter("numeroLocal");
		
		webService.Local[] locals = null;
		
		try{
			webService.EAccessibleWebServiceServiceLocator service = new webService.EAccessibleWebServiceServiceLocator();
			webService.EAccessibleWebService port = service.geteAccessibleWebServicePort();
			locals = port.cercaLocalPerTipoLocalNomLocalNumero(Integer.parseInt(codiTipoLocal), nomLocal, Integer.parseInt(numeroLocal));
		}
		catch (Exception e) { 
			e.printStackTrace();
		}
		
		if(locals != null) {
			
			webService.Local[] infoLocals = new webService.Local[locals.length];
			for(int i=0; i<locals.length; i++){
				webService.Local informacioLocals = new webService.Local();
				informacioLocals.setCodiLocal(locals[i].getCodiLocal());
				informacioLocals.setCodiTipoLocal(locals[i].getCodiTipoLocal());
				informacioLocals.setCodiCarrer(locals[i].getCodiCarrer());
				informacioLocals.setNomCarrer(locals[i].getNomCarrer());
				informacioLocals.setNomVia(locals[i].getNomVia());
				informacioLocals.setNumero(locals[i].getNumero());
				informacioLocals.setNomLocal(locals[i].getNomLocal());
				informacioLocals.setObservacions(locals[i].getObservacions());
				informacioLocals.setVerificat(locals[i].getVerificat());
				
				infoLocals[i] = informacioLocals;
			}

			session.setAttribute("locals", infoLocals);
			
			}else {
				session.setAttribute("locals", null);
			}
		try{
			
			ServletContext context = getServletContext();
		
			RequestDispatcher rd = context.getRequestDispatcher("/llistaLocals");
		
			rd.forward(request, response);
	
		} catch(Exception e){
	
			e.printStackTrace();
	
		}
		
	}

}
