/******************************************************************************
 *  Copyright (c) 2012 GitHub Inc.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *    Kevin Sawicki (GitHub Inc.) - initial API and implementation
 *****************************************************************************/
package org.eclipse.egit.github.core.event;

import java.io.Serializable;

import org.eclipse.egit.github.core.CommitComment;

/**
 * Payload for an event with type {@link Event#TYPE_PULL_REQUEST_REVIEW_COMMENT}
 */
public class PullRequestReviewCommentPayload extends EventPayload implements
		Serializable {

	private static final long serialVersionUID = -2403658752886394741L;

	private CommitComment comment;

	/**
	 * @return comment
	 */
	public CommitComment getComment() {
		return comment;
	}

	/**
	 * @param comment
	 * @return this payload
	 */
	public PullRequestReviewCommentPayload setComment(CommitComment comment) {
		this.comment = comment;
		return this;
	}
}
