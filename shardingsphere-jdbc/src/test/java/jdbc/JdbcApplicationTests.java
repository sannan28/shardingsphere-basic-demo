package jdbc;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jdbc.entity.Course;
import jdbc.entity.User;
import jdbc.mapper.CourseMapper;
import jdbc.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class JdbcApplicationTests {

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private JdbcTemplate jdbcTemplate;


    /**
     * 测试垂直分表
     *//*
    @Test
    public void addUser() {

        String userBaseSql = "INSERT INTO user_base (id,username, password) " + "VALUES (?, ?, ?)";
        jdbcTemplate.update(userBaseSql, 1930916295148900353L, "垂直分库1", "123456");

        String userProfilesql = "INSERT INTO user_profile (id,email, phone, address) " + "VALUES (?,?, ?, ?)";
        jdbcTemplate.update(userProfilesql, 1930916295148900353L, "123@163.com", "13278906780", "垂直分库1");

    }*/

    /**
     * 测试垂直分库
     *//*
    @Test
    public void addUserDb() {
        User user = new User();
        user.setUsername("测试垂直分库的使用");
        user.setUstatus("Normal");
        userMapper.insert(user);
    }*/


    /**
     * 测试水平分库分表
     *//*
    @Test
    public void addCourse() {
        Course course = new Course();
        course.setCname("测试水平分库01");
        course.setUserId(4L);
        course.setCstatus("Normal");
        courseMapper.insert(course);

        course.setCname("测试水平分库02");
        course.setUserId(5L);
        course.setCstatus("Normal");
        courseMapper.insert(course);
    }*/

    /**
     * 测试 水平分库
     *//*
    @Test
    public void addCourse() {
        Course course = new Course();
        course.setCname("测试水平分库01");
        course.setUserId(4L);
        course.setCstatus("Normal");
        courseMapper.insert(course);

        course.setCname("测试水平分库02");
        course.setUserId(5L);
        course.setCstatus("Normal");
        courseMapper.insert(course);
    }


    @Test
    public void findCourse() {
        QueryWrapper<Course> wrapper = new QueryWrapper<Course>();
        wrapper.eq("user_id", 100L);
        wrapper.eq("cid", 1930916295148900353L);
        Course course = courseMapper.selectOne(wrapper);
        System.out.println(course);
    }*/


    /**
     * 水平分表
     *//*
    @Test
    public void addCourse() {
        for (int i = 0; i < 10; i++) {
            Course course = new Course();
            course.setCname("java" + i);
            course.setUserId(100L);
            course.setCstatus("Normal");
            courseMapper.insert(course);
        }
    }

    @Test
    public void findCourse() {
        QueryWrapper<Course> wrapper = new QueryWrapper<Course>();
        wrapper.eq("cid", 1930916295148900353L);
        Course course = courseMapper.selectOne(wrapper);
        System.out.println(course);

    }*/


}
