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

object Bank {
  def negativeBalanceAccounts(accounts: List[Account]): List[Account] = {
    accounts.filter(_.getBalance < 0)
  }

  def totalBalance(accounts: List[Account]): Double = {
    accounts.map(_.getBalance).sum
  }

  def applyInterest(accounts: List[Account]): List[Account] = {
    accounts.map { account =>
      if (account.getBalance > 0) {
        account.deposit(account.getBalance * 0.05)
      } else {
        account.withdraw(-account.getBalance * 0.1)
      }
      account
    }
  }
}

object main1 {
  def main(args: Array[String]): Unit = {
    val account1 = new Account(1000.0)
    val account2 = new Account(-500.0)
    val account3 = new Account(200.0)

    val bankAccounts = List(account1, account2, account3)

    println("Negative Balance Accounts:")
    Bank.negativeBalanceAccounts(bankAccounts).foreach(println)

    val totalBalances = Bank.totalBalance(bankAccounts)
    println(s"Total Balance of all accounts: $totalBalances")

    val updatedAccounts = Bank.applyInterest(bankAccounts)
    println("Updated Account Balances:")
    updatedAccounts.foreach(println)
  }
}