package com.databricks.sdk.core.utils;

import java.time.Clock;

public class RealClockSupplier implements ClockSupplier {
  @Override
  public Clock getClock() {
    return Clock.systemDefaultZone();
  }
}
