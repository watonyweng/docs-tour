package me.weitao.spring.docs.controller;

import io.swagger.annotations.Api;
import java.util.List;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import me.weitao.spring.docs.dao.MemberRepository;
import me.weitao.spring.docs.dao.UserRepository;
import me.weitao.spring.docs.domain.Member;
import me.weitao.spring.docs.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/member")
@Api(value = "会员管理", description = "会员管理")
public class MemberController {

  @Autowired
  private MemberRepository memberRepository;

  @ApiOperation(value = "获取用户列表", notes = "")
  @RequestMapping(value = {""}, method = RequestMethod.GET)
  public List<Member> getUserList() {
    return memberRepository.findAll();
  }

  @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
  @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
  @RequestMapping(value = "", method = RequestMethod.POST)
  public String postUser(@RequestBody Member member) {
    memberRepository.save(member);
    return "success";
  }

  @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
  @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path")
  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Member getUser(@PathVariable Long id) {
    return memberRepository.getOne(id);
  }

  @ApiOperation(value = "更新用户详细信息", notes = "根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
  @ApiImplicitParams({
      @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path"),
      @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
  })
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public String putUser(@PathVariable Long id, @RequestBody User user) {
    Member u = memberRepository.getOne(id);
    u.setAccount(u.getAccount());
    u.setPassword(u.getPassword());
    return "success";
  }

  @ApiOperation(value = "删除用户", notes = "根据url的id来指定删除对象")
  @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path")
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public String deleteUser(@RequestBody Member member) {
    memberRepository.delete(member);
    return "success";
  }

}
