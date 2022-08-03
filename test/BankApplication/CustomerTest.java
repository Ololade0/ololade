package BankApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer;
    Account account1;
    Account account2;
    Customer customer1;
    Bank bank;


    @BeforeEach
    void setUp() {
        customer = new Customer("Ololade", "Demilade",
                "Female", 28, "08109093828",
                "Sabo yaba");

        customer1 = new Customer("Ololade", "090", "Female",
                40,
                "080", "yaba");
        bank = new Bank("Access bank", "Yaba");


        account1 = new Account("Adesuyi Ololade", "0782807561", "1234");
        account2 = new Account("Adesuyi Ola", "0782807560", "1234");

    }

    @Test
    void testThatCustomerExist() {
        assertNotNull(customer);
    }


    @Test
    void testThatCustomerDetailsCanSet() {
        customer.setFirstName("Ololade");
        customer.setMiddleName("Oluwatosin");
        customer.setLastName("Demilade");
        customer.setGender("Female");
        customer.setAge(28);
        customer.setPhoneNumber("08109093828");
        customer.setEmailAddress("ola@");
        customer.setHomeAddress("Sabo yaba");
        assertEquals("Ololade", customer.getFirstName());
        assertEquals("Oluwatosin", customer.getMiddleName());
        assertEquals("Demilade", customer.getLastName());
        assertEquals("Female", customer.getGender());
        assertEquals(28, customer.getAge());
        assertEquals("08109093828", customer.getPhoneNumber());
        assertEquals("ola@", customer.getEmailAddress());
        assertEquals("Sabo yaba", customer.getHomeAddress());

    }

    @Test
    void testThatDateOfBirthCanBeSet() {
        customer.setDateOfBirth("21st");
        customer.setMonthOfBirth("April");
        customer.setYearOfBirth("2022");
        assertEquals("21st", customer.getDateOfBirth());
        assertEquals("April", customer.getMonthOfBirth());
        assertEquals("2022", customer.getYearOfBirth());
    }

    @Test
    void testThatDateOfBirthCanBeDisplay() {
        customer.setDateOfBirth("21st");
        customer.setMonthOfBirth("April");
        customer.setYearOfBirth("2022");
        assertEquals("21st/April/2022", customer.displayBirthHistory());
    }

    @Test
    void testThatAccountNameisSet() {
        assertEquals("Adesuyi Ololade", account1.getAccountName());

    }

    @Test
    void testThatCustomerCanDepositIntoAccount() {
        bank.addCustomer(customer);
        account1.deposit(3000);
        assertEquals(3000, account1.getBalance("1234"));
    }

    @Test
    void testThatCustomerCanWithdrawFromAccount() {
        bank.addCustomer(customer);
        account1.deposit(3000);
        account1.withdraw(2000, "1234");
        assertEquals(1000, account1.getBalance("1234"));

    }

    @Test
    void testThatCustomerCanChangePin() {
        bank.addCustomer(customer);
        account1.setPin("5467");
        account1.deposit(3000);
        account1.withdraw(2000, "5467");
        assertEquals(1000, account1.getBalance("5467"));

    }

    @Test
    void testThatCustomerCanMakeTransfer() {
        bank.addCustomer(customer);
        account1.setPin("5467");
        account1.deposit(10000);
        account1.transfer(2000, account2, "5467");
        assertEquals(8000, account1.getBalance("5467"));
        assertEquals(2000, account2.getBalance("1234"));

    }

    @Test
    void testThatCustomerCanCloseAccount() {
        bank.addCustomer(customer);
        bank.addAccount(account2);
        bank.closeAccount(account2);
        assertEquals("Adesuyi Ola", account2.getAccountName());

    }

}








