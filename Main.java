package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

	public void start(Stage primaryStage) {
		try {
			AnchorPane root = new AnchorPane();
			
			Rectangle retanguloAzul = new Rectangle(400, 40);
            retanguloAzul.setFill(Color.web("#4267B4")); 
            root.getChildren().add(retanguloAzul);

			Label Titulo_Pagina = new Label();
			Titulo_Pagina.setText("Facebook");
			Titulo_Pagina.setTextFill(Color.WHITE);
			Titulo_Pagina.setLayoutX(15);
			Titulo_Pagina.setLayoutY(5);
			Titulo_Pagina.setStyle("-fx-font-size: 20px;");
			root.getChildren().add(Titulo_Pagina);

			Label mensagem = new Label();
			mensagem.setText("Faça o login para usar sua conta");
			mensagem.setLayoutX(100);
			mensagem.setLayoutY(60);
			mensagem.setStyle("-fx-font-size: 15px; -fx-text-fill: #4267B4;");
			root.getChildren().add(mensagem);

			Label emailLabel = new Label();
			emailLabel.setLayoutY(90);
			emailLabel.setLayoutX(15);
			emailLabel.setText("Digite seu Email ou Telefone:");
			root.getChildren().add(emailLabel);

			TextField emailField = new TextField("Digite seu Email");
			emailField.setLayoutY(90);
			emailField.setLayoutX(180);
			emailField.setPrefWidth(200);
			emailField.setPromptText("Digite se3u Email: ");
			root.getChildren().add(emailField);

			Label senhaLabel = new Label();
			senhaLabel.setLayoutY(120);
			senhaLabel.setLayoutX(15);
			senhaLabel.setText("Digite sua Senha:");
			root.getChildren().add(senhaLabel);

			TextField senhaField = new TextField();
			senhaField.setLayoutY(120);
			senhaField.setLayoutX(180);
			senhaField.setPrefWidth(200);
			senhaField.setPromptText("Digite sua senha");
			root.getChildren().add(senhaField);

			Button btnlogin = new Button ("Login");
			btnlogin.setLayoutY(180);
			btnlogin.setLayoutX(100);
			btnlogin.setStyle("-fx-background-color: #4267B4; -fx-text-fill: #FFFFFF;");
			root.getChildren().add(btnlogin);

			Label esqueci = new Label("Esqueceu a conta?");
			esqueci.setLayoutY(215);
			esqueci.setLayoutX(100);
			esqueci.setStyle("-fx-text-fill: #4267B4;");
			root.getChildren().add(esqueci);

			Button btncreate = new Button("Crie uma nova Conta");
			btncreate.setLayoutY(245);
			btncreate.setLayoutX(100);
			btncreate.setStyle("-fx-background-color: #43B82D; -fx-text-fill: #FFFFFF;");
			//btncreate.setId("btnCreate");
			root.getChildren().add(btncreate);

			Scene scene = new Scene(root, 400, 400);
			primaryStage.setScene(scene);
			primaryStage.setTitle("FACEBOOK");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
