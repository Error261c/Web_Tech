import java.util.*;

class Customer {
    int age; 
    String name, account_number, address;    
       
    public Customer(String name, String account_number, String address, int age) 
    {        
        this.name = name;        
        this.address = address;        
        this.account_number = account_number;        
        this.age = age;   
     }
}
class Account
{
    String account_type, branch;
    public Account(String account_type, String branch) 
    {        
        this.account_type = account_type;        
        this.branch = branch;    
    }
}
class RBI 
{  
    int min_bal, max_withdrawal;
    double min_interest_rate;    
    public RBI() {
        min_bal = 100;        
        max_withdrawal = 1000000;        
        min_interest_rate = 4.0;    
    }    
    public void set_minRate(double min_interest_rate) 
    {        
        if (min_interest_rate >= this.min_interest_rate) 
        {            
            this.min_interest_rate = min_interest_rate;        
        } 
        else {            
            System.out.println("As per RBI guidelines minimum interest rate should be "+this.min_interest_rate);        
        }    
    }    
    public void set_minBal(int min_bal) 
    {        
        if (min_bal < this.min_bal) 
        {            
            this.min_bal = min_bal;        
        } 
        else 
        {            
            System.out.println("As per RBI guidelines minimum balance should be "+this.min_bal);        
        }    
    }
    public void set_max_wl(int max_withdrawal) 
    {        
        if (max_withdrawal > this.max_withdrawal) 
        {            
            this.max_withdrawal = max_withdrawal;        
        } 
        else 
        {            
            System.out.println("As per RBI guidelines maximum withdrawal cant be over "+this.max_withdrawal);        
        }    
    }    
    public void printInfo() 
    {    
        System.out.println("\nUpdated Minimum Balance: " + min_bal);        
        System.out.println("Updated Minimum Interest Rate: " + min_interest_rate);        
        System.out.println("Updated Maximum Withraw Limit: " + min_bal);    
    }
}


class ICICI extends RBI 
{  
    public ICICI(int min_bal, int max_withdrawal, double min_interest_rate) 
    {        
        set_minRate(min_interest_rate);        
        set_minBal(min_bal);        
        set_max_wl(max_withdrawal);    
    }    
    public void printInfo() 
    {        
        System.out.println("\nFinal Minimum Balance: " + min_bal);        
        System.out.println("Final Minimum Interest Rate: " + min_interest_rate);        
        System.out.println("Final Maximum Withraw Limit: " + min_bal);    
    }
}

class SBI extends RBI {
    public SBI(int min_bal, int max_withdrawal, double min_interest_rate) 
    {        
        set_minRate(min_interest_rate);        
        set_minBal(min_bal);        
        set_max_wl(max_withdrawal);    
    }    
    public void printInfo() 
    {        
        System.out.println("\nFinal Minimum Balance: " + min_bal);        
        System.out.println("Final Minimum Interest Rate: " + min_interest_rate);        
        System.out.println("Final Maximum Withraw Limit: " + min_bal);    
    }
}


class PNB extends RBI {
    public PNB(int min_bal, int max_withdrawal, double min_interest_rate) 
    {        
        set_minRate(min_interest_rate);        
        set_minBal(min_bal);        
        set_max_wl(max_withdrawal);    
    }    
    public void printInfo() 
    {        
        System.out.println("\nFinal Minimum Balance: " + min_bal);        
        System.out.println("Final Minimum Interest Rate: " + min_interest_rate);        
        System.out.println("Final Maximum Withraw Limit: " + min_bal);    
    }
}
public class Q2 {   
    public static void main(String args[]) 
    {        
        Scanner sc = new Scanner(System.in);
        int x;        
        System.out.println("Enter your bank");        
        System.out.println("1: SBI");
        System.out.println("2: ICICI");
        System.out.println("3: PNB");      
        x = sc.nextInt();        
              
        System.out.println("Enter minimum balance, maximum withdraw limit and minimum Interest rate");        
        int a, b;        
        double c;        
        a = sc.nextInt();        
        b = sc.nextInt();        
        c = sc.nextDouble();        
        RBI bank;
        sc.close();        
        switch (x) {            
            case 1:                
                bank = new SBI(a, b, c);                
                bank.printInfo();                
                break;            
            case 2:                
                bank = new ICICI(a, b, c);                
                bank.printInfo();                
                break;            
            case 3:               
                bank = new PNB(a, b, c);                
                bank.printInfo();               
                break;            
            default:                
                System.out.println("Invalid Input");        
        }    
    }
