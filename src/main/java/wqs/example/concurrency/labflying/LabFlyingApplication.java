package wqs.example.concurrency.labflying;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import wqs.example.concurrency.labflying.service.PDFService;

@SpringBootApplication
public class LabFlyingApplication {
	
	@Autowired
	PDFService pdfService;
	
	public static void main(String[] args) {
		SpringApplication.run(LabFlyingApplication.class, args);
		
		// Acesse http://localhost:8080/pdf para obter o PDF gerado
	}
	
}
