/*
 * Gitea API
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.21.10
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.CommitAffectedFiles;
import io.swagger.client.model.CommitMeta;
import io.swagger.client.model.CommitStats;
import io.swagger.client.model.RepoCommit;
import io.swagger.client.model.User;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * Commit
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class Commit {
  @SerializedName("author")
  private User author = null;

  @SerializedName("commit")
  private RepoCommit commit = null;

  @SerializedName("committer")
  private User committer = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("files")
  private List<CommitAffectedFiles> files = null;

  @SerializedName("html_url")
  private String htmlUrl = null;

  @SerializedName("parents")
  private List<CommitMeta> parents = null;

  @SerializedName("sha")
  private String sha = null;

  @SerializedName("stats")
  private CommitStats stats = null;

  @SerializedName("url")
  private String url = null;

  public Commit author(User author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @Schema(description = "")
  public User getAuthor() {
    return author;
  }

  public void setAuthor(User author) {
    this.author = author;
  }

  public Commit commit(RepoCommit commit) {
    this.commit = commit;
    return this;
  }

   /**
   * Get commit
   * @return commit
  **/
  @Schema(description = "")
  public RepoCommit getCommit() {
    return commit;
  }

  public void setCommit(RepoCommit commit) {
    this.commit = commit;
  }

  public Commit committer(User committer) {
    this.committer = committer;
    return this;
  }

   /**
   * Get committer
   * @return committer
  **/
  @Schema(description = "")
  public User getCommitter() {
    return committer;
  }

  public void setCommitter(User committer) {
    this.committer = committer;
  }

  public Commit created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @Schema(description = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public Commit files(List<CommitAffectedFiles> files) {
    this.files = files;
    return this;
  }

  public Commit addFilesItem(CommitAffectedFiles filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<CommitAffectedFiles>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @Schema(description = "")
  public List<CommitAffectedFiles> getFiles() {
    return files;
  }

  public void setFiles(List<CommitAffectedFiles> files) {
    this.files = files;
  }

  public Commit htmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
    return this;
  }

   /**
   * Get htmlUrl
   * @return htmlUrl
  **/
  @Schema(description = "")
  public String getHtmlUrl() {
    return htmlUrl;
  }

  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }

  public Commit parents(List<CommitMeta> parents) {
    this.parents = parents;
    return this;
  }

  public Commit addParentsItem(CommitMeta parentsItem) {
    if (this.parents == null) {
      this.parents = new ArrayList<CommitMeta>();
    }
    this.parents.add(parentsItem);
    return this;
  }

   /**
   * Get parents
   * @return parents
  **/
  @Schema(description = "")
  public List<CommitMeta> getParents() {
    return parents;
  }

  public void setParents(List<CommitMeta> parents) {
    this.parents = parents;
  }

  public Commit sha(String sha) {
    this.sha = sha;
    return this;
  }

   /**
   * Get sha
   * @return sha
  **/
  @Schema(description = "")
  public String getSha() {
    return sha;
  }

  public void setSha(String sha) {
    this.sha = sha;
  }

  public Commit stats(CommitStats stats) {
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @Schema(description = "")
  public CommitStats getStats() {
    return stats;
  }

  public void setStats(CommitStats stats) {
    this.stats = stats;
  }

  public Commit url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Commit commit = (Commit) o;
    return Objects.equals(this.author, commit.author) &&
        Objects.equals(this.commit, commit.commit) &&
        Objects.equals(this.committer, commit.committer) &&
        Objects.equals(this.created, commit.created) &&
        Objects.equals(this.files, commit.files) &&
        Objects.equals(this.htmlUrl, commit.htmlUrl) &&
        Objects.equals(this.parents, commit.parents) &&
        Objects.equals(this.sha, commit.sha) &&
        Objects.equals(this.stats, commit.stats) &&
        Objects.equals(this.url, commit.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, commit, committer, created, files, htmlUrl, parents, sha, stats, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Commit {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
    sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}