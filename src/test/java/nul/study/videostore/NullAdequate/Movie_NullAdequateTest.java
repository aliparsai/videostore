package nul.study.videostore.NullAdequate;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import nul.study.videostore.ChildrensMovie;
import nul.study.videostore.NewReleaseMovie;
import nul.study.videostore.RegularMovie;
import nul.study.videostore.Movie;


public class Movie_NullAdequateTest {

	private Movie movieInstance;

	@Test(expected=NullPointerException.class)
	public void testMutant7a()
	{
		try {
			movieInstance = new ChildrensMovie(null);
		}
		catch (NullPointerException e)
		{
			//ignore exception
		}
		
		movieInstance.getTitle();
	}
	
	@Test(expected=NullPointerException.class)
	public void testMutant7b()
	{
		try {
			movieInstance = new RegularMovie(null);
		}
		catch (NullPointerException e)
		{
			//ignore exception
		}
		
		movieInstance.getTitle();
	}
	
	@Test(expected=NullPointerException.class)
	public void testMutant7c()
	{
		try {
			movieInstance = new NewReleaseMovie(null);
		}
		catch (NullPointerException e)
		{
			//ignore exception
		}
		
		movieInstance.getTitle();
	}
	
	@Test(expected=NullPointerException.class)
	public void testMutant8a()
	{
		new ChildrensMovie(null);
	}
	

	@Test(expected=NullPointerException.class)
	public void testMutant8b()
	{
		new NewReleaseMovie(null);
	}
	

	@Test(expected=NullPointerException.class)
	public void testMutant8c()
	{
		new RegularMovie(null);
	}
	
}
