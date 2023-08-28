package com.databricks.sdk.integration.framework;

import java.security.SecureRandom;

public class NameUtils {
  // Generates a unique name by appending a random string to the given prefix.
  public static String uniqueName(String prefix) {
    return prefix + "-" + generateRandomBase16String(16);
  }

  public static String generateRandomBase16String(int length) {
    byte[] bytes = new byte[length / 2];
    new SecureRandom().nextBytes(bytes);
    StringBuilder hexBuilder = new StringBuilder(length);
    for (byte b : bytes) {
      hexBuilder.append(String.format("%02x", b));
    }
    return hexBuilder.toString();
  }
}
