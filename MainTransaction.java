
package com.mycompany.sprint2;


public class MainTransaction {

        User usuario= new User(1, "linzhz@gmail.com", "12555556");
        User[] users=new User[1];
        users[0]=usuario;


        Date createdAt=new Date (2022,8, 26);
        Enterprise empresa=new Enterprise(1, "Manofactura", "8605533", "7842222","cr 23 689 ", users,  null, createdAt );

        Transaction nuevaTransaccion= new Transaction(1, "pago de nomina", 1000000, empresa, "2022-08-28", "2022-08-28",usuario );

}
