

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ezvcard.*;
import ezvcard.property.StructuredName; 


/**
 * Servlet implementation class Create
 */
public class Create extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Create() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String mail = request.getParameter("mail") ;
		if (mail==null){mail="";}
		VCard vcard = new VCard();
		StructuredName n = new StructuredName();
		n.setParameter("EMAIL", "alexis.anzieu@gmail.com");

		vcard.setStructuredName(n);
	
		String text = Ezvcard.write(vcard).version(VCardVersion.V3_0).go();
		
		request.setAttribute("test", text);
		this.getServletContext().getRequestDispatcher( "/WEB-INF/createCard.jsp" ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
