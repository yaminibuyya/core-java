package pdfbasedprogram;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph; 
import com.lowagie.text.pdf.PdfWriter;

public class test {
	public static void main(String[] args) throws  FileNotFoundException, DocumentException {
		Document document=new Document();
		
		PdfWriter writer =PdfWriter.getInstance(document,new FileOutputStream("employee.pdf"));
		document.open();
		document.add(new Paragraph("hii"));
		document.close();
		writer.close();
		System.out.println("success");
	}

}
