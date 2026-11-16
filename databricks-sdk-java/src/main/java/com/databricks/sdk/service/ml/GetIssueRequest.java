// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetIssueRequest {
  /**
   * The Issue to get, as `experiments/{experiment}/issues/{issue}`, where `{experiment}` is the
   * experiment ID and `{issue}` is the Issue ID: `iss-` followed by 32 lowercase hex digits. For
   * example, `experiments/1234567890/issues/iss-0123456789abcdef0123456789abcdef`.
   */
  @JsonIgnore private String name;

  public GetIssueRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetIssueRequest that = (GetIssueRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetIssueRequest.class).add("name", name).toString();
  }
}
