package com.xinggq.pattern.command.secondemo.command;

import com.xinggq.pattern.command.secondemo.reciver.OperationApi;

/**
 * @author xinggq
 * @date 2019-07-12 10:57
 * @description
 */
public class SubstractCommand implements Command {

  private OperationApi operationApi;

  /**
   * 操作的数据，也就是要减去的数据
   */
  private int opeNum;

  public SubstractCommand(OperationApi operationApi, int opeNum) {
    this.opeNum = opeNum;
    this.operationApi = operationApi;
  }

  @Override
  public void execute() {
    operationApi.substract(opeNum);
  }

  @Override
  public void undo() {
    operationApi.add(opeNum);
  }
}
