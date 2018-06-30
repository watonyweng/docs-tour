package me.weitao.spring.docs.controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import me.weitao.spring.docs.dao.TagRepository;
import me.weitao.spring.docs.domain.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tag")
@Api(value = "标签管理", description = "标签管理")
public class TagController {

  @Autowired
  private TagRepository tagRepository;

  @ApiOperation(value = "获取标签列表", notes = "")
  @RequestMapping(value = {""}, method = RequestMethod.GET)
  public List<Tag> getTagList() {
    List<Tag> tags = tagRepository.findAll();
    return tags;
  }

  @ApiOperation(value = "创建标签", notes = "根据Tag对象创建标签")
  @ApiImplicitParam(name = "tag", value = "标签详细实体", required = true, dataType = "Tag")
  @RequestMapping(value = "", method = RequestMethod.POST)
  public String postTag(@RequestBody Tag tag) {
    tagRepository.save(tag);
    return "success";
  }

  @ApiOperation(value = "获取标签信息", notes = "根据Url的Id来获取标签信息")
  @ApiImplicitParam(name = "id", value = "标签Id", required = true, dataType = "Long", paramType = "path")
  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Tag getTag(@PathVariable Long id) {
    return tagRepository.getOne(id);
  }

  @ApiOperation(value = "更新标签信息", notes = "根据url的Id来指定更新对象，并根据传过来的Tag信息来更新标签信息")
  @ApiImplicitParams({
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path"),
    @ApiImplicitParam(name = "tag", value = "标签详细实体tag", required = true, dataType = "Tag")
  })
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public String putTag(@PathVariable Long id, @RequestBody Tag tag) {
    Tag t = tagRepository.getOne(id);
    t.setName(tag.getName());
    t.setMark(tag.getMark());
    return "success";
  }

  @ApiOperation(value = "删除标签", notes = "根据url的id来指定删除对象")
  @ApiImplicitParam(name = "id", value = "标签Id", required = true, dataType = "Long", paramType = "path")
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public String deleteTag(@RequestBody Tag tag) {
    tagRepository.delete(tag);
    return "success";
  }

}
