
public class VendingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMachine vm = new VendingMachine();
		System.out.println(vm.candyBars);
		System.out.println(vm.getBalance());
		System.out.println(vm.getRevenue());
		vm.insertCoin();
		vm.insertCoin();
		
		//Test VendCandyBar Fail/Success
		//vm.insertCoin();
		

		vm.vendCandyBar();
		
		System.out.println(vm.getBalance());
		System.out.println(vm.getRevenue());
		System.out.println(vm.candyBars);
		
		vm.refund();
		System.out.println(vm.getBalance());
		
		
	}

}
