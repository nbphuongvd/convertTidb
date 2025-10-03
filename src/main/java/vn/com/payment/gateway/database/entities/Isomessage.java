package vn.com.payment.gateway.database.entities;

import lombok.Getter;
import lombok.Setter;

import jakarta.annotation.*;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "ISOMESSAGE", schema = "test")
public class Isomessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tidb_id")
    private Long tidbId;

    @Column(name = "SEQ_NO")
    private Long seqNo;

    @Column(name = "MTI", length = 12)
    private String mti;

    @Column(name = "CARD_NO", length = 57)
    private String cardNo;

    @Column(name = "PROC_CODE", length = 18)
    private String procCode;

    @Column(name = "ORIGINAL_DATE", length = 30)
    private String originalDate;

    @Column(name = "TRACE_NO", length = 18)
    private String traceNo;

    @Column(name = "REF_NO", length = 36)
    private String refNo;

    @Column(name = "ACQ_ID", length = 33)
    private String acqId;

    @Column(name = "ISS_ID", length = 33)
    private String issId;

    @Column(name = "APPROVAL_CODE", length = 18)
    private String approvalCode;

    @Column(name = "RESPONSE_CODE", length = 9)
    private String responseCode;

    @Column(name = "TERM_ID", length = 24)
    private String termId;

    @Column(name = "ORIGINAL_DATA", length = 4000)
    private String originalData;

    @Column(name = "REVERSED", length = 3)
    private String reversed;

    @Column(name = "TNX_STAMP")
    private LocalDateTime tnxStamp;

    @Column(name = "PACKAGER", length = 300)
    private String packager;

    @Column(name = "AMOUNT")
    private Long amount;

    @Column(name = "ACCOUNT_NO", length = 69)
    private String accountNo;

    @Column(name = "LOCAL_TIME", length = 18)
    private String localTime;

    @Column(name = "LOCAL_DATE", length = 12)
    private String localDate;

    @Column(name = "SETTLE_DATE", length = 12)
    private String settleDate;

    @Column(name = "MCC", length = 12)
    private String mcc;

    @Column(name = "CURRENCY_CODE", length = 9)
    private String currencyCode;

    @Column(name = "DEST_ACCOUNT", length = 69)
    private String destAccount;

    @Column(name = "RECONCILE_TIME")
    private LocalDateTime reconcileTime;

    @Column(name = "TRANX_DATE")
    private LocalDateTime tranxDate;

    @Column(name = "ADD_INFO", length = 765)
    private String addInfo;

    @Column(name = "SERVICE_CODE", length = 90)
    private String serviceCode;

    @Column(name = "VAS_INFO", length = 600)
    private String vasInfo;

    @Column(name = "BEN_ID", length = 33)
    private String benId;

    @Column(name = "IBFT_INFO", length = 999)
    private String ibftInfo;

    @Column(name = "AMOUNT_SETTLEMENT")
    private Long amountSettlement;

    @Column(name = "AMOUNT_CARDHOLDER")
    private Long amountCardholder;

    @Column(name = "CURRENCY_CODE_SETTLEMENT", length = 9)
    private String currencyCodeSettlement;

    @Column(name = "CURRENCY_CODE_CARDHOLDER", length = 9)
    private String currencyCodeCardholder;

    @Column(name = "CONVERSION_RATE_SETTLEMENT", length = 8)
    private String conversionRateSettlement;

    @Column(name = "CONVERSION_RATE_CARDHOLDER", length = 8)
    private String conversionRateCardholder;

    @Column(name = "USER_DEFINE", length = 60)
    private String userDefine;

    @Column(name = "TRANX_REF", length = 16)
    private String tranxRef;

    @Column(name = "ACQ_INST_COUNTRY_CODE", length = 9)
    private String acqInstCountryCode;

    @Column(name = "POS_ENTRY_MODE", length = 6)
    private String posEntryMode;

    @Column(name = "POS_CONDITION_CODE", length = 6)
    private String posConditionCode;

    @Column(name = "CARD_ACCEPT_ID_CODE", length = 15)
    private String cardAcceptIdCode;

    @Column(name = "CARD_ACCEPT_NAME_LOCATION", length = 40)
    private String cardAcceptNameLocation;

    @Column(name = "PAYMENT_CODE")
    private Integer paymentCode;

    @Column(name = "INFO_HOLDER_BENECIARY", length = 100)
    private String infoHolderBeneciary;

    @Column(name = "RECORD_DATA", length = 999)
    private String recordData;

    @Column(name = "ADD_RECORD_DATA", length = 999)
    private String addRecordData;

    @Column(name = "REVERSED123", length = 999)
    private String reversed123;

    @Column(name = "REVERSED124", length = 999)
    private String reversed124;

    @Column(name = "REVERSED125", length = 999)
    private String reversed125;

    @Column(name = "MESSAGE_NUMBER")
    private Short messageNumber;

    @Column(name = "LAST_MESSAGE_NUMBER")
    private Short lastMessageNumber;

    @Column(name = "SETTLEMENT_CODE")
    private Integer settlementCode;
}
