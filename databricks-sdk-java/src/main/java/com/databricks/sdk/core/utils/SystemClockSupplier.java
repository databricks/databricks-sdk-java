package com.databricks.sdk.core.utils;

import java.time.Clock;

public class SystemClockSupplier implements ClockSupplier {
  @Override
  public Clock getClock() {
    return Clock.systemUTC();
  }
}
