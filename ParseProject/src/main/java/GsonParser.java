import com.google.gson.Gson;
import java.io.FileReader;

public class GsonParser {

    public Root parse()
    {
        Gson gson = new Gson();
        Insert insert = new Insert();

        try (FileReader reader = new FileReader(insert.filling())){

            Root root=gson.fromJson(reader, Root.class);
            System.out.println("ФАЙЛ ЗАГРУЖЕН");
            System.out.println("ФАЙЛ РАЗОБРАН");
            return root;

        } catch (Exception e) {
            System.out.println("Parsing error"+e.toString());
        }
        return null;
    }
}

