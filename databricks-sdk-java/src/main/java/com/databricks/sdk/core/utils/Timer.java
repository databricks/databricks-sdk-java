package com.databricks.sdk.core.utils;

public interface Timer {
  void wait(int milliseconds) throws InterruptedException;

  long getCurrentTime();
}
