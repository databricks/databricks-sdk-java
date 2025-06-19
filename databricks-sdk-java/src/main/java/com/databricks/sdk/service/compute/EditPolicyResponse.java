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
@JsonSerialize(using = EditPolicyResponse.EditPolicyResponseSerializer.class)
@JsonDeserialize(using = EditPolicyResponse.EditPolicyResponseDeserializer.class)
public class EditPolicyResponse {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    return new ToStringer(EditPolicyResponse.class).toString();
  }

  EditPolicyResponsePb toPb() {
    EditPolicyResponsePb pb = new EditPolicyResponsePb();

    return pb;
  }

  static EditPolicyResponse fromPb(EditPolicyResponsePb pb) {
    EditPolicyResponse model = new EditPolicyResponse();

    return model;
  }

  public static class EditPolicyResponseSerializer extends JsonSerializer<EditPolicyResponse> {
    @Override
    public void serialize(EditPolicyResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EditPolicyResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EditPolicyResponseDeserializer extends JsonDeserializer<EditPolicyResponse> {
    @Override
    public EditPolicyResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EditPolicyResponsePb pb = mapper.readValue(p, EditPolicyResponsePb.class);
      return EditPolicyResponse.fromPb(pb);
    }
  }
}
