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
public class Member {

  /**
   * 主键
   */
  @Id
  @GeneratedValue
  private Long id;

  /**
   * 账号
   */
  @Column
  private String account;

  /**
   * 密码
   */
  @Column
  private String password;

}
