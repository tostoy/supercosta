package com.nobrain.supercosta.dto.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.nobrain.supercosta.dto.Auditable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user_profile")
@NoArgsConstructor
@ToString(callSuper = true)
public class UserProfile extends Auditable<Long> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter
	private Long id;

	@Column
	@Getter
	@Setter
	private Long userId;

	@Column
	@Getter
	@Setter
	private String firstName;

	@Column
	@Getter
	@Setter
	private String lastName;

}
