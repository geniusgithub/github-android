/******************************************************************************
 *  Copyright (c) 2011 GitHub Inc.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *    Kevin Sawicki (GitHub Inc.) - initial API and implementation
 *****************************************************************************/
package org.eclipse.egit.github.core;

import java.io.Serializable;
import java.util.Date;

import org.eclipse.egit.github.core.util.DateUtils;

/**
 * Issue event model class
 */
public class IssueEvent implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = -842754108817725707L;

	private Date createdAt;

	private Issue issue;

	private long id;

	private String commitId;

	private String event;

	private String url;

	private User actor;

	/**
	 * @return createdAt
	 */
	public Date getCreatedAt() {
		return DateUtils.clone(createdAt);
	}

	/**
	 * @param createdAt
	 * @return this issue event
	 */
	public IssueEvent setCreatedAt(Date createdAt) {
		this.createdAt = DateUtils.clone(createdAt);
		return this;
	}

	/**
	 * @return issue
	 */
	public Issue getIssue() {
		return issue;
	}

	/**
	 * @param issue
	 * @return this issue event
	 */
	public IssueEvent setIssue(Issue issue) {
		this.issue = issue;
		return this;
	}

	/**
	 * @return id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 * @return this issue event
	 */
	public IssueEvent setId(long id) {
		this.id = id;
		return this;
	}

	/**
	 * @return commitId
	 */
	public String getCommitId() {
		return commitId;
	}

	/**
	 * @param commitId
	 * @return this issue event
	 */
	public IssueEvent setCommitId(String commitId) {
		this.commitId = commitId;
		return this;
	}

	/**
	 * @return event
	 */
	public String getEvent() {
		return event;
	}

	/**
	 * @param event
	 * @return this issue event
	 */
	public IssueEvent setEvent(String event) {
		this.event = event;
		return this;
	}

	/**
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 * @return this issue event
	 */
	public IssueEvent setUrl(String url) {
		this.url = url;
		return this;
	}

	/**
	 * @return actor
	 */
	public User getActor() {
		return actor;
	}

	/**
	 * @param actor
	 * @return this issue event
	 */
	public IssueEvent setActor(User actor) {
		this.actor = actor;
		return this;
	}
}
