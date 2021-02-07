package com.hcl.hiring.hiringapp.position;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.hcl.hiring.hiringapp.group.Group;

@Entity
@Table(name = "position")
public class Position {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="generation_date")
	private Date generationDate;

	@Column(name="billing_date")
	private Date billingDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="group_id", nullable=false)
	private Group group;
	
	@Column(name="skill_set")
	private String skillSet;
	
	@Column(name="experience")
	private float experience;
	
	@Column(name="count")
	private int count;
	
	@Column(name="location")
	private String location;
	
	@Column(name="customer_contact")
	private String customerContact;
	
	@Column(name="monthly_billing")
	private int monthlyBilling;
	
	@Column(name="billing_currency")
	private String billingCurrency;
	
	@Column(name="current_openings")
	private int currentOpenings;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getGenerationDate() {
		return generationDate;
	}

	public void setGenerationDate(Date generationDate) {
		this.generationDate = generationDate;
	}

	public Date getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(Date billingDate) {
		this.billingDate = billingDate;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}

	public int getMonthlyBilling() {
		return monthlyBilling;
	}

	public void setMonthlyBilling(int monthlyBilling) {
		this.monthlyBilling = monthlyBilling;
	}

	public String getBillingCurrency() {
		return billingCurrency;
	}

	public void setBillingCurrency(String billingCurrency) {
		this.billingCurrency = billingCurrency;
	}

	public int getCurrentOpenings() {
		return currentOpenings;
	}

	public void setCurrentOpenings(int currentOpenings) {
		this.currentOpenings = currentOpenings;
	}
	
}
