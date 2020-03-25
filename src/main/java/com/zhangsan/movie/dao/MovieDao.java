package com.zhangsan.movie.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhangsan.movie.domain.Movie;

@Repository
public interface MovieDao {

	public List<Movie> selectAll();
}
