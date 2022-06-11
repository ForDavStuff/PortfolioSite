package com.personalForDav.portfolioSite.view;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.personalForDav.portfolioSite.utils.Lettore;
import com.personalForDav.portfolioSite.utils.RenderPagina;

public class ViewIndex extends RenderPagina implements IViewIndex {

	//creo un singleton e un arrayList che sarà la pagina index
	private static ViewIndex instance;
	private ArrayList<String> percorsi = new ArrayList<String>();
	
	//questo è il costruttore che inserisce all'interno dell' ArrList i vari paths dei files
	private ViewIndex() {
		Paths path = null;
		this.percorsi.add(path.get("\\src\\main\\resources\\static\\js\\", "main.js").getRoot().toString());
		this.percorsi.add(path.get("\\src\\main\\resources\\static\\js\\", "jquery-3.6.0.min.js").getRoot().toString());
		this.percorsi.add(path.get("\\src\\main\\resources\\static\\html\\", "Header.txt").getRoot().toString());
		this.percorsi.add(path.get("\\src\\main\\resources\\static\\html\\Index\\", "Index.txt").getRoot().toString());
		}

	//questo dovrebbe essere il costruttore del singleton
	public static ViewIndex getIndex(){
		if(instance == null) {
			instance = new ViewIndex();
		}
		return instance;
	}
	
	
	public ArrayList<String> getPercorsi() {
		return this.percorsi;
	}

//	public void setPercorsi(ArrayList<String> percorsi) {
//		this.percorsi = percorsi;
//	}


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
