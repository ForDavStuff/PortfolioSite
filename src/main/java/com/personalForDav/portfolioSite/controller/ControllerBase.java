package com.personalForDav.portfolioSite.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personalForDav.portfolioSite.utils.RenderPagina;
import com.personalForDav.portfolioSite.view.ViewIndex;

@RestController
@RequestMapping ({"/", "/home"})
public class ControllerBase {

	//richiama la classe che farà da "assemblatore" della pagina, il tipo formale è abstract
	private RenderPagina index = null;

	//metodo per richiamare la home con la mappatura della classe
	@GetMapping
	public String home() {
		//ArrayList che si aspetta RenderPagina per trovare i percorsi da cui prendere il testo
		ArrayList<String> percorsi = new ArrayList<String>();
		
		//percorsi che andranno a comporre la pagina richiesta, in questo caso la home
		percorsi.add("../../../../../../resources/static/html/Header.txt");
		percorsi.add("../../../../../../resources/static/html/Index.txt");

		//inizializzo index con tipo formale ViewIndex, che sarebbe il tipo concreto
		//con cui richiamare la Home (attraverso il metodo di RenderPagina
		index = new ViewIndex();
		//creo una stringa che sarà letteralmente la pagina HTML
		String indexHtml = index.renderPagina(percorsi);
		
		//cerco di stampare in console la pagina HTML per capire perchè non funziona
//		System.out.println(indexHtml);

		return indexHtml;
	}



}
