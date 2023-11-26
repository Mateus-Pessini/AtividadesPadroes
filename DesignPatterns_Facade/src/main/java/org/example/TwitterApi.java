package org.example;

public class TwitterApi {
    public String getRequestToken() {
        return "Token de Solicitação";
    }

    public String getAccessToken(String requestToken) {
        return "Token de Acesso";
    }

    public String getRecentTweets(String accessToken) {
        return "A prof Ju é a melhor e vai fazer o melhor discurso para a gente";
    }
}
