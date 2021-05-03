package JavaD4HW2;

public class StarbucksCustomerManager extends CustomerManager{
	
	VerificationServices verificationServices;
	
	
	
	public StarbucksCustomerManager(VerificationServices verificationServices) {
		this.verificationServices = verificationServices;
	}


	@Override
	public void save(Customer customer) {
		if(verificationServices.check(customer)) {
			System.out.println("Saved to Starbuck database "+ customer.getFirstName()+ " " + customer.getLastName());
		}else {
			System.out.println(customer.getFirstName() + " "+ customer.getLastName() + " cannot be saved into Starbucks database");
		}
	}
	
	
}
