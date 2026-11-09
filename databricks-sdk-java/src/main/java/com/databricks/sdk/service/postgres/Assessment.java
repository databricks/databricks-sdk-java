// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Collection;
import java.util.Objects;

/**
 * A server-managed assessment of a migration's source configuration. Completed check results are
 * immutable.
 */
@Generated
public class Assessment {
  /** Output-only. Results of the checks performed by this assessment. */
  @JsonProperty("checks")
  private Collection<AssessmentCheck> checks;

  /** Output-only. The time when the assessment completed. */
  @JsonProperty("complete_time")
  private Timestamp completeTime;

  /** Output-only. The time when the assessment started. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** Output-only. The time when the assessment expires. */
  @JsonProperty("expire_time")
  private Timestamp expireTime;

  /**
   * The assessment resource name, in the format `migrations/{migration}/assessments/{assessment}`.
   */
  @JsonProperty("name")
  private String name;

  /** Output-only. The aggregate assessment state. */
  @JsonProperty("state")
  private AssessmentState state;

  public Assessment setChecks(Collection<AssessmentCheck> checks) {
    this.checks = checks;
    return this;
  }

  public Collection<AssessmentCheck> getChecks() {
    return checks;
  }

  public Assessment setCompleteTime(Timestamp completeTime) {
    this.completeTime = completeTime;
    return this;
  }

  public Timestamp getCompleteTime() {
    return completeTime;
  }

  public Assessment setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Assessment setExpireTime(Timestamp expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  public Timestamp getExpireTime() {
    return expireTime;
  }

  public Assessment setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Assessment setState(AssessmentState state) {
    this.state = state;
    return this;
  }

  public AssessmentState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Assessment that = (Assessment) o;
    return Objects.equals(checks, that.checks)
        && Objects.equals(completeTime, that.completeTime)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(expireTime, that.expireTime)
        && Objects.equals(name, that.name)
        && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checks, completeTime, createTime, expireTime, name, state);
  }

  @Override
  public String toString() {
    return new ToStringer(Assessment.class)
        .add("checks", checks)
        .add("completeTime", completeTime)
        .add("createTime", createTime)
        .add("expireTime", expireTime)
        .add("name", name)
        .add("state", state)
        .toString();
  }
}
