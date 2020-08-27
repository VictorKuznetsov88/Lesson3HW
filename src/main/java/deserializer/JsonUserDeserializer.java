package deserializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import userFile.UserList;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class JsonUserDeserializer {

    public static UserList deserialize(String filename) throws IOException {
        File file = new File(filename);
        ObjectMapper objectMapper = new ObjectMapper();
        Object obj = objectMapper.readerFor(UserList.class).readValue(file);
        UserList userList = (UserList) obj;
        System.out.println(userList);

        return userList;

    }
}
