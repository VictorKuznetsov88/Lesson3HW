package deserializer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import userFile.UserList;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class XmlUserDeserializerTest {

      @Test
        void deserialize() throws IOException, ClassNotFoundException {
            XmlUserDeserializer xmlUserDeserializer = new XmlUserDeserializer();
            UserList userList = xmlUserDeserializer.deserialize("UserListData.xml");

            Assertions.assertTrue(new File("UserListData.xml").exists());
            Assertions.assertTrue(userList.getUsers().size()==1);
            Assertions.assertEquals("Vasiliy",userList.getUsers().iterator().next().getName());

        }
    }
