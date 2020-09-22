package diguidome;

import java.io.File;

public class DiGuiDome02 {
    public static void main(String[] args) {
        File srcfile = new File("D:/Dome");
        getAllFilePath(srcfile);
    }
    public static void getAllFilePath(File srcfile){
        File[] f1 = srcfile.listFiles();
        if (f1!=null){
            for (File f2 : f1){
                if (f2.isDirectory()){
                    getAllFilePath(f2);
                }else {
                    System.out.println(f2.getAbsolutePath());
                }
            }
        }
    }
}
