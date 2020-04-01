package com.zjh.sms.dao.User;

import com.github.pagehelper.PageRowBounds;
import com.zjh.sms.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Description
 * Author: zjh
 * Date2020/3/28 11:08
 **/
@Mapper
public interface AdminMapper {
  /**
   * description: 新增学生账号信息
   * @param user
   * @return void
   * @author zjh
   * @date 2020/3/4 23:05
   */
  void add(User user);

  /**
   * description: 删除学生账号
   *
   * @param ids
   * @return void
   * @author zjh
   * @date 2019/8/29 14:55
   */
  void delete(@Param("ids") List<Integer> ids);

  /**
   * description: 修改学生账号
   *
   * @param user
   * @return void
   * @author zjh
   * @date 2019/8/29 14:55
   */
  void update(User user);

  /**
   * description: 获取学生账号信息列表
   * @param rowBounds
   * @author zjh
   * @return java.util.List<com.zjh.sms.dto.User>
   * @date 2020/3/4 23:05
   */
  List<User> getAdminList(PageRowBounds rowBounds, @Param("condition") Map<String, Object> condition);
  /**
  * description:
  * @param:
  * return:
  * Author: zjh
  * @Date: 2020/3/30 23:43
  */
  User getUserById(@Param("id") String id);
}