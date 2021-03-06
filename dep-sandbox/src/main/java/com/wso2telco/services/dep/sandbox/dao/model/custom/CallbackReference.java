/*******************************************************************************
 * Copyright  (c) 2015-2016, WSO2.Telco Inc. (http://www.wso2telco.com) All Rights Reserved.
 * 
 * WSO2.Telco Inc. licences this file to you under  the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.wso2telco.services.dep.sandbox.dao.model.custom;

public class CallbackReference {
	private String notifyURL;

	private String callbackData;

	private String resourceURL;

	/**
	 * @return the notifyURL
	 */
	public String getNotifyURL() {
		return notifyURL;
	}

	/**
	 * @param notifyURL
	 *            the notifyURL to set
	 */
	public void setNotifyURL(String notifyURL) {
		this.notifyURL = notifyURL;
	}

	/**
	 * @return the callbackData
	 */
	public String getCallbackData() {
		return callbackData;
	}

	/**
	 * @param callbackData
	 *            the callbackData to set
	 */
	public void setCallbackData(String callbackData) {
		this.callbackData = callbackData;
	}

	/**
	 * @return the resourceURL
	 */
	public String getResourceURL() {
		return resourceURL;
	}

	/**
	 * @param resourceURL
	 *            the resourceURL to set
	 */
	public void setResourceURL(String resourceURL) {
		this.resourceURL = resourceURL;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append(" notify URL : " + notifyURL);
		builder.append(" callback Data : " + callbackData);
		builder.append(" resource URL : " + resourceURL);

		return builder.toString();
	}

}
