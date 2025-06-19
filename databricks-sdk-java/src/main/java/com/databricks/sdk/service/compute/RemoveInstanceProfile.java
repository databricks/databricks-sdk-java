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
@JsonSerialize(using = RemoveInstanceProfile.RemoveInstanceProfileSerializer.class)
@JsonDeserialize(using = RemoveInstanceProfile.RemoveInstanceProfileDeserializer.class)
public class RemoveInstanceProfile {
  /** The ARN of the instance profile to remove. This field is required. */
  private String instanceProfileArn;

  public RemoveInstanceProfile setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RemoveInstanceProfile that = (RemoveInstanceProfile) o;
    return Objects.equals(instanceProfileArn, that.instanceProfileArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceProfileArn);
  }

  @Override
  public String toString() {
    return new ToStringer(RemoveInstanceProfile.class)
        .add("instanceProfileArn", instanceProfileArn)
        .toString();
  }

  RemoveInstanceProfilePb toPb() {
    RemoveInstanceProfilePb pb = new RemoveInstanceProfilePb();
    pb.setInstanceProfileArn(instanceProfileArn);

    return pb;
  }

  static RemoveInstanceProfile fromPb(RemoveInstanceProfilePb pb) {
    RemoveInstanceProfile model = new RemoveInstanceProfile();
    model.setInstanceProfileArn(pb.getInstanceProfileArn());

    return model;
  }

  public static class RemoveInstanceProfileSerializer
      extends JsonSerializer<RemoveInstanceProfile> {
    @Override
    public void serialize(
        RemoveInstanceProfile value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RemoveInstanceProfilePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RemoveInstanceProfileDeserializer
      extends JsonDeserializer<RemoveInstanceProfile> {
    @Override
    public RemoveInstanceProfile deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RemoveInstanceProfilePb pb = mapper.readValue(p, RemoveInstanceProfilePb.class);
      return RemoveInstanceProfile.fromPb(pb);
    }
  }
}
