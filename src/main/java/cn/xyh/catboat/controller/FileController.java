package cn.xyh.catboat.controller;

import cn.xyh.catboat.model.ReturnJson;
import cn.xyh.catboat.model.StringUrl;
import cn.xyh.catboat.util.FileUtil;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping(value = "/file",produces = "application/json;charset=utf-8")
public class FileController {

    @RequestMapping("/upload")
    public StringUrl upload(String localUrl, @RequestParam("catImg") CommonsMultipartFile commonsMultipartFile, HttpServletRequest httpRequest) throws UnsupportedEncodingException {
        if (localUrl != null && !"".equals(localUrl)) {
            FileUtil.deleteFile(localUrl);
        }
        StringUrl stringUrl = FileUtil.upload(commonsMultipartFile, "category", httpRequest);
        return stringUrl;
    }

    @RequestMapping("/editorUpload")
    public ReturnJson editorUpload(@RequestParam("upload") CommonsMultipartFile commonsMultipartFile, HttpServletRequest httpServletRequest) {
        StringUrl stringUrl = FileUtil.upload(commonsMultipartFile, "editor", httpServletRequest);
        return new ReturnJson(1, stringUrl.getRemoteUrl());
    }
}
