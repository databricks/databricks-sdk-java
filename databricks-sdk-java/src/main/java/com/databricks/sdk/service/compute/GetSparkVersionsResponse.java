// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>GetSparkVersionsResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetSparkVersionsResponse {
  /** All the available Spark versions. */
  @JsonProperty("versions")
  private Collection<SparkVersion> versions;

  /**
   * <p>Setter for the field <code>versions</code>.</p>
   *
   * @param versions a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.compute.GetSparkVersionsResponse} object
   */
  public GetSparkVersionsResponse setVersions(Collection<SparkVersion> versions) {
    this.versions = versions;
    return this;
  }

  /**
   * <p>Getter for the field <code>versions</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<SparkVersion> getVersions() {
    return versions;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetSparkVersionsResponse that = (GetSparkVersionsResponse) o;
    return Objects.equals(versions, that.versions);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(versions);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetSparkVersionsResponse.class).add("versions", versions).toString();
  }
}
