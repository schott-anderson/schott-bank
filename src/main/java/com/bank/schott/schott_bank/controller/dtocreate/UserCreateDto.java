package com.bank.schott.schott_bank.controller.dtocreate;

import com.bank.schott.schott_bank.model.Account;
import com.bank.schott.schott_bank.model.Card;
import com.bank.schott.schott_bank.model.Feature;
import com.bank.schott.schott_bank.model.News;

import java.util.List;

public class UserCreateDto {

    private String name;

    private Account account;

    private Card card;

    private List<Feature> features;

    private List<News> news;

   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

}
