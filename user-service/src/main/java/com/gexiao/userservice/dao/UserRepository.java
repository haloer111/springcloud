package com.gexiao.userservice.dao;

import com.gexiao.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author gexiao
 * @date 2019/1/30 11:08
 */
@Repository
public interface UserRepository  extends JpaRepository<User,Long> {

}
