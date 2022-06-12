package com.personalForDav.portfolioSite.utils;

import java.io.File;
import java.util.ArrayList;

public interface IRenderPagina {
	
	String renderHTMLStart();
	
	String renderJS(ArrayList<String> percorsi);
	
	String renderPagina(String percorsi);

}
