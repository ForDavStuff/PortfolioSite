package com.personalForDav.portfolioSite.utils;

import java.io.File;
import java.util.ArrayList;

public interface IRenderPagina {
	
	String renderHTMLStart(String pagina);
	
	String renderJS(String pagina, File file, ArrayList<String> percorsi);
	
	String renderPagina(ArrayList<String> percorsi);

}
