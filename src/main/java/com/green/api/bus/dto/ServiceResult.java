package com.green.api.bus.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ServiceResult {
	
	@JsonProperty("ServiceResult")
	BusAPItResponse<BusRouteItem> serviceResult;

}
