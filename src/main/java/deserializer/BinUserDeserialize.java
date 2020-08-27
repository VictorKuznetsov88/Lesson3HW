package deserializer;

import userFile.UserList;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BinUserDeserialize implements UserDeserialize {
    public UserList deserialize(String filename) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream(filename);
        ObjectInputStream list = new ObjectInputStream(file);
        Object object = list.readObject();
        UserList userList = (UserList) object;
        System.out.println(userList);

        list.close();
        file.close();

        return userList;

    }
}
