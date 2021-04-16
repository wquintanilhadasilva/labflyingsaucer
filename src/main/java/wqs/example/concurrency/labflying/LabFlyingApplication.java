package wqs.example.concurrency.labflying;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import wqs.example.concurrency.labflying.service.PDFContent;
import wqs.example.concurrency.labflying.service.PDFService;

@SpringBootApplication
public class LabFlyingApplication {
	
	@Autowired
	PDFService pdfService;
	
	public static void main(String[] args) {
		SpringApplication.run(LabFlyingApplication.class, args);
		
		// Acesse http://localhost:8080/pdf para obter o PDF gerado
	}
	
	@PostConstruct
	public void run() throws IOException {
		pdfService.xhtmlToPdf(PDFContent.getContentToPdf(), "/home/basis/Documentos/pdfteste.pdf");
	}
	
	
}
