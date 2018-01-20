import java.io.*;

public class Main {
    private static final String PATH = "src/LemonSchool.txt";

    public static void main(String[] args) {
        String bullshit = "This is bullshit!!11";
        writeBullshit(bullshit, getFile());
        System.out.println(readBullshit());
    }

    private static File getFile() {
        File file = null;
        try {
            file = new File(PATH);
            if (!file.exists()) {
                System.out.println("File not exists");
                System.out.println();
                System.out.println("Create file");
                System.out.println();
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return file;
    }

    private static void writeBullshit(String bullshit, File file) {
        System.out.println("Start write to file");
        try (FileOutputStream stream = new FileOutputStream(file)) {
            byte[] bullshitInBytes = bullshit.getBytes();
            stream.write(bullshitInBytes);
        } catch (IOException e) {
            System.out.println("IOException on writeBullshit()");
        }
        System.out.println("End write to file");

    }

    private static String readBullshit(){
        byte[] buffer = {};
        try(FileInputStream stream = new FileInputStream(PATH)) {
            buffer = new byte[stream.available()];
            stream.read(buffer, 0, stream.available());
            System.out.println("Read file: ");
        }catch (IOException e){
            System.out.println("IOException on readBullshit()");
        }
        return new String(buffer);
    }
}
