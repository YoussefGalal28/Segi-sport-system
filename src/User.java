
package segisportsystem;

public class User {
    private String userID;
    private String userName;
    private String email;
    private long contact;

    public User(String userID, String userName, String email, long contact) {
        this.userID = userID;
        this.userName = userName;
        this.email = email;
        this.contact = contact;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public double discount(){return 0;}

    @Override
    public String toString() {
        return "User -> " +
                "userID = '" + userID + '\'' +
                ", userName = ' " + userName + '\'' +
                ", email = '" + email + '\'' +
                ", contact = " + contact;
    }
}

