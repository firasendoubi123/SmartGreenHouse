package smartgreen.Security.Oauth;
import smartgreen.Entity.User;
public class RemoveToken {
    private final User user;

    private final String token;

    public RemoveToken(User user, String token) {
        this.user = user;
        this.token = token;
    }

    public User getUser() {
        return user;
    }

    public String getToken() {
        return token;
    }
}
