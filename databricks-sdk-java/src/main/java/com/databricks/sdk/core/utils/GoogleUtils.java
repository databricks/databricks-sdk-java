package com.databricks.sdk.core.utils;

import java.util.Arrays;
import java.util.List;

public class GoogleUtils {
  public static List<String> GcpScopes =
      Arrays.asList(
          "https://www.googleapis.com/auth/cloud-platform",
          "https://www.googleapis.com/auth/compute");
}
