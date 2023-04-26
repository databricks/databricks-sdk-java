// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateContext class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateContext {
  /** Running cluster id */
  @JsonProperty("clusterId")
  private String clusterId;

  /** */
  @JsonProperty("language")
  private Language language;

  /**
   * <p>Setter for the field <code>clusterId</code>.</p>
   *
   * @param clusterId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.CreateContext} object
   */
  public CreateContext setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  /**
   * <p>Getter for the field <code>clusterId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getClusterId() {
    return clusterId;
  }

  /**
   * <p>Setter for the field <code>language</code>.</p>
   *
   * @param language a {@link com.databricks.sdk.service.compute.Language} object
   * @return a {@link com.databricks.sdk.service.compute.CreateContext} object
   */
  public CreateContext setLanguage(Language language) {
    this.language = language;
    return this;
  }

  /**
   * <p>Getter for the field <code>language</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.Language} object
   */
  public Language getLanguage() {
    return language;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateContext that = (CreateContext) o;
    return Objects.equals(clusterId, that.clusterId) && Objects.equals(language, that.language);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(clusterId, language);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateContext.class)
        .add("clusterId", clusterId)
        .add("language", language)
        .toString();
  }
}
