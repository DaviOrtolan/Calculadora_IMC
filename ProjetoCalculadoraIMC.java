import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class ProjetoCalculadoraIMC extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Etiquetas para os campos de entrada
        Label etiquetaPeso = new Label("Peso");
        Label etiquetaAltura = new Label("Altura");

        // Campos de texto para entrada de dados
        TextField campoPeso = new TextField();
        campoPeso.setPromptText("Peso em kg");
        TextField campoAltura = new TextField();
        campoAltura.setPromptText("Altura em metros");

        // Label para mostrar o resultado do IMC
        Label etiquetaResultado = new Label();

        // Botão para calcular o IMC
        Button botao = new Button("Calcular IMC");
        botao.setOnAction(e -> {
            double peso = Double.parseDouble(campoPeso.getText());
            double altura = Double.parseDouble(campoAltura.getText());

            double imc = peso / (altura * altura);
            etiquetaResultado.setText(String.format("Seu IMC é: %.2f", imc));
        });

        // Layout vertical
        VBox layout = new VBox(10, etiquetaPeso, campoPeso, etiquetaAltura, campoAltura, botao, etiquetaResultado);
        layout.setPadding(new Insets(10));
        layout.setAlignment(Pos.CENTER);

        // Cena e Stage
        Scene cena = new Scene(layout, 300, 250);
        primaryStage.setTitle("Calculadora de IMC");
        primaryStage.setScene(cena);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

/* Observações de Melhorias
- Tratamento de Exception
    try {
        // peso
        // altura
        // Cálculo IMC
        // resultado
    } catch (NumberFormatException e) {
        etiquetaResultado.setText("Por favor, insira números válidos para peso e altura");
    } 

- Conversão para separação de casas decimais com vírgula:   
double peso = Double.parseDouble(campoPeso.getText().replace(',', '.'));
double altura = Double.parseDouble(campoAltura.getText().replace(',', '.'));
    */