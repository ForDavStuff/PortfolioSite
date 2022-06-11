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

	private RenderPagina index = null;

	@GetMapping
	public String home() {
		ArrayList<String> percorsi = new ArrayList<String>();
		
		percorsi.add("../../../../../../resources/static/html/Header.txt");
		percorsi.add("../../../../../../resources/static/html/Index.txt");

		index = new ViewIndex();
		String indexHtml = index.renderPagina(percorsi);
		System.out.println(indexHtml);

		return indexHtml;
	}



}
