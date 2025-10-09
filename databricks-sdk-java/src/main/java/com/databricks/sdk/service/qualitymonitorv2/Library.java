// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.qualitymonitorv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Library {
  /** Whether the resource contains sauce */
  @JsonProperty("contains_sauce")
  private Boolean containsSauce;

  /** The time at which the resource was created */
  @JsonProperty("created_at")
  private Long createdAt;

  /** Count of legs in the resource */
  @JsonProperty("leg_count")
  private Long legCount;

  /**
   * Name of the Resource. Must contain only: - alphanumeric characters - underscores - hyphens
   *
   * <p>Note: The name must be unique within the scope of the resource.
   */
  @JsonProperty("name")
  private String name;

  public Library setContainsSauce(Boolean containsSauce) {
    this.containsSauce = containsSauce;
    return this;
  }

  public Boolean getContainsSauce() {
    return containsSauce;
  }

  public Library setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public Library setLegCount(Long legCount) {
    this.legCount = legCount;
    return this;
  }

  public Long getLegCount() {
    return legCount;
  }

  public Library setName(String name) {
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
    Library that = (Library) o;
    return Objects.equals(containsSauce, that.containsSauce)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(legCount, that.legCount)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containsSauce, createdAt, legCount, name);
  }

  @Override
  public String toString() {
    return new ToStringer(Library.class)
        .add("containsSauce", containsSauce)
        .add("createdAt", createdAt)
        .add("legCount", legCount)
        .add("name", name)
        .toString();
  }
}
