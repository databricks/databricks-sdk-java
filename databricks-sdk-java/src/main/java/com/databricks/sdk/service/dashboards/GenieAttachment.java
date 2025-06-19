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

/** Genie AI Response */
@Generated
@JsonSerialize(using = GenieAttachment.GenieAttachmentSerializer.class)
@JsonDeserialize(using = GenieAttachment.GenieAttachmentDeserializer.class)
public class GenieAttachment {
  /** Attachment ID */
  private String attachmentId;

  /** Query Attachment if Genie responds with a SQL query */
  private GenieQueryAttachment query;

  /** Text Attachment if Genie responds with text */
  private TextAttachment text;

  public GenieAttachment setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

  public String getAttachmentId() {
    return attachmentId;
  }

  public GenieAttachment setQuery(GenieQueryAttachment query) {
    this.query = query;
    return this;
  }

  public GenieQueryAttachment getQuery() {
    return query;
  }

  public GenieAttachment setText(TextAttachment text) {
    this.text = text;
    return this;
  }

  public TextAttachment getText() {
    return text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieAttachment that = (GenieAttachment) o;
    return Objects.equals(attachmentId, that.attachmentId)
        && Objects.equals(query, that.query)
        && Objects.equals(text, that.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentId, query, text);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAttachment.class)
        .add("attachmentId", attachmentId)
        .add("query", query)
        .add("text", text)
        .toString();
  }

  GenieAttachmentPb toPb() {
    GenieAttachmentPb pb = new GenieAttachmentPb();
    pb.setAttachmentId(attachmentId);
    pb.setQuery(query);
    pb.setText(text);

    return pb;
  }

  static GenieAttachment fromPb(GenieAttachmentPb pb) {
    GenieAttachment model = new GenieAttachment();
    model.setAttachmentId(pb.getAttachmentId());
    model.setQuery(pb.getQuery());
    model.setText(pb.getText());

    return model;
  }

  public static class GenieAttachmentSerializer extends JsonSerializer<GenieAttachment> {
    @Override
    public void serialize(GenieAttachment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GenieAttachmentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenieAttachmentDeserializer extends JsonDeserializer<GenieAttachment> {
    @Override
    public GenieAttachment deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenieAttachmentPb pb = mapper.readValue(p, GenieAttachmentPb.class);
      return GenieAttachment.fromPb(pb);
    }
  }
}
