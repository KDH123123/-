package com.nowon.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.options;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nowon.test.domain.entity.Board;
import com.nowon.test.domain.entity.BoardRepository;

@SpringBootTest
class SpringTest03ApplicationTests {

	@Autowired // 필드 injection
	private BoardRepository repository;

	//@Test
	void 데이터베이스연결_테스트입니다() {
		Board entity = new Board(102, "제목", "내용", "작성자", 0, LocalDateTime.now());
		repository.save(entity);
		//JPA: 자동으로 쿼리를 생성 시켜줌. save: insert query를 생성
	}
	
	//@Test
	void 읽기테스트(){
	List<Board> result = repository.findAll();
	
	for(Board b :result) {
		System.out.println(b);
	}
}
	@Test
	void 한개만읽어오기() {
		Optional<Board> result=repository.findById(101);
		System.out.println(result.get());
	}
}
