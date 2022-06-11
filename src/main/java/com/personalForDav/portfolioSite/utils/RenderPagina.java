package com.personalForDav.portfolioSite.utils;

import java.io.File;
import java.util.ArrayList;

//questa classe restituisce la pagina HTML finale
public abstract class RenderPagina implements IRenderPagina {

	// metodo per renderizzare l'HTML fino agli script js
	public String renderHTMLStart(String pagina) {

//		File file = new File("/../../../../../../resources/static/html/htmlStart.txt");
		File file = new File("/PortFolioSite_Project/src/main/resources/static/html/htmlStart.txt");
//							  /PortFolioSite_Project/src/main/java/com/personalForDav/portfolioSite/utils/RenderPagina.java

		for (String riga : Lettore.leggiFile(file))
			pagina += riga;

		return pagina;
	}

	//metodo per caricare gli <script> js da inserire all'interno della pagina
	//richiamato da renderPagina
	public String renderJS(String percorso, String pagina) {

		File file;

		file = new File(percorso);
		for (String riga : Lettore.leggiFile(file)) {
			pagina += riga;
		}
		return pagina;
	}

	
	//metodo che assembla tutti quelli precedenti
	@Override
	public String renderPagina(ArrayList<String> percorsi) {

		String pagina = "";
		File file;		

		pagina = renderHTMLStart(pagina);

		for (String unPercorso : percorsi) {
			while (unPercorso.contains("js")) {
				file = new File(unPercorso);
				for (String riga : Lettore.leggiFile(file)) {
					pagina = renderJS(unPercorso, pagina);
				}
			}

		}
		// TODO Auto-generated method stub
		return pagina;
	}

}
