package com.Stepik.Stepik.Classes.CLI;

import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountType;
import com.Stepik.Stepik.Interfaces.CLIUI;

import java.util.Arrays;
import java.util.Scanner;

public class MyCLI implements CLIUI {

    private Scanner scanner;

    public MyCLI() {
        this.scanner = new Scanner(System.in);
    }

    MyCLI(Scanner scanner) {
        this.scanner = scanner;
    }

    //Геттер сканера
    public Scanner getScanner() {
        return scanner;
    }

    //Ввести сумму баланса для клиента
    public double requestClientAmount(){

        System.out.println("Enter client amount: ");
        return scanner.nextDouble();

    }

    //Ввести id клиента
    public String requestClientAccountNumber(){

        System.out.println("Please enter client account number: ");
        return scanner.next();

    }

    //Запросить пользователя ввести с клавиатуры тип аккаунта , в данном случае выбрать из существующих
    @Override
    public AccountType requestAccountType() {

        System.out.println("Choose account type");
        System.out.println(Arrays.toString(AccountType.values()));

        String certainAccountType = scanner.next();
        AccountType certainAT = AccountType.valueOf(certainAccountType);

        if(certainAccountType != null){

            return certainAT;

        }

        return null;

    }

}
