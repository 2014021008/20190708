package com.lll.mybatis;

import com.lll.mybatis.dao.UserMapper;
import com.lll.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Liulele
 * @Date 2019/4/2117:14
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        SqlSessionFactory sqlSessionFactory = null;
        SqlSession sqlSession = null;
        InputStream in = null;
        try {
            //1.读取配置文件
            in = Resources.getResourceAsStream("sqlMapConfig.xml");
            //1.1创建SqlSessinFactory构建者
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            //2.创建SqlSessionFactory工厂
            sqlSessionFactory = sqlSessionFactoryBuilder.build(in);
            //3.使用工厂生产SqlSession对象
            sqlSession = sqlSessionFactory.openSession();
            //4.使用SqlSession对象创建Dao接口的代理对象
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            //5.使用代理对象执行方法
           /* List<User> userList = mapper.findAll();
            for (User user : userList) {
                System.out.println(user);
            }*/
            User user = new User();
            user.setName("把手给我");
            user.setAddress("西安");
            user.setSex("女");
            int i = mapper.saveUser(user);
            sqlSession.commit();
            System.out.println(i);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //6.释放资源
            sqlSession.close();
            in.close();
        }
    }
}
