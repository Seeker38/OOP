package test;



import java.io.*;

public class test {
    private int i;

    private int nextId;

    public static void main(String[] args) {
//        FileReader in = null;
//        FileWriter out= null;
//
//        in = new  FileReader("D:\\JavaCodingFiles\\intellij\\src\\test\\input.txt");
//        out = new FileWriter("D:\\JavaCodingFiles\\intellij\\src\\test\\output.txt");
//        int c;
//        while ((c = in.read()) != -1){
//            out.write(c);
//        }
//        in.close();
//        out.close();
//        addRecords();

        int N =42,k;

        for (k = 2;k <= N;k++) {

            if (N % k == 0) {

                System.out.print(k+" ");

                N = N/k;

                k++;

            }

        }



    }

}
//    public void analyzePath(String path){
//        File name = new File(path);
//        if (name.exists()){
//            System.out.printf("%s \n%s \n%s \n%s \n%s \n%s \n%s \n%s \n%s \n%s", name.getName(), name.isFile(), name.isDirectory(), name.isAbsolute(), name.lastModified(), name.length(), name.getPath(), name.getAbsolutePath(), name.getParent());
//
//            if (name.isDirectory()){
//                String directory[] = name.list();
//                System.out.println("\n \nNoi dung thu muc: \n");
//
//                for (String directoryName : directory){
//                    System.out.printf("%s\n", directoryName);
//                }
//            }
//        }
//
//    }
//    public void openFile(){
//        try{
//           Formatter output = new Formatter("D:\\JavaCodingFiles\\intellij\\src\\test\\input.txt");
//    }catch (FileNotFoundException e){
//            System.out.println("Error creating file");
//            System.exit(1);
//        } catch (SecurityException e){
//            System.err.println("You do not have write access to this file");
//            System.exit(1);
//        }
//
//    }
//
//    public static void addRecords() throws IOException{
//       Cicrle record = new Cicrle();
//       Scanner input = new Scanner(System.in);
//       Formatter output = new Formatter("D:\\JavaCodingFiles\\intellij\\src\\test\\output.txt");
//       int count = input.nextInt();
//        for (int i=0; i < count; i++) {
//            record.setColor(input.next());
//            record.setRadius(input.nextDouble());
//
//            output.format("%s %.2f %.2f %.2f\n", record.getColor(), record.getRadius(), record.getArea(), record.getPerimeter());
//        }
//        output.close();
//    }



