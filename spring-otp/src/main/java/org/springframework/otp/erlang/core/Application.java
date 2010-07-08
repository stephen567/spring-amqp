/*
 * Copyright 2002-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.otp.erlang.core;

/**
 * Describes an Erlang application.  Only three fields are supported as that is the level
 * of information that rabbitmq returns when performing a status request.
 *  
 * See http://www.erlang.org/doc/man/app.html for full details
 * 
 * @author Mark Pollack
 *
 */
public class Application {

	private String description;
	
	private String id;
	
	private String version;

	public Application(String description, String id, String version) {
		super();
		this.description = description;
		this.id = id;
		this.version = version;
	}

	public String getDescription() {
		return description;
	}

	public String getId() {
		return id;
	}


	public String getVersion() {
		return version;
	}

	@Override
	public String toString() {
		return "Application [description=" + description + ", id=" + id
				+ ", version=" + version + "]";
	}


	
}
