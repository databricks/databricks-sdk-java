// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>GetLatestVersionsResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetLatestVersionsResponse {
  /**
   * Latest version models for each requests stage. Only return models with current `READY` status.
   * If no `stages` provided, returns the latest version for each stage, including `"None"`.
   */
  @JsonProperty("model_versions")
  private Collection<ModelVersion> modelVersions;

  /**
   * <p>Setter for the field <code>modelVersions</code>.</p>
   *
   * @param modelVersions a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.GetLatestVersionsResponse} object
   */
  public GetLatestVersionsResponse setModelVersions(Collection<ModelVersion> modelVersions) {
    this.modelVersions = modelVersions;
    return this;
  }

  /**
   * <p>Getter for the field <code>modelVersions</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ModelVersion> getModelVersions() {
    return modelVersions;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetLatestVersionsResponse that = (GetLatestVersionsResponse) o;
    return Objects.equals(modelVersions, that.modelVersions);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(modelVersions);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetLatestVersionsResponse.class)
        .add("modelVersions", modelVersions)
        .toString();
  }
}
