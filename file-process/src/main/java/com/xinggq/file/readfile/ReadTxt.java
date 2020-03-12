package com.xinggq.file.readfile;

import com.xinggq.file.dto.FileReadDto;
import com.xinggq.file.utils.F;
import com.xinggq.file.utils.FileTypeUtil;
import com.xinggq.file.utils.ImageFilePaser;
import com.xinggq.file.utils.ReadTxtUtils;
import java.io.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.util.ResourceUtils;

/**
 * @author xinggq
 * @date 2019-12-04 16:15
 * @description 读取文本文件
 */
public class ReadTxt {

//  public static void main(String[] args) throws Exception {
//    File file = ResourceUtils.getFile("classpath:a.txt");
//    FileReadDto fileReadDto = ReadTxtUtils.readToDto(file, FileReadDto.class);
//    byte[] decodeBase64 = Base64.decodeBase64(fileReadDto.getDatas());
//    ImageFilePaser.byteToImage(decodeBase64,"fapiao.jpg");
//    System.out.println();
//  }


//  public static void main(String[] args) throws Exception {
//    File file = ResourceUtils.getFile("classpath:a.txt");
//    String fileReadDto = ReadTxtUtils.readToString(file);
//    byte[] decodeBase64 = Base64.decodeBase64(fileReadDto);
//    ImageFilePaser.byteToImage(decodeBase64,"fapiao.jpg");
//    System.out.println();
//  }


  public static void main(String[] args) throws FileNotFoundException {
    File file = ResourceUtils.getFile("classpath:download.jpg");
    byte[] bytes = ImageFilePaser.imageToBytes(file);
    System.out.println(F.ispdf(bytes));
  }






}
