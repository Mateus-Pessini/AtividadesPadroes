package org.example;

public class Main {
    public static void main(String[] args) {
        TwitterFacade twitterFacade = new TwitterFacade();
        String recentTweets = twitterFacade.getRecentTweets();

        System.out.println("Tweets Recentes: " + recentTweets);
    }
}