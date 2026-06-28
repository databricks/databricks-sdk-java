// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.disasterrecovery;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateStableUrlRequest {
  /** The parent resource. Format: accounts/{account_id}. */
  @JsonIgnore private String parent;

  /** The stable URL to create. */
  @JsonProperty("stable_url")
  private StableUrl stableUrl;

  /**
   * Client-provided identifier for the stable URL. Used to construct the resource name as
   * {parent}/stable-urls/{stable_url_id}.
   */
  @JsonIgnore
  @QueryParam("stable_url_id")
  private String stableUrlId;

  /** When true, validates the request without creating the stable URL. */
  @JsonIgnore
  @QueryParam("validate_only")
  private Boolean validateOnly;

  public CreateStableUrlRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public CreateStableUrlRequest setStableUrl(StableUrl stableUrl) {
    this.stableUrl = stableUrl;
    return this;
  }

  public StableUrl getStableUrl() {
    return stableUrl;
  }

  public CreateStableUrlRequest setStableUrlId(String stableUrlId) {
    this.stableUrlId = stableUrlId;
    return this;
  }

  public String getStableUrlId() {
    return stableUrlId;
  }

  public CreateStableUrlRequest setValidateOnly(Boolean validateOnly) {
    this.validateOnly = validateOnly;
    return this;
  }

  public Boolean getValidateOnly() {
    return validateOnly;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateStableUrlRequest that = (CreateStableUrlRequest) o;
    return Objects.equals(parent, that.parent)
        && Objects.equals(stableUrl, that.stableUrl)
        && Objects.equals(stableUrlId, that.stableUrlId)
        && Objects.equals(validateOnly, that.validateOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, stableUrl, stableUrlId, validateOnly);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateStableUrlRequest.class)
        .add("parent", parent)
        .add("stableUrl", stableUrl)
        .add("stableUrlId", stableUrlId)
        .add("validateOnly", validateOnly)
        .toString();
  }
}
