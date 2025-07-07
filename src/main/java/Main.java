import com.Stepik.Stepik.Classes.Bank.BankCore;
import com.Stepik.Stepik.Classes.CLI.AccountBasicCLI;
import com.Stepik.Stepik.Classes.CLI.MyCLI;
import com.Stepik.Stepik.Classes.MemoryAccountDAO;
import com.Stepik.Stepik.Classes.Services.AccountCreationServiceImpl;
import com.Stepik.Stepik.Classes.Services.AccountListingServiceImpl;
import com.Stepik.Stepik.Interfaces.AccountCreationService;
import com.Stepik.Stepik.Interfaces.AccountDAO;
import com.Stepik.Stepik.Interfaces.AccountListingService;
import com.Stepik.Stepik.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {

    private static final String help =
            "Welcome to CLI bank service" +
            "Enter operationNumber:" +
                    "1 - show accounts" +
                    "2 - create account" +
                    "3 - deposit" +
                    "4 - withdraw" +
                    "5 - transfer" +
                    "6 - this message" +
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

        while(scanner.hasNext()){
            switch (scanner.next()){
                case "1": accountBasicCLI.getAccounts(clientId);
                case "2": accountBasicCLI.createAccountRequest(clientId);
                case "6" : System.out.println(help);
                case "7": System.exit(0);
            }
        }

        context.close();

    }

}
