package io.seomoon.SbbBoard;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;



}
