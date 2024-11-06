package com.databricks.sdk.core.utils;

public class FakeTimer implements Timer {
  private long currentTimeMillis;

  public FakeTimer() {
    this(0);
  }

  public FakeTimer(long currentTimeMillis) {
    this.currentTimeMillis = currentTimeMillis;
  }

  @Override
  public void sleep(long milliseconds) {
    currentTimeMillis += milliseconds;
  }

  @Override
  public long getCurrentTime() {
    return currentTimeMillis;
  }
}
