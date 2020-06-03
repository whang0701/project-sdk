package com.wanghang.projectsdk.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * MyWebMvcConfig.class
 *
 * @author wanghang
 * 2020/5/16
 **/
public class ImgUploadUtil {
    private static final String REAL_IMG_PATH_BASE = "F:/ideaproject/wanghang/upload/img/";

    private static final String VIRTUAL_IMG_PATH_BASE = "gateway/upload/img/";

    private static final String USER = "user/";


    public static String getUserRealPath() {
        return REAL_IMG_PATH_BASE + USER;
    }

    public static String doUploadForUser(MultipartFile file) throws IOException {
        String suffixName = file.getContentType().substring(file.getContentType().indexOf("/") + 1);
        String imgName = UUID.randomUUID().toString().replaceAll("-", "") + "." + suffixName;

        String realPath = REAL_IMG_PATH_BASE + USER + imgName;
        File realFile = new File(realPath);
        file.transferTo(realFile);//实体保存

        return VIRTUAL_IMG_PATH_BASE + USER + imgName;
    }

}
