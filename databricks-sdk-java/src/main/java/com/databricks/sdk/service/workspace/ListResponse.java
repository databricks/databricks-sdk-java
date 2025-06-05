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
@JsonSerialize(using = ListResponse.ListResponseSerializer.class)
@JsonDeserialize(using = ListResponse.ListResponseDeserializer.class)
public class ListResponse {
  /** List of objects. */
  private Collection<ObjectInfo> objects;

  public ListResponse setObjects(Collection<ObjectInfo> objects) {
    this.objects = objects;
    return this;
  }

  public Collection<ObjectInfo> getObjects() {
    return objects;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListResponse that = (ListResponse) o;
    return Objects.equals(objects, that.objects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objects);
  }

  @Override
  public String toString() {
    return new ToStringer(ListResponse.class).add("objects", objects).toString();
  }

  ListResponsePb toPb() {
    ListResponsePb pb = new ListResponsePb();
    pb.setObjects(objects);

    return pb;
  }

  static ListResponse fromPb(ListResponsePb pb) {
    ListResponse model = new ListResponse();
    model.setObjects(pb.getObjects());

    return model;
  }

  public static class ListResponseSerializer extends JsonSerializer<ListResponse> {
    @Override
    public void serialize(ListResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListResponseDeserializer extends JsonDeserializer<ListResponse> {
    @Override
    public ListResponse deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListResponsePb pb = mapper.readValue(p, ListResponsePb.class);
      return ListResponse.fromPb(pb);
    }
  }
}
