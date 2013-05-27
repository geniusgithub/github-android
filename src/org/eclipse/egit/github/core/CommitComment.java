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

/**
 * Commit comment model class.
 */
public class CommitComment extends Comment {

	/** serialVersionUID */
	private static final long serialVersionUID = 5932088388457362322L;

	private int line;

	private int position;

	private String commitId;

	private String path;

	/**
	 * @return line
	 */
	public int getLine() {
		return line;
	}

	/**
	 * @param line
	 * @return this commit comment
	 */
	public CommitComment setLine(int line) {
		this.line = line;
		return this;
	}

	/**
	 * @return position
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * @param position
	 * @return this commit comment
	 */
	public CommitComment setPosition(int position) {
		this.position = position;
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
	 * @return this commit comment
	 */
	public CommitComment setCommitId(String commitId) {
		this.commitId = commitId;
		return this;
	}

	/**
	 * @return path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path
	 * @return this commit comment
	 */
	public CommitComment setPath(String path) {
		this.path = path;
		return this;
	}
}
