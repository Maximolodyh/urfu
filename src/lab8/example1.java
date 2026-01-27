package lab8;
import java.io.File;

public class example1 {
        public static void main(String[] args) {
            try {
                File f1 = new File("newFile1.txt");
                f1.createNewFile();

                if (f1.exists()) {
                    System.out.println("Создан!!!!");
                    System.out.println("Полный путь до файла: " + f1.getAbsolutePath());
                }

                File f2 = new File("Files/newDir_1/newDir_2/newDir_3");
                f2.mkdirs();
                System.out.println("Полный путь до конечного каталога: " + f2.getAbsolutePath());

            } catch (Exception e) {
                System.out.println("Ошибка!!!( " + e);
            }
        }
}
