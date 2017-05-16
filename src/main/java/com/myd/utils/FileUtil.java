package com.myd.utils;

import com.myd.config.Configure;
import com.myd.web.enums.FileType;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * Created by zhugp on 2017/3/29.
 */
public class FileUtil {

    private static Configure configure = new Configure();

    private static Properties p = configure.getProperties();


    public static String modifyFileName(MultipartFile file, FileType fileType, String ptId, String batchNum) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        //获得文件名
        String fileName = file.getOriginalFilename();
        //获得文件后缀
        String suffix = fileName.substring(fileName.indexOf("."), fileName.length());
        //修改文件名
        String time = simpleDateFormat.format(new Date());
        fileName =  time + suffix;
        //获取本地配置文件中的保存地址
        String savePath = "";
        switch (fileType) {
            //拼接保存地址 E:/carImg/seriase/2/batchNum/fileName
            case IMGFILE:
                savePath = p.getProperty("saveImgPath");
                savePath = savePath + ptId + "/2" + "/" + batchNum + "/" + fileName;
                break;
            //拼接保存地址 E:/carVideo/seriase/2/batchNum/fileName
            case VIDEOFILE:
                savePath = p.getProperty("saveVideoPath");
                savePath = savePath + ptId + "/2" + "/" + fileName;
                break;
            case RECORDFILE:
                fileName = time.substring(8) + suffix;
                savePath = p.getProperty("saveRecordPath");
                savePath = savePath + time.substring(0, 8) + "/" + ptId + "/" + fileName;
        }

        return savePath;
    }

    public static boolean saveFileToLocal(MultipartFile file, String savePath) {
        File newFile = new File(savePath);
        if (!newFile.exists()) {
            //构建目录
            newFile.mkdirs();
        }
        try {
            //将文件保存到本地
            file.transferTo(newFile);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


    public static boolean copyFileToAnotherDir(String oldPath,String newPath) {
        String newFileParentPath = newPath.substring(0,newPath.lastIndexOf("/"));
        File oldFile = new File(oldPath);
        File newFile = new File(newFileParentPath);
        InputStream in = null;
        OutputStream out = null;
        if (!newFile.exists()) {
            newFile.mkdirs();
        }
        try {
            in = new FileInputStream(oldFile);
            out = new FileOutputStream(newPath);
            int temp;
            while ((temp = in.read()) != -1) {
                out.write(temp);
            }
        } catch (IOException e1) {
            e1.printStackTrace();
            return false;
        }finally {
            try {
                if(in!=null && out !=null){
                    in.close();
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

}
