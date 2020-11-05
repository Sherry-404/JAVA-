/*9.7 (账 户类 Account)设计一个名为 Account 的类，它包括： — 个名为 id的 int 类型私有数据域（默认值为 0)。 — 个名为 balance 的 double 类型
私有数据域（默认值为 0>。 — 个 名 为 annuallnterestRate 的 double 类型私有数据域存储当前利率（默认值为 0)。假
 设所有的篆户都有相同的利率。 — 个 名 为 的 Date 类型的私有数据域，存储账户的开户日期。 — 个用于创建默认账户的无参构造方法。一个用于创建带特定
  id 和初始余额的账户的构造方法。
 id、balance 和 annuallnterstRate 的访问器和修改器。
 dateCreated 的访问器。
 一个名为 getMonthlyInterestRate()的方法，返回月利率。 — 个名为 withDraw 的方法，从账户提取特定数额。 — 个名为 deposit 的方法向账户存储特定数额。*/
 package 第三次java作业;

import java.util.Date;
import java.util.Scanner;

public class Account {
 private int id = 0;
 private double balance = 0;
 private double annuallnterestRate = 0;
 private Date date = new Date();

 public int createAccount() {
  System.out.println("您的账户名为" + id);
  System.out.println("您的账户余额为" + balance);
  return id;
 }

 public void createyourAccount() {
  System.out.println("请输入账户名称");
  Scanner input1 = new Scanner(System.in);
  String idYours = input1.nextLine();
  System.out.println("您的账户余额为" + balance);
  Scanner input2 = new Scanner(System.in);
  String balanceYours = input2.nextLine();
 }

 public int getId() {
  return id;
 }

 public void setId() {
  this.id = id;
 }

 public double getBalance() {
  return balance;
 }

 public void setBalance() {
  this.balance = balance;
 }

 public double getAnnuallnterestRate() {
  return annuallnterestRate;
 }

 public void setAnnuallnterestRate() {
  this.annuallnterestRate = annuallnterestRate;
 }

 public double getMonthlyInterestRate() {
  double MonthlyInterestRate = annuallnterestRate / 12;
  return MonthlyInterestRate;
 }

 public double withdraw() {
  System.out.println("请输入您想提取的金额数量");
  Scanner input3 = new Scanner(System.in);
  double withdraw = input3.nextDouble();
  balance = balance - withdraw;
  return balance;
 }

 public double deposit() {
  System.out.println("请输入您想提取的金额数量");
  Scanner input3 = new Scanner(System.in);
  double deposit = input3.nextDouble();
  balance = balance + deposit;
  return balance;
 }
}
