package cn.xyh.catboat.model;

import lombok.Data;

@Data
public class ReturnJson {
    private int uploaded;
    private String url;

    public ReturnJson(int uploaded, String url) {
        this.uploaded = uploaded;
        this.url = url;
    }
}
