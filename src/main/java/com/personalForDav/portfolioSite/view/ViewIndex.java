package com.personalForDav.portfolioSite.view;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;

import com.personalForDav.portfolioSite.utils.Lettore;
import com.personalForDav.portfolioSite.utils.RenderPagina;

public class ViewIndex extends RenderPagina implements IViewIndex {

	//creo un singleton e un arrayList che sarà la pagina index
	private static ViewIndex instance;
	private ArrayList<String> percorsi;
	private String percorso;
	
	//questo è il costruttore che inserisce all'interno dell' ArrList i vari paths dei files
	private ViewIndex() {
//		this.percorso = "..\\main\\resources\\static\\html\\Index\\Index.txt";
		this.percorso = "../PortFolioSite_Project/src/main/resources/static/html/Index/Index.txt";

//		instance.percorsi = new ArrayList<String>();
		
//		Path path = path.getRoot();
//		String filePath = "\\src\\main\\resources\\static\\html\\Index\\Index.txt";
//		String rootDir = path.toString();
//		ArrayList<String> basePath = new ArrayList<String>(rootDir.split("\\"));
//		for(String i : rootDir.split("\\")) {
//			
//		}
		
		
//		this.percorsi.add(path.get("\\src\\main\\resources\\static\\js\\", "main.js").getRoot().toString());
//		this.percorsi.add(path.get("\\src\\main\\resources\\static\\js\\", "jquery-3.6.0.min.js").getRoot().toString());
//		this.percorsi.add(path.get("\\src\\main\\resources\\static\\html\\", "Header.txt").getRoot().toString());
//		this.percorsi.add(path.getPath("\\src\\main\\resources\\static\\html\\Index\\", "Index.txt").getRoot().toString());
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
	
	public String getPercorso() {
		return this.percorso;
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
