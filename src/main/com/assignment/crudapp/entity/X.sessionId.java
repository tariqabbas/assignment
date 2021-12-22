package com.assignment.crudapp.entity;
// Generated Dec 22, 2021, 12:04:33 AM by Hibernate Tools 5.5.7.Final


import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * X.sessionId generated by hbm2java
 */
public class X.sessionId  implements java.io.Serializable {


     private long thdId;
     private Long connId;
     private String user;
     private String db;
     private String command;
     private String state;
     private Long time;
     private String currentStatement;
     private Long statementLatency;
     private BigDecimal progress;
     private Long lockLatency;
     private Long rowsExamined;
     private Long rowsSent;
     private Long rowsAffected;
     private Long tmpTables;
     private Long tmpDiskTables;
     private String fullScan;
     private String lastStatement;
     private Long lastStatementLatency;
     private BigInteger currentMemory;
     private String lastWait;
     private String lastWaitLatency;
     private String source;
     private Long trxLatency;
     private String trxState;
     private String trxAutocommit;
     private String pid;
     private String programName;

    public X.sessionId() {
    }

	
    public X.sessionId(long thdId, String fullScan) {
        this.thdId = thdId;
        this.fullScan = fullScan;
    }
    public X.sessionId(long thdId, Long connId, String user, String db, String command, String state, Long time, String currentStatement, Long statementLatency, BigDecimal progress, Long lockLatency, Long rowsExamined, Long rowsSent, Long rowsAffected, Long tmpTables, Long tmpDiskTables, String fullScan, String lastStatement, Long lastStatementLatency, BigInteger currentMemory, String lastWait, String lastWaitLatency, String source, Long trxLatency, String trxState, String trxAutocommit, String pid, String programName) {
       this.thdId = thdId;
       this.connId = connId;
       this.user = user;
       this.db = db;
       this.command = command;
       this.state = state;
       this.time = time;
       this.currentStatement = currentStatement;
       this.statementLatency = statementLatency;
       this.progress = progress;
       this.lockLatency = lockLatency;
       this.rowsExamined = rowsExamined;
       this.rowsSent = rowsSent;
       this.rowsAffected = rowsAffected;
       this.tmpTables = tmpTables;
       this.tmpDiskTables = tmpDiskTables;
       this.fullScan = fullScan;
       this.lastStatement = lastStatement;
       this.lastStatementLatency = lastStatementLatency;
       this.currentMemory = currentMemory;
       this.lastWait = lastWait;
       this.lastWaitLatency = lastWaitLatency;
       this.source = source;
       this.trxLatency = trxLatency;
       this.trxState = trxState;
       this.trxAutocommit = trxAutocommit;
       this.pid = pid;
       this.programName = programName;
    }
   
    public long getThdId() {
        return this.thdId;
    }
    
    public void setThdId(long thdId) {
        this.thdId = thdId;
    }
    public Long getConnId() {
        return this.connId;
    }
    
