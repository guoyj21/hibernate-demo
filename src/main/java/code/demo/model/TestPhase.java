package code.demo.model;

// Generated Mar 11, 2014 9:18:20 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * TestPhase generated by hbm2java
 */
public class TestPhase implements java.io.Serializable {

	private Short id;
	private String testphase;
	private Set<TestRecord> testRecords = new HashSet<TestRecord>(0);

	public TestPhase() {
	}

	public TestPhase(String testphase) {
		this.testphase = testphase;
	}

	public TestPhase(String testphase, Set<TestRecord> testRecords) {
		this.testphase = testphase;
		this.testRecords = testRecords;
	}

	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getTestphase() {
		return this.testphase;
	}

	public void setTestphase(String testphase) {
		this.testphase = testphase;
	}

	public Set<TestRecord> getTestRecords() {
		return this.testRecords;
	}

	public void setTestRecords(Set<TestRecord> testRecords) {
		this.testRecords = testRecords;
	}

}
