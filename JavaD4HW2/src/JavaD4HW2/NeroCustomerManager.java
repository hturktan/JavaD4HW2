package JavaD4HW2;

public class NeroCustomerManager extends CustomerManager{
	@Override
	public void save(Customer customer) {
			System.out.println("Saved to Nero database "+ customer.getFirstName() + " " + customer.getLastName());
	}
}
