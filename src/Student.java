
package segisportsystem;


public class Student extends User{
    public Student(String userID, String userName, String email, long contact) {
        super(userID, userName, email, contact);
    }
    @Override
    public double discount(){
        return 40;
    }
}

