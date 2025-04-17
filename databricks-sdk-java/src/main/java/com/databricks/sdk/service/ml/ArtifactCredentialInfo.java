// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ArtifactCredentialInfo {
  /**
   * A collection of HTTP headers that should be specified when uploading to or downloading from the
   * specified `signed_uri`.
   */
  @JsonProperty("headers")
  private Collection<ArtifactCredentialInfoHttpHeader> headers;

  /**
   * The path, relative to the Run's artifact root location, of the artifact that can be accessed
   * with the credential.
   */
  @JsonProperty("path")
  private String path;

  /** The ID of the MLflow Run containing the artifact that can be accessed with the credential. */
  @JsonProperty("run_id")
  private String runId;

  /** The signed URI credential that provides access to the artifact. */
  @JsonProperty("signed_uri")
  private String signedUri;

  /**
   * The type of the signed credential URI (e.g., an AWS presigned URL or an Azure Shared Access
   * Signature URI).
   */
  @JsonProperty("type")
  private ArtifactCredentialType typeValue;

  public ArtifactCredentialInfo setHeaders(Collection<ArtifactCredentialInfoHttpHeader> headers) {
    this.headers = headers;
    return this;
  }

  public Collection<ArtifactCredentialInfoHttpHeader> getHeaders() {
    return headers;
  }

  public ArtifactCredentialInfo setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public ArtifactCredentialInfo setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public ArtifactCredentialInfo setSignedUri(String signedUri) {
    this.signedUri = signedUri;
    return this;
  }

  public String getSignedUri() {
    return signedUri;
  }

  public ArtifactCredentialInfo setType(ArtifactCredentialType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public ArtifactCredentialType getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ArtifactCredentialInfo that = (ArtifactCredentialInfo) o;
    return Objects.equals(headers, that.headers)
        && Objects.equals(path, that.path)
        && Objects.equals(runId, that.runId)
        && Objects.equals(signedUri, that.signedUri)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, path, runId, signedUri, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(ArtifactCredentialInfo.class)
        .add("headers", headers)
        .add("path", path)
        .add("runId", runId)
        .add("signedUri", signedUri)
        .add("typeValue", typeValue)
        .toString();
  }
}
