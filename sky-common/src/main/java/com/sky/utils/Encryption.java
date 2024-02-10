package com.sky.utils;

import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

@Component
public class Encryption {
    /**
     * 对员工密码进行加密
     * @param password
     * @return
     */
    public String empEncryption(String password) {
        password = "sky" + password.substring(0, password.length() / 2) + "take" + password.substring(password.length() / 2);
        password = DigestUtils.md5DigestAsHex(password.getBytes());
        password = DigestUtils.md5DigestAsHex(password.getBytes());
        password = DigestUtils.md5DigestAsHex(password.getBytes());
        password = DigestUtils.md5DigestAsHex(password.getBytes());
        password = DigestUtils.md5DigestAsHex(password.getBytes());
        return password;
    }
}
