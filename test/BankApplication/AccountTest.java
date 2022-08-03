package BankApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AccountTest {
    Account account;
    Account account1 ;
    Account account2 ;
    Account account3;

    @BeforeEach
    void setUp() {
         account = new Account("Adesuyi Ololade","0782807561", "1234");
         account1 = new Account("Adesuyi Ololade", "0782807561", "2345");
         account2 = new Account("Jummy", "070", "3456");
         account3 = new Account("Dee", "080", "4567");
    }
    @Test
    void testThatAccountCanBeCreated(){
        assertNotNull(account);
    }
    @Test
    void testThatAccountIsFunctional(){
        assertEquals("Adesuyi Ololade", account.getAccountName());
        assertEquals("0782807561", account.getAccountNumber());

    }

    @Test
    void testThatWeCanDepositIntoAccount(){
        account.deposit(3000);
        assertEquals(3000, account.getBalance("1234"));
    }

    @Test
    void testThatWeCanWithdrawFromAccount(){
        account.deposit(4000);
        account.withdraw(2000, "1234");
        assertEquals(2000, account.getBalance("1234"));
    }

    @Test
    void testThatWeCannotWithdrawWithWrongPin(){
        account.deposit(3000);
        account.withdraw(2000, "1234");
        assertEquals(0, account.getBalance("1414"));


    }
    @Test
    void testThatWeCanCheckBalanceWithCorrectPin() {
        account.deposit(3000);
        account.withdraw(2000, "1234");
        assertEquals(1000, account.getBalance("1234"));
    }

    @Test
    void testThatWeCanCheckBalanceWithWrongPin() {
        account.deposit(3000);
        account.withdraw(2000, "1234");
        assertEquals(0, account.getBalance("1444"));

    }

    @Test
    void testThatCustomerCanChangePin(){
        account.deposit(5000);
        account.withdraw(1000, "1234");
        account.getPin("1234");
        account.setPin("1222");
        assertEquals(4000, account.getBalance("1222"));
    }

    @Test
    void testThatAccountCanTransfer(){
        account.deposit(9000);
        account.transfer(5000, account2, "1234");
        assertEquals(4000, account.getBalance("1234"));
        assertEquals(5000, account2.getBalance("3456"));
    }

    @Test
   // @DisplayName("Restrict negative value test")
    void testThatNegativeFundsCannotBeDeposited(){
        account.deposit(-5000);
        assertEquals(0, account.getBalance("1234"));
    }

    @Test
    void excessiveWithdrawalTest(){
        account.deposit(10000);
        account.withdraw(40000,"1234" );
        assertEquals(10000, account.getBalance("1234"));
    }

    @Test
    void TestThatNegativeAmountCannotBeWithdraw(){
        account.deposit(10000);
        account.withdraw(-40000,"1234" );
        assertEquals(10000, account.getBalance("1234"));
    }








    }
