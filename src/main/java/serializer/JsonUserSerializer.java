package serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import userFile.UserList;

import java.io.File;
import java.io.IOException;

public class JsonUserSerializer implements UserSerializer {
    public void serialize(UserList userList, String filename) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(filename);
        objectMapper.writerFor(UserList.class).writeValue(file,userList);

    }
}
