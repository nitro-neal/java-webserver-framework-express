package network;

import express.Express;

public class App {

    public static void main(String[] args){
        Routes routes = new Routes();
        Express app = new Express();

        app.bind(routes);
        app.listen();
    }
}

