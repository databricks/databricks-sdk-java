// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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

/** Run repair was initiated. */
@Generated
@JsonSerialize(using = RepairRunResponse.RepairRunResponseSerializer.class)
@JsonDeserialize(using = RepairRunResponse.RepairRunResponseDeserializer.class)
public class RepairRunResponse {
  /**
   * The ID of the repair. Must be provided in subsequent repairs using the `latest_repair_id` field
   * to ensure sequential repairs.
   */
  private Long repairId;

  public RepairRunResponse setRepairId(Long repairId) {
    this.repairId = repairId;
    return this;
  }

  public Long getRepairId() {
    return repairId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RepairRunResponse that = (RepairRunResponse) o;
    return Objects.equals(repairId, that.repairId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repairId);
  }

  @Override
  public String toString() {
    return new ToStringer(RepairRunResponse.class).add("repairId", repairId).toString();
  }

  RepairRunResponsePb toPb() {
    RepairRunResponsePb pb = new RepairRunResponsePb();
    pb.setRepairId(repairId);

    return pb;
  }

  static RepairRunResponse fromPb(RepairRunResponsePb pb) {
    RepairRunResponse model = new RepairRunResponse();
    model.setRepairId(pb.getRepairId());

    return model;
  }

  public static class RepairRunResponseSerializer extends JsonSerializer<RepairRunResponse> {
    @Override
    public void serialize(RepairRunResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RepairRunResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RepairRunResponseDeserializer extends JsonDeserializer<RepairRunResponse> {
    @Override
    public RepairRunResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RepairRunResponsePb pb = mapper.readValue(p, RepairRunResponsePb.class);
      return RepairRunResponse.fromPb(pb);
    }
  }
}
