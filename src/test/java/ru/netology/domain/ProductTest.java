package ru.netology.domain;

import org.junit.jupiter.api.Test;

public class ProductTest {
    Product item1 = new Product(1,"AAA", 40);

    @Test
    public void test() {
        Product repo = new Product();
        repo.save(item1);
    }
}
