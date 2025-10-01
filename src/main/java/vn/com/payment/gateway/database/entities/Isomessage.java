package vn.com.payment.gateway.database.entities;

import java.io.Serializable;
//import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import jakarta.annotation.*;
import jakarta.persistence.*;

/**
 * The persistent class for the ISOMESSAGE database table.
 * 
 */
@Entity
@NamedQuery(name = "Isomessage.findAll", query = "SELECT i FROM Isomessage i")
public class Isomessage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "ACCOUNT_NO")
	private String accountNo;

	@Column(name = "ACQ_ID")
	private String acqId;

	@Column(name = "ACQ_INST_COUNTRY_CODE")
	private String acqInstCountryCode;

	@Column(name = "ADD_INFO")
	private String addInfo;

	@Column(name = "ADD_RECORD_DATA")
	private String addRecordData;

	private BigDecimal amount;

	@Column(name = "AMOUNT_CARDHOLDER")
	private BigDecimal amountCardholder;

	@Column(name = "AMOUNT_SETTLEMENT")
	private BigDecimal amountSettlement;

	@Column(name = "APPROVAL_CODE")
	private String approvalCode;

	@Column(name = "BEN_ID")
	private String benId;

	@Column(name = "CARD_ACCEPT_ID_CODE")
	private String cardAcceptIdCode;

	@Column(name = "CARD_ACCEPT_NAME_LOCATION")
	private String cardAcceptNameLocation;

	@Column(name = "CARD_NO")
	private String cardNo;

	@Column(name = "CONVERSION_RATE_CARDHOLDER")
	private String conversionRateCardholder;

	@Column(name = "CONVERSION_RATE_SETTLEMENT")
	private String conversionRateSettlement;

	@Column(name = "CP_BALANCE_AMOUNT")
	private BigDecimal cpBalanceAmount;

	@Column(name = "CP_RESPONSE_CODE")
	private String cpResponseCode;

	@Column(name = "CP_TRACE_NUMBER")
	private String cpTraceNumber;

	@Column(name = "CURRENCY_CODE")
	private String currencyCode;

	@Column(name = "CURRENCY_CODE_CARDHOLDER")
	private String currencyCodeCardholder;

	@Column(name = "CURRENCY_CODE_SETTLEMENT")
	private String currencyCodeSettlement;

	@Column(name = "DEST_ACCOUNT")
	private String destAccount;

	@Column(name = "IBFT_INFO")
	private String ibftInfo;

	@Column(name = "INFO_HOLDER_BENECIARY")
	private String infoHolderBeneciary;

	@Column(name = "ISS_ID")
	private String issId;

	@Column(name = "LAST_MESSAGE_NUMBER")
	private BigDecimal lastMessageNumber;

	@Column(name = "LOCAL_DATE")
	private String localDate;

	@Column(name = "LOCAL_TIME")
	private String localTime;

	private String mcc;

	@Column(name = "MESSAGE_NUMBER")
	private BigDecimal messageNumber;
	private String mti;
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "ORIGINAL_DATA")
//	 @Basic(fetch = FetchType.LAZY)
	private String originalData;

	@Column(name = "ORIGINAL_DATE")
	private String originalDate;

	private String packager;

	@Column(name = "PAYMENT_CODE")
	private BigDecimal paymentCode;

	@Column(name = "POS_CONDITION_CODE")
	private String posConditionCode;

	@Column(name = "POS_ENTRY_MODE")
	private String posEntryMode;

	@Column(name = "PROC_CODE")
	private String procCode;

	@Temporal(TemporalType.DATE)
	@Column(name = "RECONCILE_TIME")
	private Date reconcileTime;

	@Column(name = "RECORD_DATA")
	private String recordData;

	@Column(name = "REF_NO")
	private String refNo;

	@Column(name = "RESPONSE_CODE")
	private String responseCode;

	private String reversed;

	private String reversed123;

	private String reversed124;

	private String reversed125;

	@Id
	@Column(name = "SEQ_NO")
	private BigDecimal seqNo;

	@Column(name = "SERVICE_CODE")
	private String serviceCode;

	@Column(name = "SETTLE_DATE")
	private String settleDate;

	@Column(name = "SETTLEMENT_CODE")
	private BigDecimal settlementCode;

	@Column(name = "TERM_ID")
	private String termId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TNX_STAMP")
	private Date tnxStamp;

	@Column(name = "TRACE_NO")
	private String traceNo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TRANX_DATE")
	private Date tranxDate;

	@Column(name = "TRANX_REF")
	private String tranxRef;

	@Column(name = "USER_DEFINE")
	private String userDefine;

	@Column(name = "VAS_INFO")
	private String vasInfo;

	public Isomessage() {
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAcqId() {
		return this.acqId;
	}

	public void setAcqId(String acqId) {
		this.acqId = acqId;
	}

	public String getAcqInstCountryCode() {
		return this.acqInstCountryCode;
	}

	public void setAcqInstCountryCode(String acqInstCountryCode) {
		this.acqInstCountryCode = acqInstCountryCode;
	}

	public String getAddInfo() {
		return this.addInfo;
	}

	public void setAddInfo(String addInfo) {
		this.addInfo = addInfo;
	}

	public String getAddRecordData() {
		return this.addRecordData;
	}

	public void setAddRecordData(String addRecordData) {
		this.addRecordData = addRecordData;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getAmountCardholder() {
		return this.amountCardholder;
	}

	public void setAmountCardholder(BigDecimal amountCardholder) {
		this.amountCardholder = amountCardholder;
	}

	public BigDecimal getAmountSettlement() {
		return this.amountSettlement;
	}

	public void setAmountSettlement(BigDecimal amountSettlement) {
		this.amountSettlement = amountSettlement;
	}

	public String getApprovalCode() {
		return this.approvalCode;
	}

	public void setApprovalCode(String approvalCode) {
		this.approvalCode = approvalCode;
	}

	public String getBenId() {
		return this.benId;
	}

	public void setBenId(String benId) {
		this.benId = benId;
	}

	public String getCardAcceptIdCode() {
		return this.cardAcceptIdCode;
	}

	public void setCardAcceptIdCode(String cardAcceptIdCode) {
		this.cardAcceptIdCode = cardAcceptIdCode;
	}

	public String getCardAcceptNameLocation() {
		return this.cardAcceptNameLocation;
	}

	public void setCardAcceptNameLocation(String cardAcceptNameLocation) {
		this.cardAcceptNameLocation = cardAcceptNameLocation;
	}

	public String getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getConversionRateCardholder() {
		return this.conversionRateCardholder;
	}

	public void setConversionRateCardholder(String conversionRateCardholder) {
		this.conversionRateCardholder = conversionRateCardholder;
	}

	public String getConversionRateSettlement() {
		return this.conversionRateSettlement;
	}

	public void setConversionRateSettlement(String conversionRateSettlement) {
		this.conversionRateSettlement = conversionRateSettlement;
	}

	public BigDecimal getCpBalanceAmount() {
		return this.cpBalanceAmount;
	}

	public void setCpBalanceAmount(BigDecimal cpBalanceAmount) {
		this.cpBalanceAmount = cpBalanceAmount;
	}

	public String getCpResponseCode() {
		return this.cpResponseCode;
	}

	public void setCpResponseCode(String cpResponseCode) {
		this.cpResponseCode = cpResponseCode;
	}

	public String getCpTraceNumber() {
		return this.cpTraceNumber;
	}

	public void setCpTraceNumber(String cpTraceNumber) {
		this.cpTraceNumber = cpTraceNumber;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCurrencyCodeCardholder() {
		return this.currencyCodeCardholder;
	}

	public void setCurrencyCodeCardholder(String currencyCodeCardholder) {
		this.currencyCodeCardholder = currencyCodeCardholder;
	}

	public String getCurrencyCodeSettlement() {
		return this.currencyCodeSettlement;
	}

	public void setCurrencyCodeSettlement(String currencyCodeSettlement) {
		this.currencyCodeSettlement = currencyCodeSettlement;
	}

	public String getDestAccount() {
		return this.destAccount;
	}

	public void setDestAccount(String destAccount) {
		this.destAccount = destAccount;
	}

	public String getIbftInfo() {
		return this.ibftInfo;
	}

	public void setIbftInfo(String ibftInfo) {
		this.ibftInfo = ibftInfo;
	}

	public String getInfoHolderBeneciary() {
		return this.infoHolderBeneciary;
	}

	public void setInfoHolderBeneciary(String infoHolderBeneciary) {
		this.infoHolderBeneciary = infoHolderBeneciary;
	}

	public String getIssId() {
		return this.issId;
	}

	public void setIssId(String issId) {
		this.issId = issId;
	}

	public BigDecimal getLastMessageNumber() {
		return this.lastMessageNumber;
	}

	public void setLastMessageNumber(BigDecimal lastMessageNumber) {
		this.lastMessageNumber = lastMessageNumber;
	}

	public String getLocalDate() {
		return this.localDate;
	}

	public void setLocalDate(String localDate) {
		this.localDate = localDate;
	}

	public String getLocalTime() {
		return this.localTime;
	}

	public void setLocalTime(String localTime) {
		this.localTime = localTime;
	}

	public String getMcc() {
		return this.mcc;
	}

	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public BigDecimal getMessageNumber() {
		return this.messageNumber;
	}

	public void setMessageNumber(BigDecimal messageNumber) {
		this.messageNumber = messageNumber;
	}

	public String getMti() {
		return this.mti;
	}

	public void setMti(String mti) {
		this.mti = mti;
	}

	public String getOriginalData() {
		return this.originalData;
	}

	public void setOriginalData(String originalData) {
		this.originalData = originalData;
	}

	public String getOriginalDate() {
		return this.originalDate;
	}

	public void setOriginalDate(String originalDate) {
		this.originalDate = originalDate;
	}

	public String getPackager() {
		return this.packager;
	}

	public void setPackager(String packager) {
		this.packager = packager;
	}

	public BigDecimal getPaymentCode() {
		return this.paymentCode;
	}

	public void setPaymentCode(BigDecimal paymentCode) {
		this.paymentCode = paymentCode;
	}

	public String getPosConditionCode() {
		return this.posConditionCode;
	}

	public void setPosConditionCode(String posConditionCode) {
		this.posConditionCode = posConditionCode;
	}

	public String getPosEntryMode() {
		return this.posEntryMode;
	}

	public void setPosEntryMode(String posEntryMode) {
		this.posEntryMode = posEntryMode;
	}

	public String getProcCode() {
		return this.procCode;
	}

	public void setProcCode(String procCode) {
		this.procCode = procCode;
	}

	public Date getReconcileTime() {
		return this.reconcileTime;
	}

	public void setReconcileTime(Date reconcileTime) {
		this.reconcileTime = reconcileTime;
	}

	public String getRecordData() {
		return this.recordData;
	}

	public void setRecordData(String recordData) {
		this.recordData = recordData;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getResponseCode() {
		return this.responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getReversed() {
		return this.reversed;
	}

	public void setReversed(String reversed) {
		this.reversed = reversed;
	}

	public String getReversed123() {
		return this.reversed123;
	}

	public void setReversed123(String reversed123) {
		this.reversed123 = reversed123;
	}

	public String getReversed124() {
		return this.reversed124;
	}

	public void setReversed124(String reversed124) {
		this.reversed124 = reversed124;
	}

	public String getReversed125() {
		return this.reversed125;
	}

	public void setReversed125(String reversed125) {
		this.reversed125 = reversed125;
	}

	public BigDecimal getSeqNo() {
		return this.seqNo;
	}

	public void setSeqNo(BigDecimal seqNo) {
		this.seqNo = seqNo;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getSettleDate() {
		return this.settleDate;
	}

	public void setSettleDate(String settleDate) {
		this.settleDate = settleDate;
	}

	public BigDecimal getSettlementCode() {
		return this.settlementCode;
	}

	public void setSettlementCode(BigDecimal settlementCode) {
		this.settlementCode = settlementCode;
	}

	public String getTermId() {
		return this.termId;
	}

	public void setTermId(String termId) {
		this.termId = termId;
	}

	public Date getTnxStamp() {
		return this.tnxStamp;
	}

	public void setTnxStamp(Date tnxStamp) {
		this.tnxStamp = tnxStamp;
	}

	public String getTraceNo() {
		return this.traceNo;
	}

	public void setTraceNo(String traceNo) {
		this.traceNo = traceNo;
	}

	public Date getTranxDate() {
		return this.tranxDate;
	}

	public void setTranxDate(Date tranxDate) {
		this.tranxDate = tranxDate;
	}

	public String getTranxRef() {
		return this.tranxRef;
	}

	public void setTranxRef(String tranxRef) {
		this.tranxRef = tranxRef;
	}

	public String getUserDefine() {
		return this.userDefine;
	}

	public void setUserDefine(String userDefine) {
		this.userDefine = userDefine;
	}

	public String getVasInfo() {
		return this.vasInfo;
	}

	public void setVasInfo(String vasInfo) {
		this.vasInfo = vasInfo;
	}

}