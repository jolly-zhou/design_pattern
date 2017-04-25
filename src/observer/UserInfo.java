package observer;


import java.util.Observable;

/**
 * Created by jolly on 2017/4/23.
 */
public class UserInfo extends Observable {

    private String username;

    private String password;

    private long id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        this.setChanged();
        this.notifyObservers("username");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        this.setChanged();
        this.notifyObservers("password");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
        this.setChanged();
        this.notifyObservers("id");
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                '}';
    }
}
