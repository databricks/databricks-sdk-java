// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateCleanRoomAssetReviewRequest {
  /** Asset type. Can either be NOTEBOOK_FILE or JAR_ANALYSIS. */
  @JsonIgnore private CleanRoomAssetAssetType assetType;

  /** Name of the clean room */
  @JsonIgnore private String cleanRoomName;

  /** Name of the asset */
  @JsonIgnore private String name;

  /** */
  @JsonProperty("notebook_review")
  private NotebookVersionReview notebookReview;

  public CreateCleanRoomAssetReviewRequest setAssetType(CleanRoomAssetAssetType assetType) {
    this.assetType = assetType;
    return this;
  }

  public CleanRoomAssetAssetType getAssetType() {
    return assetType;
  }

  public CreateCleanRoomAssetReviewRequest setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  public CreateCleanRoomAssetReviewRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateCleanRoomAssetReviewRequest setNotebookReview(NotebookVersionReview notebookReview) {
    this.notebookReview = notebookReview;
    return this;
  }

  public NotebookVersionReview getNotebookReview() {
    return notebookReview;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCleanRoomAssetReviewRequest that = (CreateCleanRoomAssetReviewRequest) o;
    return Objects.equals(assetType, that.assetType)
        && Objects.equals(cleanRoomName, that.cleanRoomName)
        && Objects.equals(name, that.name)
        && Objects.equals(notebookReview, that.notebookReview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetType, cleanRoomName, name, notebookReview);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCleanRoomAssetReviewRequest.class)
        .add("assetType", assetType)
        .add("cleanRoomName", cleanRoomName)
        .add("name", name)
        .add("notebookReview", notebookReview)
        .toString();
  }
}
