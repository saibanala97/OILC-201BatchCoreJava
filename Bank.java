class Bank {
      Public static void main(String[] args) {
       BankAccount acc = new BankAccount();
        acc.deposit(5000); 
        }
}
class BankAccount {
            double balance;
             Public  void deposit(final BankAccount this,double amt){
            balance = balance + amt;
     }
 }
