package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("David"," Ahds146% ", User.Role.CUSTOMER);
        User user2 = new User("Ashot"," Lhds146% ", User.Role.ADMIN);
        User user3 = new User("Spartak"," Ohgds186% ", User.Role.CUSTOMER);
        User user4 = new User("Maria"," Ahds146p ", User.Role.CUSTOMER);
        User user5 = new User("Poxos"," Phds146% ", User.Role.CUSTOMER);
        User user6 = new User("Petros"," A#ds146% ", User.Role.CUSTOMER);
        User user7 = new User("Martiros"," LLds146% ", User.Role.ADMIN);
        User user8 = new User("Karlos"," AhdL16% ", User.Role.CUSTOMER);
        User user9 = new User("Astghik"," LLhds146% ", User.Role.CUSTOMER);
        User user10 = new User("Aryusak"," LLs146% ", User.Role.CUSTOMER);

        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);

        for (int i = 0; i < users.size(); i++) {
            System.out.println("Username is = " + users.get(i).getUsername() + " ,Password is = " + users.get(i).getPassword() + " ,Role is = " + users.get(i).getRole() + ".");
        }
    }
}
