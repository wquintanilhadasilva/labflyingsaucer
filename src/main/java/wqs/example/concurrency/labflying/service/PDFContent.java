package wqs.example.concurrency.labflying.service;

public class PDFContent {
	
	private static String CONTENT = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
			+ "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" "
			+ "   \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\"><html xmlns=\"http://www.w3.org/1999/xhtml\"><head>"
			+ "    <style>"
			+ "    @font-face {"
			+ "        font-family: \"Butterfly\";"
			+ "        src: url(\"Butterfly.ttf\");"
			+ "    }"
			+ "    .butterfly {"
			+ "        font-family: \"Butterfly\";"
			+ "    }"
			+ "    </style>"
			+ "</head>"
			+ "<body>"
			+ "    <h1>Hello world</h1>"
			+ "    <img src=\"https://www.w3schools.com/w3css/img_lights.jpg\"/>"
			+ "    <p>Regular text</p>"
			+ "    <p style=\"color:red\">Red text</p>"
			+ "    <b>Bold text</b>"
			+ "    <p class=\"butterfly\">Fancy font</p>"
			+ "    <img src=\"https://www.w3schools.com/w3css/img_lights.jpg\"/>"
			+ "</body></html>";
	
	public static String getContentToPdf() {
		return CONTENT;
	}

}
