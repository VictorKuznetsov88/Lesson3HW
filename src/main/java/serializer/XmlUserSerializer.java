package serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import userFile.UserList;

import java.io.File;
import java.io.IOException;

public class XmlUserSerializer implements UserSerializer{

    public void serialize(UserList userList, String filename) throws IOException {
        ObjectMapper objectMapper = new XmlMapper();
        File file = new File(filename);
        objectMapper.writerFor(UserList.class).writeValue(file,userList);

    }

}
