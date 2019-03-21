package com.example.experiment2.repository;

import com.example.experiment2.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void addUserTest() {
        User user = userRepository.addUser(new User("zk"));
        log.debug("{}", user.getInsertTime());
    }
}
