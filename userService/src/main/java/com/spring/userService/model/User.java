package com.spring.userService.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "Users")
public class User {

	@Id
	private String id;
	private String name;
	private String email;
	private String city;
	private List<Rating> ratings;

}
