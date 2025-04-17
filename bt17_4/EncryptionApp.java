package bt17_4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EncryptionApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // TextField để nhập dữ liệu
        TextField inputField = new TextField();
        inputField.setPromptText("Nhập dữ liệu cần mã hóa");

        // ComboBox chọn thuật toán
        ComboBox<String> algorithmBox = new ComboBox<>();
        algorithmBox.getItems().addAll("AES", "RSA");
        algorithmBox.setValue("AES");

        // Nút thực hiện mã hóa
        Button encryptButton = new Button("Mã hóa");

        // TextArea hiển thị kết quả
        TextArea resultArea = new TextArea();
        resultArea.setEditable(false);

        // Xử lý sự kiện khi bấm nút
        encryptButton.setOnAction(e -> {
            String input = inputField.getText();
            String algorithm = algorithmBox.getValue();
            String result = "";

            if (algorithm.equals("AES")) {
                AESEncryptor aes = new AESEncryptor();
                result = aes.encrypt(input);  // Giả sử lớp này có phương thức encrypt
            } else if (algorithm.equals("RSA")) {
                RSAEncryptor rsa = new RSAEncryptor();
                result = rsa.encrypt(input);  // Tương tự
            }

            resultArea.setText(result);
        });

        VBox root = new VBox(10, inputField, algorithmBox, encryptButton, resultArea);
        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("Encryption App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

