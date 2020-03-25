package com.zhangsan.movie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangsan.movie.dao.MovieDao;
import com.zhangsan.movie.domain.Movie;
import com.zhangsan.movie.service.MovieService;
@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao movieDao;

	@Override
	public List<Movie> selectAll() {
		// TODO Auto-generated method stub
		return movieDao.selectAll();
	}
	
}
