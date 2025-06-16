package com.databricks.sdk.core.utils;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

public class TestClockSupplier implements ClockSupplier {
  private Clock clock;

  public TestClockSupplier(Instant fixedInstant) {
    clock = Clock.fixed(fixedInstant, ZoneId.of("UTC"));
  }

  public void advanceTime(Duration duration) {
    clock = Clock.offset(clock, duration);
  }

  @Override
  public Clock getClock() {
    return clock;
  }
}
