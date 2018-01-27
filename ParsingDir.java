import java.io.*;
import java.util.ArrayList;

public class IOFileList {

    private static final String path = "D:\\Download\\Mega";
    private static final String outPath = "NewFileList.txt";

    private static ArrayList<String> fileListString;

    private static File file;

    public static void main(String[] args) throws IOException{
        fileListString = new ArrayList();
        System.out.println("Start parsing directory: " + path + "\n");
        scanDir(getList(path), path);
        writeInFile(fileListString);
    }

    private static File[] getList(String path) {
        file = new File(path);
        File[] fileArr = file.listFiles();
        return fileArr;
    }

    private static File getFile() {
        File file = null;
        try {
            file = new File(outPath);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    private static void scanDir(File[] filesList, String path) throws IOException {
        for (File file : filesList) {
            if (file.isDirectory()) {
                scanDir(getList(path + "/" + file.getName()), path + "/" + file.getName());
            } else {
                System.out.println(file);
                fileListString.add(file.toString());
            }
        }
    }

    private static void writeInFile(ArrayList fileList) throws IOException {
        try (FileOutputStream stream = new FileOutputStream(getFile())){
            fileList.forEach(string -> {
                try {
                    stream.write((string + "\n").getBytes());
                } catch (IOException e) {
                    System.out.println("error in lambda body");
                    e.printStackTrace();
                }
            });
        }
        System.out.println("\n" + "Parsing end successful. All data write to file.");
    }
}
