// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Generate volume credentials RPC */
@Generated
public class GenerateTemporaryVolumeCredentialRequest {
  /**
   * The operation performed against the volume data, either READ_VOLUME or WRITE_VOLUME. If
   * WRITE_VOLUME is specified, the credentials returned will have write permissions, otherwise, it
   * will be read only.
   */
  @JsonProperty("operation")
  private VolumeOperation operation;

  /** Id of the volume to read or write. */
  @JsonProperty("volume_id")
  private String volumeId;

  public GenerateTemporaryVolumeCredentialRequest setOperation(VolumeOperation operation) {
    this.operation = operation;
    return this;
  }

  public VolumeOperation getOperation() {
    return operation;
  }

  public GenerateTemporaryVolumeCredentialRequest setVolumeId(String volumeId) {
    this.volumeId = volumeId;
    return this;
  }

  public String getVolumeId() {
    return volumeId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenerateTemporaryVolumeCredentialRequest that = (GenerateTemporaryVolumeCredentialRequest) o;
    return Objects.equals(operation, that.operation) && Objects.equals(volumeId, that.volumeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, volumeId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenerateTemporaryVolumeCredentialRequest.class)
        .add("operation", operation)
        .add("volumeId", volumeId)
        .toString();
  }
}
