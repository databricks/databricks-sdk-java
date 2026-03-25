package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

class HostMetadataTest {

  private final ObjectMapper mapper = new ObjectMapper();

  @Test
  void testDeserializeWithCloud() throws Exception {
    String json =
        "{\"oidc_endpoint\":\"https://example.com/oidc\","
            + "\"account_id\":\"acc-123\","
            + "\"workspace_id\":\"ws-456\","
            + "\"cloud\":\"aws\"}";

    HostMetadata meta = mapper.readValue(json, HostMetadata.class);

    assertEquals("https://example.com/oidc", meta.getOidcEndpoint());
    assertEquals("acc-123", meta.getAccountId());
    assertEquals("ws-456", meta.getWorkspaceId());
    assertEquals("aws", meta.getCloud());
  }

  @Test
  void testDeserializeWithoutCloud() throws Exception {
    String json =
        "{\"oidc_endpoint\":\"https://example.com/oidc\","
            + "\"account_id\":\"acc-123\","
            + "\"workspace_id\":\"ws-456\"}";

    HostMetadata meta = mapper.readValue(json, HostMetadata.class);

    assertEquals("https://example.com/oidc", meta.getOidcEndpoint());
    assertEquals("acc-123", meta.getAccountId());
    assertEquals("ws-456", meta.getWorkspaceId());
    assertNull(meta.getCloud());
  }

  @Test
  void testConstructorWithCloud() {
    HostMetadata meta = new HostMetadata("https://example.com/oidc", "acc-123", "ws-456", "gcp");

    assertEquals("https://example.com/oidc", meta.getOidcEndpoint());
    assertEquals("acc-123", meta.getAccountId());
    assertEquals("ws-456", meta.getWorkspaceId());
    assertEquals("gcp", meta.getCloud());
  }

  @Test
  void testConstructorWithoutCloud() {
    HostMetadata meta = new HostMetadata("https://example.com/oidc", "acc-123", "ws-456");

    assertEquals("https://example.com/oidc", meta.getOidcEndpoint());
    assertEquals("acc-123", meta.getAccountId());
    assertEquals("ws-456", meta.getWorkspaceId());
    assertNull(meta.getCloud());
  }
}
