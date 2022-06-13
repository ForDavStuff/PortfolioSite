package com.personalForDav.portfolioSite.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personalForDav.portfolioSite.utils.RenderPagina;
import com.personalForDav.portfolioSite.view.ViewIndex;

@RestController
//@RequestMapping ({"/", "/home"})
@RequestMapping ("/")
public class ControllerBase {

	//richiama la classe che farà da "assemblatore" della pagina, il tipo formale è abstract
//	private RenderPagina index = null;

	//metodo per richiamare la home con la mappatura della classe
	@GetMapping
	public String home() {
		
		ViewIndex index = ViewIndex.getIndex();
//		System.out.println(index.getPercorsi());
		
		//creo una stringa che sarà letteralmente la pagina HTML e la ritorno al client
		String home = index.renderPagina(index.getPercorsi());
		
		//cerco di stampare in console la pagina HTML per capire perchè non funziona
//		System.out.println(home);

		return home;
	}



}
