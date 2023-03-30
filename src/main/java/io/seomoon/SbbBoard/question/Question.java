package io.seomoon.SbbBoard.question;

import io.seomoon.SbbBoard.Answer.Answer;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@Entity
public class Question {

    @Id     //Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //AUTO_INCREMENT
    private Integer id;

    @Column(length = 200)
    private String subject;     //String -> VARCHAR(200)

    @Column(columnDefinition = "TEXT")
    private String content;    //String -> VARCHAR(255) -> TEXT

    //@Column (안붙여도 자동으로 컬럼이 됨. 위에는 조건을 붙이기 위해 사용한 것)
    private LocalDateTime createDate;       //createDate -> create_date

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;

}
