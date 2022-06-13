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
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>DFStuff</title>\r\n"
				+ "    <script src=\"../Javascript/header.js\"></script>\r\n"
				+ "    <script src=\"../Javascript/jquery-3.6.0.min.js\"></script>\r\n"
				+ "    <script src=\"../Javascript/main.js\"></script>\r\n"
				+ "</head>\r\n"
				+ "\r\n"
				+ "<body>\r\n"
				+ "    <div style=\"width:100%; height: 500px; padding: 0%, 50%; background-color: mediumblue;\">\r\n"
				+ "        <center>\r\n"
				+ "            <h1 id=\"titoloBenvenuto\">Benvenuto sul mio sito!</h1>\r\n"
				+ "            <br><br>\r\n"
				+ "        <p>Mi chiamo Davide fornetti, ho 28 anni e faccio cose, ecco alcuni esempi:</p>\r\n"
				+ "        </center>\r\n"
				+ "        <img name = \"header-logo\" >\r\n"
				+ "    </div>\r\n"
				+ "    <div>\r\n"
				+ "    </div>\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "\r\n"
				+ "</html>";
		return index;
	}
	
}
