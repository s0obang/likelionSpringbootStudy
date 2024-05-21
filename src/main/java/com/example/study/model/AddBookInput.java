package com.example.study.model;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

//컨트롤러에서 데이터 입력받기위한 클래스
//여기서 제약 걸어줄 수 있음. 조건 충족 못할시 컨트롤러로 못넘어가게 함.
//이후 컨트롤러 단에서 밸리데이션 사용 여부 지정 필요
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AddBookInput {
    @NotBlank
    @Size(min=2, max=20, message="책 제목은 최소 2글자 이상 20글자 미만")
    private String bookName;
    @Range(min=100, max=100000, message="책 가격은 최소 100원 이상 100000원 이하")
    private long bookPrice;
    //d에러를 보일수 있게 하기 위해 커스텀 필요->익셉션 패키지 및 핸들러에서
}
