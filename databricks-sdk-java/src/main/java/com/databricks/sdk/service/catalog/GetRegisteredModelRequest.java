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

/** Get a Registered Model */
@Generated
@JsonSerialize(using = GetRegisteredModelRequest.GetRegisteredModelRequestSerializer.class)
@JsonDeserialize(using = GetRegisteredModelRequest.GetRegisteredModelRequestDeserializer.class)
public class GetRegisteredModelRequest {
  /** The three-level (fully qualified) name of the registered model */
  private String fullName;

  /** Whether to include registered model aliases in the response */
  private Boolean includeAliases;

  /**
   * Whether to include registered models in the response for which the principal can only access
   * selective metadata for
   */
  private Boolean includeBrowse;

  public GetRegisteredModelRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetRegisteredModelRequest setIncludeAliases(Boolean includeAliases) {
    this.includeAliases = includeAliases;
    return this;
  }

  public Boolean getIncludeAliases() {
    return includeAliases;
  }

  public GetRegisteredModelRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRegisteredModelRequest that = (GetRegisteredModelRequest) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(includeAliases, that.includeAliases)
        && Objects.equals(includeBrowse, that.includeBrowse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, includeAliases, includeBrowse);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRegisteredModelRequest.class)
        .add("fullName", fullName)
        .add("includeAliases", includeAliases)
        .add("includeBrowse", includeBrowse)
        .toString();
  }

  GetRegisteredModelRequestPb toPb() {
    GetRegisteredModelRequestPb pb = new GetRegisteredModelRequestPb();
    pb.setFullName(fullName);
    pb.setIncludeAliases(includeAliases);
    pb.setIncludeBrowse(includeBrowse);

    return pb;
  }

  static GetRegisteredModelRequest fromPb(GetRegisteredModelRequestPb pb) {
    GetRegisteredModelRequest model = new GetRegisteredModelRequest();
    model.setFullName(pb.getFullName());
    model.setIncludeAliases(pb.getIncludeAliases());
    model.setIncludeBrowse(pb.getIncludeBrowse());

    return model;
  }

  public static class GetRegisteredModelRequestSerializer
      extends JsonSerializer<GetRegisteredModelRequest> {
    @Override
    public void serialize(
        GetRegisteredModelRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetRegisteredModelRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetRegisteredModelRequestDeserializer
      extends JsonDeserializer<GetRegisteredModelRequest> {
    @Override
    public GetRegisteredModelRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetRegisteredModelRequestPb pb = mapper.readValue(p, GetRegisteredModelRequestPb.class);
      return GetRegisteredModelRequest.fromPb(pb);
    }
  }
}
