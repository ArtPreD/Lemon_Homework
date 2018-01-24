import java.io.*;

public class ParsingDir {

    private static final String path = "D:\\Java Projects";
    private static final String outPath = "FileList.txt";

    private static File file;

    public static void main(String[] args) {
        System.out.println("Start parsing directory: " + path + "\n");
        try(FileOutputStream stream = new FileOutputStream(getFile())) {
            scanDir(stream, getList(path), path);
            System.out.println("\n" + "Parsing end successful. All data write to file.");
        }catch (IOException e){
        }
    }

    private static File[] getList(String path){
        file = new File(path);
        File[] fileArr = file.listFiles();
        return fileArr;
    }

    private static File getFile() {
        File file = null;
        try {
            file = new File(outPath);
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

    private static void scanDir (FileOutputStream stream, File[] filesList, String path) throws IOException{
        for (File file : filesList){
            if (file.isDirectory()){
                scanDir(stream, getList(path + "/" + file.getName()), path + "/" + file.getName());
            }else {
                System.out.println(file);
                writeInFile(stream, file.toString());
            }
        }
    }

    private static void writeInFile(FileOutputStream stream, String string) throws IOException{
            byte[] stringInBytes = (string + "\n").getBytes();
            stream.write(stringInBytes);
    }
}
