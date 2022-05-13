package com.nowon.test.domain.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //연결해주는 객체
public interface BoardRepository extends JpaRepository<Board, Integer>{
	
}
