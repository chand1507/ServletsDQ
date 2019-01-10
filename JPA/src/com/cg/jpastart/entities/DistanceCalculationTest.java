package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DistanceCalculationTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		DistanceCalculation distance = new DistanceCalculation();
		distance.setSource("Delhi");
		distance.setDestination("Hyderabad");
		distance.setDistance_Id(103);
		em.persist(distance);
		
		
		System.out.println("Added one record to database.");
		
		/*Student stu = em.find(Student.class, 1);
		System.out.println("Stu id = "+stu.getStudentId());
		System.out.println("Stu name = "+stu.getName());
		
		stu.setName("Ritu");
		em.merge(stu);*/
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
