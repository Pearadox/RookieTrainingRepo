import java.io.*;

public class FavoriteColors {
    public static void main(String[] args) {
        final String dir = "favorite_colors/";
        String[] fileList = new File(dir).list();

        for (String fileName : fileList) {
            if (fileName.endsWith(".txt")) {
                try (BufferedReader r = new BufferedReader(new FileReader(dir + fileName))) {
                    System.out.println(fileName.substring(0, fileName.indexOf("."))
                            + "\'s favorite color is " + r.readLine() + "!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}