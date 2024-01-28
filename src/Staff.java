/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segisportsystem;


public class Staff extends User{
    public Staff(String userID, String userName, String email, long contact) {
        super(userID, userName, email, contact);
    }
    @Override
    public double discount(){
        return 20;
    }
}