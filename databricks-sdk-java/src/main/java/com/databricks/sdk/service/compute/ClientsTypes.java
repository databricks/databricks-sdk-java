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

@Generated
@JsonSerialize(using = ClientsTypes.ClientsTypesSerializer.class)
@JsonDeserialize(using = ClientsTypes.ClientsTypesDeserializer.class)
public class ClientsTypes {
  /** With jobs set, the cluster can be used for jobs */
  private Boolean jobs;

  /** With notebooks set, this cluster can be used for notebooks */
  private Boolean notebooks;

  public ClientsTypes setJobs(Boolean jobs) {
    this.jobs = jobs;
    return this;
  }

  public Boolean getJobs() {
    return jobs;
  }

  public ClientsTypes setNotebooks(Boolean notebooks) {
    this.notebooks = notebooks;
    return this;
  }

  public Boolean getNotebooks() {
    return notebooks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClientsTypes that = (ClientsTypes) o;
    return Objects.equals(jobs, that.jobs) && Objects.equals(notebooks, that.notebooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobs, notebooks);
  }

  @Override
  public String toString() {
    return new ToStringer(ClientsTypes.class)
        .add("jobs", jobs)
        .add("notebooks", notebooks)
        .toString();
  }

  ClientsTypesPb toPb() {
    ClientsTypesPb pb = new ClientsTypesPb();
    pb.setJobs(jobs);
    pb.setNotebooks(notebooks);

    return pb;
  }

  static ClientsTypes fromPb(ClientsTypesPb pb) {
    ClientsTypes model = new ClientsTypes();
    model.setJobs(pb.getJobs());
    model.setNotebooks(pb.getNotebooks());

    return model;
  }

  public static class ClientsTypesSerializer extends JsonSerializer<ClientsTypes> {
    @Override
    public void serialize(ClientsTypes value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ClientsTypesPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ClientsTypesDeserializer extends JsonDeserializer<ClientsTypes> {
    @Override
    public ClientsTypes deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClientsTypesPb pb = mapper.readValue(p, ClientsTypesPb.class);
      return ClientsTypes.fromPb(pb);
    }
  }
}
