package serializer;

import userFile.User;
import userFile.UserList;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

class BinUserSerializerTest {

    @org.junit.jupiter.api.Test
    void serialize() {
    UserList userList  =  testData();
    BinUserSerializer binUserSerializer = new BinUserSerializer();
    binUserSerializer.serialize (userList,"usData.txt");

        Assertions.assertTrue(new File("usData.txt").exists());
    }


    @org.junit.jupiter.api.Test
    void jsonSerializeTest() throws IOException {
        UserList userList  =  testData();
        JsonUserSerializer binUserSerializer = new JsonUserSerializer();
        binUserSerializer.serialize (userList,"UserListData.json");

        Assertions.assertTrue(new File("UserListData.json").exists());
    }

    @org.junit.jupiter.api.Test
    void xmlSerializeTest() throws IOException {
        UserList userList  =  testData();
        XmlUserSerializer binUserSerializer = new XmlUserSerializer();
        binUserSerializer.serialize (userList,"UserListData.xml");

        Assertions.assertTrue(new File("UserListData.xml").exists());
    }
    @org.junit.jupiter.api.Test
    void csvSerializeTest() throws IOException {
        UserList userList  =  testData();
        CsvUserSerializer csvUserSerializer = new CsvUserSerializer();
        CsvUserSerializer.serialize (userList,"UserListData.csv");

        Assertions.assertTrue(new File("UserListData.csv").exists());
    }

    private UserList testData() {
        User vasiliy = new User();
        vasiliy.setName("Vasiliy");
        vasiliy.setId("11");
        vasiliy.setEmail("vasiliy@list.com");
        UserList userList = new UserList();
        userList.setUsers(new ArrayList<User>());
        userList.getUsers().add(vasiliy);
        return userList;
    }

}