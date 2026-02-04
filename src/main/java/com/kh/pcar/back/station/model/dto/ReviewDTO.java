package com.kh.pcar.back.station.model.dto;

import java.sql.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReviewDTO {
	
	private Long reviewId;
	@NotBlank(message = "리뷰 내용은 비어있을 수 없습니다.")
    @Size(min = 10, max = 50, message = "리뷰 내용은 10글자 이상 50글자 이하만 가능합니다.")
	private String commentContent;
	@NotBlank(message = "추천/비추천 값은 비어있을 수 없습니다.")
    @Pattern(regexp = "Y|N", message = "recommend 값은 Y 또는 N 이어야 합니다.")
	private String recommend;
	@NotBlank(message = "충전소 아이디 값은 비어있을 수 없습니다.")
	private String stationId;
	
	private Long userNo;
	
	private Date createdAt;
	
	private String notRecommend;
	

}
