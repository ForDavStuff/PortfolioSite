package com.personalForDav.portfolioSite.utils;

import java.util.ArrayList;

public interface IRenderPagina {
	
	String renderHTMLStart(String pagina);
	
	String renderJS(String percorso, String pagina);
	
	String renderPagina(ArrayList<String> percorsi);

}
