// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Compute {
  /** Hardware accelerator configuration for Serverless GPU workloads. */
  @JsonProperty("hardware_accelerator")
  private com.databricks.sdk.service.compute.HardwareAcceleratorType hardwareAccelerator;

  public Compute setHardwareAccelerator(
      com.databricks.sdk.service.compute.HardwareAcceleratorType hardwareAccelerator) {
    this.hardwareAccelerator = hardwareAccelerator;
    return this;
  }

  public com.databricks.sdk.service.compute.HardwareAcceleratorType getHardwareAccelerator() {
    return hardwareAccelerator;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Compute that = (Compute) o;
    return Objects.equals(hardwareAccelerator, that.hardwareAccelerator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hardwareAccelerator);
  }

  @Override
  public String toString() {
    return new ToStringer(Compute.class).add("hardwareAccelerator", hardwareAccelerator).toString();
  }
}
