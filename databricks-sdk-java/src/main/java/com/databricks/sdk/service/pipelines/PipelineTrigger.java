// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PipelineTrigger {
  /** */
  @JsonProperty("cron")
  private CronTrigger cron;

  /** */
  @JsonProperty("manual")
  private Object /* MISSING TYPE */ manual;

  public PipelineTrigger setCron(CronTrigger cron) {
    this.cron = cron;
    return this;
  }

  public CronTrigger getCron() {
    return cron;
  }

  public PipelineTrigger setManual(Object /* MISSING TYPE */ manual) {
    this.manual = manual;
    return this;
  }

  public Object /* MISSING TYPE */ getManual() {
    return manual;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineTrigger that = (PipelineTrigger) o;
    return Objects.equals(cron, that.cron) && Objects.equals(manual, that.manual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cron, manual);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineTrigger.class).add("cron", cron).add("manual", manual).toString();
  }
}
