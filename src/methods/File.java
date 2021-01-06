package methods;

public class File {
    private File file;

    public static void main(String[] args) {
        File txtFile = new File();
        txtFile.file = null;
        File folder = new File();
        folder.file = txtFile;
        File anotherFolder = new File();
        anotherFolder.file = folder;
    }
}
