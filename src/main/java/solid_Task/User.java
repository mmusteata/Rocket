package solid_Task;

public class User {

    private int user_id;

    public User(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "User{" +
               "user_id=" + user_id +
               '}';
    }
}
