// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Details required to identify and reject a model version stage transition request. */
@Generated
public class RejectTransitionRequest {
  /** User-provided comment on the action. */
  @JsonProperty("comment")
  private String comment;

  /** Name of the model. */
  @JsonProperty("name")
  private String name;

  /**
   * Target stage of the transition. Valid values are:
   *
   * <p>* `None`: The initial stage of a model version.
   *
   * <p>* `Staging`: Staging or pre-production stage.
   *
   * <p>* `Production`: Production stage.
   *
   * <p>* `Archived`: Archived stage.
   */
  @JsonProperty("stage")
  private String stage;

  /** Version of the model. */
  @JsonProperty("version")
  private String version;

  public RejectTransitionRequest setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public RejectTransitionRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public RejectTransitionRequest setStage(String stage) {
    this.stage = stage;
    return this;
  }

  public String getStage() {
    return stage;
  }

  public RejectTransitionRequest setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RejectTransitionRequest that = (RejectTransitionRequest) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(stage, that.stage)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, name, stage, version);
  }

  @Override
  public String toString() {
    return new ToStringer(RejectTransitionRequest.class)
        .add("comment", comment)
        .add("name", name)
        .add("stage", stage)
        .add("version", version)
        .toString();
  }
}
