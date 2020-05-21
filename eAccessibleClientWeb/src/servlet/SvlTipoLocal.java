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
 * Servlet implementation class SvlTipusLocal
 */
@WebServlet("/SvlTipoLocal")
public class SvlTipoLocal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlTipoLocal() {
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
	
	public void doFer(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession(true);
		
		String codiTipoLocal = request.getParameter("codiTipoLocal");
		
		webService.CaracteristicaTipoLocal[] caracteristicaTipoLocal = null;
		
		
		try{
			webService.EAccessibleWebServiceServiceLocator service = new webService.EAccessibleWebServiceServiceLocator();
			webService.EAccessibleWebService port = service.geteAccessibleWebServicePort();
			caracteristicaTipoLocal = port.informacioCaracteristicaTipoLocal(Integer.parseInt(codiTipoLocal));
		}
		catch (Exception e) { 
			e.printStackTrace();
		}
		
		webService.Caracteristica[] caracteristiques = new webService.Caracteristica[caracteristicaTipoLocal.length];
		for(int i = 0; i<caracteristicaTipoLocal.length; i++) {
			try{
				webService.EAccessibleWebServiceServiceLocator service = new webService.EAccessibleWebServiceServiceLocator();
				webService.EAccessibleWebService port = service.geteAccessibleWebServicePort();
				caracteristiques[i] = port.informacioCaracteristica(caracteristicaTipoLocal[i].getCodiCaracteristica());
			}catch (Exception e) { e.printStackTrace();}
		}
		
		
		session.setAttribute("caracteristiques", caracteristiques);
		session.setAttribute("codiTipoLocal", codiTipoLocal);
		try {
			ServletContext context = getServletContext();
			RequestDispatcher rd = context.getRequestDispatcher("/AltaLocal");
			rd.forward(request, response);
		}
		catch ( Exception e ) {
			e.printStackTrace();
		}
	}

}
