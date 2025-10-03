package vn.com.payment.gateway.database.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DebeziumPayload {

    @JsonProperty("before")
    private IsomessageDto before;

    @JsonProperty("after")
    private IsomessageDto after;

    @JsonProperty("source")
    private DebeziumSource source;

    @JsonProperty("op")
    private String op;

    @JsonProperty("ts_ms")
    private Long tsMs;

    @JsonProperty("transaction")
    private String transaction;

    // getters/setters
    public IsomessageDto getBefore() { return before; }
    public void setBefore(IsomessageDto before) { this.before = before; }

    public IsomessageDto getAfter() { return after; }
    public void setAfter(IsomessageDto after) { this.after = after; }

    public DebeziumSource getSource() { return source; }
    public void setSource(DebeziumSource source) { this.source = source; }

    public String getOp() { return op; }
    public void setOp(String op) { this.op = op; }

    public Long getTsMs() { return tsMs; }
    public void setTsMs(Long tsMs) { this.tsMs = tsMs; }

    public String getTransaction() { return transaction; }
    public void setTransaction(String transaction) { this.transaction = transaction; }
}

