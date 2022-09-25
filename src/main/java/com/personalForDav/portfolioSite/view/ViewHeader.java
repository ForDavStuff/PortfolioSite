package com.personalForDav.portfolioSite.view;

public class ViewHeader {

//	public String header = 
//			"<div style=\"width:100%; height: 60px; background-color: black;\">"
//				+ "<table>"
//					+ "<tr>"
//						+ "<td>"
//				            + "<a href=\"Home\">Home</a>"
//				        + "</td>"
//				        + "<td>"
//				            + "<a href=\"WhatIdo\">What I Do</a>"
//				        + "</td>"
//		            + "</tr>"
//	           + "</table>"
//            + "</div>";
	
	private static String bootstrap =
			"<script src=\"./resources/static/style/bootstrap/bootstrap.css\"></script>\r\n"
			+ "<script src=\"./resources/static/style/bootstrap/bootstrap.css.map\"></script>\r\n"
			+ "<script src=\"./resources/static/style/bootstrap/bootstrap.min.css\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap.min.css.map\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap.rtl.css\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap.rtl.css.map\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap.rtl.min.css\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap.rtl.min.css.map\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap-grid.css\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap-grid.css.map\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap-grid.min.css\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap-grid.min.css.map\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap-grid.rtl.css\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap-grid.rtl.css.map\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap-grid.rtl.min.css\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap-grid.rtl.min.css.map\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap-reboot.css\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap-reboot.css.map\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap-reboot.min.css\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap-reboot.min.css.map\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap-reboot.rtl.css\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap-reboot.rtl.css.map\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap-reboot.rtl.min.css\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap-reboot.rtl.min.css.map\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap-utilities.css\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap-utilities.css.map\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap-utilities.min.css\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap-utilities.min.css.map\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap-utilities.rtl.css\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap-utilities.rtl.css.map\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap-utilities.rtl.min.css\"></script>\r\n"
	+ "<script src=\"./resources/static/style/bootstrap/bootstrap-utilities.rtl.min.css.map\"></script>\r\n";
	
	private static String header = 
			"<!DOCTYPE html>\r\n"
					+ "<html lang=\"en\">\r\n"
					+ "\r\n"
					+ "  <head>\r\n"
					+ "    <meta charset=\"UTF-8\">\r\n"
					+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
					+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
					+ "    <title>DFStuff</title>\r\n"
					+ bootstrap
					+ "    <script src=\"./script/header.js\"></script>\r\n"
					+ "    <script src=\"./script/jquery-3.6.0.min.js\"></script>\r\n"
					+ "    <script src=\"./script/main.js\"></script>\r\n"
					+ "    <link href=\"./resources/static/style/css/main.css\" rel=\"stylesheet\">\r\n"
					+ "  </head>\r\n"
					+ "\r\n"
					+ "  <body>\r\n"
					+ "     <nav class=\"navbar navbar-inverse\">\r\n"
					+ "            <div class=\"container-fluid\">\r\n"
					+ "                <div class=\"navbar-header\">\r\n"
					+ "                  <a class=\"navbar-brand\" href=\"#\">ForDavStuff</a>\r\n"
					+ "                </div>\r\n"
					+ "                <ul class=\"nav navbar-nav\">\r\n"
					+ "                  <li class=\"active\"><a href=\"#\">Home</a></li>\r\n"
					+ "                  <li><a href=\"#\">Page 1</a></li>\r\n"
					+ "                  <li><a href=\"#\">Page 2</a></li>\r\n"
					+ "                </ul>\r\n"
					+ "                <ul class=\"nav navbar-nav navbar-right\">\r\n"
					+ "                  <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\r\n"
					+ "                  <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\r\n"
					+ "                </ul>\r\n"
					+ "              </div>\r\n"
					+ "        </nav> \r\n";
					
	public static String getHeader() {
		return header;
	}
	
}
