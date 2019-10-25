//package file;
//
//import java.io.*;
//
///**
// * @Description :
// * Created by WL on 2018/12/28
// */
//public class TestFile {
//    public static void main(String[] args) throws IOException {
//        File file = new File("C:\\Users\\User\\Desktop/ttttt.jpg");
//        OutputStream outputStream = new FileOutputStream(new File("C:\\Users\\User\\Desktop/tt.jpg"));
//        int length = 0;
//        InputStream inputStream = new FileInputStream(file);
//        byte[] buffer = new byte[1024];
//        while ((length = inputStream.read(buffer)) != -1) {
//            outputStream.write(buffer, 0, length);
//        }
//    }
//}
