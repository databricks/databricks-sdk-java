// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
@JsonSerialize(using = ListInstancePools.ListInstancePoolsSerializer.class)
@JsonDeserialize(using = ListInstancePools.ListInstancePoolsDeserializer.class)
public class ListInstancePools {
  /** */
  private Collection<InstancePoolAndStats> instancePools;

  public ListInstancePools setInstancePools(Collection<InstancePoolAndStats> instancePools) {
    this.instancePools = instancePools;
    return this;
  }

  public Collection<InstancePoolAndStats> getInstancePools() {
    return instancePools;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListInstancePools that = (ListInstancePools) o;
    return Objects.equals(instancePools, that.instancePools);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instancePools);
  }

  @Override
  public String toString() {
    return new ToStringer(ListInstancePools.class).add("instancePools", instancePools).toString();
  }

  ListInstancePoolsPb toPb() {
    ListInstancePoolsPb pb = new ListInstancePoolsPb();
    pb.setInstancePools(instancePools);

    return pb;
  }

  static ListInstancePools fromPb(ListInstancePoolsPb pb) {
    ListInstancePools model = new ListInstancePools();
    model.setInstancePools(pb.getInstancePools());

    return model;
  }

  public static class ListInstancePoolsSerializer extends JsonSerializer<ListInstancePools> {
    @Override
    public void serialize(ListInstancePools value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListInstancePoolsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListInstancePoolsDeserializer extends JsonDeserializer<ListInstancePools> {
    @Override
    public ListInstancePools deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListInstancePoolsPb pb = mapper.readValue(p, ListInstancePoolsPb.class);
      return ListInstancePools.fromPb(pb);
    }
  }
}
