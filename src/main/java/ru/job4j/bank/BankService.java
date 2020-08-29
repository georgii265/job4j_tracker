package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    /**
     *  поле содержит всех пользователей системы с привязанными к ним счетами.
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * В методе должна быть проверка, что такого пользователя еще нет в системе.
     * Если он есть, то нового добавлять не надо.
     * Это метод должен добавить пользователя в систему.
     * Чтобы добавить пользователя в систему нужно использовать метод Map.put.
     * Этот метод принимает два параметра: пользователя и список счетов.
     * По умолчанию нужно добавить пустой список - new ArrayList<Account>().
     * if (!equals(user)) {
     * users.put(user, new ArrayList<Account>());
     * PutIfAbsent() - все упростилось для вызова одного метода
     * users.putIfAbsent(user, new ArrayList<Account>());
     * @param user
     */
    public void addUser(User user) {
        List<Account> newUser = new ArrayList<>();
        users.putIfAbsent(user, newUser);
    }

    /**
     * Метод должен добавить новый счет к пользователю.
     * Первоначально пользователя нужно найти по паспорту.
     * Для этого нужно использовать метод findByPassport.
     * После этого мы получим список всех счетов пользователя и добавим новый счет к ним.
     * В этом методе должна быть проверка, что такого счета у пользователя еще нет.
     * accounts.add - добавление всех элементов коллекции collection в список в порядке их расположения в collection.
     * get(int index) - возвращает элемент, который расположен в указанной позиции списка.
     * contains(Object o) - проверка наличие объекта в списке, возвращает boolean-значение.
     * contains()- метод чтобы проверить, содержит ли String указанную последовательность символов.
     * @param passport
     * @param account
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) ;
            accounts.add(account);
        }
    }

    /**
     * Это метод ищет пользователя по номеру паспорта.
     * Здесь нужно использовать перебор всех элементов через цикл for-earch и метод Map.keySet.
     * @param passport
     * @return
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Этот метод ищет счет пользователя по реквизитам.
     * Сначала нужно найти пользователя.
     * Потом получить список счетов этого пользователя и в нем найти нужный счет.
     * @param passport
     * @param requisite
     * @return
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод для перечисления денег с одного счёта на другой счёт.
     * Если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят), то метод должен вернуть false.
     * double amount - колличество переводимых денег.
     * @param srcPassport
     * @param srcRequisite
     * @param destPassport
     * @param dеstRequisite
     * @param amount
     * @return
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, dеstRequisite);
        if (srcAccount != null || destAccount != null || amount > srcAccount.getBalance()) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
