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
import com.Stepik.Stepik.Interfaces.*;
import com.Stepik.Stepik.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {

    private static final String help =
            "Welcome to CLI bank service" +
            "Enter operationNumber:" + "\n" +
                    "1 - show accounts" + "\n" +
                    "2 - create account" + "\n" +
                    "3 - deposit" + "\n" +
                    "4 - withdraw" + "\n" +
                    "5 - transfer" + "\n" +
                    "6 - this message" + "\n" +
                    "7 - exit";

    public static void main(String[] args) {

        //Создаем контекст для Ioc
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MyCLI myCLI = context.getBean(MyCLI.class);
        Scanner scanner = myCLI.getScanner();
        String clientId = myCLI.requestClientAccountNumber();
        System.out.println(help);

        AccountDAO memoryAccountDAO = context.getBean("memoryAccountDAO",MemoryAccountDAO.class);
        AccountCreationService accountCreationService = context.getBean("accountCreationService", AccountCreationServiceImpl.class);
        BankCore bank = context.getBean("bankCore", BankCore.class);
        AccountListingService accountListingService = context.getBean("accountListingService", AccountListingServiceImpl.class);
        AccountBasicCLI accountBasicCLI = context.getBean("accountBasicCLI", AccountBasicCLI.class);

        TransactionDAO memoryTransactionDAO = context.getBean("memoryTransactionDAO", MemoryTransactionDAO.class);
        AccountDepositService accountDepositService = context.getBean("accountDepositService", AccountDepositServiceImpl.class);
        AccountWithdrawService accountWithdrawService = context.getBean("accountWithdrawService", AccountWithdrawServiceImpl.class);
        TransactionDeposit transactionDeposit = context.getBean("transactionDeposit", TransactionDeposit.class);
        TransactionWithdraw transactionWithdraw = context.getBean("transactionWithdraw", TransactionWithdraw.class);
        TransactionDepositCLI transactionDepositCLI = context.getBean("transactionDepositCLI", TransactionDepositCLI.class);
        TransactionWithdrawCLI transactionWithdrawCLI = context.getBean("transactionWithdrawCLI", TransactionWithdrawCLI.class);



        while(scanner.hasNext()){
            switch (scanner.next()){
                case "1" -> accountBasicCLI.getAccounts(clientId);

                case "2" -> accountBasicCLI.createAccountRequest(clientId);

                case "3" -> transactionDepositCLI.depositMoney(clientId);

                case "4" -> transactionWithdrawCLI.withdrawMoney(clientId);

                case "5" -> memoryTransactionDAO.getTransactions();

                case "6" -> System.out.println(help);

                case "7" ->  System.exit(0);
            }
        }

        context.close();

    }

}
