package com.databricks.sdk.core.utils;

public class SystemTimer implements Timer {
  @Override
  public void wait(int milliseconds) throws InterruptedException {
    Thread.sleep(milliseconds);
  }

  @Override
  public long getCurrentTime() {
    return System.currentTimeMillis();
  }
}
