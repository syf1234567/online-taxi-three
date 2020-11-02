package com.mashibing.serviceverificationcode.service.impl;

import com.mashibing.internalcommon.dto.ResponseResult;
import com.mashibing.internalcommon.dto.serviceverificationcode.VerifyCodeResponse;
import com.mashibing.serviceverificationcode.service.VerifyCodeService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class VerifyCodeServiceImpl implements VerifyCodeService {
    @Override
    public ResponseResult<VerifyCodeResponse> generate(int identity, String phoneNumber) {
        String code = (Math.random() + "").substring(2, 8);
        return null;
    }

    public static void main(String[] args) {
        String code = String.valueOf(new Random().nextInt(1000000));
        String code1 = String.valueOf((int)((Math.random()*9+1)*Math.pow(10,5)));
        System.out.println(code);
    }
}
