package com.bahiazone.bahiazone.admin.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class ResponseDto {

	private String status;
	private String message;
	private Date timestamp = new Date();
	private Object data;


}
