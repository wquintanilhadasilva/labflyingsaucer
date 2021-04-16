package wqs.example.concurrency.labflying.web;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lowagie.text.DocumentException;

import lombok.AllArgsConstructor;
import wqs.example.concurrency.labflying.service.PDFContent;
import wqs.example.concurrency.labflying.service.PDFService;

@AllArgsConstructor
@RestController
public class ReportController {
	
	private final PDFService pdfService;
         
    @GetMapping("/pdf")
    public ResponseEntity<InputStreamResource> exportToPDF(HttpServletResponse response) throws DocumentException, IOException {
        
        var data = pdfService.toPDF(PDFContent.getContentToPdf(), "/home/basis/Documentos/pdfteste.pdf");
        
        return this.output(data.toByteArray(), getHttpHeaders("pdfteste.pdf"));
         
    }
    
	private HttpHeaders getHttpHeaders(String nome) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "Expires");
        headers.add("Content-Disposition", "attachment; filename=" + nome);

        return headers;
    }
	
	private ResponseEntity<InputStreamResource> output(byte[] byteArrayOutputStream, HttpHeaders headers) {
        return ResponseEntity.ok().headers(headers).contentLength(byteArrayOutputStream.length)
            .contentType(MediaType.parseMediaType(MediaType.APPLICATION_OCTET_STREAM_VALUE))
            .body(new InputStreamResource(new ByteArrayInputStream(byteArrayOutputStream)));
    }
	

}
