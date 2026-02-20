package com.databricks.sdk.core.utils;

import com.databricks.sdk.support.InternalApi;

@InternalApi
public interface Timer {
  void sleep(long milliseconds) throws InterruptedException;

  long getCurrentTime();
}
