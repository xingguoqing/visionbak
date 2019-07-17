package com.xinggq.pattern.command.secondemo.command;

import com.xinggq.pattern.command.secondemo.reciver.OperationApi;

/**
 * @author xinggq
 * @date 2019-07-12 10:55
 * @description
 */
public class AddCommand implements Command {

  private OperationApi operationApi;

  /**
   * 操作的数据，也就是要加上的数据
   */
  private int opeNum;

  public AddCommand(OperationApi operationApi, int opeNum) {
    this.opeNum = opeNum;
    this.operationApi = operationApi;
  }

  @Override
  public void execute() {
    operationApi.add(opeNum);
  }

  @Override
  public void undo() {
    operationApi.substract(opeNum);
  }
}
