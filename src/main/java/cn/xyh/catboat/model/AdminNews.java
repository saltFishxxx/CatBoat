package cn.xyh.catboat.model;

import cn.xyh.catboat.util.DateUtil;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "cat_news")
public class AdminNews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer newsId;
    private String newsTitle;
    private Date newsTime;

    @Transient
    private String strNewsTime;
    private String newsContent;
    private Integer newsGood; //点赞数
    private Integer newsCollect; //收藏数
    private String newsCategory;

    public void setNewsTime(Date newsTime) {
        this.newsTime = newsTime;
        this.strNewsTime = DateUtil.dateToString(newsTime);
    }
}
