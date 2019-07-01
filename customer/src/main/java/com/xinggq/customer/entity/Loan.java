package com.xinggq.customer.entity;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Loan {

  private String id;
  private String type;
  private long amount;
  private String customerId;


}
