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
import io.swagger.client.model.CommitDateOptions;
import io.swagger.client.model.Identity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * UpdateFileOptions options for updating files Note: &#x60;author&#x60; and &#x60;committer&#x60; are optional (if only one is given, it will be used for the other, otherwise the authenticated user will be used)
 */
@Schema(description = "UpdateFileOptions options for updating files Note: `author` and `committer` are optional (if only one is given, it will be used for the other, otherwise the authenticated user will be used)")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class UpdateFileOptions {
  @SerializedName("author")
  private Identity author = null;

  @SerializedName("branch")
  private String branch = null;

  @SerializedName("committer")
  private Identity committer = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("dates")
  private CommitDateOptions dates = null;

  @SerializedName("from_path")
  private String fromPath = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("new_branch")
  private String newBranch = null;

  @SerializedName("sha")
  private String sha = null;

  @SerializedName("signoff")
  private Boolean signoff = null;

  public UpdateFileOptions author(Identity author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @Schema(description = "")
  public Identity getAuthor() {
    return author;
  }

  public void setAuthor(Identity author) {
    this.author = author;
  }

  public UpdateFileOptions branch(String branch) {
    this.branch = branch;
    return this;
  }

   /**
   * branch (optional) to base this file from. if not given, the default branch is used
   * @return branch
  **/
  @Schema(description = "branch (optional) to base this file from. if not given, the default branch is used")
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public UpdateFileOptions committer(Identity committer) {
    this.committer = committer;
    return this;
  }

   /**
   * Get committer
   * @return committer
  **/
  @Schema(description = "")
  public Identity getCommitter() {
    return committer;
  }

  public void setCommitter(Identity committer) {
    this.committer = committer;
  }

  public UpdateFileOptions content(String content) {
    this.content = content;
    return this;
  }

   /**
   * content must be base64 encoded
   * @return content
  **/
  @Schema(required = true, description = "content must be base64 encoded")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public UpdateFileOptions dates(CommitDateOptions dates) {
    this.dates = dates;
    return this;
  }

   /**
   * Get dates
   * @return dates
  **/
  @Schema(description = "")
  public CommitDateOptions getDates() {
    return dates;
  }

  public void setDates(CommitDateOptions dates) {
    this.dates = dates;
  }

  public UpdateFileOptions fromPath(String fromPath) {
    this.fromPath = fromPath;
    return this;
  }

   /**
   * from_path (optional) is the path of the original file which will be moved/renamed to the path in the URL
   * @return fromPath
  **/
  @Schema(description = "from_path (optional) is the path of the original file which will be moved/renamed to the path in the URL")
  public String getFromPath() {
    return fromPath;
  }

  public void setFromPath(String fromPath) {
    this.fromPath = fromPath;
  }

  public UpdateFileOptions message(String message) {
    this.message = message;
    return this;
  }

   /**
   * message (optional) for the commit of this file. if not supplied, a default message will be used
   * @return message
  **/
  @Schema(description = "message (optional) for the commit of this file. if not supplied, a default message will be used")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public UpdateFileOptions newBranch(String newBranch) {
    this.newBranch = newBranch;
    return this;
  }

   /**
   * new_branch (optional) will make a new branch from &#x60;branch&#x60; before creating the file
   * @return newBranch
  **/
  @Schema(description = "new_branch (optional) will make a new branch from `branch` before creating the file")
  public String getNewBranch() {
    return newBranch;
  }

  public void setNewBranch(String newBranch) {
    this.newBranch = newBranch;
  }

  public UpdateFileOptions sha(String sha) {
    this.sha = sha;
    return this;
  }

   /**
   * sha is the SHA for the file that already exists
   * @return sha
  **/
  @Schema(required = true, description = "sha is the SHA for the file that already exists")
  public String getSha() {
    return sha;
  }

  public void setSha(String sha) {
    this.sha = sha;
  }

  public UpdateFileOptions signoff(Boolean signoff) {
    this.signoff = signoff;
    return this;
  }

   /**
   * Add a Signed-off-by trailer by the committer at the end of the commit log message.
   * @return signoff
  **/
  @Schema(description = "Add a Signed-off-by trailer by the committer at the end of the commit log message.")
  public Boolean isSignoff() {
    return signoff;
  }

  public void setSignoff(Boolean signoff) {
    this.signoff = signoff;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFileOptions updateFileOptions = (UpdateFileOptions) o;
    return Objects.equals(this.author, updateFileOptions.author) &&
        Objects.equals(this.branch, updateFileOptions.branch) &&
        Objects.equals(this.committer, updateFileOptions.committer) &&
        Objects.equals(this.content, updateFileOptions.content) &&
        Objects.equals(this.dates, updateFileOptions.dates) &&
        Objects.equals(this.fromPath, updateFileOptions.fromPath) &&
        Objects.equals(this.message, updateFileOptions.message) &&
        Objects.equals(this.newBranch, updateFileOptions.newBranch) &&
        Objects.equals(this.sha, updateFileOptions.sha) &&
        Objects.equals(this.signoff, updateFileOptions.signoff);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, branch, committer, content, dates, fromPath, message, newBranch, sha, signoff);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFileOptions {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    fromPath: ").append(toIndentedString(fromPath)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    newBranch: ").append(toIndentedString(newBranch)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
    sb.append("    signoff: ").append(toIndentedString(signoff)).append("\n");
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