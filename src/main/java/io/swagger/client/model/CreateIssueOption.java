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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * CreateIssueOption options to create one issue
 */
@Schema(description = "CreateIssueOption options to create one issue")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class CreateIssueOption {
  @SerializedName("assignee")
  private String assignee = null;

  @SerializedName("assignees")
  private List<String> assignees = null;

  @SerializedName("body")
  private String body = null;

  @SerializedName("closed")
  private Boolean closed = null;

  @SerializedName("due_date")
  private OffsetDateTime dueDate = null;

  @SerializedName("labels")
  private List<Long> labels = null;

  @SerializedName("milestone")
  private Long milestone = null;

  @SerializedName("ref")
  private String ref = null;

  @SerializedName("title")
  private String title = null;

  public CreateIssueOption assignee(String assignee) {
    this.assignee = assignee;
    return this;
  }

   /**
   * deprecated
   * @return assignee
  **/
  @Schema(description = "deprecated")
  public String getAssignee() {
    return assignee;
  }

  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }

  public CreateIssueOption assignees(List<String> assignees) {
    this.assignees = assignees;
    return this;
  }

  public CreateIssueOption addAssigneesItem(String assigneesItem) {
    if (this.assignees == null) {
      this.assignees = new ArrayList<String>();
    }
    this.assignees.add(assigneesItem);
    return this;
  }

   /**
   * Get assignees
   * @return assignees
  **/
  @Schema(description = "")
  public List<String> getAssignees() {
    return assignees;
  }

  public void setAssignees(List<String> assignees) {
    this.assignees = assignees;
  }

  public CreateIssueOption body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @Schema(description = "")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public CreateIssueOption closed(Boolean closed) {
    this.closed = closed;
    return this;
  }

   /**
   * Get closed
   * @return closed
  **/
  @Schema(description = "")
  public Boolean isClosed() {
    return closed;
  }

  public void setClosed(Boolean closed) {
    this.closed = closed;
  }

  public CreateIssueOption dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @Schema(description = "")
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public CreateIssueOption labels(List<Long> labels) {
    this.labels = labels;
    return this;
  }

  public CreateIssueOption addLabelsItem(Long labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<Long>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * list of label ids
   * @return labels
  **/
  @Schema(description = "list of label ids")
  public List<Long> getLabels() {
    return labels;
  }

  public void setLabels(List<Long> labels) {
    this.labels = labels;
  }

  public CreateIssueOption milestone(Long milestone) {
    this.milestone = milestone;
    return this;
  }

   /**
   * milestone id
   * @return milestone
  **/
  @Schema(description = "milestone id")
  public Long getMilestone() {
    return milestone;
  }

  public void setMilestone(Long milestone) {
    this.milestone = milestone;
  }

  public CreateIssueOption ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Get ref
   * @return ref
  **/
  @Schema(description = "")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public CreateIssueOption title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(required = true, description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateIssueOption createIssueOption = (CreateIssueOption) o;
    return Objects.equals(this.assignee, createIssueOption.assignee) &&
        Objects.equals(this.assignees, createIssueOption.assignees) &&
        Objects.equals(this.body, createIssueOption.body) &&
        Objects.equals(this.closed, createIssueOption.closed) &&
        Objects.equals(this.dueDate, createIssueOption.dueDate) &&
        Objects.equals(this.labels, createIssueOption.labels) &&
        Objects.equals(this.milestone, createIssueOption.milestone) &&
        Objects.equals(this.ref, createIssueOption.ref) &&
        Objects.equals(this.title, createIssueOption.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignee, assignees, body, closed, dueDate, labels, milestone, ref, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateIssueOption {\n");
    
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
