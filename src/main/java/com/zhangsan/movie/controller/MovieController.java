package com.zhangsan.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhangsan.movie.domain.Movie;
import com.zhangsan.movie.service.MovieService;

@Controller
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@RequestMapping("list")
	public String selectAll(Model model) {
		List<Movie> list = movieService.selectAll();
		model.addAttribute("movieList", list);
		return "list";
	}
}
