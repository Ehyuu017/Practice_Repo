/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dashboard;

/**
 *
 * @author Nesty
 */
public class DashboardBean {


    
    private int eNum;
    private String firstName;
    private String LastName;
    private String birthDay;
    private String Address;
    private String phoneNum;
    private String sssNum;
    private String philNum;
    private String pagibigNum;
    private String taxNum;
    private String Status;
    private String Position;
    private String Supervisor;

    public DashboardBean(int eNum, String firstName, String LastName, String birthDay, String Address, String phoneNum, String sssNum, String philNum, String pagibigNum, String taxNum, String Status, String Position, String Supervisor) {
        this.eNum = eNum;
        this.firstName = firstName;
        this.LastName = LastName;
        this.birthDay = birthDay;
        this.Address = Address;
        this.phoneNum = phoneNum;
        this.sssNum = sssNum;
        this.philNum = philNum;
        this.pagibigNum = pagibigNum;
        this.taxNum = taxNum;
        this.Status = Status;
        this.Position = Position;
        this.Supervisor = Supervisor;
    }


    public int geteNum() {
        return eNum;
    }

    public void seteNum(int eNum) {
        this.eNum = eNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getSssNum() {
        return sssNum;
    }

    public void setSssNum(String sssNum) {
        this.sssNum = sssNum;
    }

    public String getPhilNum() {
        return philNum;
    }

    public void setPhilNum(String philNum) {
        this.philNum = philNum;
    }

    public String getPagibigNum() {
        return pagibigNum;
    }

    public void setPagibigNum(String pagibigNum) {
        this.pagibigNum = pagibigNum;
    }

    public String getTaxNum() {
        return taxNum;
    }

    public void setTaxNum(String taxNum) {
        this.taxNum = taxNum;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public String getSupervisor() {
        return Supervisor;
    }

    public void setSupervisor(String Supervisor) {
        this.Supervisor = Supervisor;
    }
    
}
