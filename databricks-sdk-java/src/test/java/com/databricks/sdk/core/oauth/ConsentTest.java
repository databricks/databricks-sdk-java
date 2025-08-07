package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.Optional;
import org.junit.jupiter.api.Test;

public class ConsentTest {

  @Test
  public void testConsentWithBrowserAuthTimeout() {
    Consent consent =
        new Consent.Builder()
            .withClientId("test-client-id")
            .withClientSecret("test-client-secret")
            .withAuthUrl("https://test.com/auth")
            .withTokenUrl("https://test.com/token")
            .withRedirectUrl("http://localhost:8080/callback")
            .withState("test-state")
            .withVerifier("test-verifier")
            .withBrowserTimeout(Optional.of(Duration.ofSeconds(30)))
            .build();

    // Verify that the timeout is properly set
    assertEquals(Optional.of(Duration.ofSeconds(30)), consent.getBrowserTimeout());
  }

  @Test
  public void testConsentWithoutBrowserAuthTimeout() {
    Consent consent =
        new Consent.Builder()
            .withClientId("test-client-id")
            .withClientSecret("test-client-secret")
            .withAuthUrl("https://test.com/auth")
            .withTokenUrl("https://test.com/token")
            .withRedirectUrl("http://localhost:8080/callback")
            .withState("test-state")
            .withVerifier("test-verifier")
            .build();

    // Verify that the timeout is empty when not set
    assertEquals(Optional.empty(), consent.getBrowserTimeout());
  }
}
