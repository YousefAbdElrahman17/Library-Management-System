package Library;

public class User {

    protected String name;
    protected String email;
    protected String phoneNum;

    //const1
    public User(String name){
        this.name = name;
    }//full const. can be setter
    public User(String name, String email, String phoneNum){
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    // Getters
    String getName(){
        return name;
    }
    String getEmail(){
        return email;
    }
    String getPhoneNum(){
        return phoneNum;
    }



}
