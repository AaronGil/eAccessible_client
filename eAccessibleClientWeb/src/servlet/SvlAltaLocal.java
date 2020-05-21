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
 * Servlet implementation class SvlAltaLocal
 */
@WebServlet("/SvlAltaLocal")
public class SvlAltaLocal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlAltaLocal() {
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
				String nomLocal = request.getParameter("nomLocal");
				String nomVia = request.getParameter("nomVia");
				String codiCarrer = request.getParameter("codiCarrer");
				String nomCarrer = request.getParameter("nomCarrer");
				String numero = request.getParameter("numero");
				String observacions = request.getParameter("observacions");				
				String caracteristiquesLength = request.getParameter("caracteristiquesLength");
				
				String caracteristicaValor[][] = new String[Integer.parseInt(caracteristiquesLength)][2];
				
				for(int i=0; i<Integer.parseInt(caracteristiquesLength); i++){
					caracteristicaValor[i][0] = request.getParameter("codiCaracteristica"+i);
					caracteristicaValor[i][1] = request.getParameter("valor"+i);
				}
				
				int ultimCodiLocal = 0;
				int ultimCodiAccessibilitat = 0;
				
				
				try{
					webService.EAccessibleWebServiceServiceLocator service = new webService.EAccessibleWebServiceServiceLocator();
					webService.EAccessibleWebService port = service.geteAccessibleWebServicePort();
					ultimCodiLocal = port.ultimCodiLocal();					
					ultimCodiAccessibilitat = port.ultimCodiAccessibilitat();

					
				}
				catch (Exception e) { e.printStackTrace();}
			
				webService.Local local = new webService.Local();
				
				local.setCodiLocal(ultimCodiLocal);
				local.setCodiTipoLocal(Integer.parseInt(codiTipoLocal));
				local.setCodiCarrer(Integer.parseInt(codiCarrer));
				local.setNomCarrer(nomCarrer);
				local.setNomVia(nomVia);
				local.setNumero(Integer.parseInt(numero));
				local.setNomLocal(nomLocal);
				local.setObservacions(observacions);
				local.setVerificat("N");
				
				
				webService.Accessibilitat[] llistaAccessibilitat = new webService.Accessibilitat[Integer.parseInt(caracteristiquesLength)];
				
				for(int i=0; i<Integer.parseInt(caracteristiquesLength); i++){
					
					llistaAccessibilitat[i] = new webService.Accessibilitat();
					
					llistaAccessibilitat[i].setCodiLocal(ultimCodiLocal);
					llistaAccessibilitat[i].setCodiAccessibilitat(ultimCodiAccessibilitat);
					llistaAccessibilitat[i].setCodiCaracteristica(Integer.parseInt(caracteristicaValor[i][0]));
					llistaAccessibilitat[i].setValor(Integer.parseInt(caracteristicaValor[i][1]));
					llistaAccessibilitat[i].setVerificat("N");
					
					ultimCodiAccessibilitat += 1;

				}
				try{
					
					webService.EAccessibleWebServiceServiceLocator service = new webService.EAccessibleWebServiceServiceLocator();
					webService.EAccessibleWebService port = service.geteAccessibleWebServicePort();			
					
					port.altaLocal(local, llistaAccessibilitat);
				
				} catch (Exception e) { 
					
					e.printStackTrace();
				}
				
				session.setAttribute("nomLocal", nomLocal);
				try {
					ServletContext context = getServletContext();
					RequestDispatcher rd = context.getRequestDispatcher("/AltaRealitzada");
					rd.forward(request, response);
				}
				catch ( Exception e ) {
					e.printStackTrace();
				}
				
			
	}

}
