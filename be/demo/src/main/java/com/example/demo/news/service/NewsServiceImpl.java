package com.example.demo.news.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.amazonaws.services.rds.model.Option;
import com.example.demo.cbs.domain.Board;
import com.example.demo.cmm.service.AbstractService;
import com.example.demo.news.domain.News;
import com.example.demo.news.repository.NewsRepository;
import com.example.demo.uss.domain.User;
import com.querydsl.core.types.Template.Element;

import lombok.extern.java.Log;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class NewsServiceImpl extends AbstractService<News> implements NewsService {
    private final NewsRepository repo;
    
    
    
    @Override
    public Document connectUrl(String url) throws IOException{
        
        return Jsoup
        .connect(url)
        .method(Connection.Method.GET)
        .userAgent("Mozilla/5.0 (X11; Linux x86_64; rv:10.0) " +
        "Gecko/20100101 Firefox/10.0 " +
        "AppleWebKit/537.36 (KHTML, like Gecko) " +
        "Chrome/51.0.2704.106 Safari/537.36")
        .execute()
        .parse();
    }


    @Override
    public List<News> newsFindAll() {
        // TODO Auto-generated method stub
        return null;
    }

    // @Override
    // public List<HomeNews> homeNewsFindAll() {
    //     // TODO Auto-generated method stub
    //     return null;
    // }

    @Override
    public void crawlingHome() throws Exception {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mainCrawler(String category) throws Exception {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void daumNews(Elements elements, String category) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Optional<News> findOne() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteById(long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public User checkLogin(News entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Board createBoard(News entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Board findBycno(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Long save(News news) {
        // TODO Auto-generated method stub
        
        //스크래핑이 발생함
        return (repo.save(news) != null) ? 1L : 0L ;
        
    }
    public Long saveAll(String category) throws IOException{
        Document document = connectUrl("https://news.daum.net/" + category);
        repo.deleteAll();
        News news = null;
        Elements elements = document.select("div.item_mainnews>div.cont_thumb>strong.tit_thumb>a");
        int count = 0;

    for (int i = 0; i < elements.size(); i++) {
            news = new News();
            news.setTitle(elements.get(i).text());
            news.setAddress(elements.get(i).attr("href"));
            news.setCategory(category);
            count++;
            System.out.println("********news 정보 : " +news.toString());
            
            // homeNewsRepo.save(homeNews);
        }
        System.out.println("********크롤링 카운팅 : " +count);

        return 0L;
    }
    

    @Override
    public Optional<News> findById(long id) {
        // TODO Auto-generated method stub
        return repo.findById(id);
    }

    @Override
    public List<News> findAll() {
        // TODO Auto-generated method stub
        return repo.findAll();
    }

    @Override
    public Long count() {
        // TODO Auto-generated method stub
        return repo.count();
    }

    @Override
    public Optional<News> getOne(long id) {
        
        return Optional.of(repo.getOne(id));
    }

    @Override
    public Long delete(News news) {
        repo.delete(news);
        return (findById(news.getNewsId()).orElse(null) == null) ? 1L : 0L;
    

    }
    //p592
    @Override
    public Boolean existsById(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<News> findByNewsNo(String newsNo) {
        Optional.ofNullable(repo.findByNewsNo(newsNo)).ifPresent(System.out::println); //p592
        return Optional.ofNullable(repo.findByNewsNo(newsNo));
    }

    @Override
    public void OptionalInit(String newsNo) {
        Optional<String> optVal = Optional.empty();//optional initializer
        
    }


    @Override
    public Long saveAll(News n) {
        // TODO Auto-generated method stub
        return null;
    }
    
    
}
