
package segisportsystem;

public class Booking {

    private Package aPackage;
    private User user;
    private String date;

    public Booking(Package aPackage, User user, String date) {
        this.aPackage = aPackage;
        this.user = user;
        this.date = date;
    }

    public Package getaPackage() {
        return aPackage;
    }
    
    public double discountedPrice() {
    	return aPackage.getPrice() - (aPackage.getPrice() * (user.discount() / 100));
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public String getDate() {
    	return date;
    }

    @Override
    public String toString() {
        return "Booking -> " +
                "[" + aPackage +
                ", date : " + date +
                ", price after discount = RM" + discountedPrice() + "]" +
                "[" + user + "]";
    }
}

