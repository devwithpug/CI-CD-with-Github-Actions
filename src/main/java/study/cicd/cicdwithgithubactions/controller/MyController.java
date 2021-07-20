package study.cicd.cicdwithgithubactions.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class MyController {

    private final Environment env;
    private final BuildProperties buildProperties;

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.status(HttpStatus.OK).body(env.getProperty("hello.message")+ " : " +buildProperties.getVersion());
    }

}
