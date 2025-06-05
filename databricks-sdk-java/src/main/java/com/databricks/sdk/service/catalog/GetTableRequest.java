// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

/** Get a table */
@Generated
@JsonSerialize(using = GetTableRequest.GetTableRequestSerializer.class)
@JsonDeserialize(using = GetTableRequest.GetTableRequestDeserializer.class)
public class GetTableRequest {
  /** Full name of the table. */
  private String fullName;

  /**
   * Whether to include tables in the response for which the principal can only access selective
   * metadata for
   */
  private Boolean includeBrowse;

  /** Whether delta metadata should be included in the response. */
  private Boolean includeDeltaMetadata;

  /** Whether to include a manifest containing capabilities the table has. */
  private Boolean includeManifestCapabilities;

  public GetTableRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetTableRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  public GetTableRequest setIncludeDeltaMetadata(Boolean includeDeltaMetadata) {
    this.includeDeltaMetadata = includeDeltaMetadata;
    return this;
  }

  public Boolean getIncludeDeltaMetadata() {
    return includeDeltaMetadata;
  }

  public GetTableRequest setIncludeManifestCapabilities(Boolean includeManifestCapabilities) {
    this.includeManifestCapabilities = includeManifestCapabilities;
    return this;
  }

  public Boolean getIncludeManifestCapabilities() {
    return includeManifestCapabilities;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetTableRequest that = (GetTableRequest) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(includeBrowse, that.includeBrowse)
        && Objects.equals(includeDeltaMetadata, that.includeDeltaMetadata)
        && Objects.equals(includeManifestCapabilities, that.includeManifestCapabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, includeBrowse, includeDeltaMetadata, includeManifestCapabilities);
  }

  @Override
  public String toString() {
    return new ToStringer(GetTableRequest.class)
        .add("fullName", fullName)
        .add("includeBrowse", includeBrowse)
        .add("includeDeltaMetadata", includeDeltaMetadata)
        .add("includeManifestCapabilities", includeManifestCapabilities)
        .toString();
  }

  GetTableRequestPb toPb() {
    GetTableRequestPb pb = new GetTableRequestPb();
    pb.setFullName(fullName);
    pb.setIncludeBrowse(includeBrowse);
    pb.setIncludeDeltaMetadata(includeDeltaMetadata);
    pb.setIncludeManifestCapabilities(includeManifestCapabilities);

    return pb;
  }

  static GetTableRequest fromPb(GetTableRequestPb pb) {
    GetTableRequest model = new GetTableRequest();
    model.setFullName(pb.getFullName());
    model.setIncludeBrowse(pb.getIncludeBrowse());
    model.setIncludeDeltaMetadata(pb.getIncludeDeltaMetadata());
    model.setIncludeManifestCapabilities(pb.getIncludeManifestCapabilities());

    return model;
  }

  public static class GetTableRequestSerializer extends JsonSerializer<GetTableRequest> {
    @Override
    public void serialize(GetTableRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetTableRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetTableRequestDeserializer extends JsonDeserializer<GetTableRequest> {
    @Override
    public GetTableRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetTableRequestPb pb = mapper.readValue(p, GetTableRequestPb.class);
      return GetTableRequest.fromPb(pb);
    }
  }
}
