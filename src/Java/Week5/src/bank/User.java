package Week5;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Timer;

public class User implements Serializable {
    static Integer number=20190001;
    private String cardId;
    private String name;
    private Double balance;
    private String password;
    private String bank_key;
    static  DecimalFormat df = new DecimalFormat();

    public User(String name,String password,String bankId,String bank_key) {
        df.setMinimumFractionDigits(2);

        this.name = name;
        cardId =bankId+number.toString();
        number++;
        balance=0.0;
        this.password=password;
        this.bank_key=bank_key;
    }
    void withdraw(double money,String password){
        if (password.equals(this.password)) {
            balance=balance-money;
            System.out.println(getInfo());
        }
        else System.out.println("Wrong password!");
    }
    void topUp(double money){
        balance=balance+money;
        System.out.println(getInfo());
    }
    private String getInfo() {
        return "{\"User\":{"
                + "\"cardId\":\""
                + cardId + '\"'
                + ",\"name\":\""
                + name + '\"'
                + ",\"balance\":"
                + df.format(balance)
                + "}}";

    }
    void getInfo(String password) {
        if (password.equals(this.password))
            System.out.println(
                    "{\"User\":{"
                + "\"cardId\":\""
                + cardId + '\"'
                + ",\"name\":\""
                + name + '\"'
                + ",\"balance\":"
                + df.format(balance)
                + "}}");
        else System.out.println("Wrong password!");

    }
    String getCardId(String password){
        if (password.equals(this.password)){
            return cardId;
        }else {
            return "Wrong password!";
        }
    }
    void changePassword(String password,String newPassword){
        if (password.equals(this.password)){
            this.password=newPassword;
        }else {
            System.out.println("Wrong password!");
        }
    }
    void changeName(String password,String newName){
        if (password.equals(this.password)){
            this.name=newName;
        }else {
            System.out.println("Wrong password!");
        }
    }
    double getBalance(String key,String newKey){
        if (bank_key.equals(key)){
            bank_key=newKey;
            return balance;
        }else return 0;
    }

    String getUserBalance(String password){
        if (this.password.equals(password)){
            return balance.toString();
        }else {
            return "Wrong password!";
        }
    }
    String getPassword(String bank_key){
        if (bank_key.equals(this.bank_key)) return password;
        else return "Wrong password!";
    }
    String getName(){
        return name;
    }

    @Override
    public String toString() {


        return "{\"User\":{"
                + "\"cardId\":\""
                + cardId + '\"'
                + ",\"name\":\""
                + name + '\"'
                + ",\"balance\":"
                + df.format(balance)
                + ",\"password\":\""
                + password + '\"'
                + ",\"bank_key\":\""
                + bank_key + '\"'
                + "}}";

    }
}
