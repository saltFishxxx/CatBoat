package cn.xyh.catboat.util;

import cn.xyh.catboat.model.StringUrl;
import org.springframework.http.HttpRequest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.annotation.Resources;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class FileUtil {
    private FileUtil(){}

    public static StringUrl upload(CommonsMultipartFile multipartFile, String newTar, HttpServletRequest httpRequest) {
        //获取物理路径
        String targetPath = httpRequest.getServletContext().getRealPath(httpRequest.getContextPath())+File.separatorChar+newTar;
        String contentType = multipartFile.getOriginalFilename();
        String suffix = contentType.substring(contentType.lastIndexOf("."));
        String newFileName = UUID.randomUUID().toString().replace("-","")+suffix;
        String newPath = targetPath+File.separatorChar+newFileName;
        File file = new File(targetPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            multipartFile.transferTo(new File(newPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new StringUrl(newPath, "http://localhost"+httpRequest.getContextPath()+httpRequest.getContextPath()+"/"+newTar+"/"+newFileName);
    }

    public static void main(String[] args) {
        String str = "sdfsdf.df";
        System.out.println(str.substring(str.lastIndexOf(".")+1));
    }


    public static void deleteFile(String path) {
        File file = new File(path);
        if (file.exists()) {
            file.delete();
            System.out.println("删除成功");
        }
    }

}
