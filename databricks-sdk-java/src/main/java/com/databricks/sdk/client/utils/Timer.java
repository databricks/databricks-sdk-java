package com.databricks.sdk.client.utils;

public interface Timer {
  void wait(int milliseconds) throws InterruptedException;

  long getCurrentTime();
}
