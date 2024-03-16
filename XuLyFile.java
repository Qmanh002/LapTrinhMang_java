import java.io.File;
import java.io.IOException;


public class XuLyFile {

    public static void taoThuMuc(String path){
        //Khai bao moi
        File file = new File(path);

        if (!file.exists()) { // kiem tra ton tai
            //Tao
        file.mkdir();//tao 1

        //file.mkdirs();//tao nhieu 
        }else{
            System.out.println("Da co");
        }
       
    }
    public static void taoTepTin(String path){
        //Khai bao moi
        File file = new File(path);

        if (!file.exists()) { // kiem tra ton tai
        try{
            file.createNewFile(); //Tao
        }catch(IOException e){
            System.out.println("Loi roi");
            e.printStackTrace();
        }
           

        //file.mkdirs();//tao nhieu 
        }else{
            System.out.println("Da co");
        }
       
    }
    public static void xoaHet(String path){
        File file = new File(path);

        if (file.exists()) {
            //de quy
            if(file.isDirectory()){
                File[] files =file.listFiles();

                for(File f : files) {
                    xoaHet(f.getAbsolutePath());
                }   
            }
            file.delete();
            
        }else{
            System.out.println("Khong co");
        }
    }


    public static void main(String[] args){

        //String path = "D:\\Coder\\LTrMang_java\\Rac\\vd1";
        //XuLyFile.taoThuMuc(path);

        //String path = "D:\\Coder\\LTrMang_java\\Rac\\vd1.txt";
        //XuLyFile.taoTepTin(path);

        //String path = "";
        //XuLyFile.xoaHet(path);
    }
}


