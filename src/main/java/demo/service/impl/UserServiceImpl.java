package demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import demo.entity.User;
import demo.service.UserService;
import demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author taoyu
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-06-03 11:06:14
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




