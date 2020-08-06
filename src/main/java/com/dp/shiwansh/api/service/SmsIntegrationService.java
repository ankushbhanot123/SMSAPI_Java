package com.dp.shiwansh.api.service;

import javax.management.ServiceNotFoundException;

import com.dp.shiwansh.api.model.MessageDetail;
import com.dp.shiwansh.api.model.MessageDetailResponse;
import com.dp.shiwansh.api.model.ReceivedMessage;
import com.dp.shiwansh.api.model.ResponseMessage;

/**
 * SmsIntegrationService .
 * 
 * @author admin
 *
 */
public interface SmsIntegrationService {

	/**
	 *  getResponseFromDownstream .
	 *  
	 * @param request
	 * @return
	 */
	public ResponseMessage getResponseFromDownstream(ReceivedMessage request) throws ServiceNotFoundException;
	
	/**
	 * saveMessage .
	 * 
	 * @param request
	 * @return
	 */
	public MessageDetailResponse saveMessage(MessageDetail request);
}
