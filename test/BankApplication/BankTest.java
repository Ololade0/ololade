package BankApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank bank;
    Customer customer;
    Customer customer2;
    Account account;


    @BeforeEach
    void setUp() {
        bank = new Bank("Access Bank", "Sabo yaba");
        account = new Account("OLA","0900", "456");
        customer = new Customer("Ololade", "Demilade","Female", 28, "08109093828","Sabo yaba");
        customer2 = new Customer("Ola", "Demi","male", 28, "081","Sabo");
        bank.addCustomer(customer);



    }


    @Test
    void testThatBankCanBeCreated() {
        assertNotNull(bank);
    }

    @Test
    void testThatBankNameCanBeCreated() {
        assertEquals("Access Bank", bank.getBankName());
    }

    @Test
    void testThatBranchCanBeCreated() {
        assertEquals("Sabo yaba", bank.getBankBranch());

    }

    @Test
    void testThatBankCanViewCustomerCanBeAdded() {
        bank.addCustomer(customer2);
        assertEquals("Ololade", bank.viewCustomer(0).getFirstName());


    }

    @Test
    void testThatBankCanViewAccountThatIsAdded() {
        bank.addAccount(account);
        assertEquals("OLA", bank.viewAccount(0).getAccountName());

    }
    @Test
    void testBankCanCloseAccount(){
        bank.addAccount(account);
        bank.addCustomer(customer);
        assertEquals(1, bank.numberOfAccounts());
        assertEquals(2, bank.numberOfCustomers());
        bank.closeAccount(account);
        assertEquals(0, bank.numberOfAccounts());

    }


}





