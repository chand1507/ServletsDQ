package com.cg.jpastart.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class DistanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		DistanceCalculation dc=new DistanceCalculation();
		
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		System.out.println("Enter distance id");
		int distId= dc.setDistance_Id(sc.nextInt());
		System.out.println("Enter source");
		String source=dc.setSource(sc.next());
		System.out.println("enter destination");
		String destination=dc.setDestination(sc.next());
		System.out.println("enter distance in kilometers");
		double distance=(double) dc.setDist_in_km(sc.nextDouble());
		
		double distInMiles=dc.setDist_in_miles(distance/2);
		System.out.println("Distance in miles is:"+distInMiles);
		em.persist(dc);
		em.getTransaction().commit();
		em.close();
		factory.close();
		
	}

}
