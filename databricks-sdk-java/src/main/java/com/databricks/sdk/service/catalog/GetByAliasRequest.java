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

/** Get Model Version By Alias */
@Generated
@JsonSerialize(using = GetByAliasRequest.GetByAliasRequestSerializer.class)
@JsonDeserialize(using = GetByAliasRequest.GetByAliasRequestDeserializer.class)
public class GetByAliasRequest {
  /** The name of the alias */
  private String alias;

  /** The three-level (fully qualified) name of the registered model */
  private String fullName;

  /** Whether to include aliases associated with the model version in the response */
  private Boolean includeAliases;

  public GetByAliasRequest setAlias(String alias) {
    this.alias = alias;
    return this;
  }

  public String getAlias() {
    return alias;
  }

  public GetByAliasRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetByAliasRequest setIncludeAliases(Boolean includeAliases) {
    this.includeAliases = includeAliases;
    return this;
  }

  public Boolean getIncludeAliases() {
    return includeAliases;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetByAliasRequest that = (GetByAliasRequest) o;
    return Objects.equals(alias, that.alias)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(includeAliases, that.includeAliases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, fullName, includeAliases);
  }

  @Override
  public String toString() {
    return new ToStringer(GetByAliasRequest.class)
        .add("alias", alias)
        .add("fullName", fullName)
        .add("includeAliases", includeAliases)
        .toString();
  }

  GetByAliasRequestPb toPb() {
    GetByAliasRequestPb pb = new GetByAliasRequestPb();
    pb.setAlias(alias);
    pb.setFullName(fullName);
    pb.setIncludeAliases(includeAliases);

    return pb;
  }

  static GetByAliasRequest fromPb(GetByAliasRequestPb pb) {
    GetByAliasRequest model = new GetByAliasRequest();
    model.setAlias(pb.getAlias());
    model.setFullName(pb.getFullName());
    model.setIncludeAliases(pb.getIncludeAliases());

    return model;
  }

  public static class GetByAliasRequestSerializer extends JsonSerializer<GetByAliasRequest> {
    @Override
    public void serialize(GetByAliasRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetByAliasRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetByAliasRequestDeserializer extends JsonDeserializer<GetByAliasRequest> {
    @Override
    public GetByAliasRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetByAliasRequestPb pb = mapper.readValue(p, GetByAliasRequestPb.class);
      return GetByAliasRequest.fromPb(pb);
    }
  }
}
