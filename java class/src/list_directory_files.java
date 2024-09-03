import java.io.File;
public class list_directory_files {
    public static void main(String[] args) throws Exception {
        String directoryPath ="D:\\website";
        File directory=new File(directoryPath);
        File[] files=directory.listFiles();
        for(File file:files){
            System.out.println(file.getName());
        }
    }
}
