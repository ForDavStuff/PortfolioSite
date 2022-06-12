package com.personalForDav.portfolioSite.utils;

import java.io.File;
import java.util.ArrayList;

//questa classe restituisce la pagina HTML finale
public abstract class RenderPagina implements IRenderPagina {

	// metodo per renderizzare l'HTML fino agli script js
	public String renderHTMLStart() {
		String pagina = "<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>DFStuff</title>\n";
		return pagina;
	}

	//metodo per caricare gli <script> js da inserire all'interno della pagina
	//richiamato da renderPagina()
	//uguale a renderHTMLstart(), ma riceve un percorso e una stringa
	//(da usare dentro a ciclo, per la lista di percorsi)
	public String renderJS(ArrayList<String> percorsi) {
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

	private String renderHTML(String percorso) {
		
				File file = new File(percorso);
				String pagina = null;
				pagina += Lettore.fileToString(file);
			
//		for (String riga : righePagina) {
//			pagina += riga + "\n";
//		}
		return pagina;
	}
	
//	private String renderHTML(ArrayList<String> percorsi) {
//		String pagina = "";
//		ArrayList<String> righePagina = new ArrayList<String>();
//		//faccio un ciclo per andare a iniettare il HTML, usando il metodo .contains()
//		//per decidere se salvarne il contenuto
//		for (String unPercorso : percorsi) {
//			if (unPercorso.contains("html")) {
//				File file = new File(unPercorso);
//				pagina += Lettore.fileToString(file);
//			}
//		}
////		for (String riga : righePagina) {
////			pagina += riga + "\n";
////		}
//		return pagina;
//	}

	//metodo che assembla tutti gli altri presenti
	@Override
//	public String renderPagina(ArrayList<String> percorsi) {
		public String renderPagina(String percorsi) {

		//creo una stringa da passare a tutti i metodi che richiamo
//		String pagina = "";
//		File file = null;		

		//HTMLStart
		//richiamo il metodo che mette <DOCTYPE> etc
//		pagina += renderHTMLStart();

		//JAVASCRIPT
//		pagina += renderJS(percorsi);
		
		//HTML
		String pagina = renderHTML(percorsi);

		// TODO Auto-generated method stub
		return pagina;
	}

}
