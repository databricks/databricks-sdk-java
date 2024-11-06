package com.databricks.sdk.core.utils;

public interface Timer {
  void sleep(long milliseconds) throws InterruptedException;

  long getCurrentTime();
}
