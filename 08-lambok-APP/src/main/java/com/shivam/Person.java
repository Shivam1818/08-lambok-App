package com.shivam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

	private Integer personId;
	private String name;
	private String gender;
	private Long phoneNo;
	
}
