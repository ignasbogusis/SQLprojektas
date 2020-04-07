package lt.codeacademy.services;

import lt.codeacademy.db.KlausimynasDatasource;
import lt.codeacademy.db.UserDatasource;
import lt.codeacademy.entities.Klausimynas;
import lt.codeacademy.entities.User;

public class UserService {

    private final UserDatasource userDatasource = new UserDatasource();
    private final KlausimynasDatasource klausimynasDatasource = new KlausimynasDatasource();

    public User CreateUser(String name, String password){
        userValidator(name, password);
        User createUser = new User(name, password);
        return userDatasource.inserUserIntoDatabase(createUser);

    }

    public Klausimynas createNewKlausimynas(String pavadinimas){
        if(pavadinimas.length() < 5){
            throw new RuntimeException("Klausimyno pavadinimas turi buti bent 5 simboliu ilgio");
        }

        Klausimynas klausimynas = new Klausimynas("asdasdasdasda");

        return klausimynas;
    }
    private void userValidator(String name, String password) {
        if(name.length() < 4){
            throw new RuntimeException("Pertrumpas vardas");
        }
        if(password.length() < 8){
            throw new RuntimeException("Slaptazodis turi but bent is 8 simboliu");
        }
    }

}