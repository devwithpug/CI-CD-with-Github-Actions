package study.cicd.cicdwithgithubactions.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyServiceTest {

    @Autowired
    private MyService myService;

    @Test
    void isBothEquals() {
        boolean result = myService.isBothEquals("A", "A");
        Assertions.assertThat(result).isTrue();
    }


}