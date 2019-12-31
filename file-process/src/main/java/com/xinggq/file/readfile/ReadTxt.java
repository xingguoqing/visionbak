package com.xinggq.file.readfile;

import com.xinggq.file.dto.FileReadDto;
import com.xinggq.file.utils.ImageFilePaser;
import com.xinggq.file.utils.ReadTxtUtils;
import java.io.*;
import org.apache.commons.codec.binary.Base64;
import org.springframework.util.ResourceUtils;

/**
 * @author xinggq
 * @date 2019-12-04 16:15
 * @description 读取文本文件
 */
public class ReadTxt {

  public static void main(String[] args) throws Exception {
    File file = ResourceUtils.getFile("classpath:bereading.txt");
    FileReadDto fileReadDto = ReadTxtUtils.readToDto(file, FileReadDto.class);
    byte[] decodeBase64 = Base64.decodeBase64(fileReadDto.getDatas());
    ImageFilePaser.byteToImage(decodeBase64,"fapiao.pdf");
    System.out.println();
  }







}
