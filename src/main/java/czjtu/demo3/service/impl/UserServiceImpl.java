package czjtu.demo3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import czjtu.demo3.entity.User;
import czjtu.demo3.mapper.UserMapper;
import czjtu.demo3.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
} 