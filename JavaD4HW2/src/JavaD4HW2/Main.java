package JavaD4HW2;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager1 = new NeroCustomerManager();
		customerManager1.save(new Customer(1, "Ahmet", "Can", "1985", "123456"));
		
		CustomerManager customerManager2 = new StarbucksCustomerManager (new VerificationServices() {
			
			@Override
			public boolean check(Customer customer) {
							return true;
			}
		});
		customerManager2.save(new Customer(1, "Hasan", "Mehmet", "1982","654789"));
		
	}

}
