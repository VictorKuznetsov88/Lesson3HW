package serializer;

import userFile.UserList;

import java.io.IOException;

public interface UserSerializer {
    void serialize(UserList userList, String filename) throws IOException;
}
