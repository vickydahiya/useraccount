package com.sclabs.useraccount.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends CrudRepository<UserProfile, Long> {
    UserProfile findByUserInfo(Long userId);
}
