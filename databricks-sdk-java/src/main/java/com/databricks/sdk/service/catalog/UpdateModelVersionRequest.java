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

@Generated
@JsonSerialize(using = UpdateModelVersionRequest.UpdateModelVersionRequestSerializer.class)
@JsonDeserialize(using = UpdateModelVersionRequest.UpdateModelVersionRequestDeserializer.class)
public class UpdateModelVersionRequest {
  /** The comment attached to the model version */
  private String comment;

  /** The three-level (fully qualified) name of the model version */
  private String fullName;

  /** The integer version number of the model version */
  private Long version;

  public UpdateModelVersionRequest setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateModelVersionRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public UpdateModelVersionRequest setVersion(Long version) {
    this.version = version;
    return this;
  }

  public Long getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateModelVersionRequest that = (UpdateModelVersionRequest) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, fullName, version);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateModelVersionRequest.class)
        .add("comment", comment)
        .add("fullName", fullName)
        .add("version", version)
        .toString();
  }

  UpdateModelVersionRequestPb toPb() {
    UpdateModelVersionRequestPb pb = new UpdateModelVersionRequestPb();
    pb.setComment(comment);
    pb.setFullName(fullName);
    pb.setVersion(version);

    return pb;
  }

  static UpdateModelVersionRequest fromPb(UpdateModelVersionRequestPb pb) {
    UpdateModelVersionRequest model = new UpdateModelVersionRequest();
    model.setComment(pb.getComment());
    model.setFullName(pb.getFullName());
    model.setVersion(pb.getVersion());

    return model;
  }

  public static class UpdateModelVersionRequestSerializer
      extends JsonSerializer<UpdateModelVersionRequest> {
    @Override
    public void serialize(
        UpdateModelVersionRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateModelVersionRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateModelVersionRequestDeserializer
      extends JsonDeserializer<UpdateModelVersionRequest> {
    @Override
    public UpdateModelVersionRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateModelVersionRequestPb pb = mapper.readValue(p, UpdateModelVersionRequestPb.class);
      return UpdateModelVersionRequest.fromPb(pb);
    }
  }
}
