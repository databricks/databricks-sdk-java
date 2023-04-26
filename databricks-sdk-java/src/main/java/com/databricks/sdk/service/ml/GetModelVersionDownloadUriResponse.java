// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>GetModelVersionDownloadUriResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetModelVersionDownloadUriResponse {
  /** URI corresponding to where artifacts for this model version are stored. */
  @JsonProperty("artifact_uri")
  private String artifactUri;

  /**
   * <p>Setter for the field <code>artifactUri</code>.</p>
   *
   * @param artifactUri a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.GetModelVersionDownloadUriResponse} object
   */
  public GetModelVersionDownloadUriResponse setArtifactUri(String artifactUri) {
    this.artifactUri = artifactUri;
    return this;
  }

  /**
   * <p>Getter for the field <code>artifactUri</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getArtifactUri() {
    return artifactUri;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetModelVersionDownloadUriResponse that = (GetModelVersionDownloadUriResponse) o;
    return Objects.equals(artifactUri, that.artifactUri);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(artifactUri);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetModelVersionDownloadUriResponse.class)
        .add("artifactUri", artifactUri)
        .toString();
  }
}
