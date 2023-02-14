package com.green.api.bus.dto;

import lombok.Data;

@Data
public class BusAPItResponse<T> {
	private ComMsgHeader comMsgHeader;
	private MsgHeader msgHeader;
	private MsgBody<T> msgBody;
}
