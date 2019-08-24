package com.techlabs.lineitem;

public class LineItem implements Comparable<LineItem>{
	private String id;
	private String name;
	private double cost;
	private int quantity;
	public LineItem(String id, String name, double cost, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getCost() {
		return cost;
	}
	public Integer getQuantity() {
		return quantity;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineItem other = (LineItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public double calTotalCost(){
		double totalCost=quantity*cost;
		return totalCost;
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public int compareTo(LineItem o) {
		int result=0;
		if(id==o.id){
			result=0;
		}else if(Integer.parseInt(id)>=Integer.parseInt(o.id)){
			result=1;
		}else if(Integer.parseInt(id)<=Integer.parseInt(o.id)){
			result=-1;
		}
		return result;
	}
	

	
	

	
	

	
	
	
	
	
	
	
	
	
	

	
}


