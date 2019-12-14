import cn.xyh.catboat.model.AdminRole;
import cn.xyh.catboat.service.IAdminRoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ServiceTest {
    @Autowired
    public IAdminRoleService iAdminRoleService;

    @Test
    public void test() {
        List<AdminRole> all = iAdminRoleService.findAll(1, 3);
        System.out.println(all);
    }
}
