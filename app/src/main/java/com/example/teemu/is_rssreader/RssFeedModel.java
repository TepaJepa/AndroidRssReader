package com.example.teemu.is_rssreader;

/**
 * Created by Teemu on 09/10/2017.
 */

class RssFeedModel {

    public String title;
    public String link;
    public String description;

    public RssFeedModel(String title, String link, String description) {
        this.title = title;
        this.link = link;
        this.description = description;
    }
}
