// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/**
 * <p>DbtOutput class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DbtOutput {
  /** An optional map of headers to send when retrieving the artifact from the `artifacts_link`. */
  @JsonProperty("artifacts_headers")
  private Map<String, String> artifactsHeaders;

  /**
   * A pre-signed URL to download the (compressed) dbt artifacts. This link is valid for a limited
   * time (30 minutes). This information is only available after the run has finished.
   */
  @JsonProperty("artifacts_link")
  private String artifactsLink;

  /**
   * <p>Setter for the field <code>artifactsHeaders</code>.</p>
   *
   * @param artifactsHeaders a {@link java.util.Map} object
   * @return a {@link com.databricks.sdk.service.jobs.DbtOutput} object
   */
  public DbtOutput setArtifactsHeaders(Map<String, String> artifactsHeaders) {
    this.artifactsHeaders = artifactsHeaders;
    return this;
  }

  /**
   * <p>Getter for the field <code>artifactsHeaders</code>.</p>
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, String> getArtifactsHeaders() {
    return artifactsHeaders;
  }

  /**
   * <p>Setter for the field <code>artifactsLink</code>.</p>
   *
   * @param artifactsLink a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.DbtOutput} object
   */
  public DbtOutput setArtifactsLink(String artifactsLink) {
    this.artifactsLink = artifactsLink;
    return this;
  }

  /**
   * <p>Getter for the field <code>artifactsLink</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getArtifactsLink() {
    return artifactsLink;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DbtOutput that = (DbtOutput) o;
    return Objects.equals(artifactsHeaders, that.artifactsHeaders)
        && Objects.equals(artifactsLink, that.artifactsLink);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(artifactsHeaders, artifactsLink);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DbtOutput.class)
        .add("artifactsHeaders", artifactsHeaders)
        .add("artifactsLink", artifactsLink)
        .toString();
  }
}
