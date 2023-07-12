// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * Get a rule set
 */
@Generated
public class GetRuleSetRequest {
  /**
   * Etag used for versioning. The response is at least as fresh as the eTag
   * provided. Etag is used for optimistic concurrency control as a way to help
   * prevent simultaneous updates of a rule set from overwriting each other. It
   * is strongly suggested that systems make use of the etag in the read ->
   * modify -> write pattern to perform rule set updates in order to avoid race
   * conditions that is get an etag from a GET rule set request, and pass it
   * with the PUT update request to identify the rule set version you are
   * updating.
   */
  @QueryParam("etag")
  private String etag;
  
  /**
   * The ruleset name associated with the request.
   */
  @QueryParam("name")
  private String name;
  
  public GetRuleSetRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }
  
  public GetRuleSetRequest setName(String name) {
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
    GetRuleSetRequest that = (GetRuleSetRequest) o;
    return Objects.equals(etag, that.etag)
    && Objects.equals(name, that.name)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRuleSetRequest.class)
      .add("etag", etag)
      .add("name", name).toString();
  }
}
