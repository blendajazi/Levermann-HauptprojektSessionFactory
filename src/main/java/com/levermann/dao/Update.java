/*



 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.dao;


/*import com.levermann.entityclass.Unternehmen;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

public class Update {


    public void UpdateUnternehmen () {

        Scanner scanner = new Scanner(System.in);    
// Eingabeauforderung Unternehmen
  
         
   SessionFactory factory;
	factory = (SessionFactory) new Configuration().configure().addAnnotatedClass(Unternehmen.class).buildSessionFactory();
     Session session = factory.openSession(); 
   Unternehmen Unternehmen=new Unternehmen();
   
  try {      
    System.out.println("Eingabe:\n 1. ID \n 2. Unternehmen \n 3. Datum \n 4. Eigenkapital \n 5. Jahresueberschuss");
       
    //Select Primärschlüssel
   int cid = scanner.nextInt();
   Unternehmen.setCid(cid);
    
    String name = scanner.next();    
    Unternehmen.setName(name);
    
    String datum = scanner.next();
    Unternehmen.setDatum(datum);
   
    float  eigenkapital = scanner.nextInt(); 
    Unternehmen.setEigenkapital(eigenkapital);   
    float  jahresueberschuss = scanner.nextInt();
    Unternehmen.setJahresueberschuss(jahresueberschuss); 
     
    session.beginTransaction(); 
        
   // Aktion   
        session.update(Unternehmen);
    
    // Variablen zum Update    
        session.getTransaction().commit();}
	finally{factory.close();}}
    
 
    
        
}

 */