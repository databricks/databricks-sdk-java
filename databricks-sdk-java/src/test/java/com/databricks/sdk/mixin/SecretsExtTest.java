package com.databricks.sdk.mixin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.databricks.sdk.service.workspace.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class SecretsExtTest {
  @Mock SecretsService mockedSecretsService;

  @BeforeEach
  void setup() {
    MockitoAnnotations.openMocks(this);
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

  @Test
  void listTest() {
    SecretsExt mockedSecretExt = new SecretsExt(mockedSecretsService);

    List<SecretMetadata> abcScopeList = new ArrayList<>();
    abcScopeList.add(new SecretMetadata().setKey("a"));
    abcScopeList.add(new SecretMetadata().setKey("b"));

    List<SecretMetadata> xyzScopeList = new ArrayList<>();
    abcScopeList.add(new SecretMetadata().setKey("x"));
    abcScopeList.add(new SecretMetadata().setKey("y"));

    Mockito.doReturn(new ListSecretsResponse().setSecrets(abcScopeList))
        .when(mockedSecretsService)
        .listSecrets(new ListSecretsRequest().setScope("abc"));
    Mockito.doReturn(new ListSecretsResponse().setSecrets(xyzScopeList))
        .when(mockedSecretsService)
        .listSecrets(new ListSecretsRequest().setScope("xyz"));

    Iterable<SecretMetadata> secretMetadataList = mockedSecretExt.listSecrets("abc");
    assertEquals(abcScopeList, secretMetadataList);

    secretMetadataList = mockedSecretExt.listSecrets("xyz");
    assertEquals(xyzScopeList, secretMetadataList);
  }

  @Test
  void listScopesTest() {
    SecretsExt mockedSecretExt = new SecretsExt(mockedSecretsService);

    List<SecretScope> secretScopes = new ArrayList<>();
    secretScopes.add(new SecretScope().setName("a"));
    secretScopes.add(new SecretScope().setName("b"));
    secretScopes.add(new SecretScope().setName("c"));

    Mockito.doReturn(new ListScopesResponse().setScopes(secretScopes))
        .when(mockedSecretsService)
        .listScopes();

    Iterable<SecretScope> response = mockedSecretExt.listScopes();
    assertEquals(secretScopes, response);
  }
}
