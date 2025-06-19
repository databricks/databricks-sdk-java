// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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

/** Lists ACLs */
@Generated
@JsonSerialize(using = ListAclsRequest.ListAclsRequestSerializer.class)
@JsonDeserialize(using = ListAclsRequest.ListAclsRequestDeserializer.class)
public class ListAclsRequest {
  /** The name of the scope to fetch ACL information from. */
  private String scope;

  public ListAclsRequest setScope(String scope) {
    this.scope = scope;
    return this;
  }

  public String getScope() {
    return scope;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAclsRequest that = (ListAclsRequest) o;
    return Objects.equals(scope, that.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAclsRequest.class).add("scope", scope).toString();
  }

  ListAclsRequestPb toPb() {
    ListAclsRequestPb pb = new ListAclsRequestPb();
    pb.setScope(scope);

    return pb;
  }

  static ListAclsRequest fromPb(ListAclsRequestPb pb) {
    ListAclsRequest model = new ListAclsRequest();
    model.setScope(pb.getScope());

    return model;
  }

  public static class ListAclsRequestSerializer extends JsonSerializer<ListAclsRequest> {
    @Override
    public void serialize(ListAclsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListAclsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListAclsRequestDeserializer extends JsonDeserializer<ListAclsRequest> {
    @Override
    public ListAclsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListAclsRequestPb pb = mapper.readValue(p, ListAclsRequestPb.class);
      return ListAclsRequest.fromPb(pb);
    }
  }
}
