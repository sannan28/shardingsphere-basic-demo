package jdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jdbc.entity.Course;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseMapper extends BaseMapper<Course> {

}
