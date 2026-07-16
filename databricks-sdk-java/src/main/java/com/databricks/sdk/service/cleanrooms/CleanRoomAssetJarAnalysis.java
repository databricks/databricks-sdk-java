// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CleanRoomAssetJarAnalysis {
  /**
   * The full paths in central to the jar files that are added to the library during execution (e.g.
   * /Volumes/creator/schema/volume/folder/my_jar_file.jar) Only returned for the owner
   * collaborator.
   */
  @JsonProperty("central_jar_file_paths")
  private Collection<String> centralJarFilePaths;

  /** Optional description of the jar analysis shown to all collaborators. */
  @JsonProperty("description")
  private String description;

  /**
   * The serverless environment version used to execute the JAR analysis (e.g. "4"). Defaults to
   * "4-scala-preview" if not specified.
   */
  @JsonProperty("environment_version")
  private String environmentVersion;

  /** Server generated etag that represents the jar analysis version. */
  @JsonProperty("etag")
  private String etag;

  /**
   * The full name of the class containing the main method to be executed. This class must be
   * contained in a JAR provided as a library The code must use `SparkContext.getOrCreate` to obtain
   * a Spark context; otherwise, runs of the job fail
   */
  @JsonProperty("main_class_name")
  private String mainClassName;

  /** Top-level status derived from all reviews. */
  @JsonProperty("review_state")
  private CleanRoomJarAnalysisReviewJarAnalysisReviewState reviewState;

  /** All existing approvals or rejections. */
  @JsonProperty("reviews")
  private Collection<CleanRoomJarAnalysisReview> reviews;

  /** Collaborators that can run the jar. */
  @JsonProperty("runner_collaborator_aliases")
  private Collection<String> runnerCollaboratorAliases;

  public CleanRoomAssetJarAnalysis setCentralJarFilePaths(Collection<String> centralJarFilePaths) {
    this.centralJarFilePaths = centralJarFilePaths;
    return this;
  }

  public Collection<String> getCentralJarFilePaths() {
    return centralJarFilePaths;
  }

  public CleanRoomAssetJarAnalysis setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public CleanRoomAssetJarAnalysis setEnvironmentVersion(String environmentVersion) {
    this.environmentVersion = environmentVersion;
    return this;
  }

  public String getEnvironmentVersion() {
    return environmentVersion;
  }

  public CleanRoomAssetJarAnalysis setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public CleanRoomAssetJarAnalysis setMainClassName(String mainClassName) {
    this.mainClassName = mainClassName;
    return this;
  }

  public String getMainClassName() {
    return mainClassName;
  }

  public CleanRoomAssetJarAnalysis setReviewState(
      CleanRoomJarAnalysisReviewJarAnalysisReviewState reviewState) {
    this.reviewState = reviewState;
    return this;
  }

  public CleanRoomJarAnalysisReviewJarAnalysisReviewState getReviewState() {
    return reviewState;
  }

  public CleanRoomAssetJarAnalysis setReviews(Collection<CleanRoomJarAnalysisReview> reviews) {
    this.reviews = reviews;
    return this;
  }

  public Collection<CleanRoomJarAnalysisReview> getReviews() {
    return reviews;
  }

  public CleanRoomAssetJarAnalysis setRunnerCollaboratorAliases(
      Collection<String> runnerCollaboratorAliases) {
    this.runnerCollaboratorAliases = runnerCollaboratorAliases;
    return this;
  }

  public Collection<String> getRunnerCollaboratorAliases() {
    return runnerCollaboratorAliases;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomAssetJarAnalysis that = (CleanRoomAssetJarAnalysis) o;
    return Objects.equals(centralJarFilePaths, that.centralJarFilePaths)
        && Objects.equals(description, that.description)
        && Objects.equals(environmentVersion, that.environmentVersion)
        && Objects.equals(etag, that.etag)
        && Objects.equals(mainClassName, that.mainClassName)
        && Objects.equals(reviewState, that.reviewState)
        && Objects.equals(reviews, that.reviews)
        && Objects.equals(runnerCollaboratorAliases, that.runnerCollaboratorAliases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        centralJarFilePaths,
        description,
        environmentVersion,
        etag,
        mainClassName,
        reviewState,
        reviews,
        runnerCollaboratorAliases);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomAssetJarAnalysis.class)
        .add("centralJarFilePaths", centralJarFilePaths)
        .add("description", description)
        .add("environmentVersion", environmentVersion)
        .add("etag", etag)
        .add("mainClassName", mainClassName)
        .add("reviewState", reviewState)
        .add("reviews", reviews)
        .add("runnerCollaboratorAliases", runnerCollaboratorAliases)
        .toString();
  }
}
