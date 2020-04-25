package info;

import java.util.Scanner;

public class LanguageSystemBeta
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	

	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}

		else if (statement.indexOf("cat") >= 0
				|| statement.indexOf("dog") >= 0)
		{
			response = "Tell me more about your pets.";
		}

		else if (statement.indexOf("AP") >= 0)
		{		
			new APscoreTest();
		}
		else if (statement.indexOf("+") >= 0
				|| statement.indexOf("-") >= 0
				|| statement.indexOf("x") >= 0
				|| statement.indexOf("/") >= 0
			|| statement.indexOf("÷") >= 0)
		{		
			new CalculateSystem();
		}
	
	
		else if (statement.trim().length() == 0)
		{
			response = GRRnull();
		}
		
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	
	private String GRRnull() {
		// TODO Auto-generated method stub
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Say something please.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
	}


	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
	}
}
