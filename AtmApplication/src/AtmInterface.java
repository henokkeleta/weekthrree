
public interface AtmInterface  {
  public  void addBalance(double num);
  public void withdrow(double num)throws overDraftException;
  public String showBalance();
 // public void printReciept();
}
