package com.natchen.wxshop.service;

import com.natchen.wxshop.AuthController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TelVerificationServiceTest {
    public static AuthController.TelAndCode VALID_PARAMETER = new AuthController.TelAndCode("138123456789", "null");
    public static AuthController.TelAndCode VALID_PARAMETER_CODE = new AuthController.TelAndCode("138123456789", "000000");
    public static AuthController.TelAndCode EMPTY_TEL = new AuthController.TelAndCode(null, null);

    @Test
    public void returnTrueIfValid() {
        Assertions.assertTrue(new TelVerificationService().verifyTelParameter(VALID_PARAMETER));
    }

    @Test
    public void returnFalseIfNoTel() {
        Assertions.assertTrue(new TelVerificationService().verifyTelParameter(EMPTY_TEL));
        Assertions.assertFalse(new TelVerificationService().verifyTelParameter(null));
    }
}