package bt17_4;

public class EncryptDecryptTask extends Thread {
    private Encryptable encryptor;
    private String data;

    public EncryptDecryptTask(Encryptable encryptor, String data) {
        this.encryptor = encryptor;
        this.data = data;
    }

    @Override
    public void run() {
        try {
            String encrypted = encryptor.encrypt(data);
            System.out.println("Encrypted: " + encrypted);
            String decrypted = encryptor.decrypt(encrypted);
            System.out.println("Decrypted: " + decrypted);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
