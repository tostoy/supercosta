package com.nobrain.supercosta.biz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nobrain.supercosta.dto.user.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long>{

}
