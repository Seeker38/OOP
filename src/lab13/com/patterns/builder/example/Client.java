package com.patterns.builder.example;

public class Client {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount
                .BankAccountBuilder("OOPBank", "0123456789")
                .withEmail("contact@oopbank.com")
                .wantNewsletter(true)
                .build();
        System.out.println(newAccount);
    }
}
