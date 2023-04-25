package com.databricks.sdk.client;

import java.util.Map;

public interface HeaderFactory {
  /** @return a map of HTTP headers with refreshed tokens */
  Map<String, String> headers();
}
