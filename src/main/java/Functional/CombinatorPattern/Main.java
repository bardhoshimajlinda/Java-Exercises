package Functional.CombinatorPattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "ALice",
                "alice@gmail.com",
                "+0857575757",
                LocalDate.of(2000,1,1)
        );

//        CustomerValidatorService validatorService = new CustomerValidatorService();
//        validatorService.isValid(customer);

        System.out.println(new CustomerValidatorService().isValid(customer));
        //if valid we can store customer in DB

        // Using combinator pattern
        CustomerRegistrationValidator.ValidationResult result = CustomerRegistrationValidator
                .isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .and(CustomerRegistrationValidator.isAdult())
                .apply(customer);

        System.out.println(result);

        if (result != CustomerRegistrationValidator.ValidationResult.SUCCESS) {
            throw new IllegalMonitorStateException(result.name());
        }
    }
}

