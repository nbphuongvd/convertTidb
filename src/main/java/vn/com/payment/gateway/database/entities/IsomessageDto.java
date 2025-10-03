package vn.com.payment.gateway.database.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@JsonIgnoreProperties(ignoreUnknown = true) // bỏ qua field lạ
@Getter
@Setter
public class IsomessageDto {
    // 🟢 Constructor mặc định
    public IsomessageDto() {
    }
	
	@Id
    @JsonProperty("SEQ_NO")
    private Long seqNo;

    @JsonProperty("MTI")
    private String mti;

    @JsonProperty("CARD_NO")
    private String cardNo;

    @JsonProperty("PROC_CODE")
    private String procCode;

    @JsonProperty("ORIGINAL_DATE")
    private String originalDate;

    @JsonProperty("TRACE_NO")
    private String traceNo;

    @JsonProperty("REF_NO")
    private String refNo;

    @JsonProperty("ACQ_ID")
    private String acqId;

    @JsonProperty("ISS_ID")
    private String issId;

    @JsonProperty("APPROVAL_CODE")
    private String approvalCode;

    @JsonProperty("RESPONSE_CODE")
    private String responseCode;

    @JsonProperty("TERM_ID")
    private String termId;

    @JsonProperty("ORIGINAL_DATA")
    private String originalData;

    @JsonProperty("REVERSED")
    private String reversed;

    @JsonProperty("TNX_STAMP")
    private Long tnxStamp;

    @JsonProperty("PACKAGER")
    private String packager;

    @JsonProperty("AMOUNT")
    private Long amount;

    @JsonProperty("ACCOUNT_NO")
    private String accountNo;

    @JsonProperty("LOCAL_TIME")
    private String localTime;

    @JsonProperty("LOCAL_DATE")
    private String localDate;

    @JsonProperty("SETTLE_DATE")
    private String settleDate;

    @JsonProperty("MCC")
    private String mcc;

    @JsonProperty("CURRENCY_CODE")
    private String currencyCode;

    @JsonProperty("DEST_ACCOUNT")
    private String destAccount;

    @JsonProperty("RECONCILE_TIME")
    private String reconcileTime;

    @JsonProperty("TRANX_DATE")
    private Long tranxDate;

    @JsonProperty("ADD_INFO")
    private String addInfo;

    @JsonProperty("SERVICE_CODE")
    private String serviceCode;

    @JsonProperty("VAS_INFO")
    private String vasInfo;

    @JsonProperty("BEN_ID")
    private String benId;

    @JsonProperty("IBFT_INFO")
    private String ibftInfo;

    @JsonProperty("AMOUNT_SETTLEMENT")
    private Long amountSettlement;

    @JsonProperty("AMOUNT_CARDHOLDER")
    private Long amountCardholder;

    @JsonProperty("CURRENCY_CODE_SETTLEMENT")
    private String currencyCodeSettlement;

    @JsonProperty("CURRENCY_CODE_CARDHOLDER")
    private String currencyCodeCardholder;

    @JsonProperty("CONVERSION_RATE_SETTLEMENT")
    private String conversionRateSettlement;

    @JsonProperty("CONVERSION_RATE_CARDHOLDER")
    private String conversionRateCardholder;

    @JsonProperty("USER_DEFINE")
    private String userDefine;

    @JsonProperty("TRANX_REF")
    private String tranxRef;

    @JsonProperty("ACQ_INST_COUNTRY_CODE")
    private String acqInstCountryCode;

    @JsonProperty("POS_ENTRY_MODE")
    private String posEntryMode;

    @JsonProperty("POS_CONDITION_CODE")
    private String posConditionCode;

    @JsonProperty("CARD_ACCEPT_ID_CODE")
    private String cardAcceptIdCode;

    @JsonProperty("CARD_ACCEPT_NAME_LOCATION")
    private String cardAcceptNameLocation;

    @JsonProperty("SETTLEMENT_CODE")
    private Integer settlementCode;

    @JsonProperty("PAYMENT_CODE")
    private String paymentCode;

    @JsonProperty("INFO_HOLDER_BENECIARY")
    private String infoHolderBeneciary;

    @JsonProperty("RECORD_DATA")
    private String recordData;

    @JsonProperty("ADD_RECORD_DATA")
    private String addRecordData;

    @JsonProperty("REVERSED123")
    private String reversed123;

    @JsonProperty("REVERSED124")
    private String reversed124;

    @JsonProperty("REVERSED125")
    private String reversed125;

    @JsonProperty("MESSAGE_NUMBER")
    private String messageNumber;

    @JsonProperty("LAST_MESSAGE_NUMBER")
    private String lastMessageNumber;
}
