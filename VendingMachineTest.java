import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VendingMachineMain {
	VendingMachine machine = new VendingMachine();

	@Test
	public void testInitialBalance() {
		assertEquals(0,machine.getBalance());
	}
	
	@Test
	public void testInitialRevenue() {
		assertEquals(0,machine.getRevenue());
	}

	@Test
	public void testInsertCoins() {
		machine.insertCoin();
		machine.insertCoin();
		machine.insertCoin();
		assertEquals(3,machine.getBalance());
		assertEquals(0, machine.getRevenue());
	
	}
	
	@Test
	public void testRefund() {
		machine.insertCoin();
		machine.insertCoin();
		machine.insertCoin();
		int ref =machine.refund();
		assertEquals(0, machine.getBalance());
		assertEquals(3, ref);
	}
	
	@Test
	public void testVendFailure() {
		assertFalse(machine.vendCandyBar());
		assertEquals(20, machine.candyBars);
		
	}
	
	@Test
	public void testVendSuccess() {
		machine.insertCoin();
		machine.insertCoin();
		machine.insertCoin();
		Boolean vend = machine.vendCandyBar();
		assertTrue(vend);
		assertEquals(19, machine.candyBars);
		assertEquals(0,machine.getBalance());
		assertEquals(3, machine.getRevenue());
	}
}
