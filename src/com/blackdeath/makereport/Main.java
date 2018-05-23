package com.blackdeath.makereport;

/**
 * @author Seth Luis
 *
 */
public class Main {

	public static void main(String[] args) {
		Report report = new Report();
		report.setNameFile("reporte");
		report.setTitle(":: REPORTE :: \n");
		report.setExtension("txt");

		String content = report.getTitle();
		for (int i = 0; i < 5; i++) {
			content += "\nReporte: " + i;
		}
		report.setContent(content);

		report.makeReport();
	}

}
