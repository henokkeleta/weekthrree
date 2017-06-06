
public class Atm extends Reciept implements AtmInterface{
  private String name;
  private String accountNumber;
  private int passCode;
  private double balance;
 // private double previousBalance;
  private double withdrowAmount;
  private double addedAmount;
  
  
  
  
  public double getWithdrowAmount() {
	return withdrowAmount;
}
public void setWithdrowAmount(double withdrowAmount) {
	this.withdrowAmount = withdrowAmount;
}
public double getAddedAmount() {
	return addedAmount;
}
public void setAddedAount(double addedAmount) {
	this.addedAmount = addedAmount;
}
public Atm(){ 
	  name="";
	  accountNumber=null;
	  passCode=0;
	  balance=0;
	  //previousBalance=0;
  }
public Atm(String accountNumber,int passCode)
{ 
	this.accountNumber=accountNumber;
	this.passCode=passCode;
}
public void setAtm(String newAcount, int newPassCode)
{ 
	this.accountNumber=newAcount;
	this.passCode=newPassCode;
}

public Atm(String name, String accountNumber, int passCode, double balance) {
	this.name=name;
	this.accountNumber=accountNumber;
	this.passCode=passCode;
	this.balance=balance;
	
}
public void setAtm(String newName, String newAccountNumber, int newPasscode,double newBalance)
{ 
	this.name=newName;
	this.accountNumber=newAccountNumber;
	this.passCode=newPasscode;
	this.balance=newBalance;
}


public String getName() {
	return this.name;
}
public void setName(String name) {
	this.name = name;
}
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public int getPassCode() {
	return passCode;
}
public void setPassCode(int passCode) {
	this.passCode = passCode;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
 public void addBalance(double money) 
 { 
	 balance=balance+money;
 }
  public void withdrow(double money)throws overDraftException
  { 
	this.balance= this.balance-money;
  }
  public String showBalance()
  { 
	  return "your balnce is:"+" "+this.getBalance();
  }
  public String printReciept()
  { 
	  return "Account summary:\nName=:"+this.getName()+"\nAccount activity on: "+this.getAccountNumber()+"\n"
	  		+ "money added on your account is:"+this.getAddedAmount()+"\n"
	  		+"The aamount of money you withdraw now:"+this.getWithdrowAmount()+"\n"
	  		+ "Your curerent Balance :"+getBalance()+"\nThank you";
  }

}
