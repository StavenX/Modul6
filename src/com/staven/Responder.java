package com.staven;

import java.util.ArrayList;
import java.util.Random;

/**
 * The responder class represents a response generator object. It is used
 * to generate an automatic response. This is the second version of this 
 * class. This time, we generate some random behavior by randomly selecting 
 * a phrase from a predefined list of responses.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.2 (2016.02.29)
 */
public class Responder
{
    private Random randomGenerator;
    private ArrayList<Responses> responses;

    /**
     * Construct a Responder
     * 
     * MY CHANGE: Now uses the setSeed method to start the random sequence
     * and converted the array to contain Responses objects
     */
    public Responder()
    {
        randomGenerator = new Random();
        randomGenerator.setSeed(666);
        
        
        responses = new ArrayList<>();
        fillResponses();
    }

    /**
     * Generate a response.
     * 
     * @return  A string that should be displayed as the response
     */
    public String generateResponse()
    {
        // Pick a random number for the index in the default response 
        // list. The number will be between 0 (inclusive) and the size
        // of the list (exclusive).
    	// MY CHANGE: Now chooses from ArrayList responses, that uses response objects
    	
        int index = randomGenerator.nextInt(responses.size());
        return responses.get(index).getResponse();
    }

    /**
     * Build up a list of default responses from which we can pick one
     * if we don't know what else to say.
     */
    private void fillResponses()
    {
        responses.add(new Responses("That sounds odd. Could you describe this in more detail?"));
        responses.add(new Responses("No other customer has ever complained about this \n" +
                      "before. What is your system configuration?"));
        responses.add(new Responses("I need a bit more information on that."));
        responses.add(new Responses("Have you checked that you do not have a dll conflict?"));
        responses.add(new Responses("That is covered in the manual. Have you read the manual?"));
        responses.add(new Responses("Your description is a bit wishy-washy. Have you got \n" +
                      "an expert there with you who could describe this better?"));
        responses.add(new Responses("That's not a bug, it's a feature!"));
        responses.add(new Responses("Could you elaborate on that?"));
        responses.add(new Responses("Have you tried running the app on your phone?"));
        responses.add(new Responses("I just checked StackOverflow - they don't know either."));
    }
    
    /*
     * MY CHANGE: Prints statistics over each response given
     */
    public void printStatistics()
    {
    	for (int i = 0; i < responses.size(); i++)
    	{
    		System.out.println(responses.get(i).response + 
    				" : " + responses.get(i).count);
    	}
    }
}

