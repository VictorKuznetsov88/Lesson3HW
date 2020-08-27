package deserializer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import userFile.UserList;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class JsonUserDeserializerTest {

    @Test
    void deserialize() throws IOException, ClassNotFoundException {
        JsonUserDeserializer jsonUserDeserializer = new JsonUserDeserializer();
        UserList userList = JsonUserDeserializer.deserialize("UserListData.json");

        Assertions.assertTrue(new File("UserListData.json").exists());
        Assertions.assertTrue(userList.getUsers().size()==1);
        Assertions.assertEquals("Vasiliy",userList.getUsers().iterator().next().getName());

    }



}