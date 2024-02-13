package weihua_sun.backend.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import weihua_sun.backend.service.UserService;

/**
 * 用户接口
 * @author weihua SUN
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/register")
    public Long userRegister(){
        userService.userRegister(userAccount, userPassword, checkPassword);
    }
}
