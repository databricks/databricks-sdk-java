// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Encryption options that apply to clients connecting to cloud storage. */
@Generated
public class EncryptionDetails {
  /** Server-Side Encryption properties for clients communicating with AWS s3. */
  @JsonProperty("sse_encryption_details")
  private SseEncryptionDetails sseEncryptionDetails;

  public EncryptionDetails setSseEncryptionDetails(SseEncryptionDetails sseEncryptionDetails) {
    this.sseEncryptionDetails = sseEncryptionDetails;
    return this;
  }

  public SseEncryptionDetails getSseEncryptionDetails() {
    return sseEncryptionDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EncryptionDetails that = (EncryptionDetails) o;
    return Objects.equals(sseEncryptionDetails, that.sseEncryptionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sseEncryptionDetails);
  }

  @Override
  public String toString() {
    return new ToStringer(EncryptionDetails.class)
        .add("sseEncryptionDetails", sseEncryptionDetails)
        .toString();
  }
}
