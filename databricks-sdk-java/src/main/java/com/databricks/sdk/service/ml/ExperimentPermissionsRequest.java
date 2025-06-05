// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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
@JsonSerialize(using = ExperimentPermissionsRequest.ExperimentPermissionsRequestSerializer.class)
@JsonDeserialize(
    using = ExperimentPermissionsRequest.ExperimentPermissionsRequestDeserializer.class)
public class ExperimentPermissionsRequest {
  /** */
  private Collection<ExperimentAccessControlRequest> accessControlList;

  /** The experiment for which to get or manage permissions. */
  private String experimentId;

  public ExperimentPermissionsRequest setAccessControlList(
      Collection<ExperimentAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<ExperimentAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public ExperimentPermissionsRequest setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExperimentPermissionsRequest that = (ExperimentPermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(experimentId, that.experimentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, experimentId);
  }

  @Override
  public String toString() {
    return new ToStringer(ExperimentPermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("experimentId", experimentId)
        .toString();
  }

  ExperimentPermissionsRequestPb toPb() {
    ExperimentPermissionsRequestPb pb = new ExperimentPermissionsRequestPb();
    pb.setAccessControlList(accessControlList);
    pb.setExperimentId(experimentId);

    return pb;
  }

  static ExperimentPermissionsRequest fromPb(ExperimentPermissionsRequestPb pb) {
    ExperimentPermissionsRequest model = new ExperimentPermissionsRequest();
    model.setAccessControlList(pb.getAccessControlList());
    model.setExperimentId(pb.getExperimentId());

    return model;
  }

  public static class ExperimentPermissionsRequestSerializer
      extends JsonSerializer<ExperimentPermissionsRequest> {
    @Override
    public void serialize(
        ExperimentPermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExperimentPermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExperimentPermissionsRequestDeserializer
      extends JsonDeserializer<ExperimentPermissionsRequest> {
    @Override
    public ExperimentPermissionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExperimentPermissionsRequestPb pb = mapper.readValue(p, ExperimentPermissionsRequestPb.class);
      return ExperimentPermissionsRequest.fromPb(pb);
    }
  }
}
