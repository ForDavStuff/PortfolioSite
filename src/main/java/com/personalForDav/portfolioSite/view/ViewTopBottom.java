package com.personalForDav.portfolioSite.view;

import java.io.File;
import java.util.List;

import com.personalForDav.portfolioSite.utils.Lettore;

public class ViewTopBottom{

	public static List<String> renderHeader() {
		File file = new File("../../../../../resources/static/html/Header.txt");
		return Lettore.leggiFile(file);
	}

	public List<String> renderFooter() {
		File file = new File("../../../../../resources/static/html/Footer.txt");
		return Lettore.leggiFile(file);
	}

}
