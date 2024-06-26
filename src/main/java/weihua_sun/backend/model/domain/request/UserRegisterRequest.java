package weihua_sun.backend.model.domain.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author weihua SUN
 */
@Data
public class UserRegisterRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = -4943014467927622106L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;
}
