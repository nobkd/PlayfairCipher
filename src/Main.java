public class Main {

    public static void main(String[] args) {
        String s0 = "input text";

        System.out.println("Input: " + s0 + "\n");

        PlayfairCipher p = new PlayfairCipher();
        String key = p.generateKey("keyword or something else");
        System.out.println("Key: " + key + "\n");

        String pencrypt = p.encryptMsg(s0, key);
        System.out.println("Encrypted: " + pencrypt + "\n");

        String pdecrypt = p.decryptMsg(pencrypt, key);
        System.out.println("Decrypted: " + pdecrypt + "\n");

    }
}
