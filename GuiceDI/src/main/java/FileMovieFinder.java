import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by happyangel on 2017/10/14.
 */
public class FileMovieFinder implements MovieFinder {
    public List<String> findAll() {
        File file = new File("GuiceDI/src/main/resources/movies.txt");
        BufferedReader reader = null;
        List<String> strList = new ArrayList();
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                line++;
                strList.add(tempString);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }

        return strList;
    }
}
