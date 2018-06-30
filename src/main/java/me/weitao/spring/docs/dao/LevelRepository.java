package me.weitao.spring.docs.dao;

import me.weitao.spring.docs.domain.Level;
import me.weitao.spring.docs.domain.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author Watony Weng
 * @date 2018年6月8日
 * @see org.springframework.data.jpa.repository.JpaRepository
 */

public interface LevelRepository extends JpaRepository<Level, Long> {

}
