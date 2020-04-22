package Week5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


public class Bank implements Serializable {
    String bankName;
    Double rate;
    HashMap<String,User> users;
    static Integer bankId=100;
    private Integer key;

    protected Bank(String bankName, Double rate) {
        this.bankName = bankName;
        this.rate = rate;
        bankId++;
        users=new HashMap<String,User>();
        Long aLong=new Date().getTime();
        key= aLong.hashCode();
    }

    String createUser(String name,String password) {
        User user = new User(name, password,bankId.toString(),key.toString());
        user.getInfo(password);
        users.put(user.getCardId(password),user);
        return user.getCardId(password);
    }

    void getPassword(String cardId,String name){
        if (name.equals(users.get(cardId).getName()))
        users.get(cardId).getPassword(key.toString());
        else System.out.println("Wrong name!");
    }

    User userTools(String cardId){
        return users.get(cardId);
    }

    ArrayList<String> refresh(){
        Long aLong=new Date().getTime();
        Integer temp=aLong.hashCode();
        Double money;
        ArrayList list=new ArrayList<String>();
        for (User u:users.values()) {
            money=u.getBalance(key.toString(),temp.toString());
            money=money*rate*0.01;
            u.topUp(money);
            list.add(u.toString());
        }
        key=temp;
        return list;
    }

   Double getBalance(String cardId,String password){
         return Double.valueOf(users.get(cardId).getUserBalance(password));
   }

}
