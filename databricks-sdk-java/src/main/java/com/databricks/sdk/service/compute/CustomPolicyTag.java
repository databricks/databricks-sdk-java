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
@JsonSerialize(using = CustomPolicyTag.CustomPolicyTagSerializer.class)
@JsonDeserialize(using = CustomPolicyTag.CustomPolicyTagDeserializer.class)
public class CustomPolicyTag {
  /**
   * The key of the tag. - Must be unique among all custom tags of the same policy - Cannot be
   * “budget-policy-name”, “budget-policy-id” or "budget-policy-resolution-result" - these tags are
   * preserved.
   *
   * <p>- Follows the regex pattern defined in cluster-common/conf/src/ClusterTagConstraints.scala
   * (https://src.dev.databricks.com/databricks/universe@1647196627c8dc7b4152ad098a94b86484b93a6c/-/blob/cluster-common/conf/src/ClusterTagConstraints.scala?L17)
   */
  private String key;

  /**
   * The value of the tag.
   *
   * <p>- Follows the regex pattern defined in cluster-common/conf/src/ClusterTagConstraints.scala
   * (https://src.dev.databricks.com/databricks/universe@1647196627c8dc7b4152ad098a94b86484b93a6c/-/blob/cluster-common/conf/src/ClusterTagConstraints.scala?L24)
   */
  private String value;

  public CustomPolicyTag setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public CustomPolicyTag setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomPolicyTag that = (CustomPolicyTag) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomPolicyTag.class).add("key", key).add("value", value).toString();
  }

  CustomPolicyTagPb toPb() {
    CustomPolicyTagPb pb = new CustomPolicyTagPb();
    pb.setKey(key);
    pb.setValue(value);

    return pb;
  }

  static CustomPolicyTag fromPb(CustomPolicyTagPb pb) {
    CustomPolicyTag model = new CustomPolicyTag();
    model.setKey(pb.getKey());
    model.setValue(pb.getValue());

    return model;
  }

  public static class CustomPolicyTagSerializer extends JsonSerializer<CustomPolicyTag> {
    @Override
    public void serialize(CustomPolicyTag value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CustomPolicyTagPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CustomPolicyTagDeserializer extends JsonDeserializer<CustomPolicyTag> {
    @Override
    public CustomPolicyTag deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CustomPolicyTagPb pb = mapper.readValue(p, CustomPolicyTagPb.class);
      return CustomPolicyTag.fromPb(pb);
    }
  }
}
