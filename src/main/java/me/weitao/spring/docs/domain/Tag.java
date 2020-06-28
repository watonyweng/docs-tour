package me.weitao.spring.docs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Watony Weng
 * @date 2020/06/28
 */

@Getter
@Setter
@Entity
public class Tag {

  /**
   * 主键
   */
  @Id
  @GeneratedValue
  private Long id;

  /**
   * 标签名称
   */
  @Column
  private String name;

  /**
   * 标签备注
   */
  @Column(nullable = false)
  private String mark;

}
