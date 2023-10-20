package com.databricks.sdk.core.utils;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class FakeClockSupplier implements ClockSupplier {
  private final Clock clock;

  public FakeClockSupplier(Instant fixedInstant, ZoneId zoneId) {
    clock = Clock.fixed(fixedInstant, zoneId);
  }

  @Override
  public Clock getClock() {
    return clock;
  }
}
