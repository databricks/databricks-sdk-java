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
import java.util.Objects;

/** Cluster Attributes showing for clusters workload types. */
@Generated
@JsonSerialize(using = WorkloadType.WorkloadTypeSerializer.class)
@JsonDeserialize(using = WorkloadType.WorkloadTypeDeserializer.class)
public class WorkloadType {
  /** defined what type of clients can use the cluster. E.g. Notebooks, Jobs */
  private ClientsTypes clients;

  public WorkloadType setClients(ClientsTypes clients) {
    this.clients = clients;
    return this;
  }

  public ClientsTypes getClients() {
    return clients;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WorkloadType that = (WorkloadType) o;
    return Objects.equals(clients, that.clients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clients);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkloadType.class).add("clients", clients).toString();
  }

  WorkloadTypePb toPb() {
    WorkloadTypePb pb = new WorkloadTypePb();
    pb.setClients(clients);

    return pb;
  }

  static WorkloadType fromPb(WorkloadTypePb pb) {
    WorkloadType model = new WorkloadType();
    model.setClients(pb.getClients());

    return model;
  }

  public static class WorkloadTypeSerializer extends JsonSerializer<WorkloadType> {
    @Override
    public void serialize(WorkloadType value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      WorkloadTypePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class WorkloadTypeDeserializer extends JsonDeserializer<WorkloadType> {
    @Override
    public WorkloadType deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      WorkloadTypePb pb = mapper.readValue(p, WorkloadTypePb.class);
      return WorkloadType.fromPb(pb);
    }
  }
}
