// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateIssueRequest {
  /** `issue.name` identifies the target. */
  @JsonProperty("issue")
  private Issue issue;

  /** experiments/{experiment}/issues/{issue} */
  @JsonIgnore private String name;

  /**
   * Accepts title, description, status, severity, categories, tags, last_seen_time, and
   * metadata.<key>. A path with an empty value clears the field, except that title, status, and
   * severity can't be cleared, and last_seen_time can be cleared only when source_type is MANUAL.
   * categories and tags are replaced whole. metadata is updated per key: a metadata.<key> path sets
   * that key from issue.metadata, or removes it when issue.metadata lacks it, and leaves the other
   * keys alone. A bare metadata path is rejected.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateIssueRequest setIssue(Issue issue) {
    this.issue = issue;
    return this;
  }

  public Issue getIssue() {
    return issue;
  }

  public UpdateIssueRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateIssueRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateIssueRequest that = (UpdateIssueRequest) o;
    return Objects.equals(issue, that.issue)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issue, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateIssueRequest.class)
        .add("issue", issue)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
