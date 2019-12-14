package cn.xyh.catboat.model;

import lombok.Data;

@Data
public class StringUrl {
    private String localUrl;
    private String remoteUrl;

    public StringUrl() {
    }

    public StringUrl(String localUrl, String remoteUrl) {
        this.localUrl = localUrl;
        this.remoteUrl = remoteUrl;
    }
}
