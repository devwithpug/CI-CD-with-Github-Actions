package study.cicd.cicdwithgithubactions.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public boolean isBothEquals(Object A, Object B) {
        return A.equals(B);
    }

}
