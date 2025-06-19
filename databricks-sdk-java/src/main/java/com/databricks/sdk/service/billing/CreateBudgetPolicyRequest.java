// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

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

/** A request to create a BudgetPolicy. */
@Generated
@JsonSerialize(using = CreateBudgetPolicyRequest.CreateBudgetPolicyRequestSerializer.class)
@JsonDeserialize(using = CreateBudgetPolicyRequest.CreateBudgetPolicyRequestDeserializer.class)
public class CreateBudgetPolicyRequest {
  /**
   * The policy to create. `policy_id` needs to be empty as it will be generated `policy_name` must
   * be provided, custom_tags may need to be provided depending on the cloud provider. All other
   * fields are optional.
   */
  private BudgetPolicy policy;

  /**
   * A unique identifier for this request. Restricted to 36 ASCII characters. A random UUID is
   * recommended. This request is only idempotent if a `request_id` is provided.
   */
  private String requestId;

  public CreateBudgetPolicyRequest setPolicy(BudgetPolicy policy) {
    this.policy = policy;
    return this;
  }

  public BudgetPolicy getPolicy() {
    return policy;
  }

  public CreateBudgetPolicyRequest setRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  public String getRequestId() {
    return requestId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateBudgetPolicyRequest that = (CreateBudgetPolicyRequest) o;
    return Objects.equals(policy, that.policy) && Objects.equals(requestId, that.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, requestId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateBudgetPolicyRequest.class)
        .add("policy", policy)
        .add("requestId", requestId)
        .toString();
  }

  CreateBudgetPolicyRequestPb toPb() {
    CreateBudgetPolicyRequestPb pb = new CreateBudgetPolicyRequestPb();
    pb.setPolicy(policy);
    pb.setRequestId(requestId);

    return pb;
  }

  static CreateBudgetPolicyRequest fromPb(CreateBudgetPolicyRequestPb pb) {
    CreateBudgetPolicyRequest model = new CreateBudgetPolicyRequest();
    model.setPolicy(pb.getPolicy());
    model.setRequestId(pb.getRequestId());

    return model;
  }

  public static class CreateBudgetPolicyRequestSerializer
      extends JsonSerializer<CreateBudgetPolicyRequest> {
    @Override
    public void serialize(
        CreateBudgetPolicyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateBudgetPolicyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateBudgetPolicyRequestDeserializer
      extends JsonDeserializer<CreateBudgetPolicyRequest> {
    @Override
    public CreateBudgetPolicyRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateBudgetPolicyRequestPb pb = mapper.readValue(p, CreateBudgetPolicyRequestPb.class);
      return CreateBudgetPolicyRequest.fromPb(pb);
    }
  }
}
