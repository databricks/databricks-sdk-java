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
@JsonSerialize(using = InstanceProfile.InstanceProfileSerializer.class)
@JsonDeserialize(using = InstanceProfile.InstanceProfileDeserializer.class)
public class InstanceProfile {
  /**
   * The AWS IAM role ARN of the role associated with the instance profile. This field is required
   * if your role name and instance profile name do not match and you want to use the instance
   * profile with [Databricks SQL Serverless].
   *
   * <p>Otherwise, this field is optional.
   *
   * <p>[Databricks SQL Serverless]: https://docs.databricks.com/sql/admin/serverless.html
   */
  private String iamRoleArn;

  /** The AWS ARN of the instance profile to register with Databricks. This field is required. */
  private String instanceProfileArn;

  /**
   * Boolean flag indicating whether the instance profile should only be used in credential
   * passthrough scenarios. If true, it means the instance profile contains an meta IAM role which
   * could assume a wide range of roles. Therefore it should always be used with authorization. This
   * field is optional, the default value is `false`.
   */
  private Boolean isMetaInstanceProfile;

  public InstanceProfile setIamRoleArn(String iamRoleArn) {
    this.iamRoleArn = iamRoleArn;
    return this;
  }

  public String getIamRoleArn() {
    return iamRoleArn;
  }

  public InstanceProfile setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  public InstanceProfile setIsMetaInstanceProfile(Boolean isMetaInstanceProfile) {
    this.isMetaInstanceProfile = isMetaInstanceProfile;
    return this;
  }

  public Boolean getIsMetaInstanceProfile() {
    return isMetaInstanceProfile;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InstanceProfile that = (InstanceProfile) o;
    return Objects.equals(iamRoleArn, that.iamRoleArn)
        && Objects.equals(instanceProfileArn, that.instanceProfileArn)
        && Objects.equals(isMetaInstanceProfile, that.isMetaInstanceProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iamRoleArn, instanceProfileArn, isMetaInstanceProfile);
  }

  @Override
  public String toString() {
    return new ToStringer(InstanceProfile.class)
        .add("iamRoleArn", iamRoleArn)
        .add("instanceProfileArn", instanceProfileArn)
        .add("isMetaInstanceProfile", isMetaInstanceProfile)
        .toString();
  }

  InstanceProfilePb toPb() {
    InstanceProfilePb pb = new InstanceProfilePb();
    pb.setIamRoleArn(iamRoleArn);
    pb.setInstanceProfileArn(instanceProfileArn);
    pb.setIsMetaInstanceProfile(isMetaInstanceProfile);

    return pb;
  }

  static InstanceProfile fromPb(InstanceProfilePb pb) {
    InstanceProfile model = new InstanceProfile();
    model.setIamRoleArn(pb.getIamRoleArn());
    model.setInstanceProfileArn(pb.getInstanceProfileArn());
    model.setIsMetaInstanceProfile(pb.getIsMetaInstanceProfile());

    return model;
  }

  public static class InstanceProfileSerializer extends JsonSerializer<InstanceProfile> {
    @Override
    public void serialize(InstanceProfile value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      InstanceProfilePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class InstanceProfileDeserializer extends JsonDeserializer<InstanceProfile> {
    @Override
    public InstanceProfile deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      InstanceProfilePb pb = mapper.readValue(p, InstanceProfilePb.class);
      return InstanceProfile.fromPb(pb);
    }
  }
}
