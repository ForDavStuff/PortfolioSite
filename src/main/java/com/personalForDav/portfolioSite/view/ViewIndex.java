package com.personalForDav.portfolioSite.view;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;

import com.personalForDav.portfolioSite.utils.Lettore;
import com.personalForDav.portfolioSite.utils.RenderPagina;

public class ViewIndex extends RenderPagina {

	//creo un singleton e un arrayList che sarà la pagina index
	private static ViewIndex instance;
	private ArrayList<String> percorsi;
	
	//questo è il costruttore che inserisce all'interno dell'ArrList i vari paths dei files
	private ViewIndex() {
		this.percorsi = new ArrayList<String>();
//		this.percorsi.add("../PortFolioSite_Project/src/main/resources/static/js/main.js");
//		this.percorsi.add("../PortFolioSite_Project/src/main/resources/static/js/jquery-3.6.0.min.js.t");
//		this.percorsi.add("../PortFolioSite_Project/src/main/resources/static/js/header.js");
		this.percorsi.add("../PortFolioSite_Project/src/main/resources/static/html/Index/IndexBody.txt");
		}

	//questo dovrebbe essere il costruttore del singleton
	public static ViewIndex getIndex(){
		if(instance == null) {instance = new ViewIndex();}
		return instance;
	}
	
	
	public ArrayList<String> getPercorsi() {
		return this.percorsi;
	}
	
	public String getIndexHTML() {
		String index = "<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "\r\n"
				+ "  <head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>DFStuff</title>\r\n"
				+ "    <script src=\"./script/header.js\"></script>\r\n"
				+ "    <script src=\"./script/jquery-3.6.0.min.js\"></script>\r\n"
				+ "    <script src=\"./script/main.js\"></script>\r\n"
				+ "    <link href=\"main.css\" rel=\"stylesheet\">\r\n"
				+ "  </head>\r\n"
				+ "\r\n"
				+ "  <body>\r\n"
				+ "    <!-- <nav class=\"navbar navbar-inverse\">\r\n"
				+ "            <div class=\"container-fluid\">\r\n"
				+ "                <div class=\"navbar-header\">\r\n"
				+ "                  <a class=\"navbar-brand\" href=\"#\">WebSiteName</a>\r\n"
				+ "                </div>\r\n"
				+ "                <ul class=\"nav navbar-nav\">\r\n"
				+ "                  <li class=\"active\"><a href=\"#\">Home</a></li>\r\n"
				+ "                  <li><a href=\"#\">Page 1</a></li>\r\n"
				+ "                  <li><a href=\"#\">Page 2</a></li>\r\n"
				+ "                </ul>\r\n"
				+ "                <ul class=\"nav navbar-nav navbar-right\">\r\n"
				+ "                  <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\r\n"
				+ "                  <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\r\n"
				+ "                </ul>\r\n"
				+ "              </div>\r\n"
				+ "        </nav> -->\r\n"
				+ "    <center>\r\n"
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
