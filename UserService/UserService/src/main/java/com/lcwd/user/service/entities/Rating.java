package com.lcwd.user.service.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String ratingId;
	private Users userId;
	private String holet;
	private int rating;
	private String feedback;

}
