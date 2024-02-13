package weihua_sun.backend.service;

import jakarta.servlet.http.HttpServletRequest;
import weihua_sun.backend.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author suihua
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2024-02-07 22:19:23
 */
public interface UserService extends IService<User> {
    /**
     * 用户注释
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    User doLogin(String userAccount, String userPassword, HttpServletRequest request);

}
