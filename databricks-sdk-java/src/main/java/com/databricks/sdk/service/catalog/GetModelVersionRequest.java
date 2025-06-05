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

/** Get a Model Version */
@Generated
@JsonSerialize(using = GetModelVersionRequest.GetModelVersionRequestSerializer.class)
@JsonDeserialize(using = GetModelVersionRequest.GetModelVersionRequestDeserializer.class)
public class GetModelVersionRequest {
  /** The three-level (fully qualified) name of the model version */
  private String fullName;

  /** Whether to include aliases associated with the model version in the response */
  private Boolean includeAliases;

  /**
   * Whether to include model versions in the response for which the principal can only access
   * selective metadata for
   */
  private Boolean includeBrowse;

  /** The integer version number of the model version */
  private Long version;

  public GetModelVersionRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetModelVersionRequest setIncludeAliases(Boolean includeAliases) {
    this.includeAliases = includeAliases;
    return this;
  }

  public Boolean getIncludeAliases() {
    return includeAliases;
  }

  public GetModelVersionRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  public GetModelVersionRequest setVersion(Long version) {
    this.version = version;
    return this;
  }

  public Long getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetModelVersionRequest that = (GetModelVersionRequest) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(includeAliases, that.includeAliases)
        && Objects.equals(includeBrowse, that.includeBrowse)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, includeAliases, includeBrowse, version);
  }

  @Override
  public String toString() {
    return new ToStringer(GetModelVersionRequest.class)
        .add("fullName", fullName)
        .add("includeAliases", includeAliases)
        .add("includeBrowse", includeBrowse)
        .add("version", version)
        .toString();
  }

  GetModelVersionRequestPb toPb() {
    GetModelVersionRequestPb pb = new GetModelVersionRequestPb();
    pb.setFullName(fullName);
    pb.setIncludeAliases(includeAliases);
    pb.setIncludeBrowse(includeBrowse);
    pb.setVersion(version);

    return pb;
  }

  static GetModelVersionRequest fromPb(GetModelVersionRequestPb pb) {
    GetModelVersionRequest model = new GetModelVersionRequest();
    model.setFullName(pb.getFullName());
    model.setIncludeAliases(pb.getIncludeAliases());
    model.setIncludeBrowse(pb.getIncludeBrowse());
    model.setVersion(pb.getVersion());

    return model;
  }

  public static class GetModelVersionRequestSerializer
      extends JsonSerializer<GetModelVersionRequest> {
    @Override
    public void serialize(
        GetModelVersionRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetModelVersionRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetModelVersionRequestDeserializer
      extends JsonDeserializer<GetModelVersionRequest> {
    @Override
    public GetModelVersionRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetModelVersionRequestPb pb = mapper.readValue(p, GetModelVersionRequestPb.class);
      return GetModelVersionRequest.fromPb(pb);
    }
  }
}
