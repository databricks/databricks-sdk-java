// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ModelTriggerConfiguration {
  /**
   * Aliases of the model versions to monitor. Can only be used in conjunction with condition
   * MODEL_ALIAS_SET.
   */
  @JsonProperty("aliases")
  private Collection<String> aliases;

  /** The condition based on which to trigger a job run. */
  @JsonProperty("condition")
  private ModelTriggerConfigurationCondition condition;

  /**
   * If set, the trigger starts a run only after the specified amount of time has passed since the
   * last time the trigger fired. The minimum allowed value is 60 seconds.
   */
  @JsonProperty("min_time_between_triggers_seconds")
  private Long minTimeBetweenTriggersSeconds;

  /**
   * Name of the securable to monitor ("mycatalog.myschema.mymodel" in the case of model-level
   * triggers, "mycatalog.myschema" in the case of schema-level triggers) or empty in the case of
   * metastore-level triggers.
   */
  @JsonProperty("securable_name")
  private String securableName;

  /**
   * If set, the trigger starts a run only after no model updates have occurred for the specified
   * time and can be used to wait for a series of model updates before triggering a run. The minimum
   * allowed value is 60 seconds.
   */
  @JsonProperty("wait_after_last_change_seconds")
  private Long waitAfterLastChangeSeconds;

  public ModelTriggerConfiguration setAliases(Collection<String> aliases) {
    this.aliases = aliases;
    return this;
  }

  public Collection<String> getAliases() {
    return aliases;
  }

  public ModelTriggerConfiguration setCondition(ModelTriggerConfigurationCondition condition) {
    this.condition = condition;
    return this;
  }

  public ModelTriggerConfigurationCondition getCondition() {
    return condition;
  }

  public ModelTriggerConfiguration setMinTimeBetweenTriggersSeconds(
      Long minTimeBetweenTriggersSeconds) {
    this.minTimeBetweenTriggersSeconds = minTimeBetweenTriggersSeconds;
    return this;
  }

  public Long getMinTimeBetweenTriggersSeconds() {
    return minTimeBetweenTriggersSeconds;
  }

  public ModelTriggerConfiguration setSecurableName(String securableName) {
    this.securableName = securableName;
    return this;
  }

  public String getSecurableName() {
    return securableName;
  }

  public ModelTriggerConfiguration setWaitAfterLastChangeSeconds(Long waitAfterLastChangeSeconds) {
    this.waitAfterLastChangeSeconds = waitAfterLastChangeSeconds;
    return this;
  }

  public Long getWaitAfterLastChangeSeconds() {
    return waitAfterLastChangeSeconds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelTriggerConfiguration that = (ModelTriggerConfiguration) o;
    return Objects.equals(aliases, that.aliases)
        && Objects.equals(condition, that.condition)
        && Objects.equals(minTimeBetweenTriggersSeconds, that.minTimeBetweenTriggersSeconds)
        && Objects.equals(securableName, that.securableName)
        && Objects.equals(waitAfterLastChangeSeconds, that.waitAfterLastChangeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aliases,
        condition,
        minTimeBetweenTriggersSeconds,
        securableName,
        waitAfterLastChangeSeconds);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelTriggerConfiguration.class)
        .add("aliases", aliases)
        .add("condition", condition)
        .add("minTimeBetweenTriggersSeconds", minTimeBetweenTriggersSeconds)
        .add("securableName", securableName)
        .add("waitAfterLastChangeSeconds", waitAfterLastChangeSeconds)
        .toString();
  }
}
