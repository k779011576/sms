package com.zjh.sms.dto;

import com.alibaba.fastjson.JSONArray;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description
 * Author: zjh
 * Date2020/4/7 13:57
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Timetable {
  /**
   * id
   */
  private Integer id;
  /**
   * week id
   */
  private Integer weekId;
  /**
   * 专业
   */
  private String profession;
  /**
   * 班级
   */
  private String grade;
}