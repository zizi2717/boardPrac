package com.tmp.exer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmp.exer.domain.BoardVO;
import com.tmp.exer.mapper.BoardMapper;
import com.tmp.exer.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> viewAll() {
		return mapper.viewAll();
	}
}
