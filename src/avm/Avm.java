package avm;

import avm.controller.AvmController;
import avm.domain.MarketRepository;
import avm.service.MarketService;
import general.Client;


public class Avm {
    public static void main(String[] args) {
        MarketRepository marketRepository = new MarketRepository();
        MarketService marketService = new MarketService(new Client("Andrey", 28), marketRepository);
        marketRepository.init();
        new AvmController(marketService).run();



//        ClientManagement clientManagement = new ClientManagement();
//        clientManagement.add("V", 10);
//        clientManagement.add("M", 9);
//        clientManagement.add("A", 11);
//        clientManagement.add("A", 14);
//        clientManagement.printClients();
//        clientManagement.delete(4);
//        clientManagement.printClients();
////        Client cl1 = new Client("V", 1, 10);
////        Client cl2 = new Client("M", 2, 9);
////        Client cl3 = new Client("A", 3, 11);
////        Client cl4 = new Client("A", 4, 14);
////
////        clientManagement.addClient(cl1);
////        clientManagement.addClient(cl2);
////        clientManagement.addClient(cl3);
////        clientManagement.addClient(cl4);

    }
}
