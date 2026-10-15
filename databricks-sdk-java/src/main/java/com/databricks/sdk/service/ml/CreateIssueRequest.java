// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateIssueRequest {
  /** Output-only fields are ignored. */
  @JsonProperty("issue")
  private Issue issue;

  /**
   * Optional client-chosen ID: iss- followed by 32 lowercase hex digits. A retry with the same ID
   * fails with ALREADY_EXISTS rather than making a duplicate. The server generates one if unset.
   */
  @JsonIgnore
  @QueryParam("issue_id")
  private String issueId;

  /** experiments/{experiment} */
  @JsonIgnore private String parent;

  public CreateIssueRequest setIssue(Issue issue) {
    this.issue = issue;
    return this;
  }

  public Issue getIssue() {
    return issue;
  }

  public CreateIssueRequest setIssueId(String issueId) {
    this.issueId = issueId;
    return this;
  }

  public String getIssueId() {
    return issueId;
  }

  public CreateIssueRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateIssueRequest that = (CreateIssueRequest) o;
    return Objects.equals(issue, that.issue)
        && Objects.equals(issueId, that.issueId)
        && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issue, issueId, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateIssueRequest.class)
        .add("issue", issue)
        .add("issueId", issueId)
        .add("parent", parent)
        .toString();
  }
}
