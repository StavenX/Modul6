package com.staven;

/**
 * This class enables the creation of response objects, that are meant to be used
 * in the Responder class. It's an effective way of storing strings of replies,
 * while also enabling the use of tracking how many times they've been given.
 * 
 * @author Edvin Myhren
 * @version 1.0
 */

public class Responses 
{
	public int count = 0;
	public String response;
	
	public Responses(String _response) 
	{
		this.response = _response;
	}
	
	
	/**
	 * Returns a response while incrementing the use of the respective response
	 * 
	 * @return The respective response 
	 */
	public String getResponse()
	{
		this.count++;
		return this.response;
	}
}

