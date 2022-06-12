package com.personalForDav.portfolioSite.utils;

import java.io.File;
import java.util.ArrayList;

//questa classe restituisce la pagina HTML finale
public abstract class RenderPagina{

	// metodo per renderizzare l'HTML fino agli script js
	private String renderHTMLStart() {
		String pagina = "<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "<title>DFStuff</title>\n";
		return pagina;
	}

	//metodo per caricare gli <script> js da inserire all'interno della pagina
	//richiamato da renderPagina()
	//uguale a renderHTMLstart(), ma riceve un percorso e una stringa
	private String renderJS(ArrayList<String> percorsi) {
		String pagina = "";
		//faccio un ciclo per andare a iniettare gli <script>, usando il metodo .contains()
		//per decidere se salvarne il contenuto
		for (String unPercorso : percorsi) {
			if (unPercorso.contains("js")) {
				pagina += "<script src=\"" + unPercorso + "\"></script>\n";
			}
		}
		return pagina;
	}

	private String renderCSS(ArrayList<String> percorsi) {
		String pagina = "";
		//faccio un ciclo per andare a iniettare gli <style>, usando il metodo .contains()
		//per decidere se salvarne il contenuto
		for (String unPercorso : percorsi) {
			if (unPercorso.contains("css")) {
				pagina += "<style src=\"" + unPercorso + "\"></style>\n";
			}
		}
		return pagina;
	}

	private String renderHeader() {
		File file = new File("../PortFolioSite_Project/src/main/resources/static/html/Header.txt");
		String pagina = Lettore.fileToHTML(file);
		return pagina;
	}

	private String renderHTML(ArrayList<String> percorsi) {
		String pagina = "";
		ArrayList<String> righePagina = new ArrayList<String>();
		//faccio un ciclo per andare a iniettare il HTML, usando il metodo .contains()
		//per decidere se salvarne il contenuto
		for (String unPercorso : percorsi) {
			if (unPercorso.contains("html")) {
				File file = new File(unPercorso);
				pagina += Lettore.fileToHTML(file);
			}
		}
		return pagina;
	}
	
	private String renderFooter() {
		File file = new File("../PortFolioSite_Project/src/main/resources/static/html/Footer.txt");
		String pagina = Lettore.fileToHTML(file);
		return pagina;
	}

	//metodo che assembla tutti gli altri presenti
	public String renderPagina(ArrayList<String> percorsi) {

		//HTMLStart
		//richiamo il metodo che crea la stringa e mette <DOCTYPE> etc fino al js
		String pagina = renderHTMLStart();

		//JAVASCRIPT
		//metodo che inserisce la sezione<scripts> 
		pagina += renderJS(percorsi);

		//CSS
		//metodo che inserisce la sezione <style>
		pagina += renderCSS(percorsi);

		//Header
		//metodo che inserisce l'header nella pagina
		pagina += renderHeader();

		//HTML
		//metodo che inserisce il corpo della pagina richiesta
		pagina += renderHTML(percorsi);

		//Footer
		//metodo che inserisce il footer e chiude la pagina HTML
		pagina += renderFooter();

		return pagina;
	}
}
