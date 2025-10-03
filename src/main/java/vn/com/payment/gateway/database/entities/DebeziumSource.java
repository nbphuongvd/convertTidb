package vn.com.payment.gateway.database.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DebeziumSource {
    @JsonProperty("version")
    private String version;

    @JsonProperty("connector")
    private String connector;

    @JsonProperty("name")
    private String name;

    @JsonProperty("ts_ms")
    private Long tsMs;

    @JsonProperty("snapshot")
    private String snapshot;

    @JsonProperty("db")
    private String db;

    @JsonProperty("sequence")
    private String sequence;

    @JsonProperty("schema")
    private String schema;

    @JsonProperty("table")
    private String table;

    @JsonProperty("txId")
    private String txId;

    @JsonProperty("scn")
    private String scn;

    @JsonProperty("commit_scn")
    private String commitScn;

    @JsonProperty("lcr_position")
    private String lcrPosition;

    @JsonProperty("rs_id")
    private String rsId;

    @JsonProperty("ssn")
    private Integer ssn;

    @JsonProperty("redo_thread")
    private Integer redoThread;

    // getters/setters
    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }

    public String getConnector() { return connector; }
    public void setConnector(String connector) { this.connector = connector; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Long getTsMs() { return tsMs; }
    public void setTsMs(Long tsMs) { this.tsMs = tsMs; }

    public String getSnapshot() { return snapshot; }
    public void setSnapshot(String snapshot) { this.snapshot = snapshot; }

    public String getDb() { return db; }
    public void setDb(String db) { this.db = db; }

    public String getSequence() { return sequence; }
    public void setSequence(String sequence) { this.sequence = sequence; }

    public String getSchema() { return schema; }
    public void setSchema(String schema) { this.schema = schema; }

    public String getTable() { return table; }
    public void setTable(String table) { this.table = table; }

    public String getTxId() { return txId; }
    public void setTxId(String txId) { this.txId = txId; }

    public String getScn() { return scn; }
    public void setScn(String scn) { this.scn = scn; }

    public String getCommitScn() { return commitScn; }
    public void setCommitScn(String commitScn) { this.commitScn = commitScn; }

    public String getLcrPosition() { return lcrPosition; }
    public void setLcrPosition(String lcrPosition) { this.lcrPosition = lcrPosition; }

    public String getRsId() { return rsId; }
    public void setRsId(String rsId) { this.rsId = rsId; }

    public Integer getSsn() { return ssn; }
    public void setSsn(Integer ssn) { this.ssn = ssn; }

    public Integer getRedoThread() { return redoThread; }
    public void setRedoThread(Integer redoThread) { this.redoThread = redoThread; }
}
 