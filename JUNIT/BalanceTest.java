package juntiiexamples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BalanceTest {
	@Test
    void testbalance() throws InsufficientFundsException {
        BankAccount bankAccount=new BankAccount();
        Integer actual=bankAccount.withdraw(4000);
        assertEquals(5000,actual);
    }
    @Test
    void testbalance1()  {
        BankAccount bankAccount=new BankAccount();
        assertThrows(InsufficientFundsException.class,()-> bankAccount.withdraw(10000));
    }
}
