package com.theironyard;

/**
 * Created by jenniferchang on 8/1/16.
 */
public class Game {
    String username;
    int ranking;
    int timestamp;
    float score;
    float highScore;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username == "") {
            System.err.println("No username");
        } else {
            this.username = username;
        }
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        if (timestamp < 000000 || timestamp > 235959) {
            System.err.println("Not a valid time");
        } else {
            this.timestamp = timestamp;
        }
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public float getHighScore() {
        return highScore;
    }

    public void setHighScore(float highScore) {
        this.highScore = highScore;
    }

}
