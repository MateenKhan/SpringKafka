package main.model;

import java.time.LocalDate;
import java.util.Objects;


public class Customer   {
  private String number = null;

  private String firstName = null;

  private String lastName = null;

  private LocalDate birthdate = null;

  private String country = null;

  private String countryCode = null;

  private String mobileNumber = null;

  private String email = null;

  private CustomerStatus customerStatus = null;

  private Address address = null;

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LocalDate getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(LocalDate birthdate) {
    this.birthdate = birthdate;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CustomerStatus getCustomerStatus() {
    return customerStatus;
  }

  public void setCustomerStatus(CustomerStatus customerStatus) {
    this.customerStatus = customerStatus;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.number, customer.number) &&
        Objects.equals(this.firstName, customer.firstName) &&
        Objects.equals(this.lastName, customer.lastName) &&
        Objects.equals(this.birthdate, customer.birthdate) &&
        Objects.equals(this.country, customer.country) &&
        Objects.equals(this.countryCode, customer.countryCode) &&
        Objects.equals(this.mobileNumber, customer.mobileNumber) &&
        Objects.equals(this.email, customer.email) &&
        Objects.equals(this.customerStatus, customer.customerStatus) &&
        Objects.equals(this.address, customer.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, firstName, lastName, birthdate, country, countryCode, mobileNumber, email, customerStatus, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    customerStatus: ").append(toIndentedString(customerStatus)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
