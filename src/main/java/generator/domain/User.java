package generator.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户昵称
     */
    private String username;

    /**
     * 登录
     */
    private String userAccount;

    /**
     * 用户头像
     */
    private String avatarUrl;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 电话号码
     */
    private String contactNumber;

    /**
     * 邮箱
     */
    private String userEmail;

    /**
     * 是否有效 (0表示正常，1 表示无效)
     */
    private Integer userStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否删除 (0 表示否)
     */
    private Integer isDelete;

    /**
     * 0-普通用户；1-管理员
     */
    @TableLogic
    private Integer userRole;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}