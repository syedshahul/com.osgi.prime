package com.osgi.prime.upper.application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.osgi.prime.upper.api.Upper;

import osgi.enroute.configurer.api.RequireConfigurerExtender;
import osgi.enroute.google.angular.capabilities.RequireAngularWebResource;
import osgi.enroute.rest.api.REST;
import osgi.enroute.twitter.bootstrap.capabilities.RequireBootstrapWebResource;
import osgi.enroute.webserver.capabilities.RequireWebServerExtender;

@RequireAngularWebResource(resource={"angular.js","angular-resource.js", "angular-route.js"}, priority=1000)
@RequireBootstrapWebResource(resource="css/bootstrap.css")
@RequireWebServerExtender
@RequireConfigurerExtender
@Component(name="com.osgi.prime.upper")
public class UpperApplication implements REST {
    @Reference
	Upper upper;
    
	public String getUpper(String string) {
		return upper.upper(string);
	}

	public void setUpper(Upper upper) {
		this.upper = upper;
	}
	
}
