package com.databricks.sdk.client.utils;

import com.databricks.sdk.support.DeveloperApi;

@DeveloperApi
public class RealTimer implements Timer {
  @Override
  public void wait(int milliseconds) throws InterruptedException {
    Thread.sleep(milliseconds);
  }

  @Override
  public long getCurrentTime() {
    return System.currentTimeMillis();
  }
}
