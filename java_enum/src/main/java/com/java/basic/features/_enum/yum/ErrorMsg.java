package com.java.basic.features._enum.yum;

/**
 * ErrorMsg
 *
 * @author 	Lian
 * @date 	2016/11/10
 * @since 	1.0
 */
public enum ErrorMsg{
	REQUEST_SUCCESS("请求成功", "200"),
	BAD_REQUEST("提交的错误请求", "400"),
	REQUEST_FORBIDDEN("拒绝访问的受保护资源", "403"),
	RESOURCE_NOT_FOUND("未找到对应资源", "404"),
	REQUEST_TIMEOUT("超时错误", "408"),
	TRANSACTION_TIME_INVALID("交易发起时间无效", "439"),
	USE_CHANNEL_IDENTIFIER_INVALID("使用渠道标识无效", "455"),
	GIVE_CHANNEL_IDENTIFIER_INVALID("发放渠道标识无效", "456"),
	COUPON_ACTIVITY_START_TIME_INVALID("电子券活动活动开始时间无效", "457"),
	COUPON_ACTIVITY_END_TIME_INVALID("电子券活动活动结束时间无效", "458"),
	COUPON_CODE_INVALID("电子券券码无效", "459"),
	COUPON_ORDER_AMOUT_INVALID("电子券订单金额无效", "460"),
	COUPON_CAV_AMOUT_INVALID("电子券核销金额无效", "461"),
	ACCEPT_COUPON_MERCHANT_POSID_INVALID("收券商户收银机号无效", "464"),
	COUPON_NOT_GIVE("电子券未发放", "465"),
	COUPON_NOT_ACTIVATE("电子券未激活", "466"),
	COUPON_STATUS_INVALID("电子券状态无效", "467"),
	COUPON_EFFECT_START_TIME_INVALID_OR_NOT_START("电子券有效开始时间无效或未开始", "468"),
	COUPON_EFFECT_END_TIME_INVALID_OR_ALREADY_END("电子券有效结束时间无效或已结束", "469"),
	COUPON_STATUS_INVALID_OR_USED_OR_EXCEED_OR_CAVED("电子券状态无效/已使用不能核销/已经超过使用次数/已销毁", "470"),
	TRANSACTION_VOUCHER_INVALID("交易凭证号无效", "489"),
	ORIGENAL_ORDER_TRANSACTION_RESULT_INVALID("原始订单交易结果无效", "491"),
	ORIGENAL_ORDER_TRANSACTION_TYPE_INVALID("原始订单交易类型无效", "492"),
	QUERY_CHANNEL_INVALID("查询渠道无效", "493"),
	COUPON_CODE_PREFIX_INVALID("电子券券码前缀无效", "494"),
	INTERNAL_SERVER_ERROR("内部错误", "500"),
	INTERNAL_COMMUNICATION_EXCEPTION("内部通讯异常", "511"),
	INTERNAL_DB_EXCETION("内部数据库异常", "512"),
	INTERNAL_SERVER_EXCEPTION("内部服务处理异常", "513"),
	INTERNAL_DATA_EXCEPTION_OR_ILLEGAL("内部数据异常或者不合法", "514"),
	NO_QUERY_AUTH("查询权限不足", "515"),
	REQUEST_PARAMS_ILLEGAL("入参请求数据不合法", "516"),
	MD5_CHECK_EXCEPTION("MD5校验异常", "517"),
	SERVER_EXCEPTION("服务处理异常", "518"),
	ACTIVITY_ID_ALREADY_EXIST("活动定义Id(ActivityId)已存在", "541"),
	MASTER_FILE_ILLEGAL("主档状态不合法", "542"),
	ORDER_ROLLBACK_FAIL("订单回滚失败", "543"),
	YUM_SYSTEM_ERROR("Yum系统错误", "999");

	private String errorMsg;
	private String errorCode;

	ErrorMsg(String errorMsg, String errorCode) {
		this.errorMsg = errorMsg;
		this.errorCode = errorCode;
	}

	public static String getErrorMsg(String errorCode) {
		for (ErrorMsg record : ErrorMsg.values()) {
			if (record.getErrorCode().equals(errorCode)) {
				return record.getErrorMsg();
			}
		}
		return "Other Error!";
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
}