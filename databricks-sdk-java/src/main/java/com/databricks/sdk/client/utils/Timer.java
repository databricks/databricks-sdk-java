package com.databricks.sdk.client.utils;

import com.databricks.sdk.support.DeveloperApi;

@DeveloperApi
public interface Timer {
  void wait(int milliseconds) throws InterruptedException;

  long getCurrentTime();
}
