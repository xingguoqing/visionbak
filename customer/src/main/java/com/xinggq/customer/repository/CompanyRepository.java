package com.xinggq.customer.repository;

import com.xinggq.customer.entity.Company;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author xinggq
 * @date 2019-06-25 16:38
 * @description
 */
@Mapper
@Repository
public interface CompanyRepository {

  List<Company> querybyId(@Param("ids") List<String> ids);

  void add(Company company);

  void updateById(Company company);
}
