package deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import userFile.UserList;

import java.io.File;
import java.io.IOException;

public class XmlUserDeserializer {
    public static UserList deserialize(String filename) throws IOException {
        File file = new File(filename);
        ObjectMapper objectMapper = new XmlMapper();
        Object obj = objectMapper.readerFor(UserList.class).readValue(file);
        UserList userList = (UserList) obj;
        System.out.println(userList);

        return userList;

    }
}


