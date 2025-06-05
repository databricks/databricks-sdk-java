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
@JsonSerialize(using = InstancePoolStatus.InstancePoolStatusSerializer.class)
@JsonDeserialize(using = InstancePoolStatus.InstancePoolStatusDeserializer.class)
public class InstancePoolStatus {
  /**
   * List of error messages for the failed pending instances. The pending_instance_errors follows
   * FIFO with maximum length of the min_idle of the pool. The pending_instance_errors is emptied
   * once the number of exiting available instances reaches the min_idle of the pool.
   */
  private Collection<PendingInstanceError> pendingInstanceErrors;

  public InstancePoolStatus setPendingInstanceErrors(
      Collection<PendingInstanceError> pendingInstanceErrors) {
    this.pendingInstanceErrors = pendingInstanceErrors;
    return this;
  }

  public Collection<PendingInstanceError> getPendingInstanceErrors() {
    return pendingInstanceErrors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InstancePoolStatus that = (InstancePoolStatus) o;
    return Objects.equals(pendingInstanceErrors, that.pendingInstanceErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pendingInstanceErrors);
  }

  @Override
  public String toString() {
    return new ToStringer(InstancePoolStatus.class)
        .add("pendingInstanceErrors", pendingInstanceErrors)
        .toString();
  }

  InstancePoolStatusPb toPb() {
    InstancePoolStatusPb pb = new InstancePoolStatusPb();
    pb.setPendingInstanceErrors(pendingInstanceErrors);

    return pb;
  }

  static InstancePoolStatus fromPb(InstancePoolStatusPb pb) {
    InstancePoolStatus model = new InstancePoolStatus();
    model.setPendingInstanceErrors(pb.getPendingInstanceErrors());

    return model;
  }

  public static class InstancePoolStatusSerializer extends JsonSerializer<InstancePoolStatus> {
    @Override
    public void serialize(InstancePoolStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      InstancePoolStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class InstancePoolStatusDeserializer extends JsonDeserializer<InstancePoolStatus> {
    @Override
    public InstancePoolStatus deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      InstancePoolStatusPb pb = mapper.readValue(p, InstancePoolStatusPb.class);
      return InstancePoolStatus.fromPb(pb);
    }
  }
}
