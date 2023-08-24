object q3 {
  class Account(initialBalance: Double) {
    private var balance: Double = initialBalance

    def getBalance: Double = balance

    def deposit(amount: Double): Unit = {
      if (amount > 0) {
        balance += amount
        println(s"Deposited $amount. New balance: $balance")
      } else {
        println("Deposit amount must be positive.")
      }
    }

    def withdraw(amount: Double): Unit = {
      if (amount > 0 && amount <= balance) {
        balance -= amount
        println(s"Withdrew $amount. New balance: $balance")
      } else {
        println("Withdrawal amount must be positive and cannot exceed the balance.")
      }
    }

    def transfer(amount: Double, toAccount: Account): Unit = {
      if (amount > 0 && amount <= balance) {
        balance -= amount
        toAccount.deposit(amount)
        println(s"Transferred $amount to ${toAccount.toString}. New balance: $balance")
      } else {
        println("Transfer amount must be positive and cannot exceed the balance.")
      }
    }

    override def toString: String = s"Account balance: $balance"
  }


  def main(args: Array[String]): Unit = {
    val account1 = new Account(1000.0)
    val account2 = new Account(500.0)

    println(account1)
    println(account2)

    account1.deposit(200.0)
    account2.withdraw(100.0)

    account1.transfer(300.0, account2)

    println(account1)
    println(account2)
  }



}
