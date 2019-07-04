package com.cg.demo.order;

public class Order {

	private String orderNam;
	private int orderNo;

	public String getOrderNam() {
		return orderNam;
	}

	public void setOrderNam(String orderNam) {
		this.orderNam = orderNam;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	@Override
	public String toString() {
		return "Order [orderNam=" + orderNam + ", orderNo=" + orderNo + "]";
	}

}
