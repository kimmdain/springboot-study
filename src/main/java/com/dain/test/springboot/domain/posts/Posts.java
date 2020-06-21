package com.dain.test.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter // lombok의 어노테이션 / 클래스 내 모든 필드의 Getter 메소드를 자동생성
@NoArgsConstructor // lombok의 어노테이션 / 기본 생성자 자동 추가
@Entity // JPA의 어노테이션 / 테이블과 링크될 클래스임을 나타냄
public class Posts { // 실제 DB의 테이블과 매칭될 클래스

    @Id // 해당 테이블의 PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK의 생성 규칙, auto_increment 하기 위해
    private Long id;

    @Column(length = 500, nullable = false) // 테이블의 칼럼. 기본값 외의 추가로 변경이 필요한 옵션이 있으면 사용, ex)varchar는 255가 기본인데 500으로 늘리고 싶을때
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder // 해당 클래스의 빌더 패턴 클래스를 생성 / 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
