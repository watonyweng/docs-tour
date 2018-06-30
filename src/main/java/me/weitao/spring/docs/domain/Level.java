package me.weitao.spring.docs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Level {

  /**
   * 主键
   */
  @Id
  @GeneratedValue
  private Long id;

  /**
   * 等级名称
   */
  @Column
  private String name;

  /**
   * 等级备注
   */
  @Column(nullable = false)
  private String mark;

}
