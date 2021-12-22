package com.assignment.crudapp.entity;
// Generated Dec 22, 2021, 12:04:33 AM by Hibernate Tools 5.5.7.Final

/**
 * LatestFileIoId generated by hbm2java
 */
public class LatestFileIoId implements java.io.Serializable {

	private String thread;
	private String file;
	private String latency;
	private String operation;
	private String requested;

	public LatestFileIoId() {
	}

	public LatestFileIoId(String operation) {
		this.operation = operation;
	}

	public LatestFileIoId(String thread, String file, String latency, String operation, String requested) {
		this.thread = thread;
		this.file = file;
		this.latency = latency;
		this.operation = operation;
		this.requested = requested;
	}

	public String getThread() {
		return this.thread;
	}

	public void setThread(String thread) {
		this.thread = thread;
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getLatency() {
		return this.latency;
	}

	public void setLatency(String latency) {
		this.latency = latency;
	}

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getRequested() {
		return this.requested;
	}

	public void setRequested(String requested) {
		this.requested = requested;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LatestFileIoId))
			return false;
		LatestFileIoId castOther = (LatestFileIoId) other;

		return ((this.getThread() == castOther.getThread()) || (this.getThread() != null
				&& castOther.getThread() != null && this.getThread().equals(castOther.getThread())))
				&& ((this.getFile() == castOther.getFile()) || (this.getFile() != null && castOther.getFile() != null
						&& this.getFile().equals(castOther.getFile())))
				&& ((this.getLatency() == castOther.getLatency()) || (this.getLatency() != null
						&& castOther.getLatency() != null && this.getLatency().equals(castOther.getLatency())))
				&& ((this.getOperation() == castOther.getOperation()) || (this.getOperation() != null
						&& castOther.getOperation() != null && this.getOperation().equals(castOther.getOperation())))
				&& ((this.getRequested() == castOther.getRequested()) || (this.getRequested() != null
						&& castOther.getRequested() != null && this.getRequested().equals(castOther.getRequested())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getThread() == null ? 0 : this.getThread().hashCode());
		result = 37 * result + (getFile() == null ? 0 : this.getFile().hashCode());
		result = 37 * result + (getLatency() == null ? 0 : this.getLatency().hashCode());
		result = 37 * result + (getOperation() == null ? 0 : this.getOperation().hashCode());
		result = 37 * result + (getRequested() == null ? 0 : this.getRequested().hashCode());
		return result;
	}

}
