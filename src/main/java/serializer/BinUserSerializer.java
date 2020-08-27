package serializer;

import userFile.UserList;

import java.io.*;

public class BinUserSerializer implements UserSerializer {
    public void serialize(UserList userList, String filename) {

        FileOutputStream file = null;
        ObjectOutputStream list = null;
        try {
            file = new FileOutputStream(filename);
            list = new ObjectOutputStream(file);
            list.writeObject(userList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }   catch (IOException e) {
                e.printStackTrace();
        } finally {
    if (list != null){
        try {
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
            try {
                list.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
