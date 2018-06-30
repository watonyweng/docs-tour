package me.weitao.spring.docs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import me.weitao.spring.docs.domain.Tag;

/**
 * @author Watony Weng
 * @date 2018年6月8日
 * @see org.springframework.data.jpa.repository.JpaRepository
 */

public interface TagRepository extends JpaRepository<Tag, Long> {

}
