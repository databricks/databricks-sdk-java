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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = ListAclsResponse.ListAclsResponseSerializer.class)
@JsonDeserialize(using = ListAclsResponse.ListAclsResponseDeserializer.class)
public class ListAclsResponse {
  /** The associated ACLs rule applied to principals in the given scope. */
  private Collection<AclItem> items;

  public ListAclsResponse setItems(Collection<AclItem> items) {
    this.items = items;
    return this;
  }

  public Collection<AclItem> getItems() {
    return items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAclsResponse that = (ListAclsResponse) o;
    return Objects.equals(items, that.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAclsResponse.class).add("items", items).toString();
  }

  ListAclsResponsePb toPb() {
    ListAclsResponsePb pb = new ListAclsResponsePb();
    pb.setItems(items);

    return pb;
  }

  static ListAclsResponse fromPb(ListAclsResponsePb pb) {
    ListAclsResponse model = new ListAclsResponse();
    model.setItems(pb.getItems());

    return model;
  }

  public static class ListAclsResponseSerializer extends JsonSerializer<ListAclsResponse> {
    @Override
    public void serialize(ListAclsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListAclsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListAclsResponseDeserializer extends JsonDeserializer<ListAclsResponse> {
    @Override
    public ListAclsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListAclsResponsePb pb = mapper.readValue(p, ListAclsResponsePb.class);
      return ListAclsResponse.fromPb(pb);
    }
  }
}
