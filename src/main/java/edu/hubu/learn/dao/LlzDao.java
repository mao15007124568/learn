package edu.hubu.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hubu.learn.entity.Llz;
public interface LlzDao extends JpaRepository<Llz, Long> {
    
}