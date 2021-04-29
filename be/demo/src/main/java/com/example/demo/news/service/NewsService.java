package com.example.demo.news.service;
import java.util.List;
import java.util.Optional;

import com.example.demo.news.domain.News;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public interface NewsService {
    public Document connectUrl(String url) throws Exception;
    public List<News> newsFindAll();
    // public List<HomeNews> homeNewsFindAll();
    public void crawlingHome() throws Exception;
    public void mainCrawler(String category) throws Exception;
    public void daumNews(Elements elements, String category);
    public Optional<News> findByNewsNo(String newsNo);
    public void OptionalInit(String newsNo);
    Long saveAll(News n);
//    public ClickedNews crawlingOne(String newsNo);
    
}
