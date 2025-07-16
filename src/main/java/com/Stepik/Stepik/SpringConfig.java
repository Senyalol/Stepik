package com.Stepik.Stepik;

import com.Stepik.Stepik.Classes.Bank.BankCore;
import com.Stepik.Stepik.Classes.Bank.TransactionDeposit;
import com.Stepik.Stepik.Classes.Bank.TransactionWithdraw;
import com.Stepik.Stepik.Classes.CLI.AccountBasicCLI;
import com.Stepik.Stepik.Classes.CLI.MyCLI;
import com.Stepik.Stepik.Classes.CLI.TransactionDepositCLI;
import com.Stepik.Stepik.Classes.CLI.TransactionWithdrawCLI;
import com.Stepik.Stepik.Classes.MemoryAccountDAO;
import com.Stepik.Stepik.Classes.MemoryTransactionDAO;
import com.Stepik.Stepik.Classes.Services.AccountCreationServiceImpl;
import com.Stepik.Stepik.Classes.Services.AccountDepositServiceImpl;
import com.Stepik.Stepik.Classes.Services.AccountListingServiceImpl;
import com.Stepik.Stepik.Classes.Services.AccountWithdrawServiceImpl;
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
        return new AccountListingServiceImpl(memoryAccountDAO());
    }

    @Bean
    AccountBasicCLI accountBasicCLI() {
        return new AccountBasicCLI(myCLI(),bankCore(),accountListingService());
    }

    @Bean
    MemoryTransactionDAO memoryTransactionDAO() {
        return new MemoryTransactionDAO();
    }

    @Bean
    TransactionDepositCLI transactionDepositCLI() {
        return new TransactionDepositCLI(transactionDeposit(),myCLI(),accountListingService());
    }

    @Bean
    TransactionWithdrawCLI transactionWithdrawCLI() {
        return new TransactionWithdrawCLI(transactionWithdraw(),myCLI(),accountListingService());
    }

    @Bean
    TransactionWithdraw transactionWithdraw(){
        return new TransactionWithdraw(accountWithdrawService(),memoryTransactionDAO());
    }

    @Bean
    AccountWithdrawServiceImpl accountWithdrawService(){
        return new AccountWithdrawServiceImpl(memoryAccountDAO());
    }

    @Bean
    TransactionDeposit transactionDeposit(){
        return new TransactionDeposit(accountDepositService(),memoryTransactionDAO());
    }

    @Bean
    AccountDepositServiceImpl accountDepositService() {
        return new AccountDepositServiceImpl(memoryAccountDAO());
    }

}
