package com.springboot.task04;

import com.springboot.task04.entity.User;
import com.springboot.task04.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
class UserShoppingTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void userShoppingMapping() {
        User user = new User();
        user.setUsername("min");
        userRepository.save(user);
    }

}
