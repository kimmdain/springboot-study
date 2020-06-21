package com.dain.test.springboot.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {
    @Test
    public void 롬복_기능_테스트() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name); // assertj라는 테스트 검증 라이브러리의 검증 메소드
        assertThat(dto.getAmount()).isEqualTo(amount);

        // isEqualsTo : assertj의 동등 비교 메소드
        // assertThat : assertThat에 있는 값과 isEqualsTo의 값을 비교해서 같을 때만 성공
    }
}
