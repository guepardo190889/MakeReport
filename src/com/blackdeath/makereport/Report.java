package com.blackdeath.makereport;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/**
 * @author Seth Luis
 *
 */
public class Report {
	private String nameFile;
	private String title;
	private String content;
	private String extension;

	public String getNameFile() {
		return nameFile;
	}

	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public String getContentWithTitle() {
		return getTitle() + "\n" + getContent();
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public void makeReport() {
		if ((getNameFile() != null) && (getTitle() != null) && (getContent() != null)) {
			// Crear archivo

			try {
				// Crear una abstracci�n de un archivo en objeto
				File file = new File(getNameFile() + "." + getExtension());
				// Escribir bytes en un archivo
				FileOutputStream fos = new FileOutputStream(file);
				OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write(getContentWithTitle());
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Ingresa los datos del archivo");
		}
	}

}
