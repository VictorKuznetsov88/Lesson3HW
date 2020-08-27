package serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import userFile.UserList;

import java.io.File;
import java.io.IOException;

public class CsvUserSerializer {

    public static void serialize(UserList userList, String filename) throws IOException {
        ObjectMapper objectMapper = new CsvMapper();
        File file = new File(filename);
        objectMapper.writerFor(UserList.class).writeValue(file,userList);

    }
}
