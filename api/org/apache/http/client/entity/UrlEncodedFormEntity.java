package org.apache.http.client.entity;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;

import org.apache.http.entity.StringEntity;

import droidsafe.annotations.DSC;
import droidsafe.annotations.DSModeled;
import droidsafe.helpers.DSTaintObject;

public class UrlEncodedFormEntity extends StringEntity {

	private DSTaintObject taint = new DSTaintObject();
	
	@DSModeled(DSC.SAFE)
	public UrlEncodedFormEntity(String string) {
		super(string);
		taint.addTaint(string);
	}
	
	@DSModeled(DSC.SAFE)
	public UrlEncodedFormEntity (
	        final List parameters) throws UnsupportedEncodingException {
		super(parameters.toString(), (Charset) null);
	}

	
}
