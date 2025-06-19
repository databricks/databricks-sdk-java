// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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
@JsonSerialize(using = NotebookFile.NotebookFileSerializer.class)
@JsonDeserialize(using = NotebookFile.NotebookFileDeserializer.class)
public class NotebookFile {
  /** The comment of the notebook file. */
  private String comment;

  /** The id of the notebook file. */
  private String id;

  /** Name of the notebook file. */
  private String name;

  /** The name of the share that the notebook file belongs to. */
  private String share;

  /** The id of the share that the notebook file belongs to. */
  private String shareId;

  /** The tags of the notebook file. */
  private Collection<com.databricks.sdk.service.catalog.TagKeyValue> tags;

  public NotebookFile setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public NotebookFile setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public NotebookFile setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public NotebookFile setShare(String share) {
    this.share = share;
    return this;
  }

  public String getShare() {
    return share;
  }

  public NotebookFile setShareId(String shareId) {
    this.shareId = shareId;
    return this;
  }

  public String getShareId() {
    return shareId;
  }

  public NotebookFile setTags(Collection<com.databricks.sdk.service.catalog.TagKeyValue> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<com.databricks.sdk.service.catalog.TagKeyValue> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NotebookFile that = (NotebookFile) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(id, that.id)
        && Objects.equals(name, that.name)
        && Objects.equals(share, that.share)
        && Objects.equals(shareId, that.shareId)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, id, name, share, shareId, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(NotebookFile.class)
        .add("comment", comment)
        .add("id", id)
        .add("name", name)
        .add("share", share)
        .add("shareId", shareId)
        .add("tags", tags)
        .toString();
  }

  NotebookFilePb toPb() {
    NotebookFilePb pb = new NotebookFilePb();
    pb.setComment(comment);
    pb.setId(id);
    pb.setName(name);
    pb.setShare(share);
    pb.setShareId(shareId);
    pb.setTags(tags);

    return pb;
  }

  static NotebookFile fromPb(NotebookFilePb pb) {
    NotebookFile model = new NotebookFile();
    model.setComment(pb.getComment());
    model.setId(pb.getId());
    model.setName(pb.getName());
    model.setShare(pb.getShare());
    model.setShareId(pb.getShareId());
    model.setTags(pb.getTags());

    return model;
  }

  public static class NotebookFileSerializer extends JsonSerializer<NotebookFile> {
    @Override
    public void serialize(NotebookFile value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      NotebookFilePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class NotebookFileDeserializer extends JsonDeserializer<NotebookFile> {
    @Override
    public NotebookFile deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      NotebookFilePb pb = mapper.readValue(p, NotebookFilePb.class);
      return NotebookFile.fromPb(pb);
    }
  }
}
