package wqs.example.concurrency.labflying.service;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.springframework.stereotype.Service;
import org.xhtmlrenderer.pdf.ITextRenderer;

@Service
public class PDFService {
	
	public void xhtmlToPdf(String xhtml, String outFileName) throws IOException {
	    File output = new File(outFileName);
	    ITextRenderer iTextRenderer = new ITextRenderer();
	    iTextRenderer.setDocumentFromString(xhtml);
	    iTextRenderer.layout();
	    OutputStream os = new FileOutputStream(output);
	    iTextRenderer.createPDF(os);
	    os.close();
	}
	
	public ByteArrayOutputStream toPDF(String xhtml, String outFileName) throws IOException{
		
	    ITextRenderer iTextRenderer = new ITextRenderer();
	    iTextRenderer.setDocumentFromString(xhtml);
	    iTextRenderer.layout();
	    ByteArrayOutputStream os = new ByteArrayOutputStream();
	    iTextRenderer.createPDF(os);
	    os.close();
	    
	    return os;
		
	}

}
