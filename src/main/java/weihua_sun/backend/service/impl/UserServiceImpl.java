package weihua_sun.backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import weihua_sun.backend.model.User;
import generator.service.UserService;
import weihua_sun.backend.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author suihua
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2024-02-07 22:19:23
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




