// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>PipelineTrigger class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PipelineTrigger {
  /** */
  @JsonProperty("cron")
  private CronTrigger cron;

  /** */
  @JsonProperty("manual")
  private Object /* MISSING TYPE */ manual;

  /**
   * <p>Setter for the field <code>cron</code>.</p>
   *
   * @param cron a {@link com.databricks.sdk.service.pipelines.CronTrigger} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineTrigger} object
   */
  public PipelineTrigger setCron(CronTrigger cron) {
    this.cron = cron;
    return this;
  }

  /**
   * <p>Getter for the field <code>cron</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.pipelines.CronTrigger} object
   */
  public CronTrigger getCron() {
    return cron;
  }

  /**
   * <p>Setter for the field <code>manual</code>.</p>
   *
   * @param manual a {@link java.lang.Object} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineTrigger} object
   */
  public PipelineTrigger setManual(Object /* MISSING TYPE */ manual) {
    this.manual = manual;
    return this;
  }

  /**
   * <p>Getter for the field <code>manual</code>.</p>
   *
   * @return a {@link java.lang.Object} object
   */
  public Object /* MISSING TYPE */ getManual() {
    return manual;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineTrigger that = (PipelineTrigger) o;
    return Objects.equals(cron, that.cron) && Objects.equals(manual, that.manual);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(cron, manual);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(PipelineTrigger.class).add("cron", cron).add("manual", manual).toString();
  }
}
