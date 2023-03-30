package io.seomoon.SbbBoard.question;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface QuestionRepository extends JpaRepository<Question, Integer> {



}
