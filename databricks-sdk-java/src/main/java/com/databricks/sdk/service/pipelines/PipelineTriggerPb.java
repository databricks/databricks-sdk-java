// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PipelineTriggerPb {
  @JsonProperty("cron")
  private CronTrigger cron;

  @JsonProperty("manual")
  private ManualTrigger manual;

  public PipelineTriggerPb setCron(CronTrigger cron) {
    this.cron = cron;
    return this;
  }

  public CronTrigger getCron() {
    return cron;
  }

  public PipelineTriggerPb setManual(ManualTrigger manual) {
    this.manual = manual;
    return this;
  }

  public ManualTrigger getManual() {
    return manual;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineTriggerPb that = (PipelineTriggerPb) o;
    return Objects.equals(cron, that.cron) && Objects.equals(manual, that.manual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cron, manual);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineTriggerPb.class)
        .add("cron", cron)
        .add("manual", manual)
        .toString();
  }
}
