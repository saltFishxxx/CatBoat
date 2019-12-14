import cn.xyh.catboat.mapper.CatNewsMapper;
import cn.xyh.catboat.model.AdminNews;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class NewsTest {
    @Autowired
    private CatNewsMapper catNewsMapper;

    @Test
    public void testAdd() {
        AdminNews adminNews = new AdminNews();
        adminNews.setNewsCollect(33);
        adminNews.setNewsContent("fff");
        adminNews.setNewsGood(33);
        adminNews.setNewsTime(new Date());
        adminNews.setNewsTitle("sdfsdf");
        adminNews.setNewsCategory("牛奶");
        catNewsMapper.insertSelective(adminNews);
    }
}
