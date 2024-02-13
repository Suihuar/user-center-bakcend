package weihua_sun.backend.service;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import weihua_sun.backend.model.domain.User;

@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;
    @Test
    void testAddUser(){
        User user = new User();
        user.setUsername("suihuarrr");
        user.setUserAccount("123");
        user.setAvatarUrl("https://c-ssl.dtstatic.com/uploads/blog/202208/01/20220801204309_f6dd8.thumb.400_0.jpeg");
        user.setGender(1);
        user.setUserPassword("12345678");
        user.setContactNumber("123");
        user.setUserEmail("456");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }

    @Test
    void userRegister() {
        String userAccount = "suihua";
        String userPassword = "";
        String checkPassword = "123456";
        long result = userService.userRegister(userAccount,userPassword,checkPassword);
        Assertions.assertEquals(-1,result);

        userAccount = "ab";
        result = userService.userRegister(userAccount,userPassword,checkPassword);
        Assertions.assertEquals(-1,result);

        userAccount = "nihaoblabla";
        userPassword = "12345678";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount,userPassword,checkPassword);
        Assertions.assertEquals(-1,result);



    }
}