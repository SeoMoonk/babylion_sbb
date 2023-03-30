package io.seomoon.SbbBoard;

import io.seomoon.SbbBoard.question.QuestionRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QuestionRepositoryTest {

    @Autowired
    QuestionRepository questionRepository;

    @Test
    @DisplayName("퀘스트 리포지터리 테스트 1")
    void t001() {

        System.out.println("Hello Worlds");

    }

}
