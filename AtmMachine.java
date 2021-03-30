
import java.text.DecimalFormat;
import java.util.*;

public class AtmMachine {

  
  private TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

  AtmMachine() {
    map.put(123456, 123);
  }
 public static void main(String args[]) {

    int pass;
    int acc;
    Scanner sc = new Scanner(System.in);
    System.out.println("WELCOME TO AUTOMETIC TELLER MACHINE");
    System.out.println("LOG IN BY PROVIDING FOLLOWING DETAILS");
    System.out.println("ACCOUNT NO.");

    acc = sc.nextInt();

    System.out.println("PASSWORD");
    pass = sc.nextInt();
    AtmMachine obj = new AtmMachine();
    Option opt = new Option();
       


       boolean bool=obj.check(acc,pass);
       if (bool == true){
       System.out.println("yaahhhhh woohhh");
       opt.option();
       
      }

       
    }
  public boolean check(int acc, int pass) {
    if (map.containsKey(acc) && map.containsValue(pass))
      return true;
    return false;
  }

 }



 class Option extends AtmMachine{
  private static int balance=0;

  public void option(){
    int op, dep,with;
    System.out.println("LOGED IN SUCCESSFULLY");
      DecimalFormat df=new DecimalFormat("###,###.##");
      do{
      
      System.out.println("BALANCE CHECK :1");
      System.out.println("DEPOSITE      :2");
      System.out.println("WITHDRAW      :3");
      System.out.println("EXIT          :4");
      Scanner sca = new Scanner(System.in); 
      op= sca.nextInt();
      switch(op){
          case 1: System.out.println(df.format(balance));
          break; 
          case 2: System.out.println("Enter Amount to be Deposite");
          dep= sca.nextInt(); balance=balance+dep;
          System.out.println("Updated Balance:"+df.format(balance));
          break;
          case 3:System.out.println("Enter Amount to be withdraw"); 
                 with= sca.nextInt();
                 if(with>balance)
                 System.out.println("Insufficient Balance");
                 else{
                 balance=balance-with;
                 System.out.println("Updated Balance:"+df.format(balance));}
                 break;
          case 4:return;
          default: System.out.println("Incorrect Input");
         break;
          
      }

  }while(true);}


}

