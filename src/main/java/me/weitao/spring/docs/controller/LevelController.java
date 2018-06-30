package me.weitao.spring.docs.controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import me.weitao.spring.docs.dao.LevelRepository;
import me.weitao.spring.docs.domain.Level;

/**
 * @author Watony Weng
 * @date 2018年6月8日
 * @see org.springframework.web.bind.annotation.RestController
 */

@RestController
@RequestMapping(value = "/level")
@Api(value = "等级管理", description = "等级管理")
public class LevelController {

  @Autowired
  private LevelRepository levelRepository;

  @ApiOperation(value = "获取等级列表", notes = "获取等级列表")
  @RequestMapping(value = {""}, method = RequestMethod.GET)
  public List<Level> getLevelList() {
    return levelRepository.findAll();
  }

  @ApiOperation(value = "创建会员等级", notes = "根据Level对象创建会员等级")
  @ApiImplicitParam(name = "level", value = "标签详细实体", required = true, dataType = "Tag")
  @RequestMapping(value = "", method = RequestMethod.POST)
  public String postTag(@RequestBody Level level) {
    levelRepository.save(level);
    return "success";
  }

  @ApiOperation(value = "获取标签信息", notes = "根据Url的Id来获取标签信息")
  @ApiImplicitParam(name = "id", value = "标签Id", required = true, dataType = "Long", paramType = "path")
  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Level getTag(@PathVariable Long id) {
    return levelRepository.getOne(id);
  }

  @ApiOperation(value = "更新标签信息", notes = "根据url的Id来指定更新对象，并根据传过来的Tag信息来更新标签信息")
  @ApiImplicitParams({
      @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long",
          paramType = "path"),
      @ApiImplicitParam(name = "tag", value = "标签详细实体tag", required = true,
          dataType = "Tag")
  })
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public String putTag(@PathVariable Long id, @RequestBody Level level) {
    Level t = levelRepository.getOne(id);
    t.setName(level.getName());
    t.setMark(level.getMark());
    return "success";
  }

  @ApiOperation(value = "删除标签", notes = "根据url的id来指定删除对象")
  @ApiImplicitParam(name = "id", value = "标签Id", required = true, dataType = "Long", paramType = "path")
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public String deleteTag(@RequestBody Level level) {
    levelRepository.delete(level);
    return "success";
  }

}
