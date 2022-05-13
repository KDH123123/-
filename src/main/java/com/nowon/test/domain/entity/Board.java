package com.nowon.test.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString//안하면 객체로 나옴
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity// db하고 연결해주는 엔터티 클래스
public class Board {
	
	@Id// pk
	private int no;
	@Column(nullable = false)// not null
	private String subject;
	@Column(columnDefinition = "not null")// 위에거랑 의미는 일치
	private String content;
	@Column(nullable = false)
	private String writer;
	@Column
	private int readCount;
	@Column(nullable = false)
	private LocalDateTime createdDate;
	
}
