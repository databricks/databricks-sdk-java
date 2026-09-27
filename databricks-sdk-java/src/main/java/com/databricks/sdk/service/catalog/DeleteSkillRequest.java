// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteSkillRequest {
  /**
   * Optimistic concurrency token from the most recent read. When set, the delete succeeds only if
   * the resource has not changed. Leave unset for an unconditional delete. For REST requests,
   * URL-encode the base64 string returned by the API when setting the `etag` query parameter.
   */
  @JsonIgnore
  @QueryParam("etag")
  private String etag;

  /**
   * Full resource name of the skill. Format: `skills/{catalog}.{schema}.{skill}`. Each `{...}`
   * component is capped at 255 characters individually.
   */
  @JsonIgnore private String name;

  public DeleteSkillRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public DeleteSkillRequest setName(String name) {
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
    DeleteSkillRequest that = (DeleteSkillRequest) o;
    return Objects.equals(etag, that.etag) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteSkillRequest.class).add("etag", etag).add("name", name).toString();
  }
}
