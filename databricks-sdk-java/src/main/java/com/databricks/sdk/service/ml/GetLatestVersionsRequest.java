// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>GetLatestVersionsRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetLatestVersionsRequest {
  /** Registered model unique name identifier. */
  @JsonProperty("name")
  private String name;

  /** List of stages. */
  @JsonProperty("stages")
  private Collection<String> stages;

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.GetLatestVersionsRequest} object
   */
  public GetLatestVersionsRequest setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>stages</code>.</p>
   *
   * @param stages a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.GetLatestVersionsRequest} object
   */
  public GetLatestVersionsRequest setStages(Collection<String> stages) {
    this.stages = stages;
    return this;
  }

  /**
   * <p>Getter for the field <code>stages</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getStages() {
    return stages;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetLatestVersionsRequest that = (GetLatestVersionsRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(stages, that.stages);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(name, stages);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetLatestVersionsRequest.class)
        .add("name", name)
        .add("stages", stages)
        .toString();
  }
}
