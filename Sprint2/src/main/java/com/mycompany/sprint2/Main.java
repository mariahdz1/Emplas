
package com.mycompany.sprint2;

import java.util.Date;

public class Main {

    public static void main(String[] args) {              
      /*Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el nombre de la empresa");*/
    }
    
    public void CrearEmpresa(long id, String name, String document, String phone, String address, User[] users, Transaction[] transactions, Date createdAt){
      Enterprise Empresa =new Enterprise (id,name,document,phone,address, users, transactions,createdAt);
            
    }
}
