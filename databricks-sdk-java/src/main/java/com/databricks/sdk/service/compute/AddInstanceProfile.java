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
@JsonSerialize(using = AddInstanceProfile.AddInstanceProfileSerializer.class)
@JsonDeserialize(using = AddInstanceProfile.AddInstanceProfileDeserializer.class)
public class AddInstanceProfile {
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

  /**
   * By default, Databricks validates that it has sufficient permissions to launch instances with
   * the instance profile. This validation uses AWS dry-run mode for the RunInstances API. If
   * validation fails with an error message that does not indicate an IAM related permission issue,
   * (e.g. “Your requested instance type is not supported in your requested availability zone”), you
   * can pass this flag to skip the validation and forcibly add the instance profile.
   */
  private Boolean skipValidation;

  public AddInstanceProfile setIamRoleArn(String iamRoleArn) {
    this.iamRoleArn = iamRoleArn;
    return this;
  }

  public String getIamRoleArn() {
    return iamRoleArn;
  }

  public AddInstanceProfile setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  public AddInstanceProfile setIsMetaInstanceProfile(Boolean isMetaInstanceProfile) {
    this.isMetaInstanceProfile = isMetaInstanceProfile;
    return this;
  }

  public Boolean getIsMetaInstanceProfile() {
    return isMetaInstanceProfile;
  }

  public AddInstanceProfile setSkipValidation(Boolean skipValidation) {
    this.skipValidation = skipValidation;
    return this;
  }

  public Boolean getSkipValidation() {
    return skipValidation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AddInstanceProfile that = (AddInstanceProfile) o;
    return Objects.equals(iamRoleArn, that.iamRoleArn)
        && Objects.equals(instanceProfileArn, that.instanceProfileArn)
        && Objects.equals(isMetaInstanceProfile, that.isMetaInstanceProfile)
        && Objects.equals(skipValidation, that.skipValidation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iamRoleArn, instanceProfileArn, isMetaInstanceProfile, skipValidation);
  }

  @Override
  public String toString() {
    return new ToStringer(AddInstanceProfile.class)
        .add("iamRoleArn", iamRoleArn)
        .add("instanceProfileArn", instanceProfileArn)
        .add("isMetaInstanceProfile", isMetaInstanceProfile)
        .add("skipValidation", skipValidation)
        .toString();
  }

  AddInstanceProfilePb toPb() {
    AddInstanceProfilePb pb = new AddInstanceProfilePb();
    pb.setIamRoleArn(iamRoleArn);
    pb.setInstanceProfileArn(instanceProfileArn);
    pb.setIsMetaInstanceProfile(isMetaInstanceProfile);
    pb.setSkipValidation(skipValidation);

    return pb;
  }

  static AddInstanceProfile fromPb(AddInstanceProfilePb pb) {
    AddInstanceProfile model = new AddInstanceProfile();
    model.setIamRoleArn(pb.getIamRoleArn());
    model.setInstanceProfileArn(pb.getInstanceProfileArn());
    model.setIsMetaInstanceProfile(pb.getIsMetaInstanceProfile());
    model.setSkipValidation(pb.getSkipValidation());

    return model;
  }

  public static class AddInstanceProfileSerializer extends JsonSerializer<AddInstanceProfile> {
    @Override
    public void serialize(AddInstanceProfile value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AddInstanceProfilePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AddInstanceProfileDeserializer extends JsonDeserializer<AddInstanceProfile> {
    @Override
    public AddInstanceProfile deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AddInstanceProfilePb pb = mapper.readValue(p, AddInstanceProfilePb.class);
      return AddInstanceProfile.fromPb(pb);
    }
  }
}
