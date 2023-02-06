import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Base64;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World");

        // Convert byte[] array to String
        // string to byte[]
        byte[] bytes = "hello".getBytes(StandardCharsets.UTF_8);
        System.out.println("Byte object in memory " + bytes);
        String myString2 = Arrays.toString(bytes);
        System.out.println("Byte object in mem. to array: " + myString2);
        // byte[] to string
        String s = new String(bytes, StandardCharsets.UTF_8);
        System.out.println("New String: " + s);
        String myString3 = new String(bytes, 2, 2);
        System.out.println("Decode with offset and length: " + myString3);

        // convert file to byte[]
        byte[] bytes2 = Files.readAllBytes(Paths.get("string/image.png"));
        System.out.println("Pic object in memory: " + bytes2);
        String temp = Arrays.toString(bytes2);
        //System.out.println("Pic object in memory to Array String " + temp);

        // encode, convert byte[] to base64 encoded string
        String a = Base64.getEncoder().encodeToString(bytes);
        System.out.println(a);

        // decode, convert base64 encoded string back to byte[]
        byte[] decode = Base64.getDecoder().decode(a);

        String string = new String(decode);
        System.out.println("Platform's default charset: " + string);

        // This Base64 encode decode string is still widely use in
        // 1. email attachment
        // 2. embed image files inside HTML or CSS
    }
}
