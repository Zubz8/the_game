package com.example.thegame

import Choice

class Game {
    fun theGame(player: Choice): Status {
        val list = listOf(Choice.paper, Choice.rock, Choice.scissors)
        val computerChoice = list.random()

        if (player == Choice.paper) {
            return if (computerChoice == Choice.paper) {
                Status.Tie
            } else if (computerChoice == Choice.scissors) {
                Status.Lose
            } else {
                Status.Win
            }
        } else if (player == Choice.rock) {
            return if (computerChoice == Choice.paper) {
                Status.Lose
            } else if (computerChoice == Choice.scissors) {
                Status.Win
            } else {
                Status.Tie
            }
        } else {
            return if (computerChoice == Choice.paper) {
                Status.Tie
            } else if (computerChoice == Choice.scissors) {
                Status.Lose
            } else {
                Status.Win
            }
        }
    }
}