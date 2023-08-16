package com.databricks.sdk.mixin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.databricks.sdk.service.workspace.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class SecretsExtTest {
  @Mock SecretsService mockedSecretsService;

  private AutoCloseable closeable;

  @BeforeEach
  void setup() {
    closeable = MockitoAnnotations.openMocks(this);
  }

  @AfterEach
  void tearDown() throws Exception {
    if (closeable != null) {
      closeable.close();
    }
  }

  @Test
  void getBytesTest() {
    SecretsExt mockedSecretExt = new SecretsExt(mockedSecretsService);
    String encodedValue =
        Base64.getEncoder()
            .encodeToString("testValueBase64Decoded".getBytes(StandardCharsets.UTF_8));

    Mockito.doReturn(new GetSecretResponse().setKey("testKey").setValue(encodedValue))
        .when(mockedSecretsService)
        .getSecret(new GetSecretRequest().setScope("abc").setKey("xyz"));

    byte[] response = mockedSecretExt.getBytes("abc", "xyz");
    assertEquals("testValueBase64Decoded", new String(response, StandardCharsets.UTF_8));
  }

  @Test
  void getTest() {
    SecretsExt mockedSecretExt = new SecretsExt(mockedSecretsService);
    String encodedValue =
        Base64.getEncoder()
            .encodeToString("testValueBase64Decoded".getBytes(StandardCharsets.UTF_8));

    Mockito.doReturn(new GetSecretResponse().setKey("testKey").setValue(encodedValue))
        .when(mockedSecretsService)
        .getSecret(new GetSecretRequest().setScope("abc").setKey("xyz"));

    String response = mockedSecretExt.get("abc", "xyz");
    assertEquals("testValueBase64Decoded", response);
  }
}
