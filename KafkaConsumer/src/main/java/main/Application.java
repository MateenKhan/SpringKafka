package main;

import com.fasterxml.jackson.databind.ObjectMapper;
import main.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
//        String str = "{\n" +
//                "  \"number\": \"a1\",\n" +
//                "  \"firstName\": \"aa\",\n" +
//                "  \"lastName\": \"ss\",\n" +
//                "  \"birthdate\": \"2019-11-18\",\n" +
//                "  \"country\": \"IND\",\n" +
//                "  \"countryCode\": \"IN\",\n" +
//                "  \"mobileNumber\": \"1324567890\",\n" +
//                "  \"email\": \"user@example.com\",\n" +
//                "  \"customerStatus\": \"R\",\n" +
//                "  \"address\": {\n" +
//                "    \"addressLine1\": \"asdf2\",\n" +
//                "    \"addressLine2\": \"asdf1\",\n" +
//                "    \"street\": \"asdf1\",\n" +
//                "    \"postalCode\": 12345\n" +
//                "  }\n" +
//                "}";
//        System.out.println(str);
//        try{
//            Customer customer = new ObjectMapper().readValue(str, Customer.class);
//            System.out.println(customer);
//        } catch (Exception e){e.printStackTrace();}

    }
}