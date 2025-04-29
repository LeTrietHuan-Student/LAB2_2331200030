
public class User {
    String UserID;
    String Password;
    String Email;
    String UserType;

    public User(String UserID, String Password, String Email, String UserType) {
        this.UserID = UserID;
        this.Password = Password;
        this.Email = Email;
        this.UserType = UserType;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String userType) {
        UserType = userType;
    }

    public void CreateUser() {

    }

    public void ResetPassword() {

    }
}
