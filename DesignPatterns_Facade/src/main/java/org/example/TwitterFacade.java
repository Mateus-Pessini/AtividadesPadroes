package org.example;

public class TwitterFacade {
    private TwitterApi twitterAPI;

    public TwitterFacade() {
        this.twitterAPI = new TwitterApi();
    }

    public String getRecentTweets() {
        // Etapas simplificadas usando o Facade
        String requestToken = twitterAPI.getRequestToken();
        String accessToken = twitterAPI.getAccessToken(requestToken);
        String recentTweets = twitterAPI.getRecentTweets(accessToken);
        return recentTweets;
    }
}
