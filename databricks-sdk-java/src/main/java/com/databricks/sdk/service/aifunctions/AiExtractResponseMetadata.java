// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class AiExtractResponseMetadata {
  /**
   * How the source was chunked for citation offsets (span for text input, bbox for parsed-document
   * input); present when citations are enabled.
   */
  @JsonProperty("chunk_type")
  private String chunkType;

  /** Citation objects locating each result in the source; present when citations are enabled. */
  @JsonProperty("citations")
  private Collection<AiExtractCitation> citations;

  /** The resolved extraction mode; present when a non-default mode was used. */
  @JsonProperty("mode")
  private String mode;

  /** The resolved function version. */
  @JsonProperty("version")
  private String version;

  public AiExtractResponseMetadata setChunkType(String chunkType) {
    this.chunkType = chunkType;
    return this;
  }

  public String getChunkType() {
    return chunkType;
  }

  public AiExtractResponseMetadata setCitations(Collection<AiExtractCitation> citations) {
    this.citations = citations;
    return this;
  }

  public Collection<AiExtractCitation> getCitations() {
    return citations;
  }

  public AiExtractResponseMetadata setMode(String mode) {
    this.mode = mode;
    return this;
  }

  public String getMode() {
    return mode;
  }

  public AiExtractResponseMetadata setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiExtractResponseMetadata that = (AiExtractResponseMetadata) o;
    return Objects.equals(chunkType, that.chunkType)
        && Objects.equals(citations, that.citations)
        && Objects.equals(mode, that.mode)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chunkType, citations, mode, version);
  }

  @Override
  public String toString() {
    return new ToStringer(AiExtractResponseMetadata.class)
        .add("chunkType", chunkType)
        .add("citations", citations)
        .add("mode", mode)
        .add("version", version)
        .toString();
  }
}
