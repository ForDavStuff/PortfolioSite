package com.personalForDav.portfolioSite.view;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;

import com.personalForDav.portfolioSite.utils.Lettore;
import com.personalForDav.portfolioSite.utils.RenderPagina;

public class ViewIndex extends RenderPagina {

	//creo un singleton e un arrayList che sarà la pagina index
	private static ViewIndex instance;
	public String index;
//	private ArrayList<String> percorsi;
	
	//questo è il costruttore che inserisce all'interno dell'ArrList i vari paths dei files
//	private ViewIndex() {
//		this.percorsi = new ArrayList<String>();
////		this.percorsi.add("../PortFolioSite_Project/src/main/resources/static/js/main.js");
////		this.percorsi.add("../PortFolioSite_Project/src/main/resources/static/js/jquery-3.6.0.min.js.t");
////		this.percorsi.add("../PortFolioSite_Project/src/main/resources/static/js/header.js");
//		this.percorsi.add("../PortFolioSite_Project/src/main/resources/static/html/Index/IndexBody.txt");
//		}

	private ViewIndex() {
		if (index == null) {
			index = ViewHeader.getHeader() + getIndexHTML();
		}
	}
	
	//questo dovrebbe essere il costruttore del singleton
	public static ViewIndex getIndex(){
		if(instance == null) {instance = new ViewIndex();}
		return instance;
	}
	
	public String getHomepage() {
		return index;
	}
	
//	public ArrayList<String> getPercorsi() {
//		return this.percorsi;
//	}
//	
	public String getIndexHTML() {
		String index = 
				  "    <center>\r\n"
				+ "      <div class=\"bkgTitolo\">\r\n"
				+ "          <h1 class=\"titolo\">Benvenuto sul mio sito!</h1>\r\n"
				+ "          <br><br>\r\n"
				+ "          <p class=\"titolo\">Mi chiamo Davide fornetti, ho 28 anni e so fare molte cose<br>appena finisco il sito potrai vedere qui alcuni esempi!</p>\r\n"
				+ "    </center>\r\n"
				+ "    <img name=\"header-logo\">\r\n"
				+ "    </div>\r\n"
				+ "    <div>\r\n"
				+ "    </div>\r\n"
				+ "\r\n"
				+ "  </body>\r\n"
				+ "\r\n"
				+ "</html>";
		return index;
	}
	
}
