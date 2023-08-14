package com.databricks.sdk.mixin;

import com.databricks.sdk.service.workspace.*;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecretsExtTest {
  @Mock
  SecretsService mockedSecretsService;

  @BeforeEach
  void setup() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void getBytesTest() {
    SecretsExt mockedSecretExt = new SecretsExt(mockedSecretsService);
    String encodedValue = Base64.getEncoder()
            .encodeToString("testValueBase64Decoded".getBytes(StandardCharsets.UTF_8));

    Mockito.doReturn(new GetSecretResponse().setKey("testKey").setValue(encodedValue))
            .when(mockedSecretsService)
            .getSecret(new GetSecretRequest().setScope("abc").setKey("xyz"));

    byte[] res = mockedSecretExt.getBytes("abc", "xyz");
    assertEquals("testValueBase64Decoded", new String(res, StandardCharsets.UTF_8));
  }

  @Test
  void getTest() {
    SecretsExt mockedSecretExt = new SecretsExt(mockedSecretsService);
    String encodedValue = Base64.getEncoder()
            .encodeToString("testValueBase64Decoded".getBytes(StandardCharsets.UTF_8));

    Mockito.doReturn(new GetSecretResponse().setKey("testKey").setValue(encodedValue))
            .when(mockedSecretsService)
            .getSecret(new GetSecretRequest().setScope("abc").setKey("xyz"));

    String res = mockedSecretExt.get("abc", "xyz");
    assertEquals("testValueBase64Decoded", res);
  }
}
