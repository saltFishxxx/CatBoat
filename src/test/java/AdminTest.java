import cn.xyh.catboat.dao.IAdminDao;
import cn.xyh.catboat.mapper.AdminRoleMapper;
import cn.xyh.catboat.mapper.PersionRoleMapper;
import cn.xyh.catboat.model.Admin;
import cn.xyh.catboat.model.AdminPerssion;
import cn.xyh.catboat.model.RoleResource;
import com.mchange.v1.io.OutputStreamUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AdminTest {

    @Autowired
    private IAdminDao iAdminDao;

    @Autowired
    private AdminRoleMapper adminRoleMapper;

    @Autowired
    private PersionRoleMapper roleResourceMapper;

    @Test
    public void testUpadte() {
        Admin admin = new Admin();
        admin.setAdminName("小明");
        admin.setAdminPassword("22222");
        iAdminDao.updatePassword(admin);
    }

    @Test
    public void testFindOtherResources() {
        System.out.println(1111);
        List<AdminPerssion> notAddResource = adminRoleMapper.findNotAddResource(8);
        System.out.println(notAddResource);
        for (AdminPerssion adminPerssion : notAddResource) {
            System.out.println(adminPerssion);
        }
        System.out.println("==============="+notAddResource.size());
    }

    @Test
    public void testAddRoleResource() {
        RoleResource roleResource = new RoleResource();
        roleResource.setPerssionId(1);
        roleResource.setRoleId(2);
        roleResourceMapper.insertSelective(roleResource);
    }
}
