package com.personalForDav.portfolioSite.utils;

import java.io.File;
import java.util.ArrayList;

//questa classe restituisce la pagina HTML finale
public abstract class RenderPagina implements IRenderPagina {

	// metodo per renderizzare l'HTML fino agli script js
	public String renderHTMLStart(String pagina) {

		File file = new File("/../../../../../../resources/static/html/htmlStart.txt");
//		File file = new File("/PortFolioSite_Project/src/main/resources/static/html/htmlStart.txt");
//							  /PortFolioSite_Project/src/main/java/com/personalForDav/portfolioSite/utils/RenderPagina.java

		//siccome Lettore restituisce un ArrayList, eseguo un ciclo per farla diventare una stringa unica
		for (String riga : Lettore.leggiFile(file))
			pagina += riga + "\n";

		return pagina;
	}

	//metodo per caricare gli <script> js da inserire all'interno della pagina
	//richiamato da renderPagina()
	//uguale a renderHTMLstart(), ma riceve un percorso e una stringa
		//(da usare dentro a ciclo, per la lista di percorsi)
	public String renderJS(String percorso, String pagina) {

		File file = new File(percorso);
		for (String riga : Lettore.leggiFile(file)) {
			pagina += riga + "\n";
		}
		return pagina;
	}

	
	//metodo che assembla tutti quelli precedenti
	@Override
	public String renderPagina(ArrayList<String> percorsi) {

		//creo una stringa da passare a tutti i metodi che richiamo
		String pagina = "";
		File file;		

		//richiamo il metodo che mette <DOCTYPE> etc
		pagina = renderHTMLStart(pagina);

		//faccio un ciclo per andare a iniettare il JS, usando il metodo .contains()
		//decidere se salvarne il contenuto
		for (String unPercorso : percorsi) {
			if (unPercorso.contains("js")) {
				file = new File(unPercorso);
				for (String riga : Lettore.leggiFile(file)) {
					renderJS(unPercorso, pagina);
				}
			}

		}
		// TODO Auto-generated method stub
		return pagina;
	}

}
