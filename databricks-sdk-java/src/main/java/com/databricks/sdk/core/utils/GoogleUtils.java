package com.databricks.sdk.core.utils;

import java.util.Arrays;
import java.util.List;

public class GoogleUtils {
  public static List<String> GCP_SCOPES =
      Arrays.asList(
          "https://www.googleapis.com/auth/cloud-platform",
          "https://www.googleapis.com/auth/compute");

  public static String SA_ACCESS_TOKEN_HEADER = "X-Databricks-GCP-SA-Access-Token";
}
