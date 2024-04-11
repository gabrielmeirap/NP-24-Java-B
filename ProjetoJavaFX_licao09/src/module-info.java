module ProjetoJavaFX_licao09 {
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.media;
	
	opens br.com.senaisp.bauru.gabriel.classes 
    to javafx.graphics,javafx.controls,javafx.media,javafx.fxml;
    
    
}