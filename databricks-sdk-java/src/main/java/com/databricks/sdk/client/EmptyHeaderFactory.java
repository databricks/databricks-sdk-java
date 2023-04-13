package com.databricks.sdk.client;

import java.util.HashMap;
import java.util.Map;

public class EmptyHeaderFactory implements HeaderFactory {
  @Override
  public Map<String, String> headers() {
    return new HashMap<>();
  }
}
