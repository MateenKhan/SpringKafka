package main;

import com.fasterxml.jackson.databind.ObjectMapper;
import main.model.Address;
import main.model.Customer;
import main.model.CustomerStatus;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) throws Exception{
        Customer customer = new Customer();
        Address address = new Address();
        address.setAddressLine1("line1");
        address.setAddressLine2("line2");
        address.setPostalCode(123);
        address.setStreet("street");
        customer.setAddress(address);
        customer.setBirthdate(LocalDate.now());
        customer.setCountry("INDIA");
        customer.setCountryCode("IN");
        customer.setCustomerStatus(CustomerStatus.C);
        customer.setEmail("asdf@asdf.com");
        customer.setFirstName("fn");
        customer.setLastName("ln");
        customer.setMobileNumber("1234567890");
        customer.setNumber("a12");
        String str = new ObjectMapper().writeValueAsString(customer);
        System.out.println(str);
        str = "{\"number\":\"a1\",\"firstName\":\"aa\",\"lastName\":\"ss\",\"birthdate\":\"2019-11-18\",\"country\":\"IND\",\"countryCode\":\"IN\",\"mobileNumber\":\"1324567890\",\"email\":\"user@example.com\",\"customerStatus\":null,\"address\":{\"addressLine1\":\"asdf2\",\"addressLine2\":\"asdf1\",\"street\":\"asdf1\",\"postalCode\":12345}}";
        Customer customer1 = new ObjectMapper().readValue(str,Customer.class);
        System.out.println(customer1.getBirthdate().getYear());

    }
}
