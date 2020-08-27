package userFile;

import java.io.Serializable;
import java.util.Collection;

public class UserList implements Serializable {

    private Collection<User> users;

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserList{" +
                "user=" + users +
                '}';
    }
}
