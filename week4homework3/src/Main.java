import java.time.LocalDate;

import Adapters.FakeMernisService;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		GameManager gameManager = new GameManager();
		Game game = new Game(1,"The Sims 4", 10,"Life Simulation");
		gameManager.add(game);
		
		
		GamerManager gamerManager = new GamerManager(new FakeMernisService());
		Gamer gamer = new Gamer (1,"A ","B ",LocalDate.of(1999,3, 25),"111111");
		gamerManager.add(gamer);
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign = new Campaign("Black Friday",LocalDate.of(2021, 5, 9),LocalDate.of(2021, 5, 12),20);
		campaignManager.add(campaign);
		
		SaleManager sale =new SaleManager();
		sale.sale(gamer, game, campaign);

	}

}
