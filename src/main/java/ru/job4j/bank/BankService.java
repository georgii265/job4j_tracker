package ru.job4j.bank;

import java.util.*;


public class BankService {

    /**
     * поле содержит всех пользователей системы с привязанными к ним счетами.
     * Здесь мы создали users, в котором элементы будут храниться в формате “User-List<Account>”.
     * User будет выступать ключом, а List<Account> — значением.
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
     *
     * @param user
     */
    public void addUser(User user) {
        List<Account> newUser = new ArrayList<>(); //проверяем пользователя
        users.putIfAbsent(user, newUser); //если его нет тогда добавляем
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
     *
     * @param passport
     * @param account
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accounts = users.get(user.get());
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Это метод ищет пользователя по номеру паспорта.
     * Здесь нужно использовать перебор всех элементов через цикл for-earch и метод Map.keySet.
     * Set<K> keySet() – Возвращает представление карты в виде множества всех ключей.
     * Из этого представления можно удалять элементы,
     * при этом ключи и соответствующие им значения автоматически удаляются из карты,
     * но добавлять новые элементы нельзя.
     *
     * @param passport
     * @return
     */

    public Optional<User> findByPassport(String passport) {
        Optional<User> rsl = Optional.empty();
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = Optional.of(user);
                break;
            }
        }
        return rsl;
    }

    /**
     * Этот метод ищет счет пользователя по реквизитам.
     * Сначала нужно найти пользователя.
     * Потом получить список счетов этого пользователя и в нем найти нужный счет.
     *
     * @param passport
     * @param requisite
     * @return
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        Optional<Account> rsl = Optional.empty();
        if (user.isPresent()) {
            rsl = users.get(user.get())
                    .stream()
                    .filter(account -> {
                        return account.getRequisite().equals(requisite);
                    })
                    .findFirst();
        }
        return rsl;
    }

    /**
     * Метод для перечисления денег с одного счёта на другой счёт.
     * Если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят), то метод должен вернуть false.
     * double amount - колличество переводимых денег.
     *
     * @param srcPassport
     * @param srcRequisite
     * @param destPassport
     * @param destRequisite
     * @param amount
     * @return
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {

        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isEmpty() && destAccount.isEmpty() && srcAccount.get().getBalance() >= amount) {
            return false;
        }
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            return true;
    }
}

