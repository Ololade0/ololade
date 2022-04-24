package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
   // public void start(){
     public void accountCanBeCreatedTest(){
        Account nepaAccount = new Account();

        int balance = nepaAccount.getBalance();
        //confirm that my balance is zero
        assertEquals(0, nepaAccount.getBalance());



    }
    @Test
    public void depositMoney(){
        //given i have an account
        Account boyoAccount = new Account();
        //when i deposit money
        boyoAccount.deposit(1500);
        //check that my account has changed
        assertEquals(1500, boyoAccount.getBalance());

    }

    public void depositTwice() {
        Account uselessAccount = new Account();
        uselessAccount.deposit(1_500);
        uselessAccount.deposit(2_000);

        assertEquals(3_500, uselessAccount.getBalance());

    }


    @Test
    public void withdrawMoney(){
        //given i have an account
        Account OloladeAccount = new Account();
       OloladeAccount.deposit(1_500);
        //when i deposit money
        OloladeAccount.withdraw(1_500);
        //check that my account has changed
        assertEquals(0, OloladeAccount.getBalance());

    }
    @Test
    public void WithdrawTwice() {
        Account uselessAccount = new Account();
        uselessAccount.deposit (3_500);
        uselessAccount.withdraw(4_000);
        assertEquals(-500, uselessAccount.getBalance());

    }



}
