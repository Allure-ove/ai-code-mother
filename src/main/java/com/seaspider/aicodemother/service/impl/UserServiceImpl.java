package com.seaspider.aicodemother.service.impl;

import cn.hutool.core.util.StrUtil;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.seaspider.aicodemother.exception.BusinessException;
import com.seaspider.aicodemother.exception.ErrorCode;
import com.seaspider.aicodemother.model.entity.User;
import com.seaspider.aicodemother.mapper.UserMapper;
import com.seaspider.aicodemother.service.UserService;
import org.apache.catalina.util.StringUtil;
import org.springframework.stereotype.Service;

/**
 * 用户 服务层实现。
 *
 * @author 海蜘蛛
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>  implements UserService{

    @Override
    public long userRegister(String userAccount, String userPassword, String checkPassword) {
        //1、检验参数

        if(StrUtil.hasBlank(userAccount, userPassword, checkPassword)){
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "参数不能为空");
        }


        //2.检验用户是否存在

        //3.密码加密

        //4、创建用户、插入数据库
        return 0;
    }
}
