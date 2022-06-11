package com.personalForDav.portfolioSite.view;

import java.io.File;
import java.util.ArrayList;

import com.personalForDav.portfolioSite.utils.Lettore;
import com.personalForDav.portfolioSite.utils.RenderPagina;

public class ViewIndex extends RenderPagina implements IViewIndex {

	@Override
	public String renderIndex() {
		String index = "";
		File file = null;
		
		file = new File("../../../../../../resources/static/html/htmlStart.txt");
		for (String i : Lettore.leggiFile(file)) {
			index += i;
		}
		
		file = null;
		file = new File("../../../../../../resources/static/html/htmlStart");
		for (String i : ViewTopBottom.renderHeader()) {
			index += i + " ";
		}

		file = new File("../../../../../../resources/static/html/Index.txt");
		for (String i : Lettore.leggiFile(file)) {
			index += i;
		}
		// TODO Auto-generated method stub
		return index;
	}

	@Override
	public String renderBasicInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String renderBody() {
		// TODO Auto-generated method stub
		return null;
	}

}