    public void setConnId(Long connId) {
        this.connId = connId;
    }
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }
    public String getDb() {
        return this.db;
    }
    
    public void setDb(String db) {
        this.db = db;
    }
    public String getCommand() {
        return this.command;
    }
    
    public void setCommand(String command) {
        this.command = command;
    }
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    public Long getTime() {
        return this.time;
    }
    
    public void setTime(Long time) {
        this.time = time;
    }
    public String getCurrentStatement() {
        return this.currentStatement;
    }
    
    public void setCurrentStatement(String currentStatement) {
        this.currentStatement = currentStatement;
    }
    public Long getStatementLatency() {
        return this.statementLatency;
    }
    
    public void setStatementLatency(Long statementLatency) {
        this.statementLatency = statementLatency;
    }
    public BigDecimal getProgress() {
        return this.progress;
    }
    
    public void setProgress(BigDecimal progress) {
        this.progress = progress;
    }
    public Long getLockLatency() {
        return this.lockLatency;
    }
    
    public void setLockLatency(Long lockLatency) {
        this.lockLatency = lockLatency;
    }
    public Long getRowsExamined() {
        return this.rowsExamined;
    }
    
    public void setRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }
    public Long getRowsSent() {
        return this.rowsSent;
    }
    
    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }
    public Long getRowsAffected() {
        return this.rowsAffected;
    }
    
    public void setRowsAffected(Long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }
    public Long getTmpTables() {
        return this.tmpTables;
    }
    
    public void setTmpTables(Long tmpTables) {
        this.tmpTables = tmpTables;
    }
    public Long getTmpDiskTables() {
        return this.tmpDiskTables;
    }
    
    public void setTmpDiskTables(Long tmpDiskTables) {
        this.tmpDiskTables = tmpDiskTables;
    }
    public String getFullScan() {
        return this.fullScan;
    }
    
    public void setFullScan(String fullScan) {
        this.fullScan = fullScan;
    }
    public String getLastStatement() {
        return this.lastStatement;
    }
    
    public void setLastStatement(String lastStatement) {
        this.lastStatement = lastStatement;
    }
    public Long getLastStatementLatency() {
        return this.lastStatementLatency;
    }
    
    public void setLastStatementLatency(Long lastStatementLatency) {
        this.lastStatementLatency = lastStatementLatency;
    }
    public BigInteger getCurrentMemory() {
        return this.currentMemory;
    }
    
    public void setCurrentMemory(BigInteger currentMemory) {
        this.currentMemory = currentMemory;
    }
    public String getLastWait() {
        return this.lastWait;
    }
    
    public void setLastWait(String lastWait) {
        this.lastWait = lastWait;
    }
    public String getLastWaitLatency() {
        return this.lastWaitLatency;
    }
    
    public void setLastWaitLatency(String lastWaitLatency) {
        this.lastWaitLatency = lastWaitLatency;
    }
    public String getSource() {
        return this.source;
    }
    
    public void setSource(String source) {
        this.source = source;
    }
    public Long getTrxLatency() {
        return this.trxLatency;
    }
    
    public void setTrxLatency(Long trxLatency) {
        this.trxLatency = trxLatency;
    }
    public String getTrxState() {
        return this.trxState;
    }
    
    public void setTrxState(String trxState) {
        this.trxState = trxState;
    }
    public String getTrxAutocommit() {
        return this.trxAutocommit;
    }
    
    public void setTrxAutocommit(String trxAutocommit) {
        this.trxAutocommit = trxAutocommit;
    }
    public String getPid() {
        return this.pid;
    }
    
    public void setPid(String pid) {
        this.pid = pid;
    }
    public String getProgramName() {
        return this.programName;
    }
    
    public void setProgramName(String programName) {
        this.programName = programName;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.sessionId) ) return false;
		 X.sessionId castOther = ( X.sessionId ) other; 
         
		 return (this.getThdId()==castOther.getThdId())
 && ( (this.getConnId()==castOther.getConnId()) || ( this.getConnId()!=null && castOther.getConnId()!=null && this.getConnId().equals(castOther.getConnId()) ) )
 && ( (this.getUser()==castOther.getUser()) || ( this.getUser()!=null && castOther.getUser()!=null && this.getUser().equals(castOther.getUser()) ) )
 && ( (this.getDb()==castOther.getDb()) || ( this.getDb()!=null && castOther.getDb()!=null && this.getDb().equals(castOther.getDb()) ) )
 && ( (this.getCommand()==castOther.getCommand()) || ( this.getCommand()!=null && castOther.getCommand()!=null && this.getCommand().equals(castOther.getCommand()) ) )
 && ( (this.getState()==castOther.getState()) || ( this.getState()!=null && castOther.getState()!=null && this.getState().equals(castOther.getState()) ) )
 && ( (this.getTime()==castOther.getTime()) || ( this.getTime()!=null && castOther.getTime()!=null && this.getTime().equals(castOther.getTime()) ) )
 && ( (this.getCurrentStatement()==castOther.getCurrentStatement()) || ( this.getCurrentStatement()!=null && castOther.getCurrentStatement()!=null && this.getCurrentStatement().equals(castOther.getCurrentStatement()) ) )
 && ( (this.getStatementLatency()==castOther.getStatementLatency()) || ( this.getStatementLatency()!=null && castOther.getStatementLatency()!=null && this.getStatementLatency().equals(castOther.getStatementLatency()) ) )
 && ( (this.getProgress()==castOther.getProgress()) || ( this.getProgress()!=null && castOther.getProgress()!=null && this.getProgress().equals(castOther.getProgress()) ) )
 && ( (this.getLockLatency()==castOther.getLockLatency()) || ( this.getLockLatency()!=null && castOther.getLockLatency()!=null && this.getLockLatency().equals(castOther.getLockLatency()) ) )
 && ( (this.getRowsExamined()==castOther.getRowsExamined()) || ( this.getRowsExamined()!=null && castOther.getRowsExamined()!=null && this.getRowsExamined().equals(castOther.getRowsExamined()) ) )
 && ( (this.getRowsSent()==castOther.getRowsSent()) || ( this.getRowsSent()!=null && castOther.getRowsSent()!=null && this.getRowsSent().equals(castOther.getRowsSent()) ) )
 && ( (this.getRowsAffected()==castOther.getRowsAffected()) || ( this.getRowsAffected()!=null && castOther.getRowsAffected()!=null && this.getRowsAffected().equals(castOther.getRowsAffected()) ) )
 && ( (this.getTmpTables()==castOther.getTmpTables()) || ( this.getTmpTables()!=null && castOther.getTmpTables()!=null && this.getTmpTables().equals(castOther.getTmpTables()) ) )
 && ( (this.getTmpDiskTables()==castOther.getTmpDiskTables()) || ( this.getTmpDiskTables()!=null && castOther.getTmpDiskTables()!=null && this.getTmpDiskTables().equals(castOther.getTmpDiskTables()) ) )
 && ( (this.getFullScan()==castOther.getFullScan()) || ( this.getFullScan()!=null && castOther.getFullScan()!=null && this.getFullScan().equals(castOther.getFullScan()) ) )
 && ( (this.getLastStatement()==castOther.getLastStatement()) || ( this.getLastStatement()!=null && castOther.getLastStatement()!=null && this.getLastStatement().equals(castOther.getLastStatement()) ) )
 && ( (this.getLastStatementLatency()==castOther.getLastStatementLatency()) || ( this.getLastStatementLatency()!=null && castOther.getLastStatementLatency()!=null && this.getLastStatementLatency().equals(castOther.getLastStatementLatency()) ) )
 && ( (this.getCurrentMemory()==castOther.getCurrentMemory()) || ( this.getCurrentMemory()!=null && castOther.getCurrentMemory()!=null && this.getCurrentMemory().equals(castOther.getCurrentMemory()) ) )
 && ( (this.getLastWait()==castOther.getLastWait()) || ( this.getLastWait()!=null && castOther.getLastWait()!=null && this.getLastWait().equals(castOther.getLastWait()) ) )
 && ( (this.getLastWaitLatency()==castOther.getLastWaitLatency()) || ( this.getLastWaitLatency()!=null && castOther.getLastWaitLatency()!=null && this.getLastWaitLatency().equals(castOther.getLastWaitLatency()) ) )
 && ( (this.getSource()==castOther.getSource()) || ( this.getSource()!=null && castOther.getSource()!=null && this.getSource().equals(castOther.getSource()) ) )
 && ( (this.getTrxLatency()==castOther.getTrxLatency()) || ( this.getTrxLatency()!=null && castOther.getTrxLatency()!=null && this.getTrxLatency().equals(castOther.getTrxLatency()) ) )
 && ( (this.getTrxState()==castOther.getTrxState()) || ( this.getTrxState()!=null && castOther.getTrxState()!=null && this.getTrxState().equals(castOther.getTrxState()) ) )
 && ( (this.getTrxAutocommit()==castOther.getTrxAutocommit()) || ( this.getTrxAutocommit()!=null && castOther.getTrxAutocommit()!=null && this.getTrxAutocommit().equals(castOther.getTrxAutocommit()) ) )
 && ( (this.getPid()==castOther.getPid()) || ( this.getPid()!=null && castOther.getPid()!=null && this.getPid().equals(castOther.getPid()) ) )
 && ( (this.getProgramName()==castOther.getProgramName()) || ( this.getProgramName()!=null && castOther.getProgramName()!=null && this.getProgramName().equals(castOther.getProgramName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getThdId();
         result = 37 * result + ( getConnId() == null ? 0 : this.getConnId().hashCode() );
         result = 37 * result + ( getUser() == null ? 0 : this.getUser().hashCode() );
         result = 37 * result + ( getDb() == null ? 0 : this.getDb().hashCode() );
         result = 37 * result + ( getCommand() == null ? 0 : this.getCommand().hashCode() );
         result = 37 * result + ( getState() == null ? 0 : this.getState().hashCode() );
         result = 37 * result + ( getTime() == null ? 0 : this.getTime().hashCode() );
         result = 37 * result + ( getCurrentStatement() == null ? 0 : this.getCurrentStatement().hashCode() );
         result = 37 * result + ( getStatementLatency() == null ? 0 : this.getStatementLatency().hashCode() );
         result = 37 * result + ( getProgress() == null ? 0 : this.getProgress().hashCode() );
         result = 37 * result + ( getLockLatency() == null ? 0 : this.getLockLatency().hashCode() );
         result = 37 * result + ( getRowsExamined() == null ? 0 : this.getRowsExamined().hashCode() );
         result = 37 * result + ( getRowsSent() == null ? 0 : this.getRowsSent().hashCode() );
         result = 37 * result + ( getRowsAffected() == null ? 0 : this.getRowsAffected().hashCode() );
         result = 37 * result + ( getTmpTables() == null ? 0 : this.getTmpTables().hashCode() );
         result = 37 * result + ( getTmpDiskTables() == null ? 0 : this.getTmpDiskTables().hashCode() );
         result = 37 * result + ( getFullScan() == null ? 0 : this.getFullScan().hashCode() );
         result = 37 * result + ( getLastStatement() == null ? 0 : this.getLastStatement().hashCode() );
         result = 37 * result + ( getLastStatementLatency() == null ? 0 : this.getLastStatementLatency().hashCode() );
         result = 37 * result + ( getCurrentMemory() == null ? 0 : this.getCurrentMemory().hashCode() );
         result = 37 * result + ( getLastWait() == null ? 0 : this.getLastWait().hashCode() );
         result = 37 * result + ( getLastWaitLatency() == null ? 0 : this.getLastWaitLatency().hashCode() );
         result = 37 * result + ( getSource() == null ? 0 : this.getSource().hashCode() );
         result = 37 * result + ( getTrxLatency() == null ? 0 : this.getTrxLatency().hashCode() );
         result = 37 * result + ( getTrxState() == null ? 0 : this.getTrxState().hashCode() );
         result = 37 * result + ( getTrxAutocommit() == null ? 0 : this.getTrxAutocommit().hashCode() );
         result = 37 * result + ( getPid() == null ? 0 : this.getPid().hashCode() );
         result = 37 * result + ( getProgramName() == null ? 0 : this.getProgramName().hashCode() );
         return result;
   }   


}


