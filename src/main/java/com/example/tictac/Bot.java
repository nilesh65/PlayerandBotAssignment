package com.example.tictac;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "player_id")
public class Bot extends Player{
    private int renk;
}
