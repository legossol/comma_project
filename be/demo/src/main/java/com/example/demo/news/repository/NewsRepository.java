package com.example.demo.news.repository;
import com.example.demo.news.domain.News;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<News, Long>{
    public News findByNewsNo(String newsNo);
    
}
