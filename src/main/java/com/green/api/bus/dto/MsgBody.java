package com.green.api.bus.dto;

import java.util.List;

import lombok.Data;

@Data
public class MsgBody<T> {
	private List<T> itemList;
}
