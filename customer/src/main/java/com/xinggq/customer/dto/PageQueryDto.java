package com.xinggq.customer.dto;

import com.xinggq.annotation.CheckPageNum;
import com.xinggq.annotation.CheckPageSize;
import lombok.Getter;
import lombok.Setter;

/**
 * @author xinggq
 * @date 2019-06-26 11:29
 * @description
 */
@Setter
@Getter
public class PageQueryDto {

  @CheckPageSize
  private Integer pageSize;

  @CheckPageNum
  private Integer pageNum;

}
