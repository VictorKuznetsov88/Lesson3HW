package deserializer;

import userFile.UserList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

class BinUserDeserializeTest {

    @Test
    void deserialize() throws IOException, ClassNotFoundException {
        BinUserDeserialize binUserDeserialize = new BinUserDeserialize();
        UserList userList = binUserDeserialize.deserialize("usData.txt");

        Assertions.assertTrue(new File("usData.txt").exists());
        Assertions.assertTrue(userList.getUsers().size()==1);
        Assertions.assertEquals("Vasiliy",userList.getUsers().iterator().next().getName());

    }


}