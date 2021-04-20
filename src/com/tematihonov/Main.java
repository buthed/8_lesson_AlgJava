package com.tematihonov;

import java.util.Random;

public class Main {
//    Task 1
//    Пример использование хеш-таблиц:  хэширование паролей при регистрации
//    Task 2
//    Примеры ключей и коллизий: ключ - наименование товара в магазине, коллизия - одна цена у товара.
//    Task 3
//    Примеры популярных и эффективных хеш-функций: Метод деления, Аддитивный метод, Метод середины квадрата, Метод открытой адресации с линейным опробыванием.
    public static void main(String[] args) {
            int size = 50;

            //Task 4
            HashTable hashTable = new HashTable(size);
            for (int i = 0; i < 20; i++) {
                hashTable.insert(new Item(new Random().nextInt(100)+1));
            }
            hashTable.display();


            //Task 5
            SecondHashTable hashTable2 = new SecondHashTable(size);
            for (int i = 0; i < 20; i++) {
                hashTable.insert(new Item(new Random().nextInt(100)+1));
            }
            hashTable.display();
    }
}
