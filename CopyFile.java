import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {
    public static void copyFile(String src,String dest) {
      File fileSrc = new File(src); //file goc
      File fileDest = new File(dest); //file copy

    
        try{
            if(!fileSrc.exists()){
                System.out.println("File da co, muon de(y,n)");
                Scanner sc= new Scanner(System.in);
                String c =sc.nextLine();

                if(c.equals("n")){
                    return;
                }else{
                    fileDest.createNewFile();
                }
            }
            FileInputStream fis = new FileInputStream(fileDest);

            FileOutputStream fos = new FileOutputStream(fileDest);

            int b = 0;
            while(true){
                b = fis.read(); // doc 1 byet

                if(b==-1) break; // =-1 khi khong co du lieu de doc

                fos.write(b); // ghi xuong file
                fos.flush(); // ep du lieu duoc ghi xuong file ngay lap tuc
            }
            fis.close();
            fos.close();
        

        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void copyFileArr(String src, String dest) {
        File fileSrc = new File(src); 
        File fileDest = new File(dest);
        try {
            if (!fileSrc.exists()) {
                System.out.println("File khong ton tai!");
            } else {
                if (fileDest.exists()) {
                    System.out.println("File da ton tai, ghi de (y/n)?");
                    Scanner sc = new Scanner(System.in);
                    String c = sc.nextLine();
                    if (c.equals("n")) { 
                        return;
                    }
                } else {
                    fileDest.createNewFile();
                }

                FileInputStream fis = new FileInputStream(fileSrc);

                FileOutputStream fos = new FileOutputStream(fileDest);

                byte[] arr = new byte[1024];// doc 1Mb
                while(true){
                    int n = fis.read(arr); 

                    if(n==-1) break; 

                    fos.write(arr, 0, n); 
                    fos.flush(); 
                }
                fis.close();
                fos.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String src = "";
        String dest = "";
        // copyFile(src, dest);
        copyFileArr(src, dest);
    }
}
