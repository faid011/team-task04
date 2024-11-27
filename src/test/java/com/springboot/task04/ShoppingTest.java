package com.springboot.task04;

import com.springboot.task04.entity.Price;
import com.springboot.task04.repository.PriceRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
public class ShoppingTest {

    @Autowired
    private PriceRepository priceRepository;


    @Test
    public void testShoppingMapping(){

        Price price = new Price();
        price.setAmount(30000);
        priceRepository.save(price);
    }

}
