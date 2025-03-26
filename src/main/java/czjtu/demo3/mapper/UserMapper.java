package czjtu.demo3.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import czjtu.demo3.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
} 