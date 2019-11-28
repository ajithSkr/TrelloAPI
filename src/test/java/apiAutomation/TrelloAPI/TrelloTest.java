package apiAutomation.TrelloAPI;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class TrelloTest extends deleteRequest
{
	
	@Test(priority=1)
	public void post() throws ParseException
	{
	    createBoard();
		createList1();
		createList2();
	    createCard1();
		createCard2();
		createlabel1();
		createlabel2();
		attachFile1();
		attachFile2();
	}

	
	@Test(priority=3)
	public void put()
	{
		updateList();
 		updateCard();
		updateLabel();
	}
	@Test(priority=4)
	public void delete()
	{
		deleteCard();
	}

}
