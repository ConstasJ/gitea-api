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
import io.swagger.client.model.Comment;
import io.swagger.client.model.Issue;
import io.swagger.client.model.Label;
import io.swagger.client.model.Milestone;
import io.swagger.client.model.Team;
import io.swagger.client.model.TrackedTime;
import io.swagger.client.model.User;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * TimelineComment represents a timeline comment (comment of any type) on a commit or issue
 */
@Schema(description = "TimelineComment represents a timeline comment (comment of any type) on a commit or issue")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class TimelineComment {
  @SerializedName("assignee")
  private User assignee = null;

  @SerializedName("assignee_team")
  private Team assigneeTeam = null;

  @SerializedName("body")
  private String body = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("dependent_issue")
  private Issue dependentIssue = null;

  @SerializedName("html_url")
  private String htmlUrl = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("issue_url")
  private String issueUrl = null;

  @SerializedName("label")
  private Label label = null;

  @SerializedName("milestone")
  private Milestone milestone = null;

  @SerializedName("new_ref")
  private String newRef = null;

  @SerializedName("new_title")
  private String newTitle = null;

  @SerializedName("old_milestone")
  private Milestone oldMilestone = null;

  @SerializedName("old_project_id")
  private Long oldProjectId = null;

  @SerializedName("old_ref")
  private String oldRef = null;

  @SerializedName("old_title")
  private String oldTitle = null;

  @SerializedName("project_id")
  private Long projectId = null;

  @SerializedName("pull_request_url")
  private String pullRequestUrl = null;

  @SerializedName("ref_action")
  private String refAction = null;

  @SerializedName("ref_comment")
  private Comment refComment = null;

  @SerializedName("ref_commit_sha")
  private String refCommitSha = null;

  @SerializedName("ref_issue")
  private Issue refIssue = null;

  @SerializedName("removed_assignee")
  private Boolean removedAssignee = null;

  @SerializedName("resolve_doer")
  private User resolveDoer = null;

  @SerializedName("review_id")
  private Long reviewId = null;

  @SerializedName("tracked_time")
  private TrackedTime trackedTime = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("user")
  private User user = null;

  public TimelineComment assignee(User assignee) {
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @Schema(description = "")
  public User getAssignee() {
    return assignee;
  }

  public void setAssignee(User assignee) {
    this.assignee = assignee;
  }

  public TimelineComment assigneeTeam(Team assigneeTeam) {
    this.assigneeTeam = assigneeTeam;
    return this;
  }

   /**
   * Get assigneeTeam
   * @return assigneeTeam
  **/
  @Schema(description = "")
  public Team getAssigneeTeam() {
    return assigneeTeam;
  }

  public void setAssigneeTeam(Team assigneeTeam) {
    this.assigneeTeam = assigneeTeam;
  }

  public TimelineComment body(String body) {
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

  public TimelineComment createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public TimelineComment dependentIssue(Issue dependentIssue) {
    this.dependentIssue = dependentIssue;
    return this;
  }

   /**
   * Get dependentIssue
   * @return dependentIssue
  **/
  @Schema(description = "")
  public Issue getDependentIssue() {
    return dependentIssue;
  }

  public void setDependentIssue(Issue dependentIssue) {
    this.dependentIssue = dependentIssue;
  }

  public TimelineComment htmlUrl(String htmlUrl) {
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

  public TimelineComment id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TimelineComment issueUrl(String issueUrl) {
    this.issueUrl = issueUrl;
    return this;
  }

   /**
   * Get issueUrl
   * @return issueUrl
  **/
  @Schema(description = "")
  public String getIssueUrl() {
    return issueUrl;
  }

  public void setIssueUrl(String issueUrl) {
    this.issueUrl = issueUrl;
  }

  public TimelineComment label(Label label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @Schema(description = "")
  public Label getLabel() {
    return label;
  }

  public void setLabel(Label label) {
    this.label = label;
  }

  public TimelineComment milestone(Milestone milestone) {
    this.milestone = milestone;
    return this;
  }

   /**
   * Get milestone
   * @return milestone
  **/
  @Schema(description = "")
  public Milestone getMilestone() {
    return milestone;
  }

  public void setMilestone(Milestone milestone) {
    this.milestone = milestone;
  }

  public TimelineComment newRef(String newRef) {
    this.newRef = newRef;
    return this;
  }

   /**
   * Get newRef
   * @return newRef
  **/
  @Schema(description = "")
  public String getNewRef() {
    return newRef;
  }

  public void setNewRef(String newRef) {
    this.newRef = newRef;
  }

  public TimelineComment newTitle(String newTitle) {
    this.newTitle = newTitle;
    return this;
  }

   /**
   * Get newTitle
   * @return newTitle
  **/
  @Schema(description = "")
  public String getNewTitle() {
    return newTitle;
  }

  public void setNewTitle(String newTitle) {
    this.newTitle = newTitle;
  }

  public TimelineComment oldMilestone(Milestone oldMilestone) {
    this.oldMilestone = oldMilestone;
    return this;
  }

   /**
   * Get oldMilestone
   * @return oldMilestone
  **/
  @Schema(description = "")
  public Milestone getOldMilestone() {
    return oldMilestone;
  }

  public void setOldMilestone(Milestone oldMilestone) {
    this.oldMilestone = oldMilestone;
  }

  public TimelineComment oldProjectId(Long oldProjectId) {
    this.oldProjectId = oldProjectId;
    return this;
  }

   /**
   * Get oldProjectId
   * @return oldProjectId
  **/
  @Schema(description = "")
  public Long getOldProjectId() {
    return oldProjectId;
  }

  public void setOldProjectId(Long oldProjectId) {
    this.oldProjectId = oldProjectId;
  }

  public TimelineComment oldRef(String oldRef) {
    this.oldRef = oldRef;
    return this;
  }

   /**
   * Get oldRef
   * @return oldRef
  **/
  @Schema(description = "")
  public String getOldRef() {
    return oldRef;
  }

  public void setOldRef(String oldRef) {
    this.oldRef = oldRef;
  }

  public TimelineComment oldTitle(String oldTitle) {
    this.oldTitle = oldTitle;
    return this;
  }

   /**
   * Get oldTitle
   * @return oldTitle
  **/
  @Schema(description = "")
  public String getOldTitle() {
    return oldTitle;
  }

  public void setOldTitle(String oldTitle) {
    this.oldTitle = oldTitle;
  }

  public TimelineComment projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @Schema(description = "")
  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public TimelineComment pullRequestUrl(String pullRequestUrl) {
    this.pullRequestUrl = pullRequestUrl;
    return this;
  }

   /**
   * Get pullRequestUrl
   * @return pullRequestUrl
  **/
  @Schema(description = "")
  public String getPullRequestUrl() {
    return pullRequestUrl;
  }

  public void setPullRequestUrl(String pullRequestUrl) {
    this.pullRequestUrl = pullRequestUrl;
  }

  public TimelineComment refAction(String refAction) {
    this.refAction = refAction;
    return this;
  }

   /**
   * Get refAction
   * @return refAction
  **/
  @Schema(description = "")
  public String getRefAction() {
    return refAction;
  }

  public void setRefAction(String refAction) {
    this.refAction = refAction;
  }

  public TimelineComment refComment(Comment refComment) {
    this.refComment = refComment;
    return this;
  }

   /**
   * Get refComment
   * @return refComment
  **/
  @Schema(description = "")
  public Comment getRefComment() {
    return refComment;
  }

  public void setRefComment(Comment refComment) {
    this.refComment = refComment;
  }

  public TimelineComment refCommitSha(String refCommitSha) {
    this.refCommitSha = refCommitSha;
    return this;
  }

   /**
   * commit SHA where issue/PR was referenced
   * @return refCommitSha
  **/
  @Schema(description = "commit SHA where issue/PR was referenced")
  public String getRefCommitSha() {
    return refCommitSha;
  }

  public void setRefCommitSha(String refCommitSha) {
    this.refCommitSha = refCommitSha;
  }

  public TimelineComment refIssue(Issue refIssue) {
    this.refIssue = refIssue;
    return this;
  }

   /**
   * Get refIssue
   * @return refIssue
  **/
  @Schema(description = "")
  public Issue getRefIssue() {
    return refIssue;
  }

  public void setRefIssue(Issue refIssue) {
    this.refIssue = refIssue;
  }

  public TimelineComment removedAssignee(Boolean removedAssignee) {
    this.removedAssignee = removedAssignee;
    return this;
  }

   /**
   * whether the assignees were removed or added
   * @return removedAssignee
  **/
  @Schema(description = "whether the assignees were removed or added")
  public Boolean isRemovedAssignee() {
    return removedAssignee;
  }

  public void setRemovedAssignee(Boolean removedAssignee) {
    this.removedAssignee = removedAssignee;
  }

  public TimelineComment resolveDoer(User resolveDoer) {
    this.resolveDoer = resolveDoer;
    return this;
  }

   /**
   * Get resolveDoer
   * @return resolveDoer
  **/
  @Schema(description = "")
  public User getResolveDoer() {
    return resolveDoer;
  }

  public void setResolveDoer(User resolveDoer) {
    this.resolveDoer = resolveDoer;
  }

  public TimelineComment reviewId(Long reviewId) {
    this.reviewId = reviewId;
    return this;
  }

   /**
   * Get reviewId
   * @return reviewId
  **/
  @Schema(description = "")
  public Long getReviewId() {
    return reviewId;
  }

  public void setReviewId(Long reviewId) {
    this.reviewId = reviewId;
  }

  public TimelineComment trackedTime(TrackedTime trackedTime) {
    this.trackedTime = trackedTime;
    return this;
  }

   /**
   * Get trackedTime
   * @return trackedTime
  **/
  @Schema(description = "")
  public TrackedTime getTrackedTime() {
    return trackedTime;
  }

  public void setTrackedTime(TrackedTime trackedTime) {
    this.trackedTime = trackedTime;
  }

  public TimelineComment type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TimelineComment updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public TimelineComment user(User user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @Schema(description = "")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimelineComment timelineComment = (TimelineComment) o;
    return Objects.equals(this.assignee, timelineComment.assignee) &&
        Objects.equals(this.assigneeTeam, timelineComment.assigneeTeam) &&
        Objects.equals(this.body, timelineComment.body) &&
        Objects.equals(this.createdAt, timelineComment.createdAt) &&
        Objects.equals(this.dependentIssue, timelineComment.dependentIssue) &&
        Objects.equals(this.htmlUrl, timelineComment.htmlUrl) &&
        Objects.equals(this.id, timelineComment.id) &&
        Objects.equals(this.issueUrl, timelineComment.issueUrl) &&
        Objects.equals(this.label, timelineComment.label) &&
        Objects.equals(this.milestone, timelineComment.milestone) &&
        Objects.equals(this.newRef, timelineComment.newRef) &&
        Objects.equals(this.newTitle, timelineComment.newTitle) &&
        Objects.equals(this.oldMilestone, timelineComment.oldMilestone) &&
        Objects.equals(this.oldProjectId, timelineComment.oldProjectId) &&
        Objects.equals(this.oldRef, timelineComment.oldRef) &&
        Objects.equals(this.oldTitle, timelineComment.oldTitle) &&
        Objects.equals(this.projectId, timelineComment.projectId) &&
        Objects.equals(this.pullRequestUrl, timelineComment.pullRequestUrl) &&
        Objects.equals(this.refAction, timelineComment.refAction) &&
        Objects.equals(this.refComment, timelineComment.refComment) &&
        Objects.equals(this.refCommitSha, timelineComment.refCommitSha) &&
        Objects.equals(this.refIssue, timelineComment.refIssue) &&
        Objects.equals(this.removedAssignee, timelineComment.removedAssignee) &&
        Objects.equals(this.resolveDoer, timelineComment.resolveDoer) &&
        Objects.equals(this.reviewId, timelineComment.reviewId) &&
        Objects.equals(this.trackedTime, timelineComment.trackedTime) &&
        Objects.equals(this.type, timelineComment.type) &&
        Objects.equals(this.updatedAt, timelineComment.updatedAt) &&
        Objects.equals(this.user, timelineComment.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignee, assigneeTeam, body, createdAt, dependentIssue, htmlUrl, id, issueUrl, label, milestone, newRef, newTitle, oldMilestone, oldProjectId, oldRef, oldTitle, projectId, pullRequestUrl, refAction, refComment, refCommitSha, refIssue, removedAssignee, resolveDoer, reviewId, trackedTime, type, updatedAt, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimelineComment {\n");
    
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    assigneeTeam: ").append(toIndentedString(assigneeTeam)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dependentIssue: ").append(toIndentedString(dependentIssue)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueUrl: ").append(toIndentedString(issueUrl)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
    sb.append("    newRef: ").append(toIndentedString(newRef)).append("\n");
    sb.append("    newTitle: ").append(toIndentedString(newTitle)).append("\n");
    sb.append("    oldMilestone: ").append(toIndentedString(oldMilestone)).append("\n");
    sb.append("    oldProjectId: ").append(toIndentedString(oldProjectId)).append("\n");
    sb.append("    oldRef: ").append(toIndentedString(oldRef)).append("\n");
    sb.append("    oldTitle: ").append(toIndentedString(oldTitle)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    pullRequestUrl: ").append(toIndentedString(pullRequestUrl)).append("\n");
    sb.append("    refAction: ").append(toIndentedString(refAction)).append("\n");
    sb.append("    refComment: ").append(toIndentedString(refComment)).append("\n");
    sb.append("    refCommitSha: ").append(toIndentedString(refCommitSha)).append("\n");
    sb.append("    refIssue: ").append(toIndentedString(refIssue)).append("\n");
    sb.append("    removedAssignee: ").append(toIndentedString(removedAssignee)).append("\n");
    sb.append("    resolveDoer: ").append(toIndentedString(resolveDoer)).append("\n");
    sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
    sb.append("    trackedTime: ").append(toIndentedString(trackedTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
