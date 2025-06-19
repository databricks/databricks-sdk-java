// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

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
@JsonSerialize(using = TextAttachment.TextAttachmentSerializer.class)
@JsonDeserialize(using = TextAttachment.TextAttachmentDeserializer.class)
public class TextAttachment {
  /** AI generated message */
  private String content;

  /** */
  private String id;

  public TextAttachment setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public TextAttachment setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TextAttachment that = (TextAttachment) o;
    return Objects.equals(content, that.content) && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, id);
  }

  @Override
  public String toString() {
    return new ToStringer(TextAttachment.class).add("content", content).add("id", id).toString();
  }

  TextAttachmentPb toPb() {
    TextAttachmentPb pb = new TextAttachmentPb();
    pb.setContent(content);
    pb.setId(id);

    return pb;
  }

  static TextAttachment fromPb(TextAttachmentPb pb) {
    TextAttachment model = new TextAttachment();
    model.setContent(pb.getContent());
    model.setId(pb.getId());

    return model;
  }

  public static class TextAttachmentSerializer extends JsonSerializer<TextAttachment> {
    @Override
    public void serialize(TextAttachment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TextAttachmentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TextAttachmentDeserializer extends JsonDeserializer<TextAttachment> {
    @Override
    public TextAttachment deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TextAttachmentPb pb = mapper.readValue(p, TextAttachmentPb.class);
      return TextAttachment.fromPb(pb);
    }
  }
}
