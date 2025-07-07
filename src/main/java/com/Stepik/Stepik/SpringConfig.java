package com.Stepik.Stepik;

import com.Stepik.Stepik.Classes.Bank.BankCore;
import com.Stepik.Stepik.Classes.CLI.AccountBasicCLI;
import com.Stepik.Stepik.Classes.CLI.MyCLI;
import com.Stepik.Stepik.Classes.MemoryAccountDAO;
import com.Stepik.Stepik.Classes.Services.AccountCreationServiceImpl;
import com.Stepik.Stepik.Classes.Services.AccountListingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Класс в котором определены бины
@Configuration
public class SpringConfig {

    @Bean
    MyCLI myCLI() {
        return new MyCLI();
    }

    @Bean
    MemoryAccountDAO memoryAccountDAO() {
        return new MemoryAccountDAO();
    }

    @Bean
    AccountCreationServiceImpl accountCreationService() {
        return new AccountCreationServiceImpl(memoryAccountDAO());
    }

    @Bean
    BankCore bankCore() {
        return new BankCore(accountCreationService());
    }

    @Bean
    AccountListingServiceImpl accountListingService() {
        return new AccountListingServiceImpl();
    }

    @Bean
    AccountBasicCLI accountBasicCLI() {
        return new AccountBasicCLI(myCLI(),bankCore(),accountListingService());
    }

}
